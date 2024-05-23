package JDBC;

import java.util.Scanner;

public class RentList_Update {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		RentDao rdao = RentDao.getInstance();
		RentDto rdto = new RentDto();
		
		// 수정할 대여기록의 번호 입력
		
		System.out.print("수정할 대여기록의 번호를 입력하세요");
		int numseq = Integer.parseInt(sc.nextLine());
		//int numesq = sc.nextInt();로 하면 숫자 + Enter까지 입력이 돼서 다음 입력에 nextLine이 있다면
		//Enter가 넘어가 입력할 기회가 없어진다. 숫자는 Enter를 무시해서 괜찮은데 문자열 형태면 Enter를 받아 문제가 된다
		
		
		// 기록이 있는지 확인합니다. 없으면 종료
		
		rdto = rdao.getRent(numseq);
		if(rdto==null) {
			System.out.print("입력한 번호의 대여기록이 존재하지 않습니다\n프로그램을 종료합니다");
			return;
		}
		// 수정할 대여날짜를 입력
		
			System.out.printf("날짜 : %s\n", rdto.getRentdate());
			System.out.print("수정할 날짜를 입력하세요(yyyy-mm-dd). 수정하지 않으려면 엔터만 입력하세요");
			String rentdate = sc.nextLine();
			if(!rentdate.equals(""))rdto.setRentdate(rentdate);
			
		// 수정할 도서번호를 입력. 입력한 번호의 도서가 없으면 다시 입력
		
			System.out.printf("도서번호 : %s\n", rdto.getBnum());
			System.out.print("수정할 도서번호를 입력하세요. 수정하지 않으려면 엔터만 입력하세요");
			String booknum = sc.nextLine();
			if(!booknum.equals("")) rdto.setBnum(Integer.parseInt(booknum)); 
		// 수정할 회원번호를 입력. 입력한 번호의 회원이 없으면 다시 입력
		
			System.out.printf("회원번호 : %s\n", rdto.getMnum());
			System.out.print("수정할 회원번호를 입력하세요. 수정하지 않으려면 엔터만 입력하세요");
			String membernum = sc.nextLine();
			if(!membernum.equals("")) rdto.setMnum(Integer.parseInt(membernum)); 
			
		// 수정할 할인금액 입력
		
			System.out.printf("할인금액 : %s\n", rdto.getDiscount());
			System.out.print("수정할 할인금액을 입력하세요. 수정하지 않으려면 엔터만 입력하세요");
			String discount = sc.nextLine();
			if(!discount.equals(""))rdto.setDiscount(Integer.parseInt(discount)); 
			
		// RentDto 에 모두 담아서 UpdateRent 메서드에 전송
		
		int result = rdao.updateRent(rdto);
		if(result==1)System.out.println("수정이 완료되었습니다");
		else System.out.println("수정이 실패하였습니다");
		
			
		}
		
		
	}
		
