
package boletin101;

import javax.swing.JOptionPane;


public class juego {
    
    String a;
    int n, s, d;
    
    
    public int opciones(){
        
        do{
        a=JOptionPane.showInputDialog("Escoje los turnos entre 5 y 20");
        d=Integer.parseInt(a);
        }while(d<5 || d>20);
        return d;
    }
    
    public void numAle(){
        
        do{
            
            a=JOptionPane.showInputDialog("inserta un número entre 0 y 50");
        n=Integer.parseInt(a);
        
        }while(n<1 || n>50);
         
        
    }
    
    public void empezar(){
        
        int i=1;
        
         for(int i=1;i<=d;i++){
         
        
            
            a=JOptionPane.showInputDialog("JUGADOR 2, Introduzca su respuesta");
            s=Integer.parseInt(a);
            if(s<n){
                JOptionPane.showMessageDialog(null, "el número es mayor");
                i=i+1;                
            }
            else if(s>n){
                JOptionPane.showMessageDialog(null, "El número es menor");
                i=i+1;
            }
           }  
         
        JOptionPane.showMessageDialog(null, "GANASTE");
    
         
                JOptionPane.showMessageDialog(null, "PERDISTE");
        }
        
           
          } 
                         
    
    
        
    
    
        
    



