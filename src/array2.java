import java.util.Arrays;
import java.util.Scanner;
public class array2 {
    public static void main(String[] args) {
        int a [] = new int [5];
        int b [] = new int [5];
        int c []= new int [10];
        int posicionC = 0;
        Scanner sc = new Scanner(System.in);
        for(int i= 0;i<a.length; i=i+1){
            System.out.println("Introduce el numero"+1+"del array a:");
            a[i]=sc.nextInt();
            for(i = 0; i<b.length; i++) {
             System.out.println("Introduce el numero"+i+"del array b:");
             b[i]=sc.nextInt();
            int posocionC=0;
             for(i = 0; i<10; i=i+1) {
                 c[posicionC]= a[i];
                 posicionC++;
                 c[posocionC]=b[i];
                 posicionC++;
                 System.out.println(Arrays.toString(c));

          }
         }
        }
    }
}
