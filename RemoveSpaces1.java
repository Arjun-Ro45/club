import java.util.Scanner;
public class RemoveSpaces1
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);	
		System.out.println("enter  a string:");
		String str=sc.nextLine();
		System.out.println("enter  a word to remove from string:");
		String temp=sc.nextLine();
		//char ch=temp.charAt(0);
		String new_string=str.replaceAll(temp,"");
		System.out.println("String without spaces:"+new_string);
	}
}