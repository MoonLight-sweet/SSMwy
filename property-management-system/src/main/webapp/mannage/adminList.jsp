
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>
        管理员列表
    </title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="../css/main.css" media="all">
    <link rel="stylesheet" href="../css/bootstrap.css">
</head>
<body>
<div class="x-nav">
            <span class="layui-breadcrumb">
              <a><cite>首页</cite></a>
              <a><cite>管理员管理</cite></a>
              <a><cite>管理员列表</cite></a>
            </span>
    <a class="layui-btn layui-btn-small" style="line-height:1.6em;margin-top:3px;float:right"  href="javascript:location.replace(location.href);" title="刷新"><i class="layui-icon" style="line-height:30px">ဂ</i></a>
</div>
<div class="x-body">
    <form class="layui-form x-center" action="" style="width:800px">
        <div class="layui-form-pane" style="margin-top: 15px;">
            <div class="layui-form-item">
                <div class="layui-input-inline">
                    <input type="text" name="username"  placeholder="管理员用户名" autocomplete="off" class="layui-input">
                </div>
                <div class="layui-input-inline" style="width:80px">
                    <button class="layui-btn"  lay-submit="" lay-filter="sreach"><i class="layui-icon">&#xe615;</i></button>
                </div>
            </div>
        </div>
    </form>
    <xblock>
        <button class="layui-btn layui-btn-danger" onclick="delAll()">
            <i class="layui-icon">&#xe640;</i>批量删除
        </button>
        <button class="layui-btn" onclick="admin_add('添加成员','../admin/admin_add','1000','600')">
            <i class="layui-icon">&#xe608;</i>添加
        </button>
        <span class="x-right" style="line-height:40px">共有数据：<span class="layui-badge">${count}</span> 条</span>
    </xblock>

    <%--    layui渲染表单--%>

    <table class="layui-table">
        <thead>
        <tr>
            <th>
                <input type="checkbox" name="quan" id="quan" value="">
            </th>

            <th>
                ID
            </th>
            <th>
                用户名
            </th>
            <th>
                姓名
            </th>
            <th>
                电话
            </th>
            <th>
                邮箱
            </th>
            <th>
                头像
            </th>
            <th>
                管理员身份
            </th>
            <th>
                登记日期
            </th>
            <th>
                权限状态
            </th>
            <th>
                操作
            </th>
        </tr>
        </thead>
        <tbody id="x-img">
        <c:forEach var="admin" items="${adminList}">
            <tr>

                <td>
                    <input type="checkbox" value="${admin.id}" name="oid">
                </td>
                <td>
                        ${admin.id}
                </td>
                <td>
                        ${admin.username}
                </td>
                <td>
                        ${admin.realname}
                </td>
                <td>
                        ${admin.phone}
                </td>
                <td>
                        ${admin.email}
                </td>
                <td>
                    <img src="../userImg/${admin.img}" width="50" height="30">
                </td>
                <td>
                        ${admin.rolename}
                </td>
                <td>
                    <fmt:formatDate value="${admin.hiredate}" pattern="yyyy-MM-dd"/>
                </td>
                <td>
                    <c:if test="${admin.available=='0'}">
                        <span style="color: red">禁止访问</span>
                    </c:if>
                    <c:if test="${admin.available=='1'}">
                        <span style="color: green">允许访问</span>
                    </c:if>
                </td>
                <td class="td-manage">
                    <a title="编辑" href="javascript:;"
                       onclick="admin_edit('编辑','admin_edit',${admin.id},'1000','600')"
                       class="ml-5" style="text-decoration:none">
                        <i class="layui-icon">&#xe642;</i>
                    </a>
                    <a title="删除" href="javascript:;" onclick="admin_del(this,${admin.id})"
                       style="text-decoration:none">
                        <i class="layui-icon">&#xe640;</i>
                    </a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


    <!--显示分页信息-->
    <div class="page">
        <!--文字信息-->
        <%--        <div class="col-md-6">--%>
        <%--            当前第 ${pageInfo.pageNum} 页.总共 ${pageInfo.pages} 页.一共 ${pageInfo.total} 条记录--%>
        <%--        </div>--%>
        <!--点击分页-->
        <ul class="pagination">
            <li><a href="../admin/admin_list?pageNum=1&username=${username}">首页</a></li>
            <!--上一页-->
            <li>
                <c:if test="${pageInfo.hasPreviousPage}">
                    <a href="../admin/admin_list?pageNum=${pageInfo.pageNum-1}&username=${username}" aria-label="Previous">
                        <span aria-hidden="true">«</span>
                    </a>
                </c:if>
            </li>
            <!--循环遍历连续显示的页面，若是当前页就高亮显示，并且没有链接-->
            <c:forEach items="${pageInfo.navigatepageNums}" var="page_num">
                <c:if test="${page_num == pageInfo.pageNum}">
                    <li class="active"><a href="#">${page_num}</a></li>
                </c:if>
                <c:if test="${page_num != pageInfo.pageNum}">
                    <li><a href="../asdmin/admin_list?pageNum=${page_num}&username=${username}">${page_num}</a></li>
                </c:if>
            </c:forEach>
            <!--下一页-->
            <li>
                <c:if test="${pageInfo.hasNextPage}">
                    <a href="../admin/admin_list?pageNum=${pageInfo.pageNum+1}&username=${username}"
                       aria-label="Next">
                        <span aria-hidden="true">»</span>
                    </a>
                </c:if>
            </li>
            <li><a href="../admin/admin_list?pageNum=${pageInfo.pages}&username=${username}">尾页</a></li>
        </ul>
    </div>

</div>
<script src="../lib/layui/layui.js" charset="utf-8"></script>
<script src="../js/x-layui.js" charset="utf-8"></script>
<script>
    layui.use(['laydate','element','laypage','layer'], function(){
        $ = layui.jquery;//jquery
        laydate = layui.laydate;//日期插件
        lement = layui.element();//面包导航
        laypage = layui.laypage;//分页
        layer = layui.layer;//弹出层


        //以上模块根据需要引入
        layer.ready(function(){ //为了layer.ext.js加载完毕再执行
            layer.photos({
                photos: '#x-img'
                //,shift: 5 //0-6的选择，指定弹出图片动画类型，默认随机
            });
        });
        var start = {
            min: laydate.now()
            ,max: '2099-06-16 23:59:59'
            ,istoday: false
            ,choose: function(datas){
                end.min = datas; //开始日选好后，重置结束日的最小日期
                end.start = datas //将结束日的初始值设定为开始日
            }
        };

        var end = {
            min: laydate.now()
            ,max: '2099-06-16 23:59:59'
            ,istoday: false
            ,choose: function(datas){
                start.max = datas; //结束日选好后，重置开始日的最大日期
            }
        };

        document.getElementById('LAY_demorange_s').onclick = function(){
            start.elem = this;
            laydate(start);
        }
        document.getElementById('LAY_demorange_e').onclick = function(){
            end.elem = this
            laydate(end);
        }
    });

    //批量删除提交

    //批量删除提交
    function delAll(obj, id) {
        //捉到所有被选中的，发异步进行删除
        var oid = $("input[name='oid']:checked");
        if (oid.size() == 0) {
            alert("你还没有选中项无法删除！");
        } else {
            layer.confirm('确认要删除吗？', {icon: 3, title: '提示信息'}, function (index) {
                var ids = "";
                oid.each(function () {
                    ids = ids + $(this).val() + ",";
                });
                $.ajax({
                    type: "delete",
                    // data: {"ids": ids.substring(0, ids.length - 1)},
                    url: "./deleteAdminByIds/" + ids.substring(0, ids.length - 1),
                    dataType: "json",
                    success: function (data) {
                        console.log(data);
                        if (data.code == 200) {
                            //发异步删除数据
                            $(obj).parents("tr").remove();
                            layer.msg(data.info, {icon: 6, time: 1000});
                            setTimeout(function () {
                                window.location.reload();
                            }, 1000);
                            return false;
                        } else {
                            layer.msg(data.info, {icon: 5, time: 1000});
                            return false;
                        }
                    }
                });
                //发异步删除数据
                $(obj).parents("tr").remove();
                layer.msg('已删除!', {icon: 1, time: 1000});
            });
        }
    }

    function question_show (argument) {
        layer.msg('可以跳到前台具体问题页面',{icon:1,time:1000});
    }

    /*添加*/
    function admin_add(title,url,w,h){
        x_admin_show(title,url,w,h);
    }

    //编辑
    function admin_edit (title,url,id,w,h) {
        url = url+"?id="+id;
        x_admin_show(title,url,w,h);
    }

    /*删除*/
    function admin_del(obj,id){
        layer.confirm('确认要删除吗？',{icon:3,title:'提示信息'},function(index){
            $.ajax({
                type:"delete",
                url:"deleteAdminlById/?id=" + id,
                dataType:"json",
                success:function(data){
                    //console.log(data);
                    if(data.code == 200){
                        //发异步删除数据
                        $(obj).parents("tr").remove();
                        layer.msg(data.info,{icon:6,time:1000});
                        setTimeout(function(){
                            window.location.reload();
                        },1000);return false;
                    } else{
                        layer.msg(data.info,{icon:5,time:1000});return false;
                    }
                }
            });
            //发异步删除数据
            $(obj).parents("tr").remove();
            layer.msg('已删除!',{icon:1,time:1000});
        });
    }



</script>

</body>
</html>
