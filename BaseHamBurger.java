package BillsBurger;

public class BaseHamBurger {
	
	private String breadRoll;
	private String meat;
	

	

	private boolean lettuce = false;
	private boolean tomatoes = false;
	private boolean carrots = false;
	private boolean sauce = false;
	private int finalPrice ;
	private int additionalItems = 0;
	public BaseHamBurger( String breadRoll, String meat, int price) {
		
		
		this.breadRoll = breadRoll;
		this.meat = meat;
		if(price<0) {
			this.setFinalPrice(100);
		}else {
		this.setFinalPrice(price);
		}
	}
	
	public void addLettuce()
	{
		if(additionalItems <= 3)
		{
			this.lettuce=true;
			setFinalPrice(getFinalPrice() + 20);
			additionalItems += 1;
			
		}else
		{
			System.out.println("Maximum number of items already added");
			
		}
	}
	public void addCarrot()
	{
		if(additionalItems <= 3)
		{
			this.carrots=true;
			setFinalPrice(getFinalPrice() + 20);
			additionalItems += 1;
		
		}else
		{
			System.out.println("Maximum number of items already added");
			
		}
	}
	public void addTomatoes()
	{
		if(additionalItems <= 3)
		{
		this.tomatoes=true;
		setFinalPrice(getFinalPrice() + 20);
		additionalItems += 1;
		
		}else
		{
			System.out.println("Maximum number of items already added");
			
		}
	}
	public void addSauce()
	{
		if(additionalItems <= 3)
		{
			this.sauce = true;
			setFinalPrice(getFinalPrice() + 20);
			additionalItems += 1;
		
		}else
		{
			System.out.println("Maximum number of items already added");
			
		}
	}
	public void getBurger() {
		if(additionalItems == 0)
		{
		System.out.println("Items in the burger are "+this.breadRoll+" "+this.meat+" And no additional items added");
		}
		else
		{
			System.out.println("Items in the burger are "+this.breadRoll+", "+this.meat+" And additional items are: "+ ((lettuce)?" Lettuce":"")+((tomatoes)?" Tomatoes":"")+((carrots)?" Carrots":"")+((sauce)?" Sauce":""));

		}
		System.out.println("Final price of burger is "+getFinalPrice());
	}

	public int getFinalPrice() {
		return finalPrice;
	}

	public void setFinalPrice(int finalPrice) {
		this.finalPrice = finalPrice;
	}
	
	public String getMeat() {
		return meat;
	}
	
	
	
	
	
	
}
