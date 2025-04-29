import java.sql.ResultSet;
import java.util.Scanner;
public class assignment3 {
    public static void main(String[] args) {

        int result;
        int num1;
        int num2;
        int operation;

        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("Welcome to the Calculator!");
            System.out.println("Please select an operation:");
            System.out.println("1. Addition\n" +
                    "2. Subtraction\n" +
                    "3. Multiplication\n" +
                    "4. Division\n" +
                    "5. Exit");
            System.out.printf("Enter your choice: ");
            operation = scanner.nextInt();
            if(operation==5){
                System.out.println("Exiting the calculator. Thank you!");

            }else{
                System.out.printf("Write the first number: ");
                num1 =scanner.nextInt();
                System.out.printf("Write the second number: ");
                num2= scanner.nextInt();
                System.out.println();
                switch (operation){
                    case 1:
                        result = num1 + num2;
                        System.out.println("Result: " + num1 + " + " + num2 +" = "+ result);
                        break;
                    case 2:
                        result = num1 - num2;
                        System.out.println("Result: " + num1 + " - " + num2 +" = "+ result);
                        break;
                    case 3:
                        result = num1 * num2;
                        System.out.println("Result: " + num1 + " * " + num2 +" = "+ result);
                        break;
                    case 4:
                        result = num1 / num2;
                        System.out.println("Result: " + num1 + " / " + num2 +" = "+ result);
                        break;
                }
                System.out.println();

            }



        }while (operation != 5);

    }
}
