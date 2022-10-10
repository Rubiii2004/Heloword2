import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        int a [] = new int[10];
        int maximo = 0;
        int minimo = 0;
        int media = 0;
        System.out.println("Introduzca un numero");
        for(int i = 0;i<a.length;i=i+1){
            media=media+a[i];
         if(a[i]>=maximo){
             maximo = a[i];
         if(a[i]<minimo){
             minimo=a[i];
             System.out.println("Media=" +media/a.length);
             System.out.println("Maximo =" +maximo);
             System.out.println("Minimo = "+minimo);
         }

        }
    }


    }
}
