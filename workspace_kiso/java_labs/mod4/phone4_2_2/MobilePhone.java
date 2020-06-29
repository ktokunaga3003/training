package phone4_2_2;

class MobilePhone implements Phone {
	
	private String name;
	
	public MobilePhone(String name) {
		this.name = name;
		System.out.println(name+"さんの携帯電話です。");
	}
	
	public void call() {
		System.out.println(name+"さんの携帯が鳴ります。");
	}
	
	public void stop() {
		System.out.println(name+"さんの携帯が切れます");
	}
	

}
