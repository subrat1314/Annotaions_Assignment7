package annotaions;

public class CustomAnnotaions_Ques1 {

	@interface Test {
		int test_case();

	}

	@Test(test_case = 1)
	public static void method1() {
		System.out.println("Method 1");

	}

	@Test(test_case = 2)
	public static void method2() {
		System.out.println("Method 2");
	}

	public static void main(String[] args) {
		method1();
		method2();

	}
}


