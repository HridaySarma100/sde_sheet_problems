package Hashing;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SHA256 {
    public static void main(String[] args) {
        System.out.println(encryptString("Hriday Sarma"));
    }

    private static String encryptString(String input){
        try {
            MessageDigest mD = MessageDigest.getInstance("SHA-256");
            byte[] messageDigest = mD.digest(input.getBytes());
            BigInteger bigInteger = new BigInteger(1,messageDigest);
            return bigInteger.toString(2);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
