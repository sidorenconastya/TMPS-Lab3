package car_visitor;

import car_composite.CarComposite;

public class CarVisitor implements Visitor{
	public void visitLeaf(CarComposite composite) {
		System.out.println("Leaf was visited");
	}

	public void visitComposite(CarComposite composite) {
		System.out.println("Composite was visited");
	}
}
