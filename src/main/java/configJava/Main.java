package configJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Calculator calculator = context.getBean("calculator", Calculator.class);
        calculator.calc(15, 3);
        context.close();
    }
}