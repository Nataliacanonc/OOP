package calculadora;


public class Calculadora1 {
  int x;
  int y;
  float r;

  public Calculadora1 (int a, int b, int c){
    x=a;
    y=b;
    r=c;
  }

  public float sumar (int a, int b){
    x=a;
    y=b;
    r=x+y;
    return r;
  }

  public float restar (int a, int b){
    x=a;
    y=b;
    r=x-y;
    return r;
  }
  public float multiplicar (int a, int b){
    x=a;
    y=b;
    r=x*y;
    return r;
  }
    public float dividir (int a, int b){
    x=a;
    y=b;
    r= x/y;
    return r;
  }
    public float potenciacion (int a){
    x=a;
    r= x*x;   
    return r;
  }
  public void imprimirResultado() {
    System.out.println("El resultado de la operacion es: " + r);
  } 
  
  public static void main(String[] args) {
    Calculadora1 obj1 = new Calculadora1(0,0,0);
    obj1.sumar(6,2);
    obj1.imprimirResultado();
    obj1.restar(6,3);
    obj1.imprimirResultado();
    obj1.multiplicar(2,2);
    obj1.imprimirResultado();
    obj1.dividir(6,2);
    obj1.imprimirResultado();
    obj1.potenciacion(4);
    obj1.imprimirResultado();    
  }
}