package CreditCardExercise.creditCard.classes;

import java.util.Calendar;

public class CreditCard {
    private int expiryMonth;
    private int expiryYear;
    private String firstName;
    private String lastName;
    private String ccNumber;

    public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber) {
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.firstName = firstName;
        this.lastName = lastName;
        this.ccNumber = ccNumber;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() { return lastName; }

    public String getCcNumber() { return ccNumber; }


    public String formatFullName() {
        return (getFirstName() + " " + getLastName());
    }

    public String formatCCNumber() {
        String novo = getCcNumber();
        String bloco1 = novo.substring(0, 4);
        String bloco2 = novo.substring(4, 8);
        String bloco3 = novo.substring(8, 12);
        String bloco4 = novo.substring(12, 16);

        return (bloco1 + " " + bloco2 + " " + bloco3 + " " + bloco4);
    }

    public String formatExpiryDate() {
        Calendar c = Calendar.getInstance();
        c.set(expiryMonth, expiryYear);
        String s = "" + expiryYear;
        return (expiryMonth + "/" + s.substring(2, 4));
    }

    public boolean isValid() {
        Calendar now = Calendar.getInstance();
        int anoAtual = now.get(Calendar.YEAR);
        int mesAtual = now.get(Calendar.MONTH);
        int anoExpiracao = getExpiryYear();
        int mesExpiracao = getExpiryMonth();
        if (anoExpiracao >= anoAtual && mesExpiracao >= mesAtual) {
            return true;
        }
        if (anoExpiracao > anoAtual && mesExpiracao < mesAtual) {
            return true;
        } else {
            return false;
        }


    }

    @Override
    public String toString() {
        return "Number: " + formatCCNumber()
                + "\nExpiration Date: " + formatExpiryDate()
                + "\nAccount holder: " + formatFullName();
    }
}
