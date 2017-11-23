package com.yanan.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.log4j.MDC;

import com.yanan.po.User;

public class Log4jFilter implements Filter{

	private FilterConfig config;
	
	private final static Integer DEFAULT_USERID=1;
	private final static String DEFAULT_LOGIP = "127.0.0.1";
	
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.config = filterConfig;
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		String path = req.getServletPath();
		System.out.println("我是log4jFilter类里的servletpath："+path);
		String str = config.getInitParameter("excludedUrl");
		String[] params = str.split(",");
		Integer length = params.length;
		boolean result = true;
		for(int i=0;i<length;i++) {
			if(path.endsWith(params[i])) {
				result = false;
				break;
			}
		}
		if(result) {
			HttpSession session = req.getSession();
			User user = (User) session.getAttribute("user");
			if(user==null) {
				MDC.put("userId", "DEFAULT_USERID");
				MDC.put("logIP", "DEFAULT_LOGIP");
			}else {
				MDC.put("userId", user.getUserId());
				MDC.put("logIP", user.getUser_login_ip());
			}
		}
		chain.doFilter(req, res);
	}

	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	
	
	
}
