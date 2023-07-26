package kr.or.ddit.basic;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationTest {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		
		System.out.println("static 변수값: " + PrintAnnotation.id);
		
		Method[] methodArr = Service.class.getDeclaredMethods();
		
		for(Method m : methodArr) {
			
			Annotation[] annos = m.getDeclaredAnnotations();
			
			for(Annotation anno : annos) {
				if(anno.annotationType().getSimpleName()
						.equals("PrintAnnotation")) {  //이름 맞으면 for문 실행
					PrintAnnotation printAnno = (PrintAnnotation) anno;
					//count값 만큼 value값 출력하기
					for(int i = 0; i < printAnno.count(); i++) {
						System.out.print(printAnno.value());
					}
				}
			}
			
			System.out.println();  //줄바꿈
			
			//m.invoke(new Service());
			
			Class<?> clazz = Service.class;
			
			Service service = (Service)clazz.newInstance();
			
			m.invoke(service);
		}
		
		
	}
}
