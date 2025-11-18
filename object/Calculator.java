 package object;

 class DemoCalculator{
    int a;
    public int add(int n1, int n2)
     {
        int result = n1 + n2;
        return result;
    }

}

public class Calculator {
    public static void main(String[] args) {
        int num1 = 4;
        int num2 = 6;
        DemoCalculator calc = new DemoCalculator(); 
         int result = calc.add(num1, num2);
        // calc.add();
        System.out.println(result);
    }
}
