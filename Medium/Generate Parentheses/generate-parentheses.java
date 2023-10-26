//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        int t = Integer.parseInt(sc.next());
        while(t>0)
        {
            int n = Integer.parseInt(sc.next());
            Solution T = new Solution();
            List<String> ans = T.AllParenthesis(n);
            String[] sequences = ans.toArray(new String[0]);
            Arrays.sort(sequences);
            int k = sequences.length;
            for(int i=0;i<k;i++)
            {
                System.out.println(sequences[i]);
            }
            
            t--;
            
        }
    }
}

// } Driver Code Ends


//User function Template for Java

class Solution {
    
    public List<String> AllParenthesis(int n) 
    {
        // Write your code here
        List<String> ans = new ArrayList<>();
        int open = n;
        int close = n;
        String op = "";
        solve(open,close,op,ans);
        return ans;
    }
    
    public void solve(int open, int close, String op, List<String> ans){
        
        if(open ==0 && close == 0){
            ans.add(op);
            return;
        }
        
        if(open!=0){
            String op1=op;
            op1+="(";
            solve(open-1,close, op1, ans);
        }
        
        if(close>open){
            String op2 = op;
            op2+=")";
            solve(open,close-1, op2, ans);
        }
        return;
    }
}