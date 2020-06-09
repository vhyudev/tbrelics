var userInfoStr = sessionStorage.getItem("userInfo");
var userInfo = JSON.parse(userInfoStr);

var applicationId = 0;

layui.use(['form', 'table'], function () {
    var $ = layui.jquery,
        layer = layui.layer,
        form = layui.form,
        table = layui.table;

    table.render({
        elem: '#currentTable',
        data: [],
       /* toolbar: '#toolbarDemo', //开启头部工具栏，并为其绑定左侧模板
        defaultToolbar: [],*/
        cols: [
            [
                {type: "checkbox"},
                {field: 'id', title: '编号', width:60},
                {field: 'appname', title: '名称', width:150},
                {field: 'purpose', title: '用途'},
                {field: 'realname', title: '申请人'},
                {field: 'applyTimeStr', title: '申请时间',sort:true},
                /*{field: 'useTimeStr', title: '使用时间',sort:true},*/
                {field: 'total', title: '资源数量',sort:true},
                {field: 'status', title: '审核状态', templet: '#buttonTpl'},
                {filed: 'right', title: '操作', templet:'#currentTableBar'}
            ]
        ],
        limits: [10],
        limit: 10,
        page: true
    });

    $(function () {
        getApplications();
    })

    function getApplications() {
        var loadingFlag;
        layui.use(['laypage', 'layer'], function() {
            var layer = layui.layer;
            $.ajax({
                type: "post",
                url: "application/findApplications",
                data: {
                    "userId":userInfo.uid
                },
                dataType: "json",
                beforeSend: function () {
                    loadingFlag= layer.msg('正在读取数据，请稍候……', {icon: 16,time:false,shade:0.8});
                },
                success: function (res) {
                    layer.close(loadingFlag);
                    if(res.status=="200"){
                        var data = res.result;
                        //console.log(data);
                        if(data.length>0){
                            table.reload('currentTable', {
                                data: data
                            });
                        }
                    }

                }
            })
        })
    }

    // 监听搜索操作
    form.on('submit(data-search-btn)', function (data) {
        var result = JSON.stringify(data.field);
        layer.alert(result, {
            title: '最终的搜索信息'
        });

        //执行搜索重载
        table.reload('currentTable', {
            page: {
                curr: 1
            }
            , where: {
                searchParams: result
            }
        }, 'data');

        return false;
    });


    // 监听批量删除操作
    /*$(".data-delete-btn").on("click", function () {
        var checkStatus = table.checkStatus('currentTable'),
            data = checkStatus.data;
        if(data.length<1){
            layer.msg("请选择需要删除的图片!", {icon: 0});
        }else{
            layer.confirm('确定删除选中的图片？',{icon:3, title:'提示信息'},function(index){
                var index = layer.msg('删除中，请稍候',{icon: 16,time:false,shade:0.8});
                setTimeout(function(){
                    layer.close(index);
                },1000);
            })
        }
    });*/

    //监听表格复选框选择
    table.on('checkbox(currentTable)', function (obj) {
        console.log(obj)
    });

    table.on('tool(currentTable)', function (obj) {
        var data = obj.data;
        if (obj.event === 'look') {//查看
            applicationId = data.id;
            var index = layer.open({
                title:"资源列表",
                type:2,
                area:["100%","100%"],
                content: "zyqdxx.html",
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
        }else if(obj.event === 'del'){//删除
            layer.confirm('真的删除资源清单吗？', function(index){
                $.ajax({
                    type: "post",
                    url: "application/delOneApplication",
                    data: {
                        "applicationId":data.id
                    },
                    dataType: "json",
                    success: function (res) {
                        if(res.status=="200"){
                            console.log(res.result);
                            obj.del();
                            layer.close(index);
                            layer.msg("删除成功!", {icon: 1});
                        }
                    }
                })
            });

        }
    });
});