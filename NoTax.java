public class NoTax implements SalesTaxBehavior {
    @Override
    public double compute(double amount) {
        return 0.00;
    }
}


