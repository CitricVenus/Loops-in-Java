import java.util.Scanner;
public class assignment2 {
    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while (flag){

            System.out.println("Write a positive number grater than 0 to sum");
            System.out.println("For exit write '-1'");
            number = scanner.nextInt();
            if (number == -1){
                System.out.println("End of program");
                flag = false;
            }
            else if(number < 0){
                System.out.println("Please write a positive number");
            }
            else {
                int sum = 0;


                while (number > 0){
                    int aux = number % 10;
                    sum += aux;
                    number /=10;
                }
                System.out.println("The sum of digits is: " + sum);
                System.out.println("-------------------------------");

            }

        }


    }
}
