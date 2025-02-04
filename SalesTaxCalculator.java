import java.util.Scanner;
public class SalesTaxCalculator {
    public static void main(String[] args) {
        //set inputs
        State state;
        if(args[0].equals("Alaska")){
            state = new Alaska();
        } else if(args[0].equals("Indiana")){
            state = new Indiana();
        } else {
            state = new Hawaii();
        }
        double saleAmount = Double.parseDouble(args[1]);

        //display result
        System.out.print("The sales tax on "+saleAmount+" in "+state.getName()+" is: ");
                state.showTax(saleAmount);

    }
}
