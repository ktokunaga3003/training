<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
 <head>
  <meta charset="utf-8">
  <title>従業員管理</title>
</head>

<body>
  <div style="text-align:center;">
    <h1>システムエラー</h1>
  </div>
  <hr>
  システムエラーが発生しました。
  <br>
  理由：<c:out value="${requestScope.message}" />
  <div style="text-align:center;">
    <a href="/sample/eserv?BUTTON_ID=B0001G01_02">[トップ画面に戻る]</a>
  </div>
</body>
</html>