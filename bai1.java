package array;

import java.util.Scanner;

public class bai1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("nhap so");
		int n = Integer.parseInt(kb.nextLine());
int s[]= {1,4,3,2,5};

System.out.print(tim(s,n));
	}

	public static boolean tim(int[] s, int n) {
		// TODO Auto-generated method stub
		for(int i=0;i<s.length;i++){
			if(n==s[i]) {
				return true;
			}
		}
		return false;
	}

}
