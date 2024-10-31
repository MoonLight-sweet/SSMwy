
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>
        添加收费管理项目
    </title>
    <meta name="renderer" content="webkit">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="format-detection" content="telephone=no">
    <link rel="stylesheet" href="../css/main.css" media="all">
    <%--    <script type="text/javascript" src="lib/loading/okLoading.js"></script>--%>

    <style>
        .imgs {
            display: none;
        }
    </style>
</head>
<body>
<div class="x-body">
    <form class="layui-form layui-form-pane" action="" id="add">
        <div class="layui-tab layui-tab-brief" lay-filter="docDemoTabBrief">
            <div class="layui-tab-content">
                <div class="layui-tab-item layui-show">
                    <input type="hidden" name="id" value=""/>
                    <div class="layui-form-item">
                        <label class="layui-form-label">
                            <span class='x-red'>*</span>所属小区
                        </label>
                        <div class="layui-input-block">
                            <select name="conmunityName" id="conmunityName" >
                                <c:forEach var="comInfo" items="${communities}">
                                    <option value="${comInfo.name}">${comInfo.name}</option>
                                </c:forEach>
                            </select>
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">
                            <span class='x-red'>*</span>收费项目编码
                        </label>
                        <div class="layui-input-block">
                            <input type="text" name="chargeNum" autocomplete="off" placeholder="收费项目编码"
                                   class="layui-input" value="">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">
                            <span class='x-red'>*</span>收费项目名称
                        </label>
                        <div class="layui-input-block">
                            <input type="text" name="chargeName" autocomplete="off" placeholder="收费项目名称"
                                   class="layui-input" value="">
                        </div>
                    </div>
                    <div class="layui-form-item">
                        <label class="layui-form-label">
                            <span class='x-red'>*</span>登记时间
                        </label>
                        <div class="layui-input-inline">
                            <input class="layui-input" name="createDateTime" placeholder="登记时间" id="LAY_demorange_s" value="">
                        </div>
                    </div>

                    <div class="layui-form-item">
                        <button class="layui-btn" type="button" lay-filter="add" lay-submit="">
                            保存
                        </button>
                    </div>
                    <!--</form>-->
                    <div style="height:100px;"></div>
                </div>

            </div>

        </div>
    </form>
</div>
<script src="../lib/layui/layui.js" charset="utf-8"></script>
<script src="../js/x-layui.js" charset="utf-8"></script>
<script src="../js/jquery.min.js" charset="utf-8"></script>
<!--<script src="/static/xiyuan/js/jquery.js" charset="utf-8"></script>-->
<script>

    layui.use(['laydate', 'element', 'layer', 'form'], function () {
        $ = layui.jquery;//jquery

        laydate = layui.laydate;//日期插件
        lement = layui.element();//面包导航
        layer = layui.layer;//弹出层

        form = layui.form();
        // okLoading.close($);
        // form.render();

        var start = {
            max: '2099-06-16 23:59:59'
            , istoday: false
            , choose: function (datas) {
                //end.min = datas; //开始日选好后，重置结束日的最小日期
                //end.start = datas //将结束日的初始值设定为开始日
            }
        };

        document.getElementById('LAY_demorange_s').onclick = function () {
            start.elem = this;
            laydate(start);
        };

        //监听提交
        form.on('submit(add)', function (data) {
            var conmunityName = $("select[name='conmunityName']").val();
            var chargeNum = $("input[name='chargeNum']").val();
            var chargeName = $("input[name='chargeName']").val();
            var createDateTime = $("input[name='createDateTime']").val().replaceAll("-","/");
            if (conmunityName == "") {
                layer.msg('小区名称不能为空', {icon: 5, time: 2000});
                return false;
            }
            if (chargeNum == "") {
                layer.msg('收费项目编号不能为空', {icon: 5, time: 2000});
                return false;
            }
            if (chargeName == "") {
                layer.msg('收费项目名称不能为空', {icon: 5, time: 2000});
                return false;
            }
            var dt = {
                "communituName": conmunityName
                , "chargeNum": chargeNum
                , "chargeName": chargeName
                , "createDateTime": createDateTime
            };
            $.ajax({
                type: "post",
                url: "chargeInsert",
                data: dt,
                dataType: "json",
                success: function (reg) {
                    //alert(1);
                    if (reg.code == 200) {
                        layer.msg(reg.info, {icon: 6, time: 2000}, function () {
                            window.parent.location.reload();
                            var index = parent.layer.getFrameIndex(window.name);
                            parent.layer.close(index);
                        });
                        return false;

                    } else {
                        layer.msg(reg.info, {icon: 5, time: 2000});
                        return false;
                    }
                }

            });

        });
    })
</script>
</body>
</html>

