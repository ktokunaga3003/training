﻿<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%-- pageディレクティブの使用 --%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%-- taglibディレクティブタグで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>loginAccount.jsp</title>
</head>

<body>
  <h1>ログイン画面</h1>
  <hr><br>

  <div style="color:red; font-weight:bold;">
    <%-- エラーメッセージがある場合は表示 --%>
    <c:out value="${requestScope.error}" />
  </div>

  <form method="post" action="/labs/loginAccount2">
  <%-- 任意問題2 --%>
  <%-- <form method="post" action="/labs/control">--%>

    <%-- 「hidden」にcommand_idの値を設定 --%>
    <input type="hidden" name="command_id" value="0">

    <table>
    <tr>
      <td>ID：</td>
      <td><input type="text" name="id"></td>
    </tr>
    <tr>
        <td>パスワード：</td>
        <td><input type="password" name="password"></td>
    </tr>
    </table>

    <br><br>
    <input type="submit" value="送信">
    <input type="reset" value="キャンセル">
  </form>
</body>
</html>
