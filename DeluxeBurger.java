package BillsBurger;

public class DeluxeBurger extends BaseHamBurger {
	private String chips;
	private String drink;
	public DeluxeBurger(String breadRoll, String meat, int price, String drink) {
		super(breadRoll, meat, price);
		this.chips = "Chips";
		this.drink=drink;
		addSauce();
		addTomatoes();
		addLettuce();
		addCarrot();
		setFinalPrice(price);
		
		
		// TODO Auto-generated constructor stub
	}
	public void getBurger() {
			
			super.getBurger();
			
			System.out.println("Also delluxe burger come with chips and your choice of drink that is "+drink);
			
		}
}
