package files;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.nio.charset.StandardCharsets;

public class Encryptor {
    static byte[] textEncrypted;
    static SecretKey myDesKey;
    static KeyGenerator keygenerator;

    public Encryptor()
    {

    }
    public static String encrypt(String str) {
        try {
            keygenerator= KeyGenerator.getInstance("DES");
            myDesKey = keygenerator.generateKey();

            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");

            byte[] text = str.getBytes(StandardCharsets.UTF_8);

            desCipher.init(Cipher.ENCRYPT_MODE, myDesKey);
            textEncrypted = desCipher.doFinal(text);

            return new String(textEncrypted);

        } catch (Exception e) {
            System.out.println("Exception");
        }
        return "";
    }
    public static String decrypt()
    {
        try {
            Cipher desCipher;
            desCipher = Cipher.getInstance("DES");

            //byte[] text = str.getBytes(StandardCharsets.UTF_8);

            desCipher.init(Cipher.DECRYPT_MODE, myDesKey);
            byte[] textDecrypted = desCipher.doFinal(textEncrypted);

            // Converting decrypted byte array to string
            return new String(textDecrypted);
        }
        catch (Exception e) {
            System.out.println("Exception");
        }
        return "";
    }

}