package Bank;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * LimitException.java
 *
 */

// 引き出し限度額オーバー例外
class LimitException extends Exception {
    public LimitException(String message) {
         super(message);
    }
}
