
package boletin101;

import javax.swing.JOptionPane;


public class juego {
    
    String a;
    int n, s;
    
    public void numAle(){
        
        do{
            
            a=JOptionPane.showInputDialog("inserta un número entre 0 y 50");
        n=Integer.parseInt(a);
        
        }while(n<1 || n>50);
         do{
            a=JOptionPane.showInputDialog("JUGADOR 2, Introduzca su respuesta");
            s=Integer.parseInt(a);
            if(s<n){
                JOptionPane.showMessageDialog(null, "el número es mayor");
            }
            else if(s>n){
                JOptionPane.showMessageDialog(null, "El número es menor");
            }
            
        }while(s!=n);
        JOptionPane.showMessageDialog(null, "GANASTE");
        
    }
    
    
    
    
    
}
