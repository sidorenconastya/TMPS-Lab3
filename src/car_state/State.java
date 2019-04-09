package car_state;

import car_composite.CarComposite;

public interface State {
	void doAction(CarComposite car);
}
