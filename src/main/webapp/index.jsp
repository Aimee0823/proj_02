
<%@ page import="pojo.BtcfRelation" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title></title>
</head>
<body>
<%
    BtcfRelation btcfRelation = new BtcfRelation();
    btcfRelation.setId(1);
    Integer id = btcfRelation.getId();
%>

<h2>Hello World!</h2>
<h2><%= id%></h2>
</body>
</html>
