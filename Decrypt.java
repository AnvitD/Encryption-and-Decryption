
/**
 *  
 *
 * @author (Anvit Dhamnekar)
 * @version (4/25/22)
 */
public class Decrypt
{
    public static final String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String cyAlph;
    public static int shiftkey;
    
    public static void setKey(int key)
    {
        shiftkey = key; 
    }
    
    public static void gencyAlph()
    {
        cyAlph = ""; 
        for(int i = 0; i <=25; i++)
        {
            cyAlph += (char)('A' + ((i - shiftkey + 26) %26)); 
        }
    }
    
    public static String getcyAlph()
    {
        return cyAlph; 
    }
   
    public static String decryptMsg(String message)
    {
        char[] mchar = message.toCharArray(); 
        
        for(int i = 0; i < message.length(); i++)
        {
            mchar[i] = cyAlph.charAt((int)(mchar[i] - 'A')); 
        }
        return new String(mchar); 
    }
}
