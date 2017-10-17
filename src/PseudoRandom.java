/**
 * Created by kissi on 16/10/17.
 */
public class PseudoRandom {




    int toRand(int x0, int m){
        int a=5,c=1;



        int i=0;
        int mprime;
        do{
            i++;
            mprime=(int)Math.pow(2,i);
        }while(mprime<m);

        x0=(a*x0+c)%mprime;
        System.out.println(a*x0+c);
        if(x0<m){

            return x0;
        }
        else

            return toRand(x0,m);


    }
}
