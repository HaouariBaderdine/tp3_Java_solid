package Exemple4;

public class FlyingCar implements IDrivable, IFlyable {

	@Override
	public void Drive() {
		// TODO Auto-generated method stub
		System.out.println("Drive Car");
	}

	@Override
	public void Fly() {
		// TODO Auto-generated method stub
		System.out.println("Fly Car");
	}

}
