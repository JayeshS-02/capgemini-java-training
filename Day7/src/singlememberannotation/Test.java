package singlememberannotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
@interface Author{
	String value();
}

@Author("Shakesphere")
class Test {
	public static void main(String[] args) {
		Test t = new Test();
		Class<?> c = t.getClass();
		Author author = c.getAnnotation(Author.class);
		System.out.println("Author: "+author.value());
	}
}
