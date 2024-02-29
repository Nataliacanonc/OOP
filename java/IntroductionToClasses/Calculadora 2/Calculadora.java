package calculadora;


public class Calculadora {
    int Numero1;
    int Numero2;
    
public Calculadora (int operador1, int operador2){
    Numero1 = operador1;
    Numero2 = operador2;
}
public int sumar(){
    int suma = this.Numero1 + this.Numero2;
    return suma;
}
public int restar(){
    int resta = this.Numero1 - this.Numero2;
    return resta;
}
public int multiplicar(){
    int multiplicacion = this.Numero1 * this.Numero2;
    return multiplicacion;
}
public double dividir(){
    double division = (double)this.Numero1 / (double)this.Numero2;
    return division;
}
public int potencia(){
    int potenciacion = this.Numero1 * this.Numero1;
    return potenciacion;
}
    public static void main(String[] args) {
        Calculadora miOperacion = new Calculadora (5,2);
        System.out.println("La suma es: " + miOperacion.sumar());
        System.out.println("La resta es: " + miOperacion.restar());
        System.out.println("La multiplicacion es: " + miOperacion.multiplicar());
        System.out.println("La division es: " + miOperacion.dividir());
        System.out.println("La potencia es: " + miOperacion.potencia());
    }
    
}
