import java.util.Scanner;
public class CountWords
{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	String str="Java is easy to learn";
	String[] words=str.split(" ");
	System.out.println("Number of words:"+words.length);
}
}