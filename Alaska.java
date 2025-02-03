import java.text.DecimalFormat;

class Alaska extends State {
    //constructor
    public Alaska(String name){
        super(name, new NoTax());
    }

    //showTax overwritten
    @Override
    public void showTax(double value){
        double total = getBehavior().compute(value);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print(df.format(total));
    }
}
