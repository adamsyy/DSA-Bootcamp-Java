public class Sumdigitrecurs{

    public static void main(String []args){
int num=123419;
int x=findd(num,0);
System.out.println(x);

    }
    public static int findd(int n,int s){
        
        if(n<=0){
            return s;}
        else{
            int d=n%10;
            s+=d;
           return findd(n/10,s);
        }
    }
}
