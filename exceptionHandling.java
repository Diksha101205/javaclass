import java.util.Scanner;

public class exceptionHandling {
    public void division(){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try{
            int value = a/b;
            System.out.println(value);
        }
        catch(ArithmeticException e){
            System.out.println("divisible by zero is not possible");
            division();
        }
    }

    public static void main(String[] args){
        exceptionHandling exp = new exceptionHandling();
        exp.division();
    }
}

