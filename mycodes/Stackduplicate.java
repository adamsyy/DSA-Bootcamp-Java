import java.util.Stack;

public class Stackduplicate {
    public static void main(String []args){
        String s="(3+4)";
        Stack<Character> st=new Stack<>();
      for(int i=0;i<s.length();i++){
          if(s.charAt(i)!=')'){
              st.push(s.charAt(i));
          }
          else{
              if(st.peek()=='('){System.out.println("true"); return;}
              else{
                  while(st.peek()!='('){
                      st.pop();
                  }
                 
              }
              System.out.println("false");  }
      }
      
      
        System.out.println(st.peek());
    }
}


