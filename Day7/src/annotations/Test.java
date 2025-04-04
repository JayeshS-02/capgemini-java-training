package annotations;

import java.lang.annotation.*; 
import java.lang.reflect.*; 

@Retention(RetentionPolicy.RUNTIME)
@interface Info { 
String status(); 
double version(); 
} 



@Info(status = "Annotation Status", version = 10.00) 
class Test { 
		 
	public static void main(String args[]) { 
		Test t1 = new Test();
		Class<?> c =t1.getClass();
		Info info = c.getAnnotation(Info.class);
		System.out.println("Status: " + info.status());
		System.out.println("Status: " + info.version());
	} 
} 