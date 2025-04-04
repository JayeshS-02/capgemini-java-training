package annotations2;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface ImportantTask{
}
public class Test {
	@ImportantTask()
	public static void myMethod() {
		Test t2 = new Test();
		Class<?> c = t2.getClass();
		try {
			
			Method m = c.getMethod("myMethod");
			if(m.isAnnotationPresent(ImportantTask.class)) {
				System.out.println("Method annotation Present");
			}
			else {
				System.out.println("Method annotation not Present");
				
			}
		}
		catch(NoSuchMethodException exc){
			System.out.println("method Not found");
		}
		
	}
	public static void main(String[] args) {
		myMethod();
	}
}
