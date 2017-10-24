package online.shixun.web.listener;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 * Application Lifecycle Listener implementation class OnlineCounter
 *
 */
public class OnlineCounter extends HttpServlet implements HttpSessionListener {
	

	private static final long serialVersionUID = 1L;
	private static int sessionCounter = 1;
	
	@Override
	public void sessionCreated(HttpSessionEvent se) {
		sessionCounter++;
	}

	@Override
	public void sessionDestroyed(HttpSessionEvent se) {
		sessionCounter--;
	}
	
	public static int getOnlineSession(){
		return sessionCounter;
	}
}
