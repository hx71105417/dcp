/***********************************************************************  
 *  
 *   @package��com.whty.netty.server��@class-name��DcpsServer.java   
 *   
 *   �人������Ϣ�ɷݲ�ҵ���޹�˾����   
 *   �ܵ����ɵı������κι�˾����ˣ�δ����Ȩ�������Կ�����   
 *   @copyright       Copyright:   2008-2015     
 *   @creator         victor.huang <br/>   
 *   @create-time   2015��7��29��   ����3:39:52   
 *   @revision         $Id: 1.0    
 ***********************************************************************/
/**
 * 
 */
package com.whty.netty.server;

import java.io.File;
import java.net.InetSocketAddress;
import java.util.TimeZone;
import java.util.concurrent.Executors;

import javax.net.ssl.SSLEngine;

import org.apache.log4j.Logger;
import org.jboss.netty.bootstrap.ServerBootstrap;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.Channels;
import org.jboss.netty.channel.socket.nio.NioServerSocketChannelFactory;
import org.jboss.netty.handler.codec.string.StringDecoder;
import org.jboss.netty.handler.execution.ExecutionHandler;
import org.jboss.netty.handler.execution.OrderedMemoryAwareThreadPoolExecutor;
import org.jboss.netty.handler.ssl.SslContext;
import org.jboss.netty.handler.ssl.SslHandler;
import org.jboss.netty.handler.timeout.IdleStateHandler;
import org.jboss.netty.util.HashedWheelTimer;

import com.whty.common.util.Config;
import com.whty.common.util.SpringUtil;

/** 
 * <p><strong>Description:</strong></p>
 * @Company �人������Ϣ��ҵ�ɷ����޹�˾
 * @author  <a href="mailto: huangxin01@whty.com.cn">victor.huang</a>
 * @version v1.0
 */
public class DcpsServer {

	/**
	 * 
	 *<p><strong>Description:</strong> </p>
	 * @param 
	 * @return
	 * @throws 
	 * @author <a href="mailto: huangxin01@whty.com.cn">victor.huang</a>
	 * @update ����: 2015��7��29��
	 */
	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("ETC/GMT-8");  // ����ʱ��ΪGTM-8
		TimeZone.setDefault(tz);
		Logger logger = Logger.getLogger(DcpsServer.class);
		
		try {
			// ��ʼ��Spring
			SpringUtil.initSpring();
	        // ���ö��̷߳������
	        ServerBootstrap bootstrap = new ServerBootstrap( 
	                new NioServerSocketChannelFactory( 
	                        Executors.newCachedThreadPool(),2, //boss
	                        Executors.newCachedThreadPool(),8)); //worker
	        
	        ChannelPipeline pipeline =  Channels.pipeline();
	        //tls
	        SslContext sslCtx = SslContext.newServerContext(new File("��֤��"),new File("��Կ"));
	        SSLEngine engine = sslCtx.newEngine();
	        engine.setNeedClientAuth(true);//˫����֤
	        engine.setUseClientMode(false);//serverģʽ
	        //engine.setWantClientAuth(true);
	        engine.setEnabledProtocols(new String[]{"TLSv10"});//Э��汾
	        pipeline.addLast("ssl", new SslHandler(engine));
	        //
	        pipeline.addLast("decoder", (StringDecoder)SpringUtil.getBean("config"));
	        // 
	        pipeline.addLast("decoder", (StringDecoder)SpringUtil.getBean("config"));
	        //
	        pipeline.addLast("encoder", (StringDecoder)SpringUtil.getBean("config"));
	        
	        pipeline.addLast("TimeoutJudge", (StringDecoder)SpringUtil.getBean("config"));
	        
	        pipeline.addLast("TimeoutHandler", (StringDecoder)SpringUtil.getBean("config"));
	        
	        pipeline.addLast("handler", (StringDecoder)SpringUtil.getBean("config"));
	        
	        
	        // �����¼��ܵ� 
	        bootstrap.setPipeline(pipeline); 
	        
	        //��ȡ�˿�����
	        Config config =(Config) SpringUtil.getBean("config");
	        
			// �󶨶˿�
	        for (int i = 0; i <config.port.length; i++){
	        bootstrap.bind(new InetSocketAddress(config.getLocalIp(),config.getPort()[i]));
	        logger.info("����������ɹ�...     �˿ں�Ϊ��" + config.getPort()[i]);
	        }
			
		} catch (Exception e) {
			logger.error("����������쳣....", e);
			e.printStackTrace();
		}

	}

}
