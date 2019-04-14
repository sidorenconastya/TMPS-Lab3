package car_composite;

import car_visitor.Visitor;

public class BasicCar implements CarComposite{
	public void ride() {
		System.out.println("Ride a Basic Car!");
	}
	public void accept(Visitor visitor) {
        visitor.visitLeaf(this);
    }
}
