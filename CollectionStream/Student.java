package CollectionStream;

public class Student {
	private String name;
	private int fees;
	private String degree;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public Student(String name, int fees, String degree) {
		super();
		this.name = name;
		this.fees = fees;
		this.degree = degree;
	}

	public String toString() {
		return "Student [name=" + name + ", fees=" + fees + ", degree=" + degree + "]";
	}

}
