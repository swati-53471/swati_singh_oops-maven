package NewYearGift.gifts;

import java.util.Scanner;

public class Candy implements Chocolate{
	
	Scanner sc=new Scanner(System.in);
	int weight,quantity;
	double price;
	public int  weight()
	{
		System.out.println("enter the weight of candy");
		weight=sc.nextInt();
		return weight;
	}
	public int quantity()
	{
		System.out.println("enter the quantity of candy");
		quantity=sc.nextInt();
		return quantity;
	}
	public double price()
	{
		System.out.println("enter the price of candy");
		price=sc.nextInt();
		return price;
	}
}
