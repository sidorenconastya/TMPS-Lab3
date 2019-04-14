package car_visitor;

import car_composite.CarComposite;

public interface Visitor {
	public void visitComposite(CarComposite composite);
	public void visitLeaf(CarComposite composite);
}
