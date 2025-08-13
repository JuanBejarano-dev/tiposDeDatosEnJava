import java.util.Scanner;
import javax.swing.JOptionPane;

public class App {

    private static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args){

        System.out.println("programa de entrada de datos");

        boolean salida = false;
        
        do{
            System.out.print(
                                "1. entrada de datos por ventana emergente \n" +
                                "2. entrada de datos por consola \n" +
                                "3. saludo personal \n" +
                                "4. salir del programa" +
                                "Digite su opcion : " );
            int op = entrada.nextInt();
            entrada.nextLine();

            switch (op) {
                case 1:System.out.println("Entrando a entrada de datos por ventana emergente..........");
                entradaDeDatosPorVentanaEmergente();
                break;

                case 2:System.out.println("Entrando a entrada de datos por consola");
                entradaDeDatosPorConsola();
                break;

                case 3:System.out.println("Entrando a saludo personal");
                saludoPersonal();
                break;

                case 4: System.out.println("Elegiste salir del programa........");
                        salida = true;
                break;

                default: System.out.println("opcion no valida........");
                    break;
            }

        }while(!salida);

        entrada.close();

        
    }

    public static void entradaDeDatosPorVentanaEmergente(){

        // entrada de datos por ventana emergente
        String  nombre = JOptionPane.showInputDialog("Digite el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
        float estatura = Float.parseFloat(JOptionPane.showInputDialog("Digite la estatura"));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Digite el sueldo"));
        char letra = JOptionPane.showInputDialog("Digite la letra").charAt(0);

        // salida de datos por ventana emergente
        JOptionPane.showMessageDialog(null, "El nombre es: " + nombre);
        JOptionPane.showMessageDialog(null, "La edad es: " + edad);
        JOptionPane.showMessageDialog(null, "La estatura es: " + estatura);
        JOptionPane.showMessageDialog(null, "El sueldo es: " + sueldo);
        JOptionPane.showMessageDialog(null, "La letra es: " + letra);

    }

    public static void entradaDeDatosPorConsola(){
        
        //entrada de datos por consola  
        int edad;
        String nombre;
        float estatura;
        char letra;

        System.out.print("Digite la edad: ");
        edad = entrada.nextInt();

        System.out.print("Digite el nombre: ");
        entrada.nextLine(); // limpiar el buffer
        nombre = entrada.nextLine(); // ejemplo: Johan Manuel Gordillo Mesa

        System.out.print("Digite la estatura: ");
        estatura = entrada.nextFloat();

        System.out.print("Digite una letra: ");
        letra = entrada.next().charAt(0); // ejemplo: j

        // imprimir datos por consola
        System.out.println("La edad es: " + edad + ", el nombre es: " + nombre + ", la estatura es: " + estatura + ", y la letra es: " + letra);

        
    }

    public static void saludoPersonal(){
        System.out.println("Hola Jorge, bienvenido al curso de programacion en java!!");
        System.out.println("""

                @@@@@@@
               @| O O |@
               (|  ^  |)
                | [_] |
                +-----+

                """);


        System.out.println("""

                  *
                 ***
                *****
               *******
                *****
                 ***
                  *

                """);
        
        System.out.println("Introduzca la primera palabra");
        String primeraPalabra = entrada.next();
        System.out.println("Introduzca la segunda palabra");
        String segundaPalabra = entrada.next();
        System.out.println("Introduzca la tercera palabra");
        String terceraPalabra = entrada.next();

        System.out.println("La frase guardada es : " + primeraPalabra + segundaPalabra + terceraPalabra);

        
    }
    
}