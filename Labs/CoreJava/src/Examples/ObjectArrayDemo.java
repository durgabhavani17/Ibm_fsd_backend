package Examples;

public class ObjectArrayDemo {

	public static void main(String[] args) {
		ObjectArray emp=new ObjectArray(1234,"durga",20,30000);
		ObjectArray emp2=new ObjectArray(1235,"murali",26,60000);
		ObjectArray emp3=new ObjectArray(1236,"vandana",19,30000);
		ObjectArray emp4=new ObjectArray(1237,"rathna",20,90000);
		ObjectArray[] empp=new ObjectArray[] {emp,emp2,emp3};
		System.out.println("*******employee details********");
		   
		for(int i=0;i<3;i++) {
			empp[i].printDetails();
		}
		System.out.println("******updated employee details*****");
		
		
			empp[0].updateDetails();
			for(int i=0;i<3;i++) {
				empp[i].printDetails();
			}
		System.out.println("******after deletion  employee details*****");
			
			
			for(int i=0;i<3;i++) {
				empp[i].printDetails();
			}
			
	}
	

}
