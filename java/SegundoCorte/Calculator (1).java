package calculator;

import javax.swing.JOptionPane;

public class Calculator {
    int num1;
    int num2;
    
    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int suma() {
         int suma = this.num1 + this.num2;
         return suma;
    }

    public int resta() {
         int resta = this.num1 - this.num2;
         return resta;
    }

    public int multiplicar() {
         int multiplicacion = this.num1 * this.num2;
         return multiplicacion;
    }

    public double dividir() {
        double division = (double)this.num1 / (double)this.num2;
        return division;
    }

    public double potenciar() {
        int potenciacion = this.num1 * this.num2;
        return potenciacion;
    }

    public static void main(String[] args) {
        String firstNumberInput = JOptionPane.showInputDialog("Enter the first integer:");
        String secondNumberInput = JOptionPane.showInputDialog("Enter the second integer:");

        int firstNumber = Integer.parseInt(firstNumberInput);
        int secondNumber = Integer.parseInt(secondNumberInput);

        Calculator calculator = new Calculator(firstNumber, secondNumber);
                
        String[] options = {"Suma", "Resta", "Multiplicación", "División", "Potenciación"};
        int option = JOptionPane.showOptionDialog(null, "Seleccione la operación", "Operación", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        switch (option) {
            case 0:
                JOptionPane.showMessageDialog(null, "El resultado de la suma es: " + calculator.suma(), "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case 1:
                JOptionPane.showMessageDialog(null, "El resultado de la resta es: " + calculator.resta(), "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(null, "El resultado de la multiplicación es: " + calculator.multiplicar(), "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "El resultado de la división es: " + calculator.dividir(), "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
            case 4:
                JOptionPane.showMessageDialog(null, "El resultado de la potenciación es: " + calculator.potenciar(), "Resultado", JOptionPane.PLAIN_MESSAGE);
                break;
        }
    }
}
