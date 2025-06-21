import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        for(int i=Integer.parseInt(s1)-1;i>=0;i--){
            if(String.valueOf(i).contains(s2)){
                
            }
            else{
              System.out.print(i);
                break;
            }
        }
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}