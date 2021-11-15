package annotaions;

/*import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface info {

	String name();
	String supervisor()default "ONKAR";
	int version();
	int AuthorID();
	String Author() default "PRATIK";
	String Date();
	String Time();
	String desp() default "hello its annotation program";*/

/*import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
@Target({ElementType.TYPE, ElementType.METHOD ,ElementType.FIELD})
@interface Info {
	int AuthorID() default 123;
	String Author() default "Pranab";
	int Date() default 10 / 11 / 2021;
	int Time() default 9;
	int Version() default 10;
}

@Info
public class CustmoAnnotationQue2 {
	@Info
	String Name;

	@Info
	public void method1() {

	}

	@Info
	public void method2(@Info String Author) {
		this.Name = Author;
		System.out.println(Author);
	}

	public static void main(String[] args) {
		CustmoAnnotationQue2 ca = new CustmoAnnotationQue2();
		ca.method1();

	}
}*/

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD,ElementType.TYPE})
@interface Info{
    int AuthorID();
    String Author() default "Subrat";
    String Supervisor() default "THE ROCK";
    String Date();
    String Time();
    int Version();
    String Description() default "F&F";
}



@Info(AuthorID = 3, Date = "15-11-2021",Time = "6:30",Version = 1)
public class CustomAnnotation_Info_Ques2 {
    public static void main(String[] args) {

    }

    @Info(AuthorID = 16,Author = "Leclerc",Date = "15-11-2021",Time = "6:30",Version = 2)
    public void driver() {

    }
}

