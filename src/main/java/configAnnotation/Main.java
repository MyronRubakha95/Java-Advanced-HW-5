package configAnnotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextAnnotation.xml");
        Calculator calculator = context.getBean("calculator", Calculator.class);
        calculator.calc(20, 60);
        context.close();

    }
}