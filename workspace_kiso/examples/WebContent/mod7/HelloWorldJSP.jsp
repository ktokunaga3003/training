<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>HelloWorldJSP.jsp</title>
</head>

<body>
  <div style="text-align:center;">
  <% for(int i = 1; i < 7; i++) { %>
       Hello World JSP!! <%= i %>times<br>
  <% } %>
  </div>
</body>
</html>
