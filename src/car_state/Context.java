package car_state;

import car_composite.CarComposite;

public class Context implements State{
	private State state;
    public void setState(State state){
        this.state = state;
    }
    public void doAction(CarComposite car) {
        this.state.doAction(null);
    }
}
