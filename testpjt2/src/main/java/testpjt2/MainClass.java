package testpjt2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	
	public static void main(String[] args) {
		
			/*
			 * TranspotationWalk transpotationWalk = new TranspotationWalk();
			 * transpotationWalk.move();
			 */
									//▼이놈이 ioc컨테이너역할을한다					▼자원(resource의 위치를 설정해준다)
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("classpath:applicationContext.xml");
	
		
		/* TranspotationWalk transpotationWalk = new TranspotationWalk(); 이렇게해도 정상작동함 */
	//														▼id     ▼데이터 타입 datatype																						
		 TranspotationWalk transpotationWalk = ctx.getBean("twalk",TranspotationWalk.class);
//							▼스프링에서지원하는 기능중하나 (이와같이 데이터타입.(명령어)로 원하는 기능을 수해알수있다)				 
		 transpotationWalk.move();
		 ctx.close();
	 }
}
