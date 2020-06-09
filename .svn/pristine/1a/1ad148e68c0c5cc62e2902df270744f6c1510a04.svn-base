var userInfoStr = sessionStorage.getItem("userInfo");
var userInfo = JSON.parse(userInfoStr);

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
                //console.log(res.result);
                var wwlData = res.result;
                if(wwlData.length>0){
                    showCart(wwlData);
                }else{
                    $(".cartMain").html('<img id="nullData" src="images/null.jpg">');
                }
            }

        }
    })
}

//文物篮显示
function showCart(wwlData){
    var arr = [];
    arr.push('<div class="cartMain_hd">'
        +'<ul class="order_lists cartTop">'
        +'<li class="list_chk">'
        +'<input type="checkbox" id="all" class="whole_check">'
        +'<label for="all"></label>全选</li>'
        +'<li class="list_con">图片</li>'
        +'<li class="list_info">图片大小</li>'
        +'<li class="list_price">格式</li>'
        +'<li class="list_sum">分辨率</li>'
        +'<li class="list_op">操作</li>'
        +'</ul></div>'
    );
    for(var j=0;j<wwlData.length;j++){
        var w_relicName = wwlData[j].title;
        var w_relicId = wwlData[j].id;
        arr.push('<div class="cartBox">'
            +'<div class="shop_info">'
            +'<div class="all_check">'
            +'<input type="checkbox" id="shop_'+w_relicId+'" class="shopChoice">'
            +'<label for="shop_'+w_relicId+'" class="shop"></label></div>'
            +'<div class="shop_name">'
            +'文物：<a href="javascript:;">'+w_relicName+'</a>'
            +'</div></div>'
            +'<div class="order_content">'
        );

        var w_img = wwlData[j].resourceList;

        for(var k=0;k<w_img.length;k++){
            var _id = w_img[k].id;
            var _addresss = w_img[k].addresss;
            var _small = getImgThumb(_addresss);
            var _name = w_img[k].name;
            var _format = w_img[k].format;
            var _resolutionRatio = w_img[k].resolutionRatio;
            var _imgSize = w_img[k].imgSize;
            arr.push('<ul class="order_lists">'
                +'<li class="list_chk">'
                +'<input type="checkbox" id="checkbox_'+_id+'" class="son_check">'
                +'<label for="checkbox_'+_id+'" ></label>'
                +'</li>'
                +'<li class="list_con">'
                +'<div class="list_img"><a href="javascript:;">'
                +'<img src="'+_small+'" alt="'+_small+'"></a>'
                +'</div><div class="list_text">'+_name+'</div>'
                +'</li>'
                +'<li class="list_info"><p>尺寸：'+_imgSize +'</p></li>'
                +'<li class="list_price"><p class="price">'+_format +'</p></li>'
                +'<li class="list_sum"><p class="sum_price">'+_resolutionRatio +'</p></li>'
                +'<li class="list_op"><p class="del"><a href="javascript:;" class="delBtn">删除</a></p>'
                +'</li></ul>'
            );
        }
        arr.push('</div></div>');
        arr.push('<div class="bar-wrapper">'
            +'<div class="bar-right">'
            +'<div class="calBtn">'
            +'<a href="javascript:;">生成资源清单</a>'
            +'</div></div></div>');
    }
    $(".cartMain").html(arr.join(''));

    $("img").on("contextmenu",function(){return false;});
    $("img").on("dragstart",function(){return false;});
    $("img").on('mousedown',function (e) { e.preventDefault()});

    carts();
}


//生成资源清单
$('.zyqdSubmit').click(function() {
    var ids = "";
    var $sonCheckBox = $('.son_check');
    $sonCheckBox.each(function () {
        if ($(this).is(':checked')) {
            var id = $(this).attr("id");
            var imgID = id.split("_")[1];
            ids += imgID +",";
        }
    });
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
                layui.use(['layer'], function () {
                    var layer = layui.layer;
                    layer.msg("生成资源清单成功！", {time:500,icon: 1}, function (){
                        var $li = $("#menu11",parent.document);//子页面获取父页面元素
                        $li.trigger("click");//触发点击事件
                    });
                })

            }
        }
    })
});

//获取图片缩略图路径
function getImgThumb(addresss) {
    var index = addresss.lastIndexOf("/");
    var prefix = "thumb/"+addresss.substring(0,index);
    var suffix = addresss.substring(index+1);
    var pos = suffix.lastIndexOf(".");
    suffix = suffix.substring(0,pos)+".png";
    var thumb=prefix+"/small-thumb_"+suffix;
    return thumb;
}

