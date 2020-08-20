class Base {
	
	public void test(Integer n) {
		System.out.println(n);
	}
}

class Child extends Base {
	
	public void test(Number n) {
		System.out.println(n);
	}
	
}
public class OverridingTest {
	public static void main(String[] args) {
		Base b = new Base();
		b.test(new Integer(2));
		
		Base b1 = new Child();
		b1.test(new Integer(5));				
	}
}