package UseArrayList;

/**
 * All Rights Reserved, Copyright(c)Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */
import java.util.*;		//ArrayList<E>クラスを使用するためインポートが必要

public class StartUp {
    public static void main(String[] args) {
    	//ArrayList<ItemInfo>オブジェクト生成(格納できる要素はItemInfo型のみ)
		ArrayList<ItemInfo> al = new ArrayList<>();
        //要素を追加
		ItemInfo item1 = new ItemInfo("えんぴつ", 80);
		ItemInfo item2 = new ItemInfo("消しゴム", 120);
		ItemInfo item3 = new ItemInfo("ボールペン", 100);

    	al.add(item1);		//al.add(new ItemInfo("えんぴつ", 80));と同じ
		al.add(item2);		//al.add(new ItemInfo("消しゴム", 120));と同じ
		al.add(item3);		//al.add(new ItemInfo("ボールペン", 100));と同じ

		//要素を取り出して情報表示
		System.out.println("-----------------------------------");
		System.out.println("拡張for文使用");
		System.out.println("-----------------------------------");
    	for(ItemInfo item : al){
    		item.print();
    	}

    	//get()メソッドを使用して要素を取得
    	System.out.println("-----------------------------------");
		System.out.println("get()メソッド使用");
		System.out.println("-----------------------------------");
    	for(int i=0;i<al.size();i++){
		    ItemInfo item = al.get(i);
		    item.print();
		}

		//Iteratorを使用して要素を取得
		System.out.println("-----------------------------------");
		System.out.println("Iterator使用");
		System.out.println("-----------------------------------");
    	Iterator<ItemInfo> iter = al.iterator();
		while(iter.hasNext()){
		    ItemInfo item = iter.next();
		    item.print();
		}
    }
}