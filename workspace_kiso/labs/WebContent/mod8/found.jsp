<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%-- pageディレクティブの使用 --%>
<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%-- taglibディレクティブタグで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>found.jsp</title>
</head>

<body>
  <div style="text-align:center;">
  該当者が見つかりました。<br>

  <%-- 検索結果の表示 --%>
  ID     : <c:out value="${requestScope.employee.id}" />    <br>
  NAME   : <c:out value="${requestScope.employee.name}" />       <br>
  SECTION: <c:out value="${requestScope.employee.section}" />       <br>
  PHONE  : <c:out value="${requestScope.employee.phone}" />       <br>


  </div>
</body>
</html>
