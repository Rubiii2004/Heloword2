 import java.util.Scanner;
public class asteriscosinertido {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        for (int i= 0; i < num; i = i + 1) {
            for (int j = 0; j < i + 1; j++) {
                    System.out.print(" *");
                }
                System.out.println("");
            }
    }  }