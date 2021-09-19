import java.util.LinkedList;

public class GFGLinkedlist {
    
    public static void main(String []args){
        LinkedList<Integer> x=new LinkedList<>();
        x.add(0,6);
        x.add(1,5);
        x.add(2,3);
        x.addFirst(9);

        System.out.println(x.get(1));
    }
}
