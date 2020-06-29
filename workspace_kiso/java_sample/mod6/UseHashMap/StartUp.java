package UseHashMap;

/**
 * All Rights Reserved, Copyright(c)Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

import java.util.*;		//HashMap<K,V>クラスを使用するためインポートが必要

public class StartUp {
    public static void main(String[] args) {

		// HashMap<String, ItemInfo>オブジェクト生成(キー:String型、要素：ItemInfo型)
		HashMap<String, ItemInfo> hm = new HashMap<>();

		// 要素を追加する
    	ItemInfo itemObj1 = new ItemInfo("えんぴつ",80);
    	ItemInfo itemObj2 = new ItemInfo("消しゴム",120);
    	ItemInfo itemObj3 = new ItemInfo("ボールペン",100);

    	hm.put("AA-001",itemObj1);		//hm.put("AA-001",new ItemInfo("えんぴつ",80));と同じ
		hm.put("AA-002",itemObj2);		//hm.put("AA-001",new ItemInfo("消しゴム",120));と同じ
		hm.put("AA-003",itemObj3);		//hm.put("AA-001",new ItemInfo("ボールペン",100));と同じ

		// キーを指定して要素を取得
		System.out.println("----------------------------------------");
		System.out.println("キーを指定");
		System.out.println("----------------------------------------");

		ItemInfo item1 = hm.get("AA-001");
		ItemInfo item2 = hm.get("AA-002");
		ItemInfo item3 = hm.get("AA-003");

		// 取り出した要素の情報表示
		item1.print();
		item2.print();
		item3.print();

		// 値の Collection ビューからIteratorを使用して要素を取得
		System.out.println("----------------------------------------");
		System.out.println("Collection ビューからIteratorを使用");
		System.out.println("----------------------------------------");

		Collection<ItemInfo> c = hm.values();
		Iterator<ItemInfo> iter = c.iterator();

		while(iter.hasNext()) {
		    ItemInfo item = iter.next();
		    item.print();
		}
    }
}