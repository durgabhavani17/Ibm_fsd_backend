
public class Prime {
   public static void main(String[] args) {
	   int n=29;
	   int count=0;
	   for(int i=2;i<=n/2;i++) {
		   if((n%i)==0) {
			   count++;
		   }
	   }
	   if(count==0) {
		   System.out.println("given number is prime number");
		   
	   }
	   else {
		   System.out.println("given number is not a prime number");
	   }
   }
}
