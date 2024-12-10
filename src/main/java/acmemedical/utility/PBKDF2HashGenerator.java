/********************************************************************************************************
 * File:  PBKDF2HashGenerator.java
 * Course Materials CST 8277
 * @author Teddy Yap
 * @author Mike Norman
 * 
 * Note:  Students do NOT need to change anything in this class.
 *
 */
package acmemedical.utility;

import static acmemedical.utility.MyConstants.DEFAULT_KEY_SIZE;
import static acmemedical.utility.MyConstants.DEFAULT_PROPERTY_ALGORITHM;
import static acmemedical.utility.MyConstants.DEFAULT_PROPERTY_ITERATIONS;
import static acmemedical.utility.MyConstants.DEFAULT_SALT_SIZE;
import static acmemedical.utility.MyConstants.PROPERTY_ALGORITHM;
import static acmemedical.utility.MyConstants.PROPERTY_ITERATIONS;
import static acmemedical.utility.MyConstants.PROPERTY_KEY_SIZE;
import static acmemedical.utility.MyConstants.PROPERTY_SALT_SIZE;

import java.util.Base64;
import java.util.HashMap;
import java.util.Map;

import org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl;

import jakarta.security.enterprise.identitystore.Pbkdf2PasswordHash;



public class PBKDF2HashGenerator {
    // The nickname of this hash algorithm is 'PBandJ' (Peanut-Butter-And-Jam, like the sandwich!)
    // I would like to use the constants from org.glassfish.soteria.identitystores.hash.Pbkdf2PasswordHashImpl
    // but they are not visible, so type in them all over again :-( Hope there are no typos!

    public static void main(String[] args) {
    	
    	//testing//
//    	String testPassword = "TestPassword123";
//        String hash = generateHash(testPassword);
//        System.out.println("Generated hash: " + hash);
//        
//        if (args.length == 0) {
//            System.err.println("Error: Please provide a password as a command-line argument.");
//            System.exit(1); // Exit with a non-zero status to indicate failure.
//        }
//
//        String testPassword2 = args[0];
//        String hash = generateHash(testPassword);
//        System.out.println("Generated hash: " + hash);
        //testing//
        
        Pbkdf2PasswordHash pbAndjPasswordHash = new Pbkdf2PasswordHashImpl();

        Map<String, String> pbAndjProperties = new HashMap<>();
        pbAndjProperties.put(PROPERTY_ALGORITHM, DEFAULT_PROPERTY_ALGORITHM);
        pbAndjProperties.put(PROPERTY_ITERATIONS, DEFAULT_PROPERTY_ITERATIONS);
        pbAndjProperties.put(PROPERTY_SALT_SIZE, DEFAULT_SALT_SIZE);
        pbAndjProperties.put(PROPERTY_KEY_SIZE, DEFAULT_KEY_SIZE);
        pbAndjPasswordHash.initialize(pbAndjProperties);
        String pwHash = pbAndjPasswordHash.generate(args[0].toCharArray());
        System.out.printf("Hash for %s is %s%n", args[0], pwHash);
    }
    
    //testing//
//    public static String generateHash(String password) {
//        try {
//            // Implement PBKDF2 hash logic here
//            // For illustration purposes:
//            String salt = "randomSalt"; // Replace with actual salt generation
//            int iterations = 10000; // Use your defined iterations
//            int keyLength = 256; // Key length in bits
//
//            // Hash generation logic
//            byte[] hashedPassword = java.security.MessageDigest.getInstance("SHA-256").digest((password + salt).getBytes());
//            return Base64.getEncoder().encodeToString(hashedPassword);
//        } catch (Exception e) {
//            throw new RuntimeException("Hash generation failed", e);
//        }
//    }
  //testing//
}