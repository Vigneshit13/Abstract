package Abstract;
abstract class AbstractDemo {
	abstract public void add(int n1,int n2);
	abstract public void printmsg();
	void product(int n1,int n2){
		int prod=n1*n2;
		System.out.println("The Product is "+prod);
	}
}
