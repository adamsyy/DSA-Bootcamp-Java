import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args){
        int[] a={3,5,2,4,1};
      sortt(a);
      System.out.println(Arrays.toString(a));
    }
    public static void sortt(int[] arr){
 int i=0,temp=0;
 while(i<arr.length){
     int correct=arr[i]-1;
     if(arr[i]!=arr[correct]){
         temp=arr[i];
         arr[i]=arr[correct];
         arr[correct]=temp;
     }else{i++;}
 }
    }
}
