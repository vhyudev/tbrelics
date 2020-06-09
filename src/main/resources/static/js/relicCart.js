var userInfoStr = sessionStorage.getItem("userInfo");
var userInfo = JSON.parse(userInfoStr);

layui.use(['form','layer'],function() {
    var $ = layui.jquery,
        layer = parent.layer === undefined ? layui.layer : parent.layer;
    form = layui.form;

    getWwlInfo();
    allCheck();
    isAllCheck();
    batchDel();
    submitForm();
})

//获取文物篮信息
function getWwlInfo() {
    $.ajax({
        type: "post",
        url: "resourceCollection/findShopcart",
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
    layui.each(wwlData, function(index, item) {
        var imgId = item.resid;
        var addresss = item.addresss;//图片地址
        var resolutionRatio = item.resolutionratio;//分辨率
        var format = item.format;//格式
        var imgSize = item.imgsize;//图片大小
        var relicname = item.title;//文物名称
        arr.push('<div class="imgItem">'
            +'<table class="img-table"><tr>'
            +'<td rowspan="3">'
            +'<div class="imgBox">'
            +'<img src="'+addresss+'" alt="'+addresss+'"/>'
            +'<div class="itemCtrl">'
            +'<input type="checkbox" lay-filter="choose" lay-skin="primary" class="son_check" value="'+imgId+'">'
        );
        /*if(relicname.length>10){
            var t =relicname.slice(0,9)+"...";
            arr.push('<div class="canshu"><a title="'+ relicname +'">'+ t +'</a></div>');
        }else{
            arr.push('<div class="canshu"><a title="'+ relicname +'">'+relicname +'</a></div>');
        }*/
        arr.push('</div></div></td>'
            +'<td><span style="color: red">' + format + '</span></td></tr>'
            +'<tr><td>' + resolutionRatio + '</td></tr>'
            +'<tr><td>' + imgSize + '</td></tr>'
            +'</tr></table></div>'
        );
    })
    $("#relicList").html(arr.join(''));
    form.render();

    /*$('.canshu').hide();
    $(".imgBox").hover(function(){
        $(this).children(".canshu").show();
    },function(){
        $(this).children(".canshu").hide();
    });*/

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

//判断是否全选
function isAllCheck(){
    form.on("checkbox(choose)",function(data){
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



