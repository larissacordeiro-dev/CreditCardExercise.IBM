package CreditCardExercise.creditCard.classes;

public class Main {
    public static void main(String[] args) {
        CreditCard cc1 = new CreditCard ( 10 , 2014, "Bob" , "Jones" , "1234567890123456" );
        System.out.println(cc1.toString()+"\nIs valid: "+cc1.isValid());
    }
}

