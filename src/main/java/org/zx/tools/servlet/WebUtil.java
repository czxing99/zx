package org.zx.tools.servlet;



import javax.servlet.http.HttpServletRequest;

public class WebUtil {
    public static String getRootPath() {
        HttpServletRequest request = AppContext.getRequest();
        String webroot = request != null ? request.getServletContext().getRealPath("/") : null;
        if(webroot==null || "".equals(webroot.trim())) {
            //webroot = System.getProperty(Constants.WEBROOT);
        }
        return webroot;
    }
}
