public class Main {
    public static void main (String[] args) {

        float F = 0;
        float S = 0;
        for(int a = 1;a < 99;a++){
            F = (float) a /(a+2);
            S += (float) a /(a+2);
            int i = a + 2;
            ++a;
        }

        System.out.println("SumaTotala este = " + S);
    }
}