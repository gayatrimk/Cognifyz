import java.util.Scanner;

public class Strength_Checker {
    public static int StrengthofPassword(String password)
    {
        double strength=0;

        int length=password.length();
        if(length<8)
        {
            strength+= 2.5;
        }
        else if(length<10)
        {
            strength+=3;
        }
        else if(length<12)
        {
            strength+=3.5;
        }else {
            strength+=4;
        }

        if(password.matches("(?=.*[A-Z]).*"))
        {
            strength+=1.5;
        }
        if(password.matches("(?=.*[a-z]).*"))
        {
            strength+=0.5;
        }
        if(password.matches("(?=.*[0-9]).*"))
        {
            strength++;
        }
        if(password.matches("(?=.*[!@#$%^&*]).*"))
        {
            strength+=2.5;
        }

        return (int) (strength*10);
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter your Password: ");
        String pass=input.next();

        System.out.println("The Strength of your Password is "+StrengthofPassword(pass)+"%");

    }


}

