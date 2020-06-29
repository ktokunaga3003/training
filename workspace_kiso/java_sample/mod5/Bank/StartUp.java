package Bank;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

class StartUp {
    public static void main(String[] args) {
		Account obj = null;
    	try{
			// 口座オブジェクトの生成
			obj = new Account("鈴木一郎",100000);

			System.out.println("《初期表示》");
			obj.print();

			// 指定金額の引き出し
			obj.withdraw(200000);

		}catch(LimitException e){
			System.out.println( e.getMessage() );
			e.printStackTrace();
		}catch(InsufficiencyException e){
			System.out.println(e.getMessage());
			e.printStackTrace();
    	}catch(Exception e){
			System.out.println( e.getMessage() );
			e.printStackTrace();
		}finally{
			System.out.println("《結果表示》");
			obj.print();
		}
	}
}
