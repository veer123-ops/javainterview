package veer.com;

public class factorialresuison {
	
	public static int facto(int n ) {
		if (n==1) {
			return 1;
		}
		
		return n* facto(n-1);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int n=5;
   System.out.print(facto(n));
   
   
	}

}
