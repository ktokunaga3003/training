<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%-- pageディレクティブの使用 --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>Request.jsp</title>
</head>

<body>
  <%-- 定義済みオブジェクトの使用 --%>
  <% request.setCharacterEncoding("UTF-8"); %>
  <h2> Request Information </h2>
  <hr>

  <table>
  <tr>
    <td>ID</td>
    <td>:<%= request.getParameter("id") %></td>
  </tr>
  <tr>
    <td>NAME</td>
    <td>:<%= request.getParameter("name") %></td>
  </tr>
  <tr>
    <td>ADDRESS</td>
    <td>:<%= request.getParameter("address") %></td>
  </tr>
  </table>

</body>
</html>
