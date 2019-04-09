package car_chain;

public interface Payment {
	public void setNext(Payment payment);
	public void pay();
}
