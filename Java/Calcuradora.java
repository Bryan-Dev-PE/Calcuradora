import java.util.Scanner;

public class Calcuradora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer número: ");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el segundo número: ");
        int num2 = sc.nextInt();
        System.out.println("Ingrese la operación a realizar: \n1. Suma\n2. Resta\n3. Multiplicación\n4. División");
        int operacion = sc.nextInt();

        switch(operacion) {
            case 1:
                System.out.println("El resultado de la suma es: " + (num1 + num2));
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + (num1 - num2));
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + (num1 * num2));
                break;
            case 4:
                System.out.println("El resultado de la división es: " + (num1 / num2));
                break;
            default:
                System.out.println("Operación no válida");
        }
    }
}
