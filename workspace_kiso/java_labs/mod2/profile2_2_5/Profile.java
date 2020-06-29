package profile2_2_5;

public class Profile {

	public static void main(String[] args) {
		
		String name="山田　太郎";
		String corporation="株式会社富士通鹿児島インフォネット";
		int carrier=1;
		
		System.out.println("私の名前は　"+name+"　です。");
		System.out.println("勤務先は　　"+corporation+"　です。");
		
		if(carrier >= 0 && carrier < 2) 	System.out.println("私は　　　　新入社員　です。");
		else if(carrier >= 2 && carrier < 6)	System.out.println("私は　　　　若手社員　です。");
		else if(carrier >= 6 && carrier < 15)	System.out.println("私は　　　　中堅社員　です。");
		else if(carrier >= 15)	System.out.println("私は　　　　ベテラン社員　です。");
		else	System.out.println("所属年数が間違っています。");

	}

}
