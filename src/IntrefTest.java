/*
class IntrefTest {

	int x = 888;

	public void m2() {
		//Case 1
		*/
/*Intref i = new Intref() {
			int x = 777;

			@Override
			public void m1() {
				int x = 999;
				System.out.println(new IntrefTest().x);
				System.out.println(this.x); // instance variable of Anonymous inner class
				System.out.println(x); // It is method local variable
			}
		};*//*



		//Case 2
		Intref i = ()-> {
			int x = 999; //It is method local variable
			System.out.println(this.x); //888
			System.out.println(x); //999
		};

		i.m1();
	}
	public static void main(String []args) {
		IntrefTest t = new IntrefTest();
		t.m2();
	}
}*/
