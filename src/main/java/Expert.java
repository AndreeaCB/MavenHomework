public class Expert extends Basic{

    public int powerInt(int base, int exp) {
        int rez = base;
        for (int i = 1; i < exp; i++) {
            rez = rez * base;
        }
        if (exp == 0) {
            rez = 1;
        }
        return rez;
    }

    public double powerDouble(double base, double exp) {
        double rez = base;
        for (int i = 1; i < exp; i++) {
            rez = rez * base;
        }
        if (exp == 0) {
            rez = 1;
        }
        return rez;
    }

    public long powerLong(long base, long exp) {
        long rez = base;
        for (int i = 1; i < exp; i++) {
            rez = rez * base;
        }
        if (exp == 0) {
            rez = 1;
        }
        return rez;
    }

    public float root(int nr) {
        float root = 0.0f;
        float square = root;
        while (square < nr) {
            root++;
            square = root * root;
        }
        return root;
    }

    public int factorial (int n){
        int rez = 1;
        for (int i = 1; i <= n; i++){
            rez = rez * i;
        }
        return rez;
    }
    public int factRec( int n){
        if ( n == 0) {
            return 1;
        }else{
            return (n* factRec(n-1));
        }
    }
    public int calcul(String var){
        var.substring(0,1);
        char varCh[] = var.toCharArray();
        int [] vect = new int[3];
        int rez= 1;
        int j=0;
        for (int i = 0; i < varCh.length; i++){

            vect[j] = varCh[i % 2];
            j++;
            if ( varCh[i] == '*'){
                rez = vect[1] * vect [2];
                System.out.println(vect[i-1]);
                System.out.println(vect[i+1]);
                vect[1]= rez;
                System.out.println(vect[1]);
            }
            rez = vect[0] + vect[1];
        }
        return rez;

    }






}
