import java.util.Scanner;
public class piramideinversa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        for (int i = 0; i < num; i = i + 1) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < num - i; j++) {
                System.out.print("* ");
            }

            System.out.println("");
        }
    }

}















