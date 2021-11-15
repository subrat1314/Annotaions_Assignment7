package annotaions;

/*import java.lang.annotation.Target;

@Target( ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute {
	int sequence() default 0;
}

public class CustomAnnotaion_Execute_Ques3 {
	public static void main(String[] args) {
		Test s=new Test(56);
		Class t=s.getClass();
		Annotation a=t.getAnnotation(Execute.class);
		Execute x=(Execute)a;
		System.out.println(x.sequence());
	}
}

class Test {
	public int pin;

	public Test(int pin) {
		this.pin = pin;
	}


	@Execute()
	public static void run2() {
	}

	@Execute()
	public static void run() {
	}
}*/


import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
    int Sequence() default 0;
}

public class CustomAnnotaion_Execute_Ques3 {
    public static void main(String[] args) {
       
    }
}
class execution{

    @Execute(Sequence = 2)
    public void myMethod1(){
        System.out.println("In method 2");
    }
    @Execute(Sequence = 1)
    public void myMethod2(){
        System.out.println("In method 1");
    }
    @Execute(Sequence = 3)
    public void myMethod3(){
        System.out.println("In method 3");
    }

}




