import java.util.Scanner;

public class MainLogin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        /**
         * Ingresar username y password por teclado y validar si es correcto
         */
        String dataUsername = "jose";
        String dataPassword = "j0s3";

        System.out.print("Username: ");
        String username = teclado.nextLine(); // Jose Luis Sanabria
        System.out.print("Password: ");
        String password = teclado.nextLine();

        if(username.equals(dataUsername) && password.equals(dataPassword)) {
            System.out.println("Bienvenido " + username + " !");
        } else {
            System.out.println("Credenciales incorrectas :(");
        }
    }
}
