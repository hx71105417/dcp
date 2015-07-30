/***********************************************************************  
 *  
 *   @package��com.whty.common.util��@class-name��SpringUtil.java   
 *   
 *   �人������Ϣ�ɷݲ�ҵ���޹�˾����   
 *   �ܵ����ɵı������κι�˾����ˣ�δ����Ȩ�������Կ�����   
 *   @copyright       Copyright:   2008-2015     
 *   @creator         victor.huang <br/>   
 *   @create-time   2015��7��29��   ����3:56:37   
 *   @revision         $Id: 1.0    
 ***********************************************************************/
/**
 * 
 */
package com.whty.common.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/** 
 * <p><strong>Description:</strong></p>
 * @Company �人������Ϣ��ҵ�ɷ����޹�˾
 * @author  <a href="mailto: huangxin01@whty.com.cn">victor.huang</a>
 * @version v1.0
 */
public class SpringUtil {
	private static ApplicationContext ctx;
	/**
	 * ��ʼ��Spring
	 *
	 */
	public static void initSpring(){
		ctx = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		//ctx.getBean("dataSource");
	}
	/**
	 * ȡ��ApplicationContext
	 * @return
	 */
	public static ApplicationContext getContex(){
		return ctx;
	}
	/**
	 * ȡ��spring bean
	 * @param beanName
	 * @return
	 */
	public static Object getBean(String beanName){
		if(beanName==null)
			return null;
		if(ctx==null)
			initSpring();
		return ctx.getBean(beanName);
		
	}
}



