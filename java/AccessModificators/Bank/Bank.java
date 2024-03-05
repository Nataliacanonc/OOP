package bank;

public class Bank{
  private CheckingAccount accountOne;
  private CheckingAccount accountTwo;

  public Bank(){
    accountOne = new CheckingAccount("Zeus", 100, "1");
    accountTwo = new CheckingAccount("Hades", 200, "2");
  }

  public static void main(String[] args){
    Bank bankOfGods = new Bank();
    
    System.out.println("El saldo inicial de la cuenta es: " + bankOfGods.accountOne.getBalance());
  
    bankOfGods.accountOne.consignar(2000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.consignar(500);
    System.out.println(bankOfGods.accountOne.getBalance());
    
    System.out.println("El saldo final de la cuenta es: " + bankOfGods.accountOne.getBalance());
    System.out.println(" El interes con este total es de: " + bankOfGods.accountOne.getMonthlyInterest());
    
    bankOfGods.accountOne.retirar(2000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(3000);
    System.out.println(bankOfGods.accountOne.getBalance());
    bankOfGods.accountOne.retirar(500);
    System.out.println(bankOfGods.accountOne.getBalance());
  }
}