import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        boolean res = Anagram(a,b);
        if(res){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
        
    }
    public static boolean Anagram(String a , String b){
        if(a.length()!=b.length())
            return false;
        a = a.toLowerCase();
        b = b.toLowerCase();
        char[] arr1 = a.toCharArray();
        char[] arr2 = b.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);
    }
}