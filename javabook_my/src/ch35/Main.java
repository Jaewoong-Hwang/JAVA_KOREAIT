package ch35;

public class Main {

	public static void main(String[] args) {

		Marine marine1 = new Marine();
		marine1.setGun(new Pistol());

		Marine marine2 = new Marine();
		marine2.setGun(new Rifle());

		// M1->M2
		new Thread() {

			@Override
			public void run() {
				while (true) {
					super.run();
					marine1.attack(marine2);
					try {
					Thread.sleep(1000);
					}catch
				}
			}

		};

		// M2 -> M1
		new Thread() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				super.run();
			}
		};
	}

}
