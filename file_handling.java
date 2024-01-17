package files;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class file_handling {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to file Encryption and Decryption System!!!");
        System.out.println();
        int ch;
        do {
            System.out.println("Select the Process:\n1.Encryption\n2.Decryption\n3.Exit");
            ch = input.nextInt();
            if (ch == 1) {
                System.out.println("Encrypting file.\nSee results in EncryptedFile.txt");
                Encryption();
            } else if (ch == 2) {
                System.out.println("Decrypting file.\nSee results in DecryptedFile.txt");
                Decryption();
            }
        }
        while (ch != 3);
    }
    public static void Encryption() {
        try {
            FileReader fr1 = new FileReader("C:\\Users\\Gayatri\\Desktop\\java\\Cognifyz\\src\\InputFile.txt");
            FileWriter fw1 = new FileWriter("C:\\Users\\Gayatri\\Desktop\\java\\Cognifyz\\src\\EncryptedFile.txt");

            String str1 = "";
            int i;
            while ((i = fr1.read()) != -1) {
                str1 += (char) i;
            }
            String en = Encryptor.encrypt(str1);
            fw1.write(en);

            fr1.close();
            fw1.close();

            System.out.println("File encryption done");
        }
        catch (IOException e) {
            System.out.println("There are some IOException");
        }
    }

    public static void Decryption() {
        try {
            FileReader fr2 = new FileReader("C:\\Users\\Gayatri\\Desktop\\java\\Cognifyz\\src\\DecryptedFile.txt");
            FileWriter fw2 = new FileWriter("C:\\Users\\Gayatri\\Desktop\\java\\Cognifyz\\src\\DecryptedFile.txt");

            String de = Encryptor.decrypt();
            fw2.write(de);

            fr2.close();
            fw2.close();

            System.out.println("File decryption done");
        } catch (IOException e) {
            System.out.println("There are some IOException");
        }
    }
}