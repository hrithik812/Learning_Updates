import java.util.*;
import java.io.*;
public class HighestFrequencyCharacter{
    public static void main(String []args) {
        Scanner scanner=null;
        String input="";
        try{
            scanner=new Scanner(System.in);
            input=scanner.nextLine();
        }
        catch(Exception e){
               
        }
     
        //Create a hashmap
       HashMap<Character,Integer> hm=new HashMap<>();
       for(int i=0;i<input.length();i++)
       {
           char ch=input.charAt(i);
          if(hm.containsKey(ch)){
             int of=hm.get(ch);
             int nf=of+1;
             hm.put(ch,nf);
          }
          else{
              hm.put(ch,1);
          }
       }

       char mfc=input.charAt(0);
       for(Character key:hm.keySet()){
           if(hm.get(key)>hm.get(mfc))
           {
               mfc=key;
           }
       }

       System.out.println("Highest Frequency Char==="+mfc);
    }
}