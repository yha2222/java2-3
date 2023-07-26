package kr.or.ddit.basic;

import java.lang.annotation.*;

/*
 	Annotation에 대하여
 	
 	프로그램 소스코드 안에서 다른 프로그램을 위한 정보를 미리 약속된 형식으로 포함시킨 것.(JDK1.5부터 지원) 
 	주석처럼 프로그램에 영향을 미치지 않으면서, 이를 필요로 하는 프로그램에게는 유용한 정보를 제공해 줄 수 있다.
 	
 	종류)
 	1. 표준 애너테이션
 	2. 메타 애너테이션(애너테이션을 위한 애너테이션, 즉 애너테이션을 정의할 때 사용하는 애너테이션)
 	
 	애너테이션 타입 정의
 	@interface 애너테이션이름 {
 		요소타입 타입요소이름();   // 반환값이 있는 매개 변수는 없는 추상메서드의 형태
 		 ...
 	}
 	
 	애너테이션 요소의 규칙
 	1. 요소타입은 기본형, String, enum, annotation, class만 허용
 	2. ()안에 매개변수를 선언할 수 없음
 	3. 예외를 선언할 수 없음
 	4. 요소타입에 제너릭타입글자를 사용할 수 없음
 */

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)  //기본값 : CLASS
public @interface PrintAnnotation {
	int id = 100; 				//상수 선언 가능. static final int = 100;
	String value() default "-"; //기본값을 '-'로 설정
	int count() default 20; 	//기본값을 20으로 지정
}
