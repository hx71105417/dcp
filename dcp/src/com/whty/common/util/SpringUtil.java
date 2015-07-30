/***********************************************************************  
 *  
 *   @package：com.whty.common.util，@class-name：SpringUtil.java   
 *   
 *   武汉天喻信息股份产业有限公司所有   
 *   受到法律的保护，任何公司或个人，未经授权不得擅自拷贝。   
 *   @copyright       Copyright:   2008-2015     
 *   @creator         victor.huang <br/>   
 *   @create-time   2015年7月29日   下午3:56:37   
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
 * @Company 武汉天喻信息产业股份有限公司
 * @author  <a href="mailto: huangxin01@whty.com.cn">victor.huang</a>
 * @version v1.0
 */
public class SpringUtil {
	private static ApplicationContext ctx;
	/**
	 * 初始化Spring
	 *
	 */
	public static void initSpring(){
		ctx = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext.xml" });
		//ctx.getBean("dataSource");
	}
	/**
	 * 取得ApplicationContext
	 * @return
	 */
	public static ApplicationContext getContex(){
		return ctx;
	}
	/**
	 * 取得spring bean
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



