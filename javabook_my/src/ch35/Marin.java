package ch35;

public class Marin extends Unit {
	//hp,amor,type
	int base_damage;
	
	
	
	
	@Override
	void move() {
		System.out.println(type + "이동합니다");
	}

	@Override
	void UnderAttack(int damage) {
		//amor--0->hp-->dead
		
	}

}
