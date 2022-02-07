import java.util.*;
import java.io.*;
public class Generic_Trees {
     
    public static void display(Node node)
    {
        String str=node.data+ "->";
        //It will display the all the childs data
        for(Node child:node.children)
        {
            str=str+child.data+",";     
        }
        str+=".";
        System.out.println(str);
        //this for loop will recursively call display on children
        for(Node child:node.children)
        {
            display(child);
        }
    }
    private static class Node{
        int data;
        ArrayList<Node> children=new ArrayList<>();
        
    }
    public static void main(String[] args) {
        Node root=null;
        int []arr={10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,
            -1,40,100,-1,-1,-1};   
  
        Stack<Node> st=new Stack<Node>();
          for(int i=0;i<arr.length;i++)
          {
             if(arr[i]==-1)
             {
                 st.pop();
             }            
             else{
                 Node newNode=new Node();
                 //asssiging the array ith element to node data
                 newNode.data=arr[i];
                 if(st.size()>0)
                 {
                         st.peek().children.add(newNode);                         
                 }
                 else
                 {
                    root=newNode;
                 }
                 st.push(newNode);
             }  
  
          }

          display(root);
  
    }

}
