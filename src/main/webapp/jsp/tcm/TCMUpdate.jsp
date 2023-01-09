<%@ page import="pojo.TraditionalChineseMedicine" %><%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/11/15
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TCM更新页面</title>
</head>
<%
    TraditionalChineseMedicine medicine = (TraditionalChineseMedicine) request.getAttribute("medicine");
%>
<body>
TCM更新页面
<div>
    <form action="/tcm/update?id=<%=medicine.getId()%>" method="post">
            <table align="center" style="font-size: 25px">
                <tr>
                    <td>编号</td>
                    <td><input type="text" name="number" value="<%=medicine.getNumber()%>" style="font-size: 25px"/></td>
                </tr>
                <tr>
                    <td>中药名</td>
                    <td><input type="text" name="name" value="<%=medicine.getName()%>" style="font-size: 25px"/></td>
                </tr>
                <tr>
                    <td>别名</td>
                    <td><input type="text" name="alias" value="<%=medicine.getAlias()%>" style="font-size: 25px"/></td>
                </tr>
                <tr>
                    <td>归属类别</td>
                    <td><input type="text" name="type" value="<%=medicine.getType()%>" style="font-size: 25px"/></td>
<%--                    <td>--%>
<%--                        <textarea rows="10" cols="50" name="type" value="<%=medicine.getType()%>" style="font-size: 25px"></textarea>--%>
<%--                    </td>--%>
                </tr>
                <tr>
                    <td>本经原文</td>
                    <td><input type="text" name="bjyw" value="<%=medicine.getBjyw()%>" style="font-size: 25px"/></td>
<%--                    <td>--%>
<%--                        <textarea rows="10" cols="50" name="bjyw" value="<%=medicine.getBjyw()%>" style="font-size: 25px"></textarea>--%>
<%--                    </td>--%>
                </tr>
                <tr>
                    <td>主治</td>
                    <td><input type="text" name="zhuzhi" value="<%=medicine.getZhuzhi()%>" style="font-size: 25px"/></td>
                </tr>
                <tr>
                    <td>性味</td>
                    <td><input type="text" name="xingwei" value="<%=medicine.getXingwei()%>" style="font-size: 25px"/></td>
                </tr>
                <tr>
                    <td>产地</td>
                    <td><input type="text" name="chandi" value="<%=medicine.getChandi()%>" style="font-size: 25px"/></td>
                </tr>
                <tr>
                    <td>用量</td>
                    <td><input type="text" name="dosage" value="<%=medicine.getDosage()%>" style="font-size: 25px"/></td>
                </tr>
                <tr>
                    <td>禁忌</td>
                    <td><input type="text" name="taboo" value="<%=medicine.getTaboo()%>" style="font-size: 25px"/></td>
                </tr>
                <tr>
                    <td>炮制方法</td>
                    <td><input type="text" name="processing" value="<%=medicine.getProcession()%>" style="font-size: 25px"/></td>
                </tr>
                <tr>
                    <td>其他</td>
                    <td><input type="text" name="note" value="<%=medicine.getNote()%>" style="font-size: 25px"/></td>
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
