import java.util.Scanner;
public class SignUp {
    public static void main(String[] args) {
        //Vamos a crear un formulario de registro
        Scanner scanner = new Scanner(System.in);
        //Los datos que debes pedir al usuario son:
        //1. Nombre
        System.out.println("Cuál es tu nombre?");
        String name = scanner.nextLine();
        System.out.println();
        //2. Apellido
        System.out.println("Cuál es tu apellido?");
        String lastName = scanner.nextLine();
        System.out.println();
        //3. Nombre de usuario
        System.out.println("Elige tu nombre de usuario");
        String user = scanner.nextLine();
        System.out.println();
        //4. Contraseña
        System.out.println("Elige tu contraseña");
        String password = scanner.nextLine();
        System.out.println();
        //Añade una nueva línea antes de mostrar la siguiente pregunta.
        //Imprimir el siguiente resultado:
        //Hola <nombre> <apellido>, tu nombre de usuario es <usuario> y tu contraseña es <contraseña>, gracias por registrarte.
        //Añade una nueva línea antes de mostrar la respuesta
        System.out.println("Hola " + name + " " + lastName + ", tu nombre de usuario es " + user + " y tu contraseña es " + password + ", gracias por registrarte.");
        scanner.close();
    }
}