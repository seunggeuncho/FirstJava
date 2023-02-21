package Seunggeun_cho;

public class StudentInfo {
	private int StudentNumber;
	private String Name;
	private String Gender;
	private int Korean;
	private int English;
	private int Math;
	private int Science;
	
	StudentInfo(int StudentNumber, String Name, String Gender, int Korean, int English, int Math, int Science){
		this.StudentNumber = StudentNumber;
		this.Name = Name;
		this.Gender = Gender;
		this.Korean = Korean;
		this.English = English;
		this.Math = Math;
		this.Science = Science;
	}
	public void ChangeInfo(String type, int grade) { //점수 변경
		if (0 > grade || grade > 100)
		{
			System.out.println("점수를 0에서 100사이로 입력하세요.");
			return;
		}
		if (type.equals("국어"))
		{
			System.out.println("1");
			this.Korean = grade;
		}
		else if (type.equals("영어"))
			this.English = grade;
		else if (type.equals("수학"))
			this.Math = grade;
		else if (type.equals("과학"))
			this.Science = grade;
		else
			System.out.println("과목을 다시 입력하세요.");
	}
	public boolean checkNumber(int number) { //학번 중복 체크
		if (StudentNumber == number)
			return true;
		else
			return false;
	}
	
	public void printInfo() {
		System.out.println(StudentNumber + "\t" + Name + "\t" + Gender + "\t" + Korean + "\t" + English + "\t" + Math + "\t" + Science);
	}
	
	
}
