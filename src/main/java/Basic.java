public class Basic {

    //adding int + double + long
    public int add(int ... varA){
        int sum = 0;
        for (int  i = 0; i < varA.length; i++){
            sum = sum + varA[i];
        }
        return sum;
    }

    public double add(double ... varB){
        double sum = 0;
        for (int  i = 0; i < varB.length; i++){
            sum = sum + varB[i];
        }
        return sum;
    }

    public long add(long ... varC){
        long sum = 0;
        for (int  i = 0; i < varC.length; i++){
            sum = sum + varC[i];
        }
        return sum;
    }

    //substracting int + double + long

    public int subst(int ... varA){
        int sub = varA[0];
        for (int  i = 1; i < varA.length; i++){
            sub = sub - varA[i];
        }
        return sub;
    }

    public double subst(double ... varB){
        double sub = varB[0];
        for (int  i = 1; i < varB.length; i++){
            sub = sub - varB[i];
        }
        return sub;
    }

    public long subst(long ... varC){
        long sub = varC[0];
        for (int  i = 1; i < varC.length; i++){
            sub = sub - varC[i];
        }
        return sub;
    }

    //multiplying int + double + long
    public int multpl(int ... varA){
        int mul = 1;
        for (int  i = 0; i < varA.length; i++){
            mul = mul * varA[i];
        }
        return mul;
    }

    public double multpl(double ... varB){
        double mul = 1;
        for (int  i = 0; i < varB.length; i++){
            mul = mul * varB[i];
        }
        return mul;
    }

    public long multpl(long ... varC){
        long mul = 1;
        for (int  i = 0; i < varC.length; i++){
            mul = mul * varC[i];
        }
        return mul;
    }

    //dividing int + double + long
    public int divide(int ... varA){
        int div = varA[0];
        for (int  i = 1; i < varA.length; i++){
            div = div / varA[i];
        }
        return div;
    }

    public double divide(double ... varB){
        double div = varB[0];
        for (int  i = 1; i < varB.length; i++){
            div = div / varB[i];
        }
        return div;
    }

    public long divide(long ... varC){
        long div = varC[0];
        for (int  i = 1; i < varC.length; i++){
            div = div / varC[i];
        }
        return div;
    }


}
