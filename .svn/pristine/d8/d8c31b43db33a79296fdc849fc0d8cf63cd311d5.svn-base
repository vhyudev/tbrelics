var userInfoStr = sessionStorage.getItem("userInfo");
var userInfo = JSON.parse(userInfoStr);

layui.use(['form','layer'],function() {
    var $ = layui.jquery,
        layer = parent.layer === undefined ? layui.layer : parent.layer;
        form = layui.form;

    getWwlInfo();
    allCheck();
    relicAllCheck();
    isAllCheck();
    batchDel();
    submitForm();
})

//获取文物篮信息
function getWwlInfo() {
    $.ajax({
        type: "post",
        url: "relic/findShopcart",
        data: {
            "userId":userInfo.uid
        },
        dataType: "json",
        success: function (res) {
            if(res.status=="200"){
                var wwlData = res.result;
                console.log(wwlData);
                if(wwlData.length>0){
                    showCart(wwlData);
                }else{
                    $("#relicList").html('<img id="nullData" src="images/null.jpg">');
                }
            }

        }
    })
}

function showCart(wwlData) {
    var arr = [];
    for(var j=0;j<wwlData.length;j++) {
        var w_relicName = wwlData[j].title;
        var w_relicId = wwlData[j].id;
        var Img = wwlData[j].resourceList;

        arr.push('<div class="relic layui-row">'
            + '<div class="relic-data all_check">'
            + '<input type="checkbox" lay-filter="relicChoose" lay-skin="primary" class="shopChoice" value="'+w_relicId+'">'
            + '文物:' + w_relicName
            +'</div><div class="relic-img">'
        );
        for(var k=0;k<Img.length;k++) {
            var imgId = Img[k].id;
            var relicId = Img[k].relicId;
            var name = Img[k].name;
            var addresss = Img[k].addresss;
            var small = getImgThumb(addresss,0);
            var format = Img[k].format;
            var resolutionRatio = Img[k].resolutionratio;
            var imgSize = Img[k].imgsize;

            arr.push('<div class="imgItem">'
                +'<table class="img-table"><tr>'
                +'<td rowspan="3">'
                +'<div class="imgBox">'
                +'<img src="'+small+'" alt="'+small+'"/>'
                +'<div class="itemCtrl">'
                +'<input type="checkbox" lay-filter="choose" lay-skin="primary" class="son_check" value="'+imgId+'">'
                +'</div></div>'
                +'</td>'
                +'<td><span style="color: red">' + format + '</span></td></tr>'
                +'<tr><td>' + resolutionRatio + '</td></tr>'
                +'<tr><td>' + imgSize + '</td></tr>'
                +'</tr></table></div>'
            );
        }
        arr.push('</div></div>');
    }
    $("#relicList").html(arr.join(''));
    form.render();

    $('.itemCtrl').hide();
    $(".imgBox").hover(function(){
        $(this).children(".itemCtrl").show();
    },function(){
        $(this).children(".itemCtrl").hide();
    });

    $("img").on("contextmenu",function(){return false;});
    $("img").on("dragstart",function(){return false;});
    $("img").on('mousedown',function (e) { e.preventDefault()});
}

//全选
function allCheck(){
    form.on("checkbox(selectAll)",function(data){
        var child = $("#relicList input[type='checkbox']");
        child.each(function(index, item){
            item.checked = data.elem.checked;
        });
        form.render('checkbox');
    })
}

//全选文物资源
function relicAllCheck(){
    form.on("checkbox(relicChoose)",function(data){
        var child = $(data.elem).parent(".relic-data").siblings(".relic-img").find("input[type='checkbox']");
        child.each(function(index, item){
            item.checked = data.elem.checked;
        });
        //全局全选与单个资源的关系
        var relicChild = $(data.elem).parents('#relicList').find('.relic-data input[type="checkbox"]');
        var relicChildChecked = $(data.elem).parents('#relicList').find('.relic-data input[type="checkbox"]:checked');
        if(relicChildChecked.length == relicChild.length){
            $('#selectAll').prop("checked", true);
        }else{
            $('#selectAll').prop("checked", false);
        }
        form.render('checkbox');
    })
}

//判断是否全选
function isAllCheck(){
    form.on("checkbox(choose)",function(data){
        //每个文物与其下资源的关系
        var child = $(data.elem).parents('.relic-img').find('input[type="checkbox"]');
        var childChecked = $(data.elem).parents('.relic-img').find('input[type="checkbox"]:checked');
        if(childChecked.length == child.length){
            $(data.elem).parents('.relic-img').siblings(".relic-data").find('input.shopChoice').get(0).checked = true;
        }else{
            $(data.elem).parents('.relic-img').siblings(".relic-data").find('input.shopChoice').get(0).checked = false;
        }
        //全局全选与单个资源的关系
        var allChild = $(data.elem).parents('#relicList').find('.itemCtrl input[type="checkbox"]');
        var allChildChecked = $(data.elem).parents('#relicList').find('.itemCtrl input[type="checkbox"]:checked');
        if(allChildChecked.length == allChild.length){
            $('#selectAll').prop("checked", true);
        }else{
            $('#selectAll').prop("checked", false);
        }
        form.render('checkbox');
    })
}

//批量删除
function batchDel(){
    $(".batchDel").click(function(){
        var $sonCheckBox = $('.son_check');
        var ids = "";
        $sonCheckBox.each(function () {
            if ($(this).is(':checked')) {
                var id = $(this).val();
                ids += id +",";
            }
        });
        console.log("ids:"+ids);
        if(ids.length!=0 && ids!=""){
            layer.confirm('确定删除选中的资源？',{icon:3, title:'提示信息'},function(index){
                $.ajax({
                    type: "post",
                    url: "relic/delBatchShopcart",
                    data: {
                        "userId":userInfo.uid,
                        "ids":ids
                    },
                    dataType: "json",
                    success: function (res) {
                        if(res.status=="200"){
                           layer.msg("已删除!",{icon:1,time:2000,shade:0.8}, function (){
                               window.location.reload();
                           });

                        }else{
                            layer.msg("删除失败",{icon: 2});
                        }

                    }
                })

            })
        }else{
            layer.msg("请选择需要删除的资源！",{icon: 7});
        }
    })
}

function submitForm() {
    $(".zyqdSubmit").click(function(){
        var $sonCheckBox = $('.son_check');
        var ids = "";
        $sonCheckBox.each(function () {
            if ($(this).is(':checked')) {
                var id = $(this).val();
                ids += id +",";
            }
        });
        console.log("ids:"+ids);
        if(ids.length!=0 && ids!=""){
            var html = '<form class="layui-form"><div class="layui-form-item" style="margin-top: 10px">'
                +'<label class="layui-form-label" style="border: none;">名称</label>'
                +'<div class="layui-input-inline">'
                +'<input type="text" name="resourceName" id="resourceName" class="layui-input" autocomplete="off" >'
                +'</div></div><div class="layui-form-item">'
                +'<label class="layui-form-label" style="border: none">用途</label>'
                +'<div class="layui-input-inline">'
                +'<input type="text" name="resourceUse" id="resourceUse" class="layui-input" autocomplete="off" >'
                +'</div></div><div class="layui-form-item">'
                +'<div class="layui-input-block">'
                +'<input class="layui-btn queding" value="提交" type="button">'
                +'<input class="layui-btn layui-btn-primary quxiao" value="取消" type="button">'
                +'</div></div></form>';
            var index=layer.open({
                type: 1,
                title: '资源清单信息',
                shadeClose: true,
                area : ['400px' , '240px'],
                content: html //这里content是一个普通的String
            });

            $(".quxiao").click(function(){
                layer.close(index);//关闭弹窗
            });

            $(".queding").click(function(){
                $.ajax({
                    type: "post",
                    url: "application/applyApplications",
                    data: {
                        "userId":userInfo.uid,
                        "listName" : $("#resourceName").val(),
                        "use" : $("#resourceUse").val(),
                        "ids": ids
                    },
                    dataType: "json",
                    success: function (res) {
                        if(res.status==200){
                            layer.msg("生成资源清单成功！", {time:500,icon: 1}, function (){
                                layer.close(index);
                                window.location.reload();
                            })
                        }
                    }
                })
            })
        }else{
            layer.msg("请选择需要删除的资源！",{icon: 7});
        }
    })
}



