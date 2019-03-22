package Examples;

public class enumDemo {
	//ENUM DEF
	public enum days{
		MONDAY{
			
			public String getDisplayName() {
				return "monday";
			}
		},
		TUESDAY{
			
			public String getDisplayName() {
				return "tuesday";
			}
		},
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY,
		SUNDAY;
		 days() {
			System.out.println("constructor called");
		}
		public String getDisplayName() {
			return "default";
		}
		};
	public static void main(String[]args) {
		String day="TUESDAY";
		//string comaparision
		if(days.MONDAY.toString()==day){
		System.out.println("given day is"+ day);
		}
		//enum comaparison
		if(days.TUESDAY==days.valueOf(day)) {
			System.out.println("given day is"+ day);
		}
		//get all enum values
		for(Enum d:days.values()) {
			System.out.println(d);
		}
		System.out.println(days.MONDAY.getDisplayName());
		System.out.println(days.TUESDAY.getDisplayName());
		System.out.println(days.FRIDAY.getDisplayName());
		
	}
	a

}
