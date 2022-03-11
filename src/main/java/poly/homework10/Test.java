package poly.homework10;

public class Test {
    public static void main(String[] args) {
        SoleTrader Company1 = new SoleTrader("Trade","10.10.2010", "1234567891",
                "Ivan Ivanov", 545, 654);
        System.out.println(Company1.actualProfit());
        Company1.issuingOfInvoice();
    }
}
