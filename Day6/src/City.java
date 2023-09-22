
public class City extends State {
	private String ciname;

	public String getiCname() {
		return ciname;
	}

	public void setCiname(String cname) {
		this.ciname = cname;
	}

	@Override
	public String toString() {
		return "City [ciname=" + ciname + ", getiCname()=" + getiCname() + ", getSname()=" + getSname()
				+ ", getCname()=" + getCname() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}

	
	
	
}
