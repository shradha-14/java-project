package BillsBurger;

public class Main {
	public static void main(String[] args) {
		BaseHamBurger burger = new BaseHamBurger("Wheat Bread", "Chicken", 100);
		burger.getBurger();
		burger.addCarrot();
		burger.addLettuce();
		
		burger.addSauce();
		burger.addTomatoes();
		burger.getBurger();
		burger.addCarrot();
		burger.addCarrot();
		burger.getBurger();
		
		HealthyBurger healthyburger = new HealthyBurger("Chicken", 100);
		healthyburger.getBurger();
		healthyburger.addCarrot();
		healthyburger.addLettuce();
		
		healthyburger.addSauce();
		healthyburger.addTomatoes();
		healthyburger.getBurger();
		healthyburger.addCarrot();
		healthyburger.addCarrot();
		healthyburger.getBurger();
		healthyburger.addHealthy1();
		healthyburger.addHealthy2();
		healthyburger.getBurger();
		healthyburger.addHealthy1();
		healthyburger.getBurger();
		
		DeluxeBurger deluxeburger = new DeluxeBurger("WheatBread", "Chicken", 250, "Pepse");
		deluxeburger.getBurger();
		deluxeburger.addCarrot();
		deluxeburger.getBurger();
	}
	
}
