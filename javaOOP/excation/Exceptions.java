import java.util.ArrayList;
public class Exceptions{
    public static void main(String[] args) {
        ArrayList<Object> myList = new ArrayList<Object>();
            myList.add("13");
            myList.add("hello world");
            myList.add(48);
            myList.add("Goodbye World");
            for(int i = 0; i < myList.size(); i++) {
                try {
                    Integer castedValue = (Integer) myList.get(i);
                    System.out.println("success");
                } catch (Exception e) {
                    System.out.println("not success");
                }
                
            }
            
    }
} 