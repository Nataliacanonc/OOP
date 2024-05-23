package Excepciones;

import javax.swing.JFrame; 
import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class TestExcepcion {

    public static void main(String[] args) {

        boolean continuarEjecucion = true;
       
      do {
        try { 
            JFrame parentFrame = new JFrame("My Application");
            
            String messageN1 = "Ingrese N1:";
            int n1 = Integer.parseInt(JOptionPane.showInputDialog(parentFrame, messageN1));

            String messageN2 = "Ingrese N2:";
            int n2 = Integer.parseInt(JOptionPane.showInputDialog(parentFrame, messageN2));

            int resultado = n1 / n2;

            String messageResultado = "Resultado: " + resultado;
            JOptionPane.showMessageDialog(parentFrame, messageResultado);  // Demonstrate message display

            continuarEjecucion = false;

        } catch (Exception e) {
            e.printStackTrace();  
            JOptionPane.showMessageDialog(null, "Ocurrio un error, Ingrese solo numeros enteros","numeros enteros", JOptionPane.ERROR_MESSAGE);
        }
      } while (continuarEjecucion);
     }
   }