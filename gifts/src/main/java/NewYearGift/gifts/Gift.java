package NewYearGift.gifts;

import java.util.Scanner;

public class Gift {
	
	public static void sort(double price1,double price2)
	{
		if(price1>price2)
			System.out.println("Sorted chocolates are : Wafer<Candy");
		else
			System.out.println("Sorted chocolates are : Candy<Wafer");

	}
	public static void main(String args[])
	{
		Candy c=new Candy();
		Wafer w=new Wafer();
		System.out.println("The total quantity of chocolates is "+c.quantity()+w.quantity());
		System.out.println("The total weight of chocolates is "+c.weight()+w.weight());
		sort(c.price(),w.price());
		
		
	}

	
}
