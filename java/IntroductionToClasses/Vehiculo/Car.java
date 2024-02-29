package car;

public class Car {
  int Año;
  String Marca;
  int Cilindraje;
  int Precio;

  public Car(int year, String name, int cc) {
    Año = year; 
    Marca = name;
    Cilindraje = cc;
  }
  
  public int actualizarPrecio(int prize){
      Precio = prize;
      return Precio;
  }
  
  public static void main(String[] args) {
    Car myCar = new Car(1969, "Mustang", 150);
    System.out.println(myCar.Año + " " + myCar.Marca + " " + myCar.Cilindraje +" " + myCar.Precio);
    System.out.println("Nuevo precio: " + myCar.actualizarPrecio(3000));
  }
}