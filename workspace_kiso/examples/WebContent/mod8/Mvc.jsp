<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%-- pageディレクティブの使用 --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%-- taglibディレクティブタグで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>Mvc.jsp</title>
  <script type="text/javascript">
    // 「ログイン」ボタンを押したときの処理
    function PushLoginButton() {
      var id = document.inform.id.value;
      if (id == "") {
        alert("ユーザーIDが未入力です。");
        return false;
      }
      var password = document.inform.password.value;
      if (password == "") {
        alert("パスワードが未入力です。");
        return false;
      }
      return true;
    }
  </script>
</head>

<body>
  <h1>Model View Controller</h1>
  <hr>

  <div style="color:red; font-weight:bold;">
        <%-- エラーメッセージがある場合、出力 --%>
        <c:out value="${requestScope.error}" />
  </div>

  <form method="post" action="/examples/mvc" name="inform">
    <p>ユーザーID:<input type="text" name="id"></p>
    <p>パスワード:<input type="password" name="password"></p>
    <input type="submit" value="ログイン" onclick="return PushLoginButton()">
    <input type="reset"  value="キャンセル">
  </form>

</body>
</html>
