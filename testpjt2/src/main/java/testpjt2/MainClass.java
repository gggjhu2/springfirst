package testpjt2;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {

	
	public static void main(String[] args) {
		
			/*
			 * TranspotationWalk transpotationWalk = new TranspotationWalk();
			 * transpotationWalk.move();
			 */
									//���̳��� ioc�����̳ʿ������Ѵ�					���ڿ�(resource�� ��ġ�� �������ش�)
		GenericXmlApplicationContext ctx= new GenericXmlApplicationContext("classpath:applicationContext.xml");
	
		
		/* TranspotationWalk transpotationWalk = new TranspotationWalk(); �̷����ص� �����۵��� */
	//														��id     �嵥���� Ÿ�� datatype																						
		 TranspotationWalk transpotationWalk = ctx.getBean("twalk",TranspotationWalk.class);
//							�彺�������������ϴ� ������ϳ� (�̿Ͱ��� ������Ÿ��.(��ɾ�)�� ���ϴ� ����� ���ؾ˼��ִ�)				 
		 transpotationWalk.move();
		 ctx.close();
	 }
}
