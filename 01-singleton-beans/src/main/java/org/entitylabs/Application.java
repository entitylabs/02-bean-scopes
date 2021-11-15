package org.entitylabs;

import org.entitylabs.beans.BeanConfigurations;
import org.entitylabs.beans.Reader;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Application {

	public static void main(String[] args) {

		try (var applicationContext = new AnnotationConfigApplicationContext(Reader.class)) {

//			applicationContext.register(Reader.class);
//			applicationContext.refresh();
			System.out.println(applicationContext.getBean("reader"));
			System.out.println(applicationContext.getBean("reader"));
			System.out.println(applicationContext.getBean("reader"));
		} catch (Exception e) {
			System.err.print(e);
		}
	}

}
