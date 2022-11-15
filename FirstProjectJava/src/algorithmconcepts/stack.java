package algorithmconcepts;

public class stack {

	private char[] text = new char[5];
	private int top;
	stack() {
		top = -1;
	}
    void push(char c)
	{
     
		if(top==text.length-1)
			System.out.println("The Stack is full");
		else
			text[++top]= c;
		 
		    
	}
     char pop()
    {
    	if(top>=0)
    		return text[top--];
    	else
    		System.out.println("The stack is empty");
        return 0;
    	
    }
    
}
