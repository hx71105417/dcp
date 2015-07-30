/***********************************************************************  
 *  
 *   @package��com.whty.common.util��@class-name��Config.java   
 *   
 *   �人������Ϣ�ɷݲ�ҵ���޹�˾����   
 *   �ܵ����ɵı������κι�˾����ˣ�δ����Ȩ�������Կ�����   
 *   @copyright       Copyright:   2008-2015     
 *   @creator         victor.huang <br/>   
 *   @create-time   2015��7��29��   ����4:16:09   
 *   @revision         $Id: 1.0    
 ***********************************************************************/
/**
 * 
 */
package com.whty.common.util;


/** 
 * <p><strong>Description:</strong></p>
 * @Company �人������Ϣ��ҵ�ɷ����޹�˾
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
