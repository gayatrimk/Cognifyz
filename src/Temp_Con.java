import java.util.Scanner;
public class Temp_Con {
    public static float cel_feh(double temp)
    {
        if(temp<-273.15)
        {
            System.out.println("Lowest possible temperature is -273.15 degrees Celsius.");
            return -1;
        }
        return (float) (temp*9/5 + 32);
    }
    public static float feh_cel(double temp)
    {
        if(temp<-460)
        {
            System.out.println("Lowest possible temperature is -460 degrees Fahrenheit.");
            return -1;
        }
        return (float) ((temp - 32) *5/9);
    }
    public static float cel_kel(double temp)
    {
        if(temp<-273.15)
        {
            System.out.println("Lowest possible temperature is -273.15 degrees Celsius.");
            return -1;
        }
        return (float) (temp + 273.15);
    }
    public static float kel_cel(double temp)
    {
        if(temp<0)
        {
            System.out.println("Lowest possible temperature is 0 Kelvin.");
            return -1;
        }
        return (float) (temp - 273.15);
    }
    public static float kel_feh(double temp)
    {
        if(temp<0)
        {
            System.out.println("Lowest possible temperature is 0 Kelvin.");
            return -1;
        }
        return (float) ((temp- 273.15) * 9/5 + 32);
    }
    public static float feh_kel(double temp)
    {
        if(temp<-460)
        {
            System.out.println("Lowest possible temperature is -460 degrees Fahrenheit.");
            return -1;
        }
        return (float) (((temp-32)*5/9) + 273.15);
    }

    public static void main(String[] args) {
        System.out.println("### Welcome to Temperature Converter ###");
        Scanner input=new Scanner(System.in);
        int ch;
        float t1=0;
        do {
            System.out.println("Menu:\n1.Celsius to Fahrenheit\n2.Fahrenheit to Celsius\n3.Celsius to Kelvin\n4.Kelvin to Celsius\n5.Fahrenheit to Kelvin\n6.Kelvin to Fahrenheit\nEnter your Choice");
            ch=input.nextInt();
            if (ch < 7) {
                System.out.println("Enter temperature:");
                t1 = input.nextFloat();
            }

            switch (ch) {
                case 1 -> System.out.println(cel_feh(t1));
                case 2 -> System.out.println(feh_cel(t1));
                case 3 -> System.out.println(cel_kel(t1));
                case 4 -> System.out.println(kel_cel(t1));
                case 5 -> System.out.println(feh_kel(t1));
                case 6 -> System.out.println(kel_feh(t1));
                default -> {
                }
            }
        }
        while (ch<7);


        System.out.println("Exit.\nThanks for using this Program!!!");
    }
}
