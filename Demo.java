package Abstract;

public class Demo extends AbstractDemo{
	//public void add(int n1,int n2) {

	@Override
		public void add(int n1, int n2) {
		int sum =n1+ n2;
		System.out.println("The Sum is "+sum);
		
	}

	@Override
	public void printmsg() {
		System.out.println("Hello Buddy...\n");
		
	}
		
	}

