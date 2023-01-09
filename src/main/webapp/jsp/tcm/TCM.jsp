<%@ page import="pojo.TraditionalChineseMedicine" %>
<%@ page import="java.util.List" %>

<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/11/11
  Time: 11:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>中草药管理模块</title>
    <script>
        function add(){
            window.self.location = "/tcm/addProc";
        }
        function sub(){
            document.getElementById("name").value = "";
            document.getElementById("alias").value = "";
            document.getElementById("bjyw").value = "";
            var useForm = document.getElementById("useForm");
            useForm.submit();

        }
    </script>
    <style>
        td{
            text-align: center;
            color: aqua;
        }
        .div3 {
            background: azure;
        }
    </style>
</head>
<%
    List<TraditionalChineseMedicine> list = (List<TraditionalChineseMedicine> )request.getAttribute("list");
    String name = (String)request.getAttribute("name");
    String alias = (String)request.getAttribute("alias");
    String bjyw = (String)request.getAttribute("bjyw");
%>
<body>
<h1 style="text-align: center">中草药管理模块</h1>
<div style="text-align: center;margin: 20px">
    <form action="/tcm/list" method="post" id="useForm">
        中药名:<input id="name" value="<%=name%>" name="name" type="text" />
        别名:<input id="alias" value="<%=alias%>"  name="alias" type="text" />
        本经原文:<input id="bjyw" value="<%=bjyw%>" name="bjyw" type="text" />
        <input type="submit"   value="查询"/>&nbsp;
        <input type="button" onclick="add()"   value="添加"/>
        <input type="button" onclick="sub()" value="重置"/>
    </form>
</div>
<div class="div3">
    <table border="2" width="70%" align="center" style="font-size:25px">
        <tr>
            <td>ID</td>
            <td>编号</td>
            <td>中药名</td>
            <td>别名</td>
            <td>归属类型</td>
            <td>本经原文</td>
            <td>主治</td>
            <td>性味</td>
            <td>产地</td>
            <td>用量</td>
            <td>禁忌</td>
            <td>炮制方法</td>
            <td>其他</td>
            <td style="width: 300px">操作</td>
        </tr>
        <%
            for (TraditionalChineseMedicine traditionalChineseMedicine : list) {
        %>
        <tr>
            <td><%=traditionalChineseMedicine.getId() %></td>
            <td><%=traditionalChineseMedicine.getNumber()%></td>
            <td><%=traditionalChineseMedicine.getName() %></td>
            <td><%=traditionalChineseMedicine.getAlias() %></td>
            <td><%=traditionalChineseMedicine.getType() %></td>
            <td><%=traditionalChineseMedicine.getBjyw() %></td>
            <td><%=traditionalChineseMedicine.getZhuzhi() %></td>
            <td><%=traditionalChineseMedicine.getXingwei() %></td>
            <td><%=traditionalChineseMedicine.getChandi() %></td>
            <td><%=traditionalChineseMedicine.getDosage() %></td>
            <td><%=traditionalChineseMedicine.getTaboo() %></td>
            <td><%=traditionalChineseMedicine.getProcession() %></td>
            <td><%=traditionalChineseMedicine.getNote() %></td>
            <td>
                <a href="/tcm/detail?id=<%=traditionalChineseMedicine.getId()%>">详情</a>
                <a href="/tcm/updateProc?id=<%=traditionalChineseMedicine.getId()%>">编辑</a>&nbsp;
                <a href="/tcm/delete?id=<%=traditionalChineseMedicine.getId()%>" >删除</a>
            </td>
        </tr>
        <%} %>
    </table>
</div>
</body>
</html>
