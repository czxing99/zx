package org.zx.tools.servlet;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.http.HttpServletRequest;

@Slf4j
public class AppContext {
    private static ThreadLocal<HttpServletRequest> requests = new ThreadLocal();

    private AppContext() {
        log.info("server boot");
    }
   
    public static HttpServletRequest getRequest() {
        return (HttpServletRequest)requests.get();
    }

    public static void setRequest(HttpServletRequest request) {
        requests.set(request);
    }

    public static void removeRequest() {
        requests.remove();
    }
}
