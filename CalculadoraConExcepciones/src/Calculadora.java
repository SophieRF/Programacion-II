import java.util.Scanner;

public class Calculadora {
    Scanner scan = new Scanner(System.in);

    public void calcular() {
        while (true) {
            System.out.println("Ingrese el primer número: ");
            String numero = scan.nextLine();
            double num1 = 0;
            try {
                num1 = Double.parseDouble(numero);
            } catch (NumberFormatException e2) {
                System.out.println("No has ingresado un número válido.");
                continue;
            }
            System.out.println("Ingrese la operación que desea realizar(+, -, x, /): ");
            String operador = scan.nextLine();
                if (operador.equals("x") || operador.equals("/") || operador.equals("+") || operador.equals("-")) {
                } else {
                    System.out.println("Operador no válido.");
                    continue;
                }
            System.out.println("Ingrese el otro número: ");
            String numero2 = scan.nextLine();
            double num2;
            try {
                num2 = Double.parseDouble(numero2);
            } catch (NumberFormatException e2) {
                System.out.println("No has ingresado un número válido");
                continue;
            }
            double resultado = 0;
            try{
                switch (operador) {
                    case "+":
                        resultado = num1 + num2;
                        break;
                    case "-":
                        resultado = num1 - num2;
                        break;
                    case "x":
                        resultado = num1 * num2;
                        break;
                    case "/":
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            throw new ArithmeticException("División por cero no válida");
                        }
                        break;
                    default:
                        System.out.println("Operador no válido.");
                        continue;
            }
            }catch (ArithmeticException e){
                System.out.println("Error: "+ e.getMessage());
                continue;
            }

            System.out.println("El resultado de la operación es: " + resultado);

            System.out.println("¿Desea realizar otra operación? (s/n): ");
            String continuar = scan.nextLine();
            if (!continuar.equalsIgnoreCase("s")) {
                break;
            }
        }
        scan.close();
    }
}
