package ConfigXML;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext ("applicationContext.xml");
        Calculator calculator = context.getBean("calculator" , Calculator.class);
        calculator.calc(12,13);
        context.close();


















/*
        PlusService plusService = new PlusService();
        MinusService minusService = new MinusService();
        Calculator calculator = new Calculator(plusService , minusService);
        calculator.calc(3,20);

 */
        }
    }

