import java.text.DecimalFormat;

public class CompoundInterest {

    public static void main(String[] args) {
        System.out.println(CompoundInterest(190000, 5, .15, 1));
    }

    public static double CompoundInterest(double principle, double years, double annualInterest, int timesPerYear){
        double total = principle * Math.pow(annualInterest/timesPerYear + 1, years * timesPerYear);

        /* wrote it the long way, then reformatted.
        double a = annualInterest/timesPerYear + 1;
        System.out.println(a);
        double b = Math.pow(a, years * timesPerYear);
        System.out.println(b);
        double total = principle * b;*/

        DecimalFormat df = new DecimalFormat("#.00");
        return Double.parseDouble(df.format(total));
    }
}
