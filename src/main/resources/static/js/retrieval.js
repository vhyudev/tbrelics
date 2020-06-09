//获取年代
function getAgeAndType() {
    $.ajax({
        type: "post",
        url: "relic/findSearchCriteria",
        data: {},
        dataType: "json",
        success: function (res) {
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
            console.log(criteria);
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

//无条件分页
function loadData(crr) {
    var loadingFlag;
    layui.use(['laypage', 'layer'], function() {
        var layer = layui.layer;

        $.ajax({
            type: "post",
            url: "resourceCollection/findAllPage",
            data: {
                "pageNum": crr || 1,
                "pageSize": 20
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
                        showResources(thisData.wrcList);
                        //调用分页方法
                        getPageList(count, crr, 20,"");
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

//文物号模糊搜索
function keywordSearch(crr) {
    var identifier = $("#keyword").val();
    var loadingFlag;

    layui.use(['laypage', 'layer'], function() {
        var $ = layui.jquery,
            layer = layui.layer;

        $.ajax({
            type: "post",
            url: "resourceCollection/findRelicByLike",
            data: {
                "identifier":identifier,
                "pageNum": crr || 1,
                "pageSize": 20
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
                        showResources(thisData.wrcList);
                        //调用分页方法
                        searchGetPageList(count,crr,20);
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
            limit : limit||20,
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
            url: "resourceCollection/findBySqlPage",
            data: {
                "sqlConditional": criteria,
                "pageNum": crr || 1,
                "pageSize": 20
            },
            dataType: "json",
            beforeSend: function () {
                loadingFlag= layer.msg('正在读取数据，请稍候……', {icon: 16,time:2000,shade:0.8});
            },
            success: function(res){
                layer.close(loadingFlag);

                var thisData = res.result;
                var count = thisData.count;//总记录
                if(count>0){
                    if(res.status==200){
                        $("#page").show();
                        //向页面放入数据
                        showResources(thisData.wrcList);
                        //调用分页方法
                        getPageList(count,crr,20,criteria);
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
        var imgId = item.id;
        var addresss = item.addresss;//图片地址
        var resolutionRatio = item.resolutionratio;//分辨率
        var relicname = item.title;//文物名称
        arr.push('<div class="imgBox">'
            +'<a href="#" onclick="openBigImg(this);">'
            +'<img src="'+addresss+'" alt="'+addresss+'"/>'
            +'</a>'
            +'<div class="toolbar">'
        );
        if(relicname.length>10){
            var t =relicname.slice(0,9)+"...";
            arr.push('<div class="canshu"><a title="'+ relicname +'">'+ t +'</a>');
        }else{
            arr.push('<div class="canshu"><a title="'+ relicname +'">'+relicname +'</a>');
        }
        arr.push('<br><span class="fbl">'+resolutionRatio+'</span></div>'
            +'<input type="hidden"  name="imgId" class="imgId" value="'+ imgId +'">'
            +'<div class="toolitem add-relic-img">'
            +'<a title="加入文物篮"><i class="layui-icon layui-icon-cart"></i></a>'
            +'</div></div></div>'
        );
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

    lookAllImg();
    //showCart();
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
            limit : limit||20,
            curr : curr||1,
            layout: ['count', 'prev', 'page', 'next'],
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

var imgSrc = "";
//看大图
function openBigImg(e){
    imgSrc =$(e).children('img').attr('src');

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
function lookAllImg(){
    $(".allImg").on("click", function () {
        var $i = $(this).children('i');
        if($i.hasClass('layui-icon-down')){
            $(this).siblings('.moreImg').show();
            $(this).html('<i class="layui-icon layui-icon-up" style="font-size: 60px;"></i>');
        }else{
            $(this).siblings('.moreImg').hide();
            $(this).html('<i class="layui-icon layui-icon-down" style="font-size: 60px;"></i>');
        }

    })
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
    var $li = $("#menu12",parent.document);//子页面获取父页面元素
    $li.trigger("click");//触发点击事件
}

//判断文物数据是否为空
function isBlank(str){
    if (str == null || str == undefined || str == '') {
        str="暂无数据";
    }
    return str;
}
