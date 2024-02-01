
/**
 * 
 *
 * @author (Anvit Dhamnekar)
 * @version (4/25/22)
 */
import java.util.Scanner; 
public class CaesarTest
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in); 
        
        System.out.println("Pick a number between 0-25"); 
        int shiftkey = in.nextInt(); 
        
        System.out.println("Encrypt"); 
        Encryption.setKey(shiftkey);
        Encryption.genCyAlph();
        System.out.println(Encryption.alph); 
        System.out.println();
        System.out.println(Encryption.getcyAlph()); 
        
        System.out.println(); 
        System.out.println("Decrypt"); 
        Decrypt.setKey(shiftkey); 
        Decrypt.gencyAlph(); 
        System.out.println(Decrypt.alph); 
        System.out.println(); 
        System.out.println(Decrypt.getcyAlph()); 
        
        boolean choose = false; 
        
        while(!choose)
        {
            System.out.println("Do you want to Encrypt(Choose #1) or Decrypt(Choose #2) or Quit(Choose #3)");
            int answer = in.nextInt(); 
            
            if(answer == 1)
            {
                System.out.println("Enter a plaintext message to be encrypted"); 
                String ms1 = in.next().toUpperCase(); 
                System.out.println(Encryption.cryptMsg(ms1));
                 
            }
            else if(answer == 2)
            {
                System.out.println("Enter a plaintext message to be decrypted"); 
                String ms = in.next().toUpperCase(); 
                System.out.println(Decrypt.decryptMsg(ms)); 
                 
            }
            else if(answer == 3)
            {
                choose = true; 
                break; 
            }
            else
            {
                System.out.println("Please choose one of the options"); 
                
            }
            
        }
        
    }
}
