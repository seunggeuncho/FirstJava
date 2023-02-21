package Seunggeun_cho;

import java.sql.*;
import java.util.*;

public class StudentManagerDB {
	Connection conn;
	PreparedStatement psmt;
	Statement smt;
	ResultSet rs;
	String sql;
	
	public StudentManagerDB() {
		String jdbc_driver = "oracle.jdbc.driver.OracleDriver";
		String jdbc_url = "jdbc:oracle:thin:@localhost:1521:XE";
		String user = "scott";
		String pwd = "tiger";
		
		try {
			Class.forName(jdbc_driver);
			conn = DriverManager.getConnection(jdbc_url, user, pwd);
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();
		} 
	}
	
	public ArrayList<StudentinfoDB> AllStudent(){ //전체 학생 조회하기 위한 데이터 생성
		ArrayList<StudentinfoDB> allstudent = new ArrayList<StudentinfoDB>();
		this.sql = "select * from student";
		try {
			this.smt = conn.createStatement();
			this.rs = this.smt.executeQuery(sql);
			
			while(this.rs.next()) {
				allstudent.add(new StudentinfoDB(this.rs.getInt("STUDENT_NUMBER"), this.rs.getString("NAME"),
								this.rs.getString("GENDER"), this.rs.getInt("KOREAN"),this.rs.getInt("ENGLISH"),
								this.rs.getInt("MATH"), this.rs.getInt("SCIENCE")));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return allstudent;
	}
	
	public ArrayList<StudentinfoDB> selectStudent(int studentNumber) { //특정 학생 정보 가져오기
		ArrayList<StudentinfoDB> student = new ArrayList<StudentinfoDB>();
		this.sql = "select * from student where STUDENT_NUMBER = ?";
		try {
			this.psmt = conn.prepareStatement(sql);
			this.psmt.setInt(1, studentNumber);
			this.rs = this.psmt.executeQuery();
			
			if(rs.next()) {
				student.add(new StudentinfoDB(this.rs.getInt("STUDENT_NUMBER"), this.rs.getString("NAME"),
						this.rs.getString("GENDER"), this.rs.getInt("KOREAN"),this.rs.getInt("ENGLISH"),
						this.rs.getInt("MATH"), this.rs.getInt("SCIENCE")));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return student;
	}
	
	
	
	public void Print_StudentInfo(ArrayList<StudentinfoDB> student) {	//학생정보 출력
		if (student.size() != 0)
		{
			for (StudentinfoDB s: student) {
				System.out.println(s.get_Student_num() + "\t" + s.get_name() + "\t" + s.get_gender()
				+ "\t" + s.get_korean() + "\t" + s.get_english() + "\t" + s.get_math() + "\t" + s.get_science());
			}
		} else {
			System.out.println("학생 정보가 없습니다.");
		}
	}
	
}
