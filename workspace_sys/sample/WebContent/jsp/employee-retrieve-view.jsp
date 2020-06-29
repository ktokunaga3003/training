<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
 <head>
  <meta charset="utf-8">
  <title>従業員検索結果</title>
</head>

<body>
  <div style="text-align:center;">
    <h1>従業員情報</h1>
    該当する従業員が見つかりました。
    <hr>
    <br>
  </div>
  <table border="1" style="margin-left: auto; margin-right: auto;">
    <tr>
      <td style="background-color:#9999ff;">従業員ID</td>
      <td><c:out value="${requestScope.employee.employeeid}" /></td>
    </tr>
    <tr>
      <td style="background-color:#9999ff;">従業員名</td>
      <td><c:out value="${requestScope.employee.employeename}" /></td>
    </tr>
    <tr>
      <td style="background-color:#9999ff;">部署</td>
      <td><c:out value="${requestScope.employee.section}" /></td>
    </tr>
    <tr>
      <td style="background-color:#9999ff;">電話番号</td>
      <td><c:out value="${requestScope.employee.phone}" /></td>
    </tr>
  </table>
  <br>
  <div style="text-align:center;">
    <a href="/sample/eserv?BUTTON_ID=B0001G01_02">[トップに戻る]</a>
  </div>
</body>
</html>