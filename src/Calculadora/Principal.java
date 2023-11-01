package Calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.println("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            Operación operación = new Operación(num1, num2);

            System.out.println("Seleccione la operación a realizar:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.println("5. Potenciación");
            System.out.println("6. Raíz");
            System.out.println("7. Salir");

            int opción = scanner.nextInt();

            double resultado = 0;

            switch (opción) {
                case 1:
                    resultado = operación.suma();
                    break;
                case 2:
                    resultado = operación.resta();
                    break;
                case 3:
                    resultado = operación.multiplicación();
                    break;
                case 4:
                    resultado = operación.division();
                    break;
                case 5:
                    resultado = operación.potenciacion();
                    break;
                case 6:
                    resultado = operación.raiz();
                    break;
                case 7:
                    System.out.println("Saliendo del programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }

            System.out.println("El resultado es: " + resultado);
        }
    }
}
