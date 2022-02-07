import java.util.*;

public class validShuffleOrNot {
 public static boolean checkValidShuffle(String s1,String s2,String s3)
{
    int n=s1.length();
    int m=s2.length();
if(s1.length()+s2.length()!=s3.length()){
    return false;
}

s1=sort(s1);
s2=sort(s2);
s3=sort(s3);
int k=-0;
int i=0,j=0;
  while(k<s3.length()){
         
      if(i<n && s1.charAt(i)==s3.charAt(k))
      {
          i++;
      }
      else if(j<m && s2.charAt(j)==s3.charAt(k))
      {
          j++;
      }
      else return false;
      k++;
  }

return (i>=n && j>=m);

}
public static String sort(String s)
{
    char[] charArray=s.toCharArray();
    Arrays.sort(charArray);
    s = String.valueOf(charArray);
    return s;
}    

public static void main(String[] args) {

    String s1="PRQ";
    String s2="123";
    String s3="P1Q2R3";
    boolean res=checkValidShuffle(s1,s2,s3);
    if(res)
    {
        System.out.println("Valid Shuffle");
    }
    else{
        System.out.println("Not valid shuffle");
    }
    
}    
}
