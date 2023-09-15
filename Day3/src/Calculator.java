
public class Calculator {
	private int no,no1;
	String sname;
	
	public int get_no() {
		return no;
	}
	
	public void set_no(int nonew2) {
		no= nonew2;
	}

	public int getNo1() {
		return no1;
	}

	public void setNo1(int no2) {
		this.no1 = no2;
	}
	public int add(){
		return no + no1;
	}
	public int sub(){
		return no - no1;
	}
	public int mul(){
		return no * no1;
	}
	public int div(){
		return no / no1;
	}

	@Override
	public String toString() {
		return "Calculator [no=" + no + ", no1=" + no1 + ", sname=" + sname + "]";
	}
		
	
}
