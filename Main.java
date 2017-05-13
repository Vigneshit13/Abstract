package Abstract;
import java.util.Scanner;



public class Main extends Demo{

	public static void main(String[] args) {

		Scanner scan=new Scanner(System.in);
		System.out.println("enter first number:");		
		int n1=scan.nextInt();
		System.out.println("enter second number:");
		int n2=scan.nextInt();
		System.out.println("enter name:");
		String name=scan.next();
		Main obj = new Main();
		obj.printmsg();
		obj.add(n1, n2);
		obj.product(n1, n2);
		obj.display();
	}
	public void display() {
		System.out.println("Bybyeeee...");
	}
	}

