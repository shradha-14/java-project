package BillsBurger;

public class HealthyBurger extends BaseHamBurger{
	private boolean healthy1;
	private boolean heathly2;
	private int extra = 0;
	

	public HealthyBurger(String meat, int price) {
		super("Brown rye bread roll", meat, price);
		// TODO Auto-generated constructor stub
	}
	
	public void addHealthy1()
	{
		if(extra <= 1)
		{
			this.healthy1=true;
			setFinalPrice(getFinalPrice() + 20);
			extra += 1;
			
		}else
		{
			System.out.println("Maximum number of items already added");
			
		}
	}
	
	public void addHealthy2()
	{
		if(extra <= 1)
		{
			this.heathly2=true;
			setFinalPrice(getFinalPrice() + 20);
			extra += 1;
			
		}else
		{
			System.out.println("Maximum number of items already added");
			
		}
	}

	@Override
	public void getBurger() {
		
		super.getBurger();
		if(extra>1) {
			System.out.println("Also additional extra healthy items are"+((healthy1)?" healthy1":"")+((heathly2)?" healthy2":""));
		}
	}
	
	

	
	

}
