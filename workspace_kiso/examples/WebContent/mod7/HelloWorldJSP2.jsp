<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->

<%-- taglibディレクティブタグで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>HelloWorldJSP2.jsp</title>
</head>

<body>
  <div style="text-align:center;">
  <c:forEach var="i" begin="1" end="6">
      <%-- 奇数回目の繰り返しの場合のみ表示 --%>
      <c:if test="${ i % 2 == 1 }">
        Hello World JSP!! <c:out value="${ i }" />times<br>
      </c:if>
  </c:forEach>
  </div>
</body>
</html>
