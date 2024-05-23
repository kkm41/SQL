package JDBC;

import java.util.Scanner;


import JDBC.RentDao;
import JDBC.RentDto;

public class RentList_Delete {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		RentDao rdao = RentDao.getInstance();
		System.out.print("삭제할 대여기록의 도서번호를 입력하세요");
		int numseq = Integer.parseInt(sc.nextLine());
		RentDto rdto = rdao.getRent(numseq);
		if(rdto==null) {
			System.out.println("입력한 번호의 대여기록이 존재하지 않습니다\n프로그램을 종료합니다");
			return;
			
			
		}
		
		int result = rdao.deleteRent(numseq);
		
		if(result==1)System.out.println("삭제 성공");
		else System.out.println("삭제 실패");	
		
	}

}
