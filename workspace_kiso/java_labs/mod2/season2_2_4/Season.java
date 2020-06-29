package season2_2_4;

public class Season {

	public static void main(String[] args) {

		int season = 1;
		/*
		if(season==1) System.out.println("春");
		else if(season==2) System.out.println("夏");
		else if(season==3) System.out.println("秋");
		else if(season==4) System.out.println("冬");
		else System.out.println("1～4の数字を指定します。");
		*/
		 switch(season) {
		 	case 1:
		 		System.out.println("春");
		 		break;
		 	case 2:
		 		System.out.println("夏");
		 		break;
		 	case 3:
		 		System.out.println("秋");
		 		break;
		 	case 4:
		 		System.out.println("冬");
		 		break;
		 	default:
		 		System.out.println("1～4の数字を指定します。");
		 }

	}

}
