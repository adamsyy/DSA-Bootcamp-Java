public class Sb {
   public static void main(String[] args){
      StringBuilder builder=new StringBuilder();
      builder.append("str");
      builder.deleteCharAt(0);
      System.out.println(builder.toString());
   } 
}
