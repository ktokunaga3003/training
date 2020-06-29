/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * Member.java
 *
 */

package mod8;
import java.io.Serializable;

public class Member implements Serializable {
	private int id;          //ID
    private String name;     //名前
    private String password; //パスワード

    //コンストラクタ
    public Member() {
    }
    //IDを設定
    public void setId(int id) {
        this.id = id;
    }
    //IDを取得
    public int getId() {
        return id;
    }
    //名前を設定
    public void setName(String name) {
        this.name = name;
    }
    //名前を取得
    public String getName() {
        return name;
    }
    //パスワードを設定
    public void setPassword(String password) {
        this.password = password;
    }
    //パスワードを取得
    public String getPassword() {
        return password;
    }

    //ログイン処理
    public boolean isValid(String chk_password) {
        if (password.equals(chk_password)) {
            return true;
        } else {
            return false;
        }
    }
}