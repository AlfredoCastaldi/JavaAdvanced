import java.math.BigDecimal;
import java.util.Scanner;

public class Main {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args){
        BigDecimal big = BigDecimal.valueOf(10);
        System.out.println(bigOperator(big));
    }
    public static BigDecimal bigOperator(BigDecimal big){

        BigDecimal big1 = BigDecimal.valueOf(0);
        System.out.println("chose operator: \n" +
                " 1: add \n 2: subtracts \n 3: multiply \n 4: divide \n 5: min \n 6: max");
        int choice = input.nextInt();
        switch (choice){
            case 1: System.out.println("add to: " + big);
                big1 = big.add(BigDecimal.valueOf(input.nextInt()));
                System.out.println( "add result: " + big1);
                break;
            case 2: System.out.println("subtract from: " + big);
                big1 = big.subtract(BigDecimal.valueOf(input.nextInt()));
                System.out.println( "subtract result: " + big1);
                break;
            case 3: System.out.println("multiply: " + big + " with: ");
                big1 = big.multiply(BigDecimal.valueOf(input.nextInt()));
                System.out.println( "multiply result: " + big1);
                break;
            case 4: System.out.println("divide: " + big + " with: ");
                big1 = big.divide(BigDecimal.valueOf(input.nextInt()));
                System.out.println( "divide result: " + big1);
                break;
            case 5: System.out.println("get the min between: " + big + " and input: ");
                big1 = big.min(BigDecimal.valueOf(input.nextInt()));
                System.out.println( "min result: " + big1);
                break;
            case 6: System.out.println("get the max between: " + big + "  and input:  ");
                big1 = big.max(BigDecimal.valueOf(input.nextInt()));
                System.out.println( "max result: " + big1);
                break;
            default: return big1;
        }
       return big1;
    }
}
