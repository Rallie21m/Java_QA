package poly.homework10;

import java.util.Scanner;

public class SoleTrader extends Company implements IssuingInvoice{
    private String nameOfOwner;
    private double initialCapital;
    private double actualCapital;

    Scanner scanner = new Scanner(System.in);

    public String getNameOfOwner() {
        return nameOfOwner;
    }

    public void setNameOfOwner(String nameOfOwner) {
        if (!nameOfOwner.trim().isEmpty()) {
            this.nameOfOwner = nameOfOwner;
        } else {
            System.out.println("Invalid name of owner!");
        }
    }

    public double getInitialCapital() {
        return initialCapital;
    }

    public void setInitialCapital(double initialCapital) {
        this.initialCapital = initialCapital;
    }

    public double getActualCapital() {
        return actualCapital;
    }

    public void setActualCapital(double actualCapital) {
        this.actualCapital = actualCapital;
    }

    public SoleTrader(String nameOfCompany, String dataOfEstablish, String registrationNo,
                      String nameOfOwner, double initialCapital, double actualCapital) {
        super(nameOfCompany, dataOfEstablish, registrationNo);
        setNameOfOwner(nameOfOwner);
        setInitialCapital(initialCapital);
        setActualCapital(actualCapital);
    }

    public double actualProfit(){
        double profit;
        profit = this.actualCapital - this.initialCapital;
        return profit;
    }


    @Override
    public void issuingOfInvoice() {
        String buyer;
        int amount;
        int number;
        String date;
        System.out.println("Enter bayer:");
        buyer = scanner.next();
        System.out.println("Enter amount:");
        amount = scanner.nextInt();
        System.out.println("Enter date of issuing:");
        date = scanner.next();
        System.out.println("Enter number of invoice:");
        number = scanner.nextInt();

        System.out.printf("%n Invoice N %d, date %s, issuer %s,recipient %s, amount %d",
                number, date,super.getNameOfCompany(), buyer, amount);
    }
}
