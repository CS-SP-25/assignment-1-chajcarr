import java.text.DecimalFormat;

class Hawaii extends State {
    //constructor
    public Hawaii(String name){
        super(name, new FourAndHalfPercent());
    }

    //showTax overwritten
    @Override
    public void showTax(double value){
        double total = getBehavior().compute(value);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print(df.format(total));
    }
}