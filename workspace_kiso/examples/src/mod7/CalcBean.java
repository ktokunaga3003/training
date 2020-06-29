/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * CalcBean.java
 *
 */

package mod7;

import java.io.Serializable;

public class CalcBean implements Serializable {

    private int number;     // 基数
    private int power;      // 乗数
    private int answer = 1; // 計算結果

    public CalcBean() {
    }

    public CalcBean(int number, int power) {
    	this.number = number;
    	this.power = power;
    }

    public void calc() {
    	// べき乗の計算
    	for(int i=0; i<power; i++) {
    		answer *= number;
    	}
    }

    public void setNumber(int number) {
        this.number = number;
    }
    public void setPower(int power) {
        this.power = power;
    }
    public void setAnswer(int answer) {
        this.answer = answer;
    }
    public int getNumber() {
        return number;
    }
    public int getPower() {
        return power;
    }
    public int getAnswer() {
        return answer;
    }
}