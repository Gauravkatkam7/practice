package string;

import java.util.LinkedHashSet;

public class removeduplicatecharacters {

	public static void main(String[] args) {
		
		String s1="ggaauurraavv";
		char a1[] =s1.toCharArray();
		
		LinkedHashSet lhs=new LinkedHashSet();
		
		for(char a:a1)
		{
			lhs.add(a);
		}
		for(Object b:lhs)
		{
			System.out.print(b);
		}
	}
}
