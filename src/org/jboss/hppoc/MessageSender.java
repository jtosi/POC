package org.jboss.hppoc;

import java.util.Date;
import java.util.Properties;

import javax.jms.JMSException;
import javax.jms.ObjectMessage;
import javax.jms.Queue;
import javax.jms.QueueConnection;
import javax.jms.QueueConnectionFactory;
import javax.jms.QueueSender;
import javax.jms.QueueSession;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.jboss.samples.domain.Claim;

public class MessageSender 
{
	QueueConnection connection;
	QueueSession session;
	Queue que;
 
 
	public void setupConnection() throws JMSException, NamingException
	{
		Properties properties = new Properties();
		properties.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
		properties.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");
		properties.put(Context.PROVIDER_URL, "jnp://127.0.0.1:1099");
		InitialContext initialContext = new InitialContext(properties);

		QueueConnectionFactory queueConnectionFactory = (QueueConnectionFactory) initialContext.lookup("ConnectionFactory");
		connection = queueConnectionFactory.createQueueConnection();
		que = (Queue) initialContext.lookup("queue/hp_poc");
		session = connection.createQueueSession(false, QueueSession.AUTO_ACKNOWLEDGE);
		connection.start();
		System.out.println("Connection Started");
	}
 
	public void stop() throws JMSException 
	{ 
		connection.stop();
		session.close();
		connection.close();
		System.out.println("Connection Stopped");
	}
 
	public void sendAMessage(String msg) throws JMSException 
	{
		QueueSender send = session.createSender(que);        
		ObjectMessage tm = session.createObjectMessage(msg);
		
		send.send(tm);        
		send.close();
	}
  
	public static void main(String args[]) throws Exception
	{                    
		MessageSender messageSender = new MessageSender();
		Claim claimToSend = new Claim();
		claimToSend.setClaimDate(new Date());
		claimToSend.setClaimID(1234567890);
		messageSender.setupConnection();
		messageSender.sendAMessage(claimToSend.toString()); 
		messageSender.stop();
 	}
}