<%@ page import="pojo.TcmRelation" %>
<%@ page import="pojo.TraditionalChineseMedicine" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/11/16
  Time: 14:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>细节</title>
</head>
<%
  TcmRelation tcmRelation = (TcmRelation)request.getAttribute("tcmRelation");
  TraditionalChineseMedicine medicine =(TraditionalChineseMedicine) request.getAttribute("traditionalChineseMedicine");
%>
<body>
<div>
  <h1><%=medicine.getName()%>的详情</h1>
  <form action="/tcm/add" method="post" >
    <table align="center" style="font-size: 25px;border: 2px">

      <tr>
        <td>出处</td>
        <td><input type="text" name="chuchu" value="<%=tcmRelation.getChuchu()%>" style="font-size: 25px"/></td>
      </tr>
      <tr>
        <td>心得内容</td>
        <td><input type="text" name="content" value="<%=tcmRelation.getContent()%>" style="font-size: 25px"/></td>
      </tr>

      <tr>
        <td colspan="2" align="center">
          <input type="submit" style="font-size: 25px" value="保存"/>&nbsp;
          <input type="reset"  style="font-size: 25px" value="重置"/>
        </td>
      </tr>
    </table>
  </form>
</div>
</body>
</html>
