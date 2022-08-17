package ConfigJava;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
      /*  PlusService plusService = new PlusService();
        MinusService minusService = new MinusService();
        Calculator calculator = new Calculator(plusService , minusService);
        calculator.calc(3,20);

       */

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Calculator calculator = context.getBean("calculator" , Calculator.class);
        calculator.calc(15,3);
    }
}
