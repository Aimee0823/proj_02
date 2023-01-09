
<%@ page import="java.util.List" %>

<%@ page import="dao.ClassicFormulaDao" %>
<%@ page import="pojo.ClassicFormula" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/11/11
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>ClassicFormula</title>
</head>
<body>
<%
    ClassicFormulaDao classicFormulaDao = new ClassicFormulaDao();
    List<ClassicFormula> list =classicFormulaDao.queryAll();
%>
<div style="align: center;margin: 20px">
    中药名:<input type="text" /> 别名:<input type="text" /> 本经原文:<input type="text" /><input type="submit" style="font-size: 25px" value="查询"/>&nbsp;<input type="reset"  style="font-size: 25px" value="添加"/>
</div>
<table border="2" width="70%" align="center" style="font-size:25px">
    <tr>
        <td>ID</td>
        <td>经方名称</td>
        <td>别名</td>
        <td>用法</td>
        <td>备注</td>
    </tr>
    <%
        for (ClassicFormula classicFormula : list) {
    %>
    <tr>
        <td><%=classicFormula.getId() %></td>
        <td><%=classicFormula.getName() %></td>
        <td><%=classicFormula.getAlias() %></td>
        <td><%=classicFormula.getUsage1() %></td>
        <td><%=classicFormula.getComment() %></td>

        <td>
            <a href="#">详细</a>&nbsp;
            <a href="#">编辑</a>&nbsp;
            <a href="#" >删除</a>
        </td>
    </tr>
    <%} %>
</table>

</body>
</html>
