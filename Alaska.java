import java.text.DecimalFormat;

class Alaska extends State {
    //constructor
    public Alaska(){
        super("Alaska");
        setBehavior(new NoTax());
    }
}
