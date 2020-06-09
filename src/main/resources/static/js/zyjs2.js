//获取年代
function getAgeAndType() {
    $.ajax({
        type: "post",
        url: "relic/findSearchCriteria",
        data: {},
        dataType: "json",
        success: function(res){
            if(res.status=="200") {
                var typeData = res.result.typeData;
                var ageData = res.result.ageData;
                var levelData = res.result.levelData;
                var formatData = res.result.formatData;
                var tpdxData = res.result.tpdxData;
                var fblData = res.result.fblData;
                getSearchList(typeData,ageData,levelData,formatData,tpdxData,fblData);//加载搜索条件
            }

        }
    })
}

//加载搜索框
function getSearchList(typeData,ageData,levelData,formatData,tpdxData,fblData) {
    //初始化参数
    var options = {
        //查询事件
        "search": function (paramList) {
            //$(".param").html('查询参数:'+JSON.stringify(paramList));
            criteria = JSON.stringify(paramList);
            //console.log(criteria);
            loadSearchData(criteria,1);
        },
        //默认展开条件数
        "expandRow": 3,
        //查询条件
        "searchBoxs": [
            {
                "id": "wwlb",
                "title": "藏品类别",
                "data": typeData
            },{
                "id": "cpnd",
                "title": "藏品年代",
                "data":ageData
            },{
                "id": "cpjb",
                "title": "藏品级别",
                "data": levelData
            },{
                "id": "tpgs",
                "title": "图片格式",
                "data": formatData
            },{
                "id": "tpdx",
                "title": "图片大小",
                "data": tpdxData
            },{
                "id": "fbl",
                "title": "分辨率",
                "data": fblData
            }
        ]
    };
    $("#searchbox").fiterMore(options);
}

//从服务器读取数据
function loadData(crr) {
    var loadingFlag;
    layui.use(['laypage', 'layer'], function() {
        var layer = layui.layer;

        $.ajax({
            type: "post",
            url: "relic/findCollectionNoTotalPage",
            data: {
                "pageNum": crr || 1,
                "pageSize": 3
            },
            dataType: "json",
            beforeSend: function () {
                loadingFlag= layer.msg('正在读取数据，请稍候……', {icon: 16,time:false,shade:0.8});
            },
            success: function(res){
                layer.close(loadingFlag);

                var thisData = res.result;
                var count = thisData.count;//总记录
                if (count > 0) {
                    if (res.status == 200) {
                        $("#page").show();
                        //向页面放入数据
                        showResources(thisData.collectionResourcesList);
                        //调用分页方法
                        getPageList(count, crr, 3,"");
                        $("#page").show();
                    }
                } else {
                    $("#relicList").html('<img id="nullData" src="images/null.jpg">');
                    $("#page").hide();
                }

            }
        });
    })

}

//搜索
function keywordSearch(crr) {
    //var cateid = $("#cateid").val();
    var identifier = $("#keyword").val();
    var loadingFlag;

    layui.use(['laypage', 'layer'], function() {
        var $ = layui.jquery,
            layer = layui.layer;

        $.ajax({
            type: "post",
            url: "relic/findRelicByLike",
            data: {
                //"cateid": cateid,
                "identifier":identifier,
                "pageNum": crr || 1,
                "pageSize": 3
            },
            dataType: "json",
            beforeSend: function () {
                loadingFlag= layer.msg('正在读取数据，请稍候……', {icon: 16,time:false,shade:0.8});
            },
            success: function(res){
                layer.close(loadingFlag);

                var thisData = res.result;
                console.log(thisData);
                var count = thisData.count;//总记录
                if(count>0){
                    if(res.status==200){
                        //向页面放入数据
                        showResources(thisData.collectionResourcesList);
                        //调用分页方法
                        searchGetPageList(count,crr,3);
                        $("#page").show();
                    }
                }else{
                    $("#relicList").html('<img id="nullData" src="images/null.jpg">');
                    $("#page").hide();
                }
            }
        })

    })
}

//搜索分页
function searchGetPageList(count,curr,limit){
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,
            layer = layui.layer;

        laypage.render({
            elem: 'page',
            count: count||0,
            theme: '#009587',
            limit : limit||3,
            curr : curr||1,
            layout: ['count', 'prev', 'page', 'next'],
            jump: function(obj,first){
                if(!first){
                    keywordSearch(obj.curr);
                }
            }
        });
    });
}

//条件过滤
function loadSearchData(criteria,crr) {
    var loadingFlag;
    layui.use(['laypage', 'layer'], function() {
        var layer = layui.layer;

        $.ajax({
            type: "post",
            url: "relic/findCollectionHaveTotalPage",
            data: {
                "sqlConditional": criteria,
                "pageNum": crr || 1,
                "pageSize": 3
            },
            dataType: "json",
            beforeSend: function () {
                loadingFlag= layer.msg('正在读取数据，请稍候……', {icon: 16,time:false,shade:0.8});
            },
            success: function(res){
                layer.close(loadingFlag);

                var thisData = res.result;
                var count = thisData.count;//总记录
                if(count>0){
                    if(res.status==200){
                        $("#page").show();
                        //向页面放入数据
                        showResources(thisData.collectionResourcesList);
                        //调用分页方法
                        getPageList(count,crr,3,criteria);
                        $("#page").show();
                    }
                }else{
                   $("#relicList").html('<img id="nullData" src="images/null.jpg">');
                   $("#page").hide();
                }

            }
        });

    })
}

//资源展示
function showResources(thisData) {
    var arr = [];
    layui.each(thisData, function(index, item) {
        var id = item.id;
        var relicName = isBlank(item.title);
        var totalNumber = isBlank(item.identifiertype)+"-"+isBlank(item.identifier);
        var type = isBlank(item.worktype);
        var fcrclass = isBlank(item.level);
        var age = isBlank(item.period);
        var date = isBlank(item.date);
        arr.push('<div class="relic layui-row">'
            + '<div class="relic-data">'
            + '<h2>' + relicName + '</h2>'
            + '<input type="hidden" class="relicId" value="'+id +'">'
            + '<button type="button" class="totalNumber tag">'
            + totalNumber + '</button>'
            + '<button type="button" class="type tag">' + type + '</button>'
            + '<button type="button" class="age tag">' + age + '</button>'
            /*+ '<button type="button" class="date tag">' + date + '</button>'*/
            + '<button type="button" class="fcrclass tag">'+ fcrclass + '</button>'
            +'</div><div class="relic-img">'
        );

        var imgs = item.resourceList;
        //console.log("Img数量："+imgs.length);

        if(imgs.length>5){
            for(var k=0;k<5;k++){
                var imgId = imgs[k].id;
                var relicId = imgs[k].relicId;
                var name = imgs[k].name;
                var addresss = imgs[k].addresss;
                var small=getImgThumb(addresss,0);
                var format = imgs[k].format;
                var resolutionRatio = imgs[k].resolutionratio;
                var imgSize = imgs[k].imgsize;

                arr.push('<div class="imgBox">'
                    + '<a href="#" onclick="openBigImg(this);">'
                    + '<img src="' + small + '" alt="' + small + '"/>'
                    + '</a>'
                    + '<div class="toolbar">'
                    + '<span class="fbl">' + resolutionRatio + '</span>'
                    + '<input type="hidden"  name="imgId" class="imgId" value="' + imgId + '">'
                    + '<div class="toolitem add-relic-img">'
                    + '<a title="加入文物篮"><i class="layui-icon layui-icon-cart"></i></a>'
                    + '</div></div></div>'
                );
            }
            var imgsStr = JSON.stringify(imgs).replace(/"/g, '&quot;');
            arr.push('<div class="allImg">'
                +'<button class="showMore" onclick="lookAllImg(this,\''+imgsStr+'\')"><i class="layui-icon' +
                ' layui-icon-down"></i></button>'
                +'</div>');
        }else {
            if(imgs.length<1){
                arr.push('<img src="images/default.jpg" style="width: 150px;height: 150px">');
            }else{
                for(var k=0;k<imgs.length;k++){
                    var imgId = imgs[k].id;
                    var relicId = imgs[k].relicId;
                    var name = imgs[k].name;
                    var addresss = imgs[k].addresss;
                    var small=getImgThumb(addresss,0);
                    var format = imgs[k].format;
                    var resolutionRatio = imgs[k].resolutionratio;
                    var imgSize = imgs[k].imgsize;

                    arr.push('<div class="imgBox">'
                        + '<a href="#" onclick="openBigImg(this);">'
                        + '<img src="' + small + '" alt="' + small + '"/>'
                        + '</a>'
                        + '<div class="toolbar">'
                        + '<span class="fbl">' + resolutionRatio + '</span>'
                        + '<input type="hidden"  name="imgId" class="imgId" value="' + imgId + '">'
                        + '<div class="toolitem add-relic-img">'
                        + '<a title="加入文物篮"><i class="layui-icon layui-icon-cart"></i></a>'
                        + '</div></div></div>'
                    );
                }
            }
        }

        arr.push('</div></div><br />');
    });
    $("#relicList").html(arr.join(''));
    $('.moreImg').hide();

    $(".imgBox").hover(function(){
        $(this).children(".toolbar").show();
    },function(){
        $(this).children(".toolbar").hide();
    });

    $("img").on("contextmenu",function(){return false;});
    $("img").on("dragstart",function(){return false;});
    $("img").on('mousedown',function (e) { e.preventDefault()});

    addToCart();
}

//分页
function getPageList(count,curr,limit,criteria){
    layui.use(['laypage', 'layer'], function(){
        var laypage = layui.laypage,
            layer = layui.layer;

        laypage.render({
            elem: 'page',
            count: count||0,
            theme: '#009587',
            limit : limit||3,
            curr : curr||1,
            layout: ['count', 'prev', 'page', 'next', 'refresh', 'skip'],
            jump: function(obj,first){
                if(!first){
                    if(criteria == ""){
                        loadData(obj.curr);
                    }else{
                        loadSearchData(criteria,obj.curr);
                    }

                }
            }
        });
    });
}

var imgId = "";
//看大图
function openBigImg(e){
    imgId = $(e).siblings(".toolbar").children(".imgId").val();
    layui.use(['layer'], function () {
        var $ = layui.jquery,
            layer = layui.layer;

        var index = layer.open({
            title:"看大图",
            type:2,
            area:["100%","100%"],
            content: "img.html",
            success:function(layero,index){
                setTimeout(function(){
                    layui.layer.tips("点击此处返回资源利用管理",'layui-layer-setwin','layui-layer-close',{
                        tips:3
                    });
                },500)
            }
        })
        //改变窗口大小时，重置弹窗的高度，防止超出可视区域（如F12调出debug的操作）
        $(window).resize(function(){
            layui.layer.full(index);
        })
        layui.layer.full(index);

    })

}

//查看全部图片
function lookAllImg(e,list){
    var list=JSON.parse(list);
    var $i = $(e).children('i');
    if($i.hasClass('layui-icon-down')){
        if($(e).parent(".allImg").siblings('.moreImg').length > 0 ){
            $(e).parent(".allImg").siblings('.moreImg').show();
        }else{
            var arr=[];
            arr.push('<div class="moreImg">');
            for(var j=5;j<list.length;j++){
                var imgId = list[j].id;
                var relicId = list[j].relicId;
                var name = list[j].name;
                var addresss = list[j].addresss;
                var small=getImgThumb(addresss,0);
                var format = list[j].format;
                var resolutionRatio = list[j].resolutionratio;
                var imgSize = list[j].imgsize;

                arr.push('<div class="imgBox">'
                    + '<a href="#" onclick="openBigImg(this);">'
                    + '<img src="' + small + '" alt="' + small + '"/>'
                    + '</a>'
                    + '<div class="toolbar">'
                    + '<span class="fbl">' + resolutionRatio + '</span>'
                    + '<input type="hidden"  name="imgId" class="imgId" value="' + imgId + '">'
                    + '<div class="toolitem add-relic-img">'
                    + '<a title="加入文物篮"><i class="layui-icon layui-icon-cart"></i></a>'
                    + '</div></div></div>'
                );
            }
            arr.push('</div');
            $(e).parent(".allImg").after(arr.join(''));
        }
        $(e).html('<i class="layui-icon layui-icon-up"></i>');
    }else{
        $(e).parent(".allImg").siblings('.moreImg').hide();
        $(e).html('<i class="layui-icon layui-icon-down"></i>');
    }
}

//获取文物篮数据
function getCartInfo() {

    layui.use(['table'], function () {
        var $ = layui.jquery,
            table = layui.table;

        $.ajax({
            type: "post",
            url: "resource/findUserResources",
            data: {
                "userId":userId
            },
            dataType: "json",
            success: function (res) {
                if(res.status=="200"){
                    var data = res.result;
                    var count = data.count;
                    $("#lmliCount").html(count);
                    if(count>0){
                        var resourceList = data.resourceList;
                        for(var a=0;a<resourceList.length;a++){
                            resourceList[a].addresss = getImgThumb(resourceList[a].addresss,0);
                        }
                        table.reload('shopTable', {
                            data: resourceList
                        });
                    }
                }
            }
        })
    });
}

//加入文物篮
function addToCart(){
    $(".toolbar .add-relic-img").on("click", function () {
        var resourceId = $(this).siblings(".imgId").val();
        $.ajax({
            type: "post",
            url: "relic/insertShopcart",
            data: {
                "userId":userId,
                "resourceId":resourceId
            },
            dataType: "json",
            success: function (res) {
                if(res.status=="200"){
                    layer.msg("加入文物篮成功！", {icon: 1});
                    getCartInfo();
                }else{
                    layer.msg("请不要重复添加！", {icon: 7});
                }

            }
        })
    });
}

//查看全部
function seeMore() {
    var $li = $("#menu22",parent.document);//子页面获取父页面元素
    $li.trigger("click");//触发点击事件
}

//判断文物数据是否为空
function isBlank(str){
    if (str == null || str == undefined || str == '') {
        str="暂无数据";
    }
    return str;
}

