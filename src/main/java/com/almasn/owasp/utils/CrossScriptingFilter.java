package com.almasn.owasp.utils;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

@WebFilter(filterName = "crossScriptingFilter", urlPatterns = "/*")
public class CrossScriptingFilter implements Filter {

	FilterConfig filterConfig;
	
    public void init(FilterConfig filterConfig) throws ServletException {
        this.filterConfig = filterConfig;
    }

    public void destroy() {
        this.filterConfig = null;
    }

    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
        throws IOException, ServletException {

    	System.out.println("Doing filter..");
        chain.doFilter(new RequestWrapper((HttpServletRequest) request), response);

    }

}