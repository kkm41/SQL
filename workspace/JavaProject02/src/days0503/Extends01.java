package days0503;

//클래스들간의 상속(Extends)
//다수개의 클래스들이 중복되는 멤버변수 및 멤버메서드를 갖고 있는경우
//부모자식관계를 생성하여 "코드의 중복을 방지"하는 것을 1차 목표로 사용합니다
//2차 목표는 "코드의 재활용"이며, 코드의 중복이 발생하고 있는 클래스에서 중복되는 멤버들을 별도의 클래스로 생성하고
//상속을 구현합니다

//코드의 중복이 발생하고 있는 구 클래스
class Student{
	String name;
	int age;
	String stdNum; //학생번호
}

class OfficeWorker{
	String name;
	int age;
	String empNum; //사원번호
}

//상속의 구현
class Person{
	String name;
	int age;
}

class Student1 extends Person{
	String strNum;
}
//부모의 멤버들은 상속한 클래스에는 별도의 언급이 없어도 부모의 멤버변수/메서드가 있는걸로 인식니다
class OfficeWorker1 extends Person{
	String empNum;
	
//상속을 제공 해주는 클래스 : 슈퍼(super)클래스, 부모클래스, 상위클래스
//상속을 받는 클래스 :  서브(sub)클래스, 자식클래스, 하위클래스
	
// extends 에 의해 상위클래스의 모든 멤버가 하위클래스에 이동(상속,쿨려받은걸로)한걸로 인식되어
// 하위클래스의 객체이름으로 자유롭게 접근이 가능합니다
}
public class Extends01 {
	public static void main(String[] args) {
		
		Student1 std = new Student1();
		std.name ="홍길동";
		std.age = 18;
		System.out.println(std.name);
		System.out.println(std.age);
		
		OfficeWorker1 ow = new OfficeWorker1();
		ow.name="홍길남";
		ow.age = 30;
		System.out.println(ow.name);
		System.out.println(ow.age);
	}

}
