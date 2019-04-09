package car_state;

import car_composite.CarComposite;

public class StopEngine implements State{
	public void doAction(CarComposite car) {
		System.out.println("Engine is stopped");
	}
}
