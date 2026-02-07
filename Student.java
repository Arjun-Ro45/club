import java.util.Scanner;
public class Student {
    public static void main(String[] args) {
        String str = "Arjun";
        int age = 21;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the marks");
        int marks=sc.nextInt();
        if(marks>75)
    {
        System.out.println("Grade A");
        System.err.println("marks"+marks);
        System.out.println("pass");
    }
    else if(marks>50)
    {
        System.out.println("Grade B");
        System.err.println("marks"+marks);
        System.out.println("pass");
    }
    else{
        System.out.println("fail");
    }
    }
}
