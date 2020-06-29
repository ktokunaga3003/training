//メンバーIDとパスワードの入力チェック
function check() {
	//メッセージ
	var message = "";
	//パスワードの入力値
	var password = document.getElementById("password").value;
	//パスワード（確認用）の入力値
	var pwConfirm = document.getElementById("password_confirm").value;
	//名前の入力値
	var name = document.getElementById("name").value;
	//住所の入力値
	var address = document.getElementById("address").value;
	//電話番号の入力値
	var phone = document.getElementById("phone").value;
	

	//パスワードが未入力の場合
	if (password.length == 0) {
		message += "<p>パスワードは入力必須項目です。</p>";
	}
	//パスワード（確認用）が未入力の場合
	if (pwConfirm.length == 0) {
		message += "<p>パスワード（確認用）は入力必須項目です。</p>";
	}
	//名前が未入力の場合
	if (name.length == 0) {
		message += "<p>名前は入力必須項目です。</p>";
	}
	
	//性別はデフォルトチェックなのでJSではチェックしない
	
	//住所が未入力の場合
	if (address.length == 0) {
		message += "<p>住所は入力必須項目です。</p>";
	}
	//電話番号が未入力の場合
	if (phone.length == 0) {
		message += "<p>電話番号は入力必須項目です。</p>";
	}
	//メッセージが設定された場合、メッセージを表示し、送信中止
	if (message != "") {
		var targetDiv = document.getElementById("target");
		targetDiv.innerHTML = message;
		return false;
	}
	//送信継続
	return true;
}

//読み込み時
window.onload = function() {
	//submitイベントハンドラの設定
	var chkForm = document.getElementById("chkForm");
	chkForm.onsubmit = check;
};