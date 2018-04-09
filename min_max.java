package array;

public class min_max {

	public static void max1(int[] t) {
		int max = t[0];
		int min = t[0];
		for(int i=1;i<t.length;i++) {
		    if(max<t[i]) {
		    	max=t[i];
		    }
		    if(min>t[i]) {
		    	min=t[i];
		    }
		}
		System.out.println("Max :"+max);
		System.out.println("Min :"+min);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int t []= {1,2,3,5,4};
    max1(t);
	}

}
