import java.util.*;
import Pants.Jeans;

public class Demo {


public static void main(String[] args) {
		Jeans jeans = new Jeans();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please input the pant's size:");
		String size =scanner.nextLine();
		jeans.setSize(size);
		System.out.print("Please input the pant's color:");
		String color = scanner.nextLine();
		jeans.setColor(color);
		System.out.print("Please input the pant's price:");
		int price =scanner.nextInt();
		jeans.setPrice(price);
		System.out.print("Please input the pants's name:");
		String name =scanner.next();
		jeans.setName(name);
		System.out.printf("Your Jeans's Size:%s,Price:%dColor:%s,Name: %s",jeans.getSize(),jeans.getPrice(),jeans.getName());
		
}



}
