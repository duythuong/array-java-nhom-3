package array;

public class bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int s[]= {1,4,2,3,};
int s1[]= {1,4,5};
for(int i=0;i<s1.length;i++) {
	for(int j=0;j<s.length;j++) {
		if(s[j]==s1[i]) {
			System.out.println(s1[i]);
		}
	}
}
}

}
