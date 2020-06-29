package transfer4_3_2;

/**
 * All Rights Reserved, Copyright(c) Fujitsu Learning Media Limited
 *
 * StartUp.java
 *
 */

public class StartUp{
	public static void main(String[] args){

		Book book = new Book("Javaプログラミング基礎","Java太郎");
		Library library = new Library("東京都港区","03-1234-5678", book);

		library.display();

	}

}