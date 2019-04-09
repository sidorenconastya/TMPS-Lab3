package car_composite;

import java.util.ArrayList;
import java.util.List;

public class Racing implements CarComposite{
	private List<CarComposite> cars = new ArrayList<CarComposite>();
	public void ride() {
		for (CarComposite car : cars) {
			car.ride();
		}
	}
	public void add(CarComposite s) {
		this.cars.add(s);
	}
}
