import java.text.DecimalFormat;

public abstract class State {
    //variables
    private String name;
    private SalesTaxBehavior behavior;

    //getters and setters
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public SalesTaxBehavior getBehavior(){
        return behavior;
    }
    public void setBehavior(SalesTaxBehavior behavior) {
        this.behavior = behavior;
    }

    //constructor
    public State(String name){
        this.name = name;
    }

    //showTax signature
    public void showTax(double value){
        double total = getBehavior().compute(value);
        DecimalFormat df = new DecimalFormat("#.##");
        System.out.print(df.format(total));
    }
}