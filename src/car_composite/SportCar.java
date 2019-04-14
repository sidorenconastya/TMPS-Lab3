package car_composite;

import car_visitor.Visitor;

public class SportCar implements CarComposite{
	public void ride() {
		System.out.println("Ride a Sport Car!");
	}
	public void accept(Visitor visitor) {
        visitor.visitLeaf(this);
    }
}
