package null_java;
/**
 *
 * @author Reem Alharbi
 */
public class Null_Java {

    /**
     * @param args the command line arguments
     */
    
    //this program will only print nothing is null because it is the only one null...
    public static void main(String[] args) 
    {
        String nothing = null;
        String word = "Cat";
        String emtpy = "";
        
        if(nothing == null) //you can use isEmpty function or isNullOrEmpty that checks for both null and "" emtpy strings...
        {
            System.out.println("nothing is null");
        }
        else if(word == null)
        {
            System.out.println("word is null");
        }
        else if (emtpy == null)
        {
            System.out.println("word is null");
        }
   
   
    }
    
}
