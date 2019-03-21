
public class EvenOdd {

	public static void main(String[] args) {
		String evenNumbers="";
		String oddNumbers="";
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				evenNumbers+=i+",";
			}else {
				oddNumbers+=i+",";
			}
		}
       System.out.println("even numbers from 1 to 100 are"+evenNumbers);
       System.out.println("odd numbers from 1 to 100 are"+oddNumbers);
	}

}
