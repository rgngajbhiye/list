package listopack;

import java.util.ArrayList;
import java.util.Scanner;

public class list67 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a1=new ArrayList<>();
		a1.add("red");
		a1.add("Green");
		a1.add("orange");
		a1.add("white");
		a1.add("black");
		System.out.println("Sample output");
		System.out.println(a1);
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter search element");
		String b=sc.nextLine();
		if(a1.contains(b))
		{
		System.out.println("Found element"+b);	
		}
		else
		{
			System.out.println("Colour is not exists");
		}
			
	
	}

}
