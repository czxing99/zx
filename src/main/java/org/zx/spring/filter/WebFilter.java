package org.zx.spring.filter;


import lombok.extern.slf4j.Slf4j;
import org.zx.servlet.AppContext;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

@Slf4j
public class WebFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)req;
        AppContext.setRequest(request);
        chain.doFilter(request, res);
        AppContext.removeRequest();
    }

    @Override
    public void destroy() {

    }
}
