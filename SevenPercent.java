public class SevenPercent implements SalesTaxBehavior {
    @Override
    public double compute(double amount) {
        double result = (amount * 0.07);
        return result;
    }
}
