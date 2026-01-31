import java.util.Scanner;
public class CountVowelsConsonants2{
	public static void main(String args[])
	{
		Scanner a = new Scanner(System.in);
		String str=a.nextLine();
		int vowels=0,consonants=0;
		str = str.toLowerCase();
		for (int i=0;i< str.length();i++)
		{
			char ch=str.charAt(i);
			if("aeiou".indexOf(ch)!=-1)
			{
				vowels++;
			}
			else if(ch >='a' && ch<='z')
			{
				consonants++;
			}
		}
		System.out.println("Vowels:" + vowels);
		System.out.println("consonants:" + consonants);
	}
}