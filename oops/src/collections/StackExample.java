package collections;
import java.util.Stack;

public class StackExample {

public static void main(String[] args) 
{

// Create an empty stack that contains String objects.

   Stack<String> st = new Stack<>();
   
// Checks that stack is empty or not.

   boolean empty = st.empty();

   System.out.println("Is stack empty: " +empty);
   
// Adds elements to the top of stack using push() method.
  st.push("Sunday");
   st.push("Monday");
   st.push("Tuesday");
   st.push("Wednesday");
   st.push("Thursday");
   st.push("Friday");
   st.push("Saturday");
   
// Displaying elements from the stack.
   System.out.println("Elements of Stack: " +st);

//remove element from the stack
System.out.println("Element removed from the Stack: " +st.pop());
System.out.println("Element removed from the Stack: " +st.pop());

// Displaying elements from the stack.
   System.out.println("Elements of Stack: " +st);

 }
}
