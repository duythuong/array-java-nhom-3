package array;

import java.util.Arrays; 
public class bai5 {
public static void main(String[] args){   
    
    int[] s = {1,4,3,2,5};
            
    String[] a = {"nguyen","duy","thuong"};        
    System.out.println("Original numeric array : "+Arrays.toString(s));
    Arrays.sort(s);
    System.out.println("Sorted numeric array : "+Arrays.toString(s));
    
    System.out.println("Original string array : "+Arrays.toString(a));
    Arrays.sort(a);
    System.out.println("Sorted string array : "+Arrays.toString(a));
    }
}
