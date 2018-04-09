package array;

public class sum1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
	     int s[]= {1,2,4,3};
	     System.out.println(sum(s));
		}

		 public static int sum(int[] s) {
			int t = 0;
			for(int i=0;i<s.length;i++) {
				t=t+s[i];
			}
			return t;
		}

}
