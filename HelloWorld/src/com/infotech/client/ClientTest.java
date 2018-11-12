package com.infotech.client;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.infotech.model.Message;

//@SuppressWarnings("deprecation")
@SuppressWarnings("deprecation")
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource resource = new ClassPathResource("Beans.xml");
		@SuppressWarnings({ "deprecation", "unused" })
		BeanFactory beanFactory = new XmlBeanFactory(resource);
		Object object = beanFactory.getBean("message");
		if (object != null) {
			Message message = (Message) object;
			System.out.println(message.getMessageId() + "\n" + message.getMessage());

		}
		
		System.out.println("---------------------------");
		Message message = beanFactory.getBean("message", Message.class);
		System.out.println(message.getMessageId() + "\n" + message.getMessage());
		
		System.out.println("---------------------------");
		
		 String[] aliases = beanFactory.getAliases("message");
		
		for(String string:aliases) {
			System.out.println(string);
		}
		System.out.println("---------------------------");

		
		Message message2 = beanFactory.getBean(Message.class);
		System.out.println(message2.getMessageId() + "\n" + message2.getMessage());
		System.out.println("---------------------------");
		
		Class<?> cls = beanFactory.getType("message");
		System.out.println(cls.getName());
		
		System.out.println("---------------------------");
		boolean singleton = beanFactory.isSingleton("message");
		System.out.println(singleton);
		System.out.println("---------------------------");
		boolean prototype = beanFactory.isPrototype("message");
		System.out.println(prototype);
		

		
		

		
		

		
		

		
		
		

		

	}

}
