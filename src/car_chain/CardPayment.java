package car_chain;

public class CardPayment implements Payment{
	private Payment payment;
	public void setNext(Payment payment) {
		this.payment = payment;
	}
	public void pay() {
		System.out.println("Bought with card");
	}
}
