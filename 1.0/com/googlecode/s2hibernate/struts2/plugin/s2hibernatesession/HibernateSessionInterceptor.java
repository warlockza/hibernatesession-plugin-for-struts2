package com.googlecode.s2hibernate.struts2.plugin.s2hibernatesession;

import java.lang.reflect.Method;

import org.hibernate.Session;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

public class HibernateSessionInterceptor extends AbstractInterceptor {

	private String target;
	
	private String sessionFactoryClass;
	
	private String sessionSource;
	
	private String staticGetSessionMethod;
	
	private String closeSessionAfterInvoke;
	
	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		Session hibernateSesssion = null;
		Object sessionFactory = null;
		
		try {
			if (isStaticGetSessionMethod())
				sessionFactory = Class.forName(sessionFactoryClass, false, this.getClass().getClassLoader());
			else
				sessionFactory = Class.forName(sessionFactoryClass).newInstance();				
			Method method = Class.forName(sessionFactoryClass).getDeclaredMethod(sessionSource, null);
			hibernateSesssion = (Session) method.invoke(sessionFactory, null);
			invocation.getStack().setValue(target, hibernateSesssion);
		} catch (Exception e) {
			System.err.println("Error! Could not open Hibernate Session!");
			e.printStackTrace();
			throw e;
		}
		String retorno = invocation.invoke();
		
		if (isCloseSessionAfterInvoke())
			hibernateSesssion.close();
		
		return retorno ;
	}

	public String getTarget() {
		return target;
	}

	public void setTarget(String target) {
		this.target = target;
	}

	public String getSessionFactoryClass() {
		return sessionFactoryClass;
	}

	public void setSessionFactoryClass(String sessionFactoryClass) {
		this.sessionFactoryClass = sessionFactoryClass;
	}

	public String getSessionSource() {
		return sessionSource;
	}

	public void setSessionSource(String sessionSource) {
		this.sessionSource = "get"+sessionSource.substring(0,1).toUpperCase()+sessionSource.substring(1,sessionSource.length());
	}

	public String getCloseSessionAfterInvoke() {
		return closeSessionAfterInvoke;
	}
	
	public Boolean isCloseSessionAfterInvoke() {
		if (closeSessionAfterInvoke==null)
			closeSessionAfterInvoke="true";
		Boolean resultado = new Boolean(closeSessionAfterInvoke); 
		return resultado;
	}

	public void setCloseSessionAfterInvoke(String closeSessionAfterInvoke) {
		this.closeSessionAfterInvoke = closeSessionAfterInvoke;
	}

	public String getStaticGetSessionMethod() {
		return staticGetSessionMethod;
	}
	
	public Boolean isStaticGetSessionMethod() {
		if (staticGetSessionMethod==null)
			staticGetSessionMethod="true";
		Boolean resultado = new Boolean(staticGetSessionMethod); 
		return resultado;
	}

	public void setStaticGetSessionMethod(String staticGetSessionMethod) {
		this.staticGetSessionMethod = staticGetSessionMethod;
	}

}
