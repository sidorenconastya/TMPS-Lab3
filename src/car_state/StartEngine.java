package car_state;

import car_composite.CarComposite;

public class StartEngine implements State{
	public void doAction(CarComposite car) {
		System.out.println("Engine is started");
	}
}
