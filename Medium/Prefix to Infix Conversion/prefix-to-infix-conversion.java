//{ Driver Code Starts
// Initial Template for Java

import java.util.*;
import java.lang.*;
import java.math.*;
import java.io.*;

class GFG {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T-- > 0) {
            sc.nextLine();
            String s = sc.next();
            Solution obj = new Solution();
            String ans = obj.preToInfix(s);
            System.out.println(ans);
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    static String preToInfix(String pre_exp) {
        // code here
        Stack<String> stack = new Stack<>();
        
        for(int i=pre_exp.length()-1;i>=0;i--){
            Character curr = pre_exp.charAt(i);
        
        
        if(isOperator(curr)){
            String firstval = stack.pop();
            String secondval = stack.pop();
            stack.push("(" + firstval + curr + secondval + ")");
        }
        else{
            stack.push(curr + "");
         }
        }
        return stack.peek();
    }
    
    public static boolean isOperator(Character curr){
     return curr=='+' || curr=='*' || curr=='-' || curr=='/' || curr=='^' || curr=='%';
    }
}
