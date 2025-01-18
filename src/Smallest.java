import java.util.Scanner;
public class Smallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First number");
        int num = scanner.nextInt();

        System.out.println(" Second Number ");
        int num2 = scanner.nextInt();

        if(num<num2){
            System.out.print(num);
        }else{
            System.out.print(num2);
        }
    }
}