package javas;

import junit.framework.TestCase;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

/**
 * Created by dev on 31/01/17.
 */
public class PasswordHash  extends TestCase{

    public void testMD5Hash(){
        String password = "admin";
        Md5PasswordEncoder passwordEncoder = new Md5PasswordEncoder();
        String hashedPassword = passwordEncoder.encodePassword(password, null);
        System.out.println(hashedPassword);
    }
}
