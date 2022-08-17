package ConfigJava;



public class Calculator {
    private final PlusService plusService ;
    private final MinusService minusService ;

    public Calculator(PlusService plusService, MinusService minusService) {
        this.plusService = plusService;
        this.minusService = minusService;
    }

    public void calc (int a , int b) {
        if (a > b) {
            System.out.println("Minus Srevice : " + minusService.minus(a,b));
        }else {
            System.out.println("Plus Service : " + plusService.add(a,b));
        }

    }
}
