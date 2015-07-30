/***********************************************************************  
 *  
 *   @package：com.whty.netty.server，@class-name：DcpsServer.java   
 *   
 *   武汉天喻信息股份产业有限公司所有   
 *   受到法律的保护，任何公司或个人，未经授权不得擅自拷贝。   
 *   @copyright       Copyright:   2008-2015     
 *   @creator         victor.huang <br/>   
 *   @create-time   2015年7月29日   下午3:39:52   
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
 * @Company 武汉天喻信息产业股份有限公司
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
	 * @update 日期: 2015年7月29日
	 */
	public static void main(String[] args) {
		TimeZone tz = TimeZone.getTimeZone("ETC/GMT-8");  // 设置时区为GTM-8
		TimeZone.setDefault(tz);
		Logger logger = Logger.getLogger(DcpsServer.class);
		
		try {
			// 初始化Spring
			SpringUtil.initSpring();
	        // 配置多线程服务进程
	        ServerBootstrap bootstrap = new ServerBootstrap( 
	                new NioServerSocketChannelFactory( 
	                        Executors.newCachedThreadPool(),2, //boss
	                        Executors.newCachedThreadPool(),8)); //worker
	        
	        ChannelPipeline pipeline =  Channels.pipeline();
	        //tls
	        SslContext sslCtx = SslContext.newServerContext(new File("根证书"),new File("公钥"));
	        SSLEngine engine = sslCtx.newEngine();
	        engine.setNeedClientAuth(true);//双向认证
	        engine.setUseClientMode(false);//server模式
	        //engine.setWantClientAuth(true);
	        engine.setEnabledProtocols(new String[]{"TLSv10"});//协议版本
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
	        
	        
	        // 设置事件管道 
	        bootstrap.setPipeline(pipeline); 
	        
	        //获取端口配置
	        Config config =(Config) SpringUtil.getBean("config");
	        
			// 绑定端口
	        for (int i = 0; i <config.port.length; i++){
	        bootstrap.bind(new InetSocketAddress(config.getLocalIp(),config.getPort()[i]));
	        logger.info("服务端启动成功...     端口号为：" + config.getPort()[i]);
	        }
			
		} catch (Exception e) {
			logger.error("服务端启动异常....", e);
			e.printStackTrace();
		}

	}

}
