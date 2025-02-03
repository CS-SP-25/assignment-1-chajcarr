public class FourAndHalfPercent implements SalesTaxBehavior {
    @Override
    public double compute(double amount) {
        double result = (amount * 0.045);
        return result;
    }
}