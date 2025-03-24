package ch35;

public class Pistol extends Gun {
	Pistol(){
		this.curBullitCtn=0;
		this.maxBullitCtn=50;
		this.power=10;
		
		
	}
	
	
	@Override
	public void fire(Unit unit) {
		if(curBullitCtn==0) {
			System.out.println("총알 : 0 재장전필요" );
			return;
		}
		unit.UnderAttack(this.power);
		curBullitCtn--;
	}

	@Override
	public void reload(int bullit) {
		if(this.maxBullitCtn>this.curBullitCtn+bullit)
			this.curBullitCtn+=bullit;
		else
			this.curBullitCtn=maxBullitCtn;
	}
	

}
