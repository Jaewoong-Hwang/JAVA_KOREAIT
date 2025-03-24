package ch35;

abstract public class Gun {

	int maxBullitCtn;
	int curBullitCtn;
	int power;
	
	public abstract void fire(Unit unit);
	public abstract void reload(int bullit);
}
