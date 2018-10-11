import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
        double result;
        float rez;

        Basic bas = new Basic();
        result = bas.add(1F,2F,3F,4F,5F,6F,7F,8F,9F,10F);
        result = bas.subst(1F,2F,3F,4F,5F,6F,7F,8F,9F,10F);
        result = bas.multpl(1F,2F,3F);
        result = bas.divide(1F,2F,3F);

        //ex 4 prima varianta
        System.out.printf("%.8f", result);
        System.out.println(" ");
        //ex 4 a doua varianta
        DecimalFormat df= new DecimalFormat();
        df.setMaximumFractionDigits(3);
        System.out.println(df.format(result));

        Expert exp = new Expert();
        rez = exp.root(9);
        System.out.println(rez);

        rez= exp.factRec(5);
        System.out.println(rez);
        System.out.println("calcul rezultat: ");
        rez= exp.calcul("3+2*4");
        System.out.println(rez);
    }
}
