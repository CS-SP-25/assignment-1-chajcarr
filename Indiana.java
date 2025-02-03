import java.text.DecimalFormat;

class Indiana extends State {
    //constructor
    public Indiana(String name){
        super(name, new SevenPercent());
    }

    //showTax overwritten
    @Override
    public void showTax(double value){
        double total = getBehavior().compute(value);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print(df.format(total));
    }
}
