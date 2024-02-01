
/**
 *  
 *
 * @author (Anvit Dhamnekar)
 * @version (4/25/22)
 */
public class Encryption
{
    public static final String alph = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    public static String cyAlph;
    public static int shiftKey;
    
    public static void setKey(int key){
        shiftKey = key;
    }
    
    public static void genCyAlph(){
        cyAlph = "";
        for(int i = 0; i < 26; i++){
            cyAlph += (char)('A' + ((i+shiftKey)%26));
        }
    }
    
    public static String getcyAlph()
    {
        return cyAlph; 
    }
    
    public static String cryptMsg(String message)
    {
        char[] mchar = message.toCharArray(); 
        
        for( int i = 0; i < message.length() ; i++)
        {
            mchar[i]=cyAlph.charAt((int)(mchar[i] - 'A')); 
        }
        return new String(mchar); 
    }
}
