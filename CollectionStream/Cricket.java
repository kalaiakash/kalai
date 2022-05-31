package CollectionStream;

public class Cricket {
	private String name;
	private int age;
	private int score;
	private boolean isBatsman;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public boolean getIsBatsman() {
		return isBatsman;
	}
	public void setBatsman(boolean isBatsman) {
		this.isBatsman = isBatsman;
	}
	public Cricket(String name, int age, int score, boolean isBatsman) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
		this.isBatsman = isBatsman;
	}
	@Override
	public String toString() {
		return "Cricket [name=" + name + ", age=" + age + ", score=" + score + ", isBatsman=" + isBatsman + "]";
	}
	
	

}
