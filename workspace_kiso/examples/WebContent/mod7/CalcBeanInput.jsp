<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%-- pageディレクティブの使用 --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<%-- taglibディレクティブタグで、使用するタグライブラリを宣言 --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>CalcBeanInput.jsp</title>
</head>

<body>
    <form method="post" action="/examples/calc">
    <h2>指数計算</h2>

    <div style="color:red; font-weight:bold;">
        <%-- エラーメッセージがある場合、出力 --%>
        <c:out value="${requestScope.error}" />
    </div>

    <table>
      <tr>
        <td>基数 ：</td>
        <td><input type="text" name="number" ></td>
      </tr>
      <tr>
        <td>乗数 ：</td>
        <td><input type="text" name="power" ></td>
      </tr>
    </table>
    <br>
    <input type="submit" value="送信">
    </form>
    </body>
</html>
