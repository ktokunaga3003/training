<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%-- pageディレクティブの使用 --%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" %>

<!DOCTYPE html>
<html lang="ja">
<head>
  <meta charset="utf-8">
  <title>Calculator2.jsp</title>
</head>

<body>
  <h1>
  <%!
      int total = 0;
      String s = null;
      int numbers[] = {32, 56, 18, 57, 83, 64, 22, 10};
  %>

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

  <%= s %> の合計は <%= total %> です。
  </h1>
</body>
</html>
