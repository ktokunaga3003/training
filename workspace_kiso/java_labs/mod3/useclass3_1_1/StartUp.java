package useclass3_1_1;

public class StartUP {

	public static void main(String[] args) {
		
		Item bowlpen = new Item();
		Item note = new Item();
		
		bowlpen.code="AA001";
		bowlpen.name="ボールペン";
		bowlpen.price=100;
		
		note.code="BB001";
		note.name="ノート";
		note.price=150;
		
		bowlpen.print();
		note.print();

	}

}
