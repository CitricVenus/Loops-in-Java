import java.util.Scanner;
public class assignment1 {
    public static void main(String[] args) {

        //Print Numbers:
        System.out.println("---------------Print Numbers----------------");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }

        //Calculate Sum:
        System.out.println("---------------Calculate Sum----------------");
        int sum= 0;
        for (int i = 1; i <=10 ; i++) {
            sum = sum + i ;
        }
        System.out.println(sum);

        //Print Multiplication Table:
        System.out.println("-------------Multiplication Table----------------");
        int number;
        Scanner scanner = new Scanner(System.in);
        System.out.println("What multiplication table number you want to know?");
        System.out.println("Write you number:");
        number = scanner.nextInt();
        for (int i = 1 ; i <=10 ; i++){
            System.out.printf("%d x %d = %d\n",number,i,number*i);
        }
    }
}
