import java.util.*;
class Solution{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		while (sc.hasNext()) {
			String input=sc.next();
            //Complete the code
            boolean isBalanced = true;
            Stack<Character> stack = new Stack<>();
            for(char ch : input.toCharArray()){
                if(ch=='(' || ch=='{' || ch=='['){
                    stack.push(ch);
                }
                else if(ch==')' && !stack.isEmpty() && stack.peek()=='('){
                    stack.pop();
                }
                else if(ch==']' && !stack.isEmpty() && stack.peek()=='['){
                    stack.pop();
                }
                else if(ch=='}' && !stack.isEmpty() && stack.peek()=='{'){
                    stack.pop();
                }
                else{
                    isBalanced = false;
                    break;
                }
            
            }
            if(stack.isEmpty() && isBalanced){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
		}
		
	}
}