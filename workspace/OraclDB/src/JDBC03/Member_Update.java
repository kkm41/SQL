package JDBC03;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class Member_Update {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("수정할 회원의 번호을 입력하세요");
		int membernum = Integer.parseInt(sc.nextLine());
		
		MemberDao mdao = new MemberDao();
		
		MemberDto mdto = mdao.getMember(membernum);
		
		if(mdto==null) {
			System.out.println("입력한 회원의 번호가 존재하지 않습니다\n 프로그램을 종료합니다");
			return;
			
		}
			String input;
			System.out.printf("\n이름 : %s \n수정할 이름을 입력하세요(수정하지 않으려면 Enter입력) ", mdto.getName());
			input = sc.nextLine();
			if( !input.equals("") ) mdto.setName(input);
			
			System.out.printf("\n전화번호 : %d \n수정할 전화번호를 입력하세요(수정하지 않으려면 Enter입력) ", mdto.getPhone() );
			input = sc.nextLine();
			if( !input.equals("") ) mdto.setPhone(input);
			
			System.out.printf("\n생일 : %s \n수정할 생일을 입력하세요(YYYY-MM-DD),(수정하지 않으려면 Enter입력) ", mdto.getBirth());
			SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-DD");
			input = sc.nextLine(); //String 입력
			if( !input.equals("") ) { //입력 내용이 있다면
				java.util.Date d  = sdf.parse(input); //java.util.Date로 변환
				java.sql.Date  birth = new java.sql.Date(d.getTime()); //java.sql.Date로 변환
				mdto.setBirth(birth);
				Calendar c = Calendar.getInstance();
				Calendar today = Calendar.getInstance();
				c.setTime(d);
				int age = today.get(Calendar.YEAR) - c.get(Calendar.YEAR);
				mdto.setAge(age);
			}
			    int result = mdao.updateMember(mdto);
			    if(result==1)System.out.println("레코드 수정 성공");
			    else System.out.println("레코드 수정 실패");
	}
	
}
