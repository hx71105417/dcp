/***********************************************************************  
 *  
 *   @package：com.whty.common.util，@class-name：Config.java   
 *   
 *   武汉天喻信息股份产业有限公司所有   
 *   受到法律的保护，任何公司或个人，未经授权不得擅自拷贝。   
 *   @copyright       Copyright:   2008-2015     
 *   @creator         victor.huang <br/>   
 *   @create-time   2015年7月29日   下午4:16:09   
 *   @revision         $Id: 1.0    
 ***********************************************************************/
/**
 * 
 */
package com.whty.common.util;


/** 
 * <p><strong>Description:</strong></p>
 * @Company 武汉天喻信息产业股份有限公司
 * @author  <a href="mailto: huangxin01@whty.com.cn">victor.huang</a>
 * @version v1.0
 */
public class Config {
	public int [] port;
	
	public String localIp;

	public int [] getPort() {
		return port;
	}

	public void setPort(int [] port) {
		this.port = port;
	}

	public String getLocalIp() {
		return localIp;
	}

	public void setLocalIp(String localIp) {
		this.localIp = localIp;
	}

}
