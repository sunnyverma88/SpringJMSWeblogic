package org.techieonthenet.jms;

import javax.jms.Queue;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SenderMain {
	


	public static void main(String[] args) {
	    // init spring context
	    ApplicationContext ctx = new ClassPathXmlApplicationContext("SpingJMS-context.xml");
	         
	    // get bean from context
	    JMSSender jmsMessageSender = (JMSSender)ctx.getBean("jmsMessageSender");
	         
	    // send to default destination 
	    
	   jmsMessageSender.send("hello JMS");
	         
	    // send to a code specified destination
	   
	    jmsMessageSender.sendText("hello Another Message");
	   
	    // close spring application context
	    ((ClassPathXmlApplicationContext)ctx).close();
	  }
	 
	}