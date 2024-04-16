public class EjerciciosConArrays {
    private int[] numeros;

    public EjerciciosConArrays(int[] numeros) {
        this.numeros = numeros;
    }

    public int[] getNumeros() {
        return numeros;
    }
    public void setNumeros(int[] numeros) {
        this.numeros = numeros;
    }

    public void posicionNumeroMayor() {
        int posicionMaximo = 0;
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > numeros[posicionMaximo]) {
                posicionMaximo = i;
            }
        }
        System.out.println("La posición del número mayor es: " + (posicionMaximo + 1));
    }
    public void posicionMayorNumeroPrimo(){
        int posicionMaximoPrimo = -1;
        for (int i = 0; i < 10; i++) {
            if (esPrimo(numeros[i]) && (posicionMaximoPrimo == -1 || numeros[i] > numeros[posicionMaximoPrimo])) {
                posicionMaximoPrimo = i;
            }
        }

        if (posicionMaximoPrimo != -1) {
            System.out.println("La posición del mayor número primo es: " + (posicionMaximoPrimo + 1));
        } else {
            System.out.println("No se encontró ningún número primo");
        }
    }
    public static boolean esPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    public void nPrimosEntreCienYTrescientos(){
        int[] primos = new int[10];
        int contador = 0;

        for (int i = 100; i <= 300 && contador < 10; i++) {
            if (esPrimo(i)) {
                primos[contador] = i;
                contador++;
            }
        }
        System.out.println("Los 10 números primos entre 100 y 300 son:");
        for (int primo : primos) {
            System.out.println(primo);
        }
    }
    public void posicionNumerosTerminadosEnCuatro(){
        System.out.println("Los números terminados en 4 están en las posiciones:");
        for (int i = 0; i < 10; i++) {
            if (numeros[i] % 10 == 4) {
                System.out.println(i + 1);
            }
        }
    }
    public void verRepeticionDeNumeroMayor(){
        int mayor = numeros[0];
        for (int i = 1; i < 10; i++) {
            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }
        }

        int contador = 0;
        for (int i = 0; i < 10; i++) {
            if (numeros[i] == mayor) {
                contador++;
            }
        }

        System.out.println("El mayor número es " + mayor + " y está repetido " + contador + " veces.");
    }
}

