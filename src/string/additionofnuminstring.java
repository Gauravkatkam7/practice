package string;

public class additionofnuminstring {

	public static void main(String[] args) {
		
		
		String s1="g2h23k43";
		
		char a1[]=s1.toCharArray();
		int sum=0;
		for(int i=0;i<=a1.length-1;i++)
		{
			if(Character.isDigit(a1[i]))
			{
				sum=sum+a1[i];
			}
			System.out.println(sum);
		}
		
	}
}
