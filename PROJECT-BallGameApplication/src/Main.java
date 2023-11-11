
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = 1;
        System.out.print("Stack size: ");
        int S_size = input.nextInt();
        Stack x = new Stack(S_size);
        System.out.println("--------------------------------------------------------------------------");
        while (a == 1) {
            System.out.println("0 - exit");
            System.out.println("1 - push");
            System.out.println("2 - pop");
            System.out.println("3 - top");
            System.out.println("4 - print all datas");
            System.out.print("CHOOSE AN OPTION: ");
            int option = input.nextInt();
            System.out.println("");
            switch (option) {
                case 0:
                    a = 0;
                    break;
                case 1:
                    System.out.print("data: ");
                    int data = input.nextInt();
                    x.push(data);
                    break;
                case 2:
                    x.pop();
                    break;
                case 3:
                    x.top();
                    break;
                case 4:
                    x.print();
                    break;
                default:
                    System.out.println("INVALID VALUE.");
                    break;
            }
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
