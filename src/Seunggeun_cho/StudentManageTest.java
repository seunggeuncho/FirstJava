package Seunggeun_cho;
import java.util.*;

public class StudentManageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		StudentManage student = new StudentManage();
		int number = 0;
		do {
			System.out.println("### 학생 성적 프로그램 ###");
			System.out.println("\n1. 학생 정보 입력");
			System.out.println("2. 학생 정보 조회");
			System.out.println("3. 성적 변경");
			System.out.println("4. 학생 정보 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.print(">>>");
			number = sc.nextInt();
			
			if (number > 5 || number <= 0)	//잘못된 번호 입력시 
				System.out.println("잘못된 번호를 입력하였습니다. 다시 한번 입력해주세요.");
			else
			{
				if (number == 1)
				{
					int flag = 0;
					while (flag == 0)
					{
						System.out.print("학생의 학번을 입력하시요:");
						int StudentNumber = sc.nextInt();
						System.out.print("학생의 이름을 입력하시요:");
						String Name = sc.next();
						System.out.print("학생의 성별을 입력하시요:(M or W)");
						String Gender = sc.next();
						System.out.print("학생의 국어 점수를 입력하시요:");
						int Korean = sc.nextInt();
						System.out.print("학생의 영어 점수를 입력하시요:");
						int English = sc.nextInt();
						System.out.print("학생의 수학 점수를 입력하시요:");
						int Math = sc.nextInt();
						System.out.print("학생의 과학 점수를 입력하시요:");
						int Science = sc.nextInt();
						if (student.makeStudent(StudentNumber, Name, Gender, Korean, English, Math, Science))
						{
							System.out.println("성공적으로 저장했습니다!!");
							flag = 1;
						}
						else
							System.out.println("이미 있는 학번 입니다. 다시 한번 입력해주세요.");
						System.out.println("\n");
					}
				} // number == 1일 때
				else if (number == 2) {
					System.out.println("*학번 개별 조회 1");
					System.out.println("*학생 전체 조회 2");
					int num = sc.nextInt();
					if (num == 1) {
						System.out.print("학번을 입력하세요:");
						int StudentNumber = sc.nextInt();
						student.lookUpInfo(StudentNumber);
					} else if (num == 2) {
						System.out.println("전체 학생 조회를 합니다.");
						student.allLookUpInfo();
					}
					
				} // number == 2일 때
				else if (number == 3) {
					System.out.println("성적을 변경하고 싶은 학번을 입력하세요:");
					int StudentNumber = sc.nextInt();
					System.out.println("변경하고 싶은 과목을 입력하세요:");
					String subject = sc.next();
					System.out.println("변경할 점수를 입력하세요:");
					int grade = sc.nextInt();
					student.UpdateInfo(StudentNumber, subject, grade);
				}
				else if (number == 4) {
					System.out.println("삭제하려는 학번을 입력하세요:");
					int StudentNumber = sc.nextInt();
					System.out.println("정말로 삭제하시겠습니까?(Y or N)");
					String flag = sc.next();
					if (flag.equals("Y")) {
						student.DeleteInfo(StudentNumber);
						System.out.println("삭제를 완료하였습니다.");
					}
				}
				System.out.println("\n");
			}

		} while(number != 5);
		System.out.println("프로그램을 종료하였습니다.");
	}
}

