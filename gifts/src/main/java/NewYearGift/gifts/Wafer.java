package NewYearGift.gifts;

import java.util.Scanner;

public class Wafer implements Chocolate{
	Scanner sc=new Scanner(System.in);
	int weight,quantity,price;
	public int  weight()
	{
		System.out.println("enter the weight of wafer");
		weight=sc.nextInt();
		return weight;
	}
	public int quantity()
	{
		System.out.println("enter the quantity of wafer");
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
