package kr.or.ddit.basic;


public class Service {

	@PrintAnnotation(count = 10, value = "#")
	public void method1() {
		System.out.println("메서드1에서 호출되었습니다.");
	}
	
	@PrintAnnotation(count = 30, value = "$")
	public void method2() {
		System.out.println("메서드2에서 호출되었습니다.");
	}
	
	@PrintAnnotation("%")  //(value = "%")
	public void method3() {
		System.out.println("메서드3에서 호출되었습니다.");
	}
}
