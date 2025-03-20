package bt.edu.gcit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml"); // Creates a IOC container
        Alien obj = (Alien) context.getBean("alien");
        // Alien obj1 = context.getBean("alien", Alien.class);
        // obj.code();
    }
}