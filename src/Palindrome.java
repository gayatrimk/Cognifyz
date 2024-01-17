import java.util.Scanner;

public class Palindrome {
    public static boolean Palindrome_Check(String str)
    {
        int i=0;
        int j=str.length()-1;
        char[] arr=str.toCharArray();
        while(i<=j)
        {
            while (i <= j && !Character.isLetterOrDigit(arr[i])) {
                i++;
            }
            while (i <= j && !Character.isLetterOrDigit(arr[j])) {
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
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str=input.next();
        System.out.println("This String a Palindrome ?\n"+Palindrome_Check(str));
    }
}
