package vista;
import static javax.swing.WindowConstants.*;
public class Calculadora {
    public static void main(String[] args) {
        ventanacalculadora ventcalculadora = new ventanacalculadora();
        ventcalculadora.setLocationRelativeTo(null);
        ventcalculadora.setResizable(false);
        ventcalculadora.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ventcalculadora.setVisible(true);
    }
    
}
