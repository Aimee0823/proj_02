<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2022/11/15
  Time: 10:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>TCM增加页面</title>
</head>
<body>
<div>
    <h1>新增TCM页面</h1>


    <form action="/tcm/add" method="post" >
        <table align="center" style="font-size: 25px">
            <tr>
                <td>编号</td>
                <td><input type="text" name="number" style="font-size: 25px"/></td>
            </tr>
            <tr>
                <td>中药名</td>
                <td><input type="text" name="name" style="font-size: 25px"/></td>
            </tr>
            <tr>
                <td>别名</td>
                <td><input type="text" name="alias" style="font-size: 25px"/></td>
            </tr>
            <tr>
                <td>归属类别</td>
                <td>
                    <textarea rows="10" cols="50" name="type" style="font-size: 25px"></textarea>
                </td>
            </tr>
            <tr>
                <td>本经原文</td>
                <td>
                    <textarea rows="10" cols="50" name="bjyw" style="font-size: 25px"></textarea>
                </td>
            </tr>
            <tr>
                <td>主治</td>
                <td><input type="text" name="zhuzhi" style="font-size: 25px"/></td>
            </tr>
            <tr>
                <td>性味</td>
                <td><input type="text" name="xingwei" style="font-size: 25px"/></td>
            </tr>
            <tr>
                <td>产地</td>
                <td><input type="text" name="chandi" style="font-size: 25px"/></td>
            </tr>
            <tr>
                <td>用量</td>
                <td><input type="text" name="dosage" style="font-size: 25px"/></td>
            </tr>
            <tr>
                <td>禁忌</td>
                <td><input type="text" name="taboo" style="font-size: 25px"/></td>
            </tr>
            <tr>
                <td>炮制方法</td>
                <td><input type="text" name="processing" style="font-size: 25px"/></td>
            </tr>
            <tr>
                <td>其他</td>
                <td><input type="text" name="note" style="font-size: 25px"/></td>
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
