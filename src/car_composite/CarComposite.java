package car_composite;

import car_visitor.Visitor;

public interface CarComposite {
	public void ride();
	public void accept(Visitor visitor);
}
