import java.util.Random;

public class Parser{
	//checks balance of given string
	public boolean check(String s)
	{
		Stack stack = new Stack();
		//search through each char in String
		for(int i = 0; i < s.length(); i++)
		{
			char ch = s.charAt(i);
			//if ch is ( then push onto stack
			if(ch == '(')
			{
				String stringValue = String.valueOf(ch);
				stack.push(stringValue);
			}
			// else if ch is ) pop top if stack isnt empty
			else if(ch == ')')
			{
				if(stack.isEmpty())
				{
					return false;
				}
				else
				{
					stack.pop();
				}
			}
		}
		//if stack is empty return true other wise return false;
		if(stack.isEmpty())
		{
			return true;
		}
		else
		{
			return false;
		}
    }

    public String getString()
    {
    	String parentheses = "()";
    	String randomString = "";

    	Random rand = new Random();

    	int randomLength = rand.nextInt(11);

    	char[] text = new char[randomLength];

    	for(int i = 0; i < randomLength; i++)
    	{
    		text[i] = parentheses.charAt(rand.nextInt(parentheses.length()));
    	}
    	for(int i = 0; i < text.length; i++)
    	{
    		randomString += text[i];
    	}
    	return randomString;
    }
}