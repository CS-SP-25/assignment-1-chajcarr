import java.text.DecimalFormat;

class Indiana extends State {
    //constructor
    public Indiana(){
        super("Indiana");
        setBehavior(new SevenPercent());
    }
}
