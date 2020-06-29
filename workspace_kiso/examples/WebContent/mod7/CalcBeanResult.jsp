<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%-- pageディレクティブの使用 --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%-- taglibディレクティブタグで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>CalcBeanResult.jsp</title>
</head>

<body>
    <h1>
    <%-- スコープ内にcalcオブジェクトが格納されているかを判断 --%>
    <c:if test ="${requestScope.calc != null}" >

        <%-- 「基数」「乗数」「計算結果」を取得し、出力 --%>
        <c:out value="${requestScope.calc.number}" /> の
        <c:out value="${requestScope.calc.power}" /> 乗は
        <c:out value="${requestScope.calc.answer}" /> です

    </c:if>

    </h1>
    </body>
</html>
