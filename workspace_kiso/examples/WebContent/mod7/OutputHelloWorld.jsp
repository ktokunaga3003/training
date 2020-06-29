<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%-- pageディレクティブの使用 --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%-- taglibディレクティブタグで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>OutputHelloWorld.jsp</title>
</head>

<body>
  <%-- 定義済みオブジェクトの使用 --%>
  <div style="text-align:center;">

    こんにちは、<c:out value="${requestScope.name}" />さん。<br>
    今日も一日がんばりましょう。<br>
    <br><hr><br>
    アクセス時刻：<c:out value="${requestScope.date}" /><br>

  </div>
</body>
</html>
