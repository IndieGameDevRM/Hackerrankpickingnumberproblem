import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int pickingNumbers(int[] a) {
        // Complete this function
        int count=0,temp=0,maxcount=0,value=a[0];
        for(int i=0;i<a.length;i++){
            for(int j=1+i;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }    
            }    
            }
        for(int k=0;k<a.length;k++){
            count=1;
            for(int p=1+k;p<a.length;p++){
                if(Math.abs(a[k]-a[p])<=1){
                    count++;
                }
            }
             if(maxcount<count){
                maxcount=count;
                }
        }
        return maxcount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int result = pickingNumbers(a);
        System.out.println(result);
        in.close();
    }
}