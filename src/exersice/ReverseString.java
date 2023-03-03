package exersice;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="123";
		String s2="";
		char ch[]=s1.toCharArray();
				
		for(int i=ch.length-1;i>=0;i--)
		{
			s2+=ch[i];
		}
		System.out.println(s2);


	}

}
