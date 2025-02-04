import java.text.DecimalFormat;

class Hawaii extends State {
    //constructor
    public Hawaii(){
        super("Hawaii");
        setBehavior(new FourAndHalfPercent());
    }

}