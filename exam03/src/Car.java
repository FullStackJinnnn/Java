//class 객체지향의 기본 객체지향 프로그램 object oriented program
		//프로그램의 객체는 속성이 있고 기능이 있는것들 학생 -> 번호 이름 학년 성별 / 기능 -> 공부하다 등교하다 등등 ..
		//클래스란 객체를 표현한 것 
		//객체를 코드화 해서 클래스로 표현 
		//컴퓨터는 input이 있어야 output이 생긴다. 객체를 컴퓨터에게 알려줘야한다.
		//체계는 클래스를 크게 2가지로나눈다. 1. 실행용 main 2. 라이브러리 (Math, System, Array) 기능, 도움들  3.data (사람,사물) 정보들
		
		
		//접근제한자 class 클래스명 { }
		//class 명 앞글자는 대문자. 
		
		//class 구성의 3요소 필드(변수), 메서드(기능), 생성자 (클래스 생성에 필수 )
		
//class 를 가지고 객체를 생성해야 사용할 수 있다
// 이것을 클래스의 객체화/인스턴스 화 라고 부른다.
// car 변수명 = new Car();
// 클래스의 변수를 부를땐 인스턴스라 부른다 변수인데 객체를 담고있음.

public class Car {
	//초기값안주면 0이나 null이 들어간다.
	int year; //연도 
	String carName; //자동차 이름 
	
	public void go() {
		System.out.println(carName + "출발합니다");
	}
	
	
	
}
