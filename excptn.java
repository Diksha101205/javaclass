package class8;

public class excptn {
    public static void main(String[] args){
        try{
            int result = 10/0;
            System.out.println(result);
        }
        catch(ArithmeticException e){
            System.out.println("division by zero is not possible.");
        }
    }
}
