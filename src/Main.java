/**
 * Created by kissi on 16/10/17.
 */
public class Main {
    public static void main(String[] args) {
        int x0=2;
        int m=11;
        PseudoRandom p1=new PseudoRandom();
        /*int c=1;
        int a=5;
        //int x;*/
        int x;
        for (int i = 0; i <m ; i++) {
            x=+p1.toRand(x0,m);
            if(i+1==m)
            {
                System.out.println("x0 = "+x);
            }else{

                System.out.println("x"+(i+1)+" = "+x);

            }

            x0=x;
        }
    }

}
