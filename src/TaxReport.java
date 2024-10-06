public class TaxReport {
    private  TaxCalculator calculator;

    public TaxReport() {
        calculator = new TaxCalculator(50_000);
    }

    public void show() {
        double tax = calculator.calculateTax();
        System.out.println(tax);
    }
}
