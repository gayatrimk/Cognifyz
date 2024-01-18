import java.util.Scanner;

public class Palindrome {
    public static boolean Palindrome_Check(String str)
    {
        int i=0;
        int j=str.length()-1;
        char[] arr=str.toCharArray();
        while(i<=j)
        {
            while (i <= j && !Character.isLetterOrDigit(arr[i]) || Character.isWhitespace(arr[i])) {
                i++;
            }
            while (i <= j && !Character.isLetterOrDigit(arr[j]) || Character.isWhitespace(arr[j])) {
                j--;
            }

            if (i <= j && Character.toLowerCase(arr[i]) != Character.toLowerCase(arr[j])) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("### Welcome to Palindrome Checker ###");
        int ch;
        do{
            System.out.println("Menu:\n1.Check Palindrome\n2.Exit");
            Scanner input=new Scanner(System.in);
            ch=input.nextInt();
            input.nextLine();
            if(ch==1)
            {
                System.out.println("Enter the String: ");
                String str=input.nextLine();
                System.out.println("This String a Palindrome ?\n"+Palindrome_Check(str));
            }
        }
        while (ch!=2);


    }
}
