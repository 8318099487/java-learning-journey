package object;

 class DemoCalculator{
    int a;
    public int add()
     {
        System.out.println("In add");
        return 0;
    }

}

public class Calculator {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        DemoCalculator calc = new DemoCalculator(); 
         
        calc.add();
    }
}
