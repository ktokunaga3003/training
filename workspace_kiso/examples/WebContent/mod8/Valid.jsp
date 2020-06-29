﻿<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%-- pageディレクティブの使用 --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%-- taglibディレクティブタグで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>Valid.jsp</title>
</head>

<body>
  <h1>
    ようこそ、
    <c:out value="${requestScope.member.name}" />
    さん。
  </h1>
</body>
</html>
