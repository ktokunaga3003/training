<!-- All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited -->
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html lang="ja">
 <head>
  <meta charset="utf-8">
  <title>従業員検索</title>
  <script type="text/javascript">
    function check(chkform){
        id = chkform.ID.value;
	    if(id == ""){
		    alert("従業員IDが未入力です。");
		    return false;
	    }
	    if(isNaN(id)){
             alert("従業員IDの入力に誤りがあります。");
             return false;
        }
        return true;
    }
  </script>
 </head>
<body>
  <div style="text-align:center;">
	<h1>従業員検索</h1>
	検索する従業員の従業員IDを入力してください。
	<hr>
	<!--  エラーメッセージ -->
	<div style="color: red;">
	  <c:out value="${requestScope.message}" />
	</div>
  </div>

  <!-- フォーム -->
  <form method="POST" action="/sample/eserv" onSubmit="return check(this)">
    <table style="margin-left: auto; margin-right: auto;">
      <tr>
        <td>従業員ID</td>
        <td><input type="text" name="ID" size="10" maxlength="6"></td>
      </tr>
    </table>
    <br>
    <div style="text-align:center;">
      <input type="hidden" name="BUTTON_ID" value="B0001G01_01">
      <input type="submit" value="検索"> <input type="reset" value="クリア">
    </div>
  </form>
</body>
</html>