package boletin101;

import javax.swing.JOptionPane;

public class juego {

    private int n;

    public int pedirNum() {
        do {
            String dato = JOptionPane.showInputDialog("Inserta un número entre 1 y 50");
            n = Integer.parseInt(dato);
        } while (n < 1 || n > 50);
        return n;
    }

    public int Intentos() {
        do {
            String valor = JOptionPane.showInputDialog("Inserte numero de intentos");
            n = Integer.parseInt(valor);
        } while (n <= 0);
        return n;
    }

    public double jugar() {
        float resp = this.pedirNum();
        double intento = this.Intentos();
        float num;
        do {
            String dato = JOptionPane.showInputDialog("DALE AHÍ");
            num = Float.parseFloat(dato);
            n++;
            if (num < resp) {
                JOptionPane.showMessageDialog(null, "CALIENTEE");
            }
            if (num > resp) {
                JOptionPane.showMessageDialog(null, "FRIIIIOO");
            }
        } while (num != resp && n != intento);
        if (num == resp) {
            JOptionPane.showMessageDialog(null, "WIN");
        }
        if (n == intento) {
            JOptionPane.showMessageDialog(null, "LOSE");
        }
        return n;
    }
}
