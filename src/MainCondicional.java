public class MainCondicional {
    public static void main(String[] args) {
        /*
        Ejemplo 1. Determinar el menor de tres números
         */
        int a = 4, b = 12, c = 18;
        if (a < b) {
            if (a < c)
                System.out.println("El menor es: " + a);
            else
                System.out.println("El menor es: " + c);
        } else {
            if (b < c)
                System.out.println("El menor es: " + b);
            else
                System.out.println("El menor es: " + c);
        }

        /**
         * Ejercicio 1.
         * Hallar el mayor de cuatro números
         * Si u = 23, v = 14, x = 7, z = 27
         * (2 puntos)
         */
        int u = 23, v = 14, x = 47, z = 27;
        if(u > v) {
            if(u > x) {
                if(u > z) {
                    System.out.println("El mayor es: " + u);
                } else {
                    System.out.println("El mayor es: " + z);
                }
            } else if (x > z) {
                System.out.println("--> El mayor es: " + x);
            } else {
                System.out.println("El mayor es: " + z);
            }
        } else {
            if(v > x) {
                if(v > z) {
                    System.out.println("El mayor es: " + v);
                } else {
                    System.out.println("El mayor es: " + z);
                }
            } else {
                if(x > z) {
                    System.out.println("El mayor es: " + x);
                } else {
                    System.out.println("El mayor es: " + z);
                }
            }
        }
    }
}
