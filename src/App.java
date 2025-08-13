
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        // entrada de datos por ventana emergente

        String nombre = JOptionPane.showInputDialog("Digite el nombre");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad"));
        float estatura = Float.parseFloat(JOptionPane.showInputDialog("Digite la estatura"));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("Digite el sueldo"));
        char letra = JOptionPane.showInputDialog("Digite el nombre de nuevo").charAt(0);

        // salida de datos por ventana emergente

        JOptionPane.showMessageDialog(null, "el nombre es: " + nombre);
        JOptionPane.showMessageDialog(null, "la edad es: " + edad);
        JOptionPane.showMessageDialog(null, "la estatura es: " + estatura);
        JOptionPane.showMessageDialog(null, "el sueldo es: "+ sueldo);
        JOptionPane.showMessageDialog(null, "la letra es: "+ letra); 

    }
}
