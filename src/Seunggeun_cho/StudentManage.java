package Seunggeun_cho;

import java.util.LinkedList;

public class StudentManage {
	LinkedList student = new LinkedList<StudentInfo>();
	int Number = 0; //학생수 
	
	StudentManage(){};
	
	public boolean makeStudent(int StudentNumber, String Name, String Gender, int Korean, int English, int Math, int Science) {
		if (duplicateCheck(StudentNumber))
		{
			student.add(new StudentInfo(StudentNumber, Name, Gender, Korean, English, Math, Science));
			return true;
		}
		else
			return false;
	}
	
	
	public boolean duplicateCheck(int StudentNumber) {	//중복 체크 - 새로운 학생 입력 시 사용
		for (int i = 0 ;i < student.size(); i++) {
			if (((StudentInfo) student.get(i)).checkNumber(StudentNumber))
				return false;
		}
		return true;
	}
	
	
	public int Check(int StudentNumber) {	//해당 학번이 있는지 체크 - 학번으로 조회 때 사용
		for (int i = 0 ;i < student.size(); i++) {
			if (((StudentInfo) student.get(i)).checkNumber(StudentNumber)) //1 - 학번이 있는 경우, 2 - 학번이 없는 경우
				return i;
		}
		return -1;
	}
	
	public void lookUpInfo(int StudentNumber) {	//학번으로 학생 조회
		if (CheckStudentNumber()) {
		System.out.println("학번\t이름\t성별\t국어\t영어\t수학\t과학");
		int index = Check(StudentNumber);
		if (index != -1)
			((StudentInfo) student.get(index)).printInfo();
		else
			System.out.println("학번 정보가 잘못되었습니다.");
		}else
			System.out.println("등록 된 학생 정보가 없습니다.");
		System.out.println("\n");
	}
	
	public void allLookUpInfo() { //전체 학생 조회
		if (CheckStudentNumber()) {
		System.out.println("학번\t이름\t성별\t국어\t영어\t수학\t과학");
		for (int i = 0; i < student.size(); i++) {
			((StudentInfo) student.get(i)).printInfo();
		}
		}else
			System.out.println("등록 된 학생 정보가 없습니다.");
		System.out.println("\n");
	}
	
	public void UpdateInfo(int StudentNumber, String subject, int grade) { //점수 변경
		if (CheckStudentNumber())
		{
		int index = Check(StudentNumber);
		if (index != -1)
		{
			((StudentInfo) student.get(index)).ChangeInfo(subject, grade);
		}
		else
			System.out.println("학번 정보가 잘못되었습니다.");
		
		}else
			System.out.println("등록 된 학생 정보가 없습니다.");
		System.out.println("\n");
	}
	
	public void DeleteInfo(int StudentNumber) {	//학생 정보 지우기
		if (CheckStudentNumber())
		{
		int index = Check(StudentNumber);
		if (index != -1)
			{
			student.remove(index);
			
			}
		else
			System.out.println("학번 정보가 잘못되었습니다.");
		}else
			System.out.println("등록 된 학생 정보가 없습니다.");
		System.out.println("\n");
		
	}
	
	public boolean CheckStudentNumber() {
		if (student.size() <= 0)
			return false;
		return true;
	}
}
