	//クレジットカード番号入力チェック
	function check() {
		//メッセージ
		var message = "";
		//クレジットカード番号の入力値
		var creditNo = document.getElementById("credit").value;
		
		if (creditNo.length == 0) {
			//入力値が空の場合、メッセージを設定
			message = "<p>クレジット番号を入力してください</p>";
		} else if (!creditNo.match(/^\d{16}$/)) {
			//入力値が16桁の数値でない場合、メッセージを設定
			message = "<p>クレジット番号が不正です</p>";
		}
		//メッセージが設定された場合、メッセージを表示し、送信中止
		if(message!=""){
			var targetDiv = document.getElementById("target");
			targetDiv.innerHTML = message;
			return false;
		}
		//送信継続
		return true;
	}
	
	//読み込み時
	window.onload = function(){
		//submitイベントハンドラの設定
		var chkForm = document.getElementById("chkForm");
		chkForm.onsubmit = check;
	};