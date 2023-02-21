package Seunggeun_cho;

public class StudentinfoDB {
	private int STUDENT_NUMBER;
	private String NAME;
	private String GENDER;
	private int KOREAN;
	private int ENGLISH;
	private int MATH;
	private int SCIENCE;
	
	public StudentinfoDB(int STUDENT_NUMBER, String NAME, String GENDER, 
			int KOREAN, int ENGLISH, int MATH, 	int SCIENCE) {
		this.STUDENT_NUMBER = STUDENT_NUMBER;
		this.NAME = NAME;
		this.GENDER = GENDER;
		this.KOREAN = KOREAN;
		this.ENGLISH = ENGLISH;
		this.MATH = MATH;
		this.SCIENCE = SCIENCE;
	}
	public int get_Student_num() {
		return this.STUDENT_NUMBER;
	}
	public String get_name() {
		return this.NAME;
	}
	public String get_gender() {
		return this.GENDER;
	}
	public int get_korean() {
		return this.KOREAN;
	}
	public int get_english() {
		return this.ENGLISH;
	}
	public int get_math() {
		return this.MATH;
	}
	public int get_science() {
		return this.SCIENCE;
	}
	
}
