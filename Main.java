import java.util.Scanner;


public class Main{

    public static void main(String[] args) {
        Scanner numeroIF = new Scanner (System.in);
        System.out.print("Ingrese un numero: ");

        int n = numeroIF.nextInt();

        if (n > 0 ){
            System.out.printf("El numero %d es positivo", n);
        } else if (n < 0) {
            System.out.printf("El numero %d es negativo", n);
        } else {
            System.out.printf("El numero %d es cero", n);
        }
    }

}

