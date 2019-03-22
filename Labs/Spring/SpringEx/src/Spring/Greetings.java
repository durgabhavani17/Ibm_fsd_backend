package Spring;

public class Greetings {
	private String msg="hello world";
	public Integer a;
	
public Greetings() {
	
}
	public Greetings(String msg,Integer a) {
		super();
		this.msg = msg;this.a=a;
	}

	public String getMsg() {
		return msg;
	}

	public Integer getA() {
		return a;
	}

	public void setA(Integer a) {
		this.a = a;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
