package mod6;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * SampleArrayList.java
 *
 */
import java.util.*;

public class SampleArrayList{
	public static void main(String[] args){
		//Accountクラスのオブジェクトを格納するArrayList<E>オブジェクトを生成する
		ArrayList<Account> al = new ArrayList<Account>();
		Account ac1 = new Account("AA001",1000);
		Account ac2 = new Account("BB001",2000);
		Account ac3 = new Account("CC001",3000);
		
		al.add(ac1); al.add(ac2); al.add(ac3);
		
		for (Account ac : al) {
			ac.print();
		}


		//Stringクラスのオブジェクトを格納するArrayList<E>オブジェクトを生成する
		ArrayList<String> list  = new ArrayList<String>();
		String str1 = "str1";	String str2 = "str2";	String str3 = "str3";
		
		list.add(str1);	list.add(str2);	list.add(str3);
		
		for(String str : list) {
			System.out.println(str);
		}


	}
}