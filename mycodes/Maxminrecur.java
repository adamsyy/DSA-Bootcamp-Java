public class Maxminrecur {
    public static void main(String []args){
        int[] arrr = { 12, 13, 45, 67, 1 };
        int maxy=getmax(arrr, 0, arrr.length);
        System.out.println(maxy);
    }
    public static int getmax(int[] arr,int i,int n){
     return (n==1)?arr[i]:Math.max(arr[i], getmax(arr, i+1, n-1)); 
    }
}
