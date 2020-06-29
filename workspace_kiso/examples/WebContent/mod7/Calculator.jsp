<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>Calculator.jsp</title>
</head>

<body>
  <!-- HTML comment -->
  <%-- JSP comment --%>

  <%-- Declaration --%>
  <%!
      int total = 0;
      String s = null;
      int numbers[] = {32, 56, 18, 57, 83, 64, 22, 10};
  %>

  <%-- Scriptlet --%>
  <%
      if(numbers.length >= 1) {
          s = Integer.toString(numbers[0]);
          total = numbers[0];
      }

      for(int i = 1;i < numbers.length;i++){
          total += numbers[i];
          s += "+" + numbers[i];
      }
  %>

  <h1>

  <%-- Statement --%>
  <%= s %> = <%= total %>

  </h1>
</body>
</html>
