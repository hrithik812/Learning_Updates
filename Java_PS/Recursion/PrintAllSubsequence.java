/**
 * PrintAllSubsequence
 */
import java.util.*;
public class PrintAllSubsequence {
    static void printSubsequence(int index,ArrayList<Integer> res,int arr[]){
         if(index==arr.length)
         {
             System.out.println(res);
             return;
         }
        //taking the arr input
        res.add(arr[index]);
        printSubsequence(index+1, res, arr);
        //not taking the array input
        res.remove(arr[index]);
        printSubsequence(index+1, res, arr);

    }
    public static void main(String[] args) {
         int []arr={3,1,2};
         ArrayList<Integer> res=new ArrayList<>();
         printSubsequence(0, res , arr);
         
    }
}