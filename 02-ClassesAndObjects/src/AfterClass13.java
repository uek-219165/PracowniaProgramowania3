public class AfterClass13 {

 class SmartPhone {
     String owner;
     String model;
     String imei;
     String phoneNumber;
     String color;

     void phoneDetails() {
        System.out.println("Smartphone with imei: " + imei + " belongs to " + owner + " phone number: " + phoneNumber);
     }

     void showDevice() {
         System.out.println(imei + " " + model + " " + color);
     }

     public void setOwner(String owner) {
         this.owner = owner;
     }
 }

 class BankAccount {
     String owner;
     String accountNumber;
     double money;
     String cardNumber;
     String cardExpireDate;

     void showAccountData() {
         System.out.println("Account: " + accountNumber + ", blongs to " + owner + " available founds: " + money + " zł");
     }

     void showFounds() {
         System.out.println("Available founds: " + money + " zł");
     }

     void showCard() {
         System.out.println("Card: " + cardNumber + " expires " + cardExpireDate);
     }
 }
}
