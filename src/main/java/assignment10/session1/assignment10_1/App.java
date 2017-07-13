package assignment10.session1.assignment10_1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
	      @SuppressWarnings("resource")
	      ApplicationContext ac = new ClassPathXmlApplicationContext("spring.xml");
	      HelloWorld obj =(HelloWorld)ac.getBean("helloWorld");
	      obj.getMessage();
	      
	      ApplicationContextProvider appContext = new ApplicationContextProvider();
	      HelloWorld hw = appContext.getApplicationContext().getBean("helloWorld", HelloWorld.class);
	      hw.getMessage();
	   }
}
