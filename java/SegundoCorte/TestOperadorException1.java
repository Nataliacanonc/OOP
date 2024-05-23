package Excepciones;

import javax.swing.JFrame; // Import for JFrame (optional)
import javax.swing.JOptionPane;
import java.util.InputMismatchException;

public class TestOperadorExcepcion {

public static void main(String[] args) {
        try {
            int choice = getOperationChoice();
            int result = performOperation(choice);
            String messageResultado = "Resultado: " + result;
            JOptionPane.showMessageDialog(null, messageResultado, "Operación realizada", JOptionPane.INFORMATION_MESSAGE);
        } catch (OperadorExecepcion e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error de operador", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            System.err.println("Excepción: " + e.getClass().getName());
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Ocurrió un error inesperado", "Error general", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showMessageDialog(null, "Se revisó la operación", "Información", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    private static int getOperationChoice() {
        String[] options = {"Sumar", "Restar", "Multiplicar", "Dividir", "Potenciar"};
        int choice = JOptionPane.showOptionDialog(null, "Elija la operación:", "Selector de operación",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        if (choice == -1) {
            System.exit(0); // Exit if user cancels the dialog
        }
        return choice;
    }

    private static int performOperation(int choice) throws OperadorExecepcion {
        String messageN1 = "Ingrese el primer número (N1):";
        String messageN2 = "Ingrese el segundo número (N2):";
        JFrame parentFrame = new JFrame("Mi aplicación");
        int n1, n2;

        do {
            try {
                n1 = Integer.parseInt(JOptionPane.showInputDialog(parentFrame, messageN1));
                n2 = Integer.parseInt(JOptionPane.showInputDialog(parentFrame, messageN2));
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                JOptionPane.showMessageDialog(null, "Ingrese solo números enteros", "Error de entrada", JOptionPane.ERROR_MESSAGE);
            }
        } while (true); // Loop until valid input is entered

        switch (choice) {
            case 0:
                return sumar(n1, n2);
            case 1:
                return restar(n1, n2);
            case 2:
                return multiplicar(n1, n2);
            case 3:
                return dividir(n1, n2);
            case 4:
                return potenciar(n1, n2);
            default:
                throw new RuntimeException("Opción de operación inválida"); // Handle unexpected choices
        }
    }

    private static int sumar(int n1, int n2) {
        return n1 + n2;
    }

    private static int restar(int n1, int n2) {
        return n1 - n2;
    }

    private static int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    private static int dividir(int n1, int n2) throws OperadorExecepcion {
        if (n2 == 0) {
            throw new OperadorExecepcion("División entre cero");
        }
        return n1 / n2;
    }

    private static int potenciar(int base, int exponente) {
        int result = 1;
        for (int i = 0; i < exponente; i++) {
            result *= base;
        }
        return result;
    }
}

class OperadorExecepcion extends Exception {
    public OperadorExecepcion(String message) {
        super(message);
    }
}
    
