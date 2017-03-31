package spitter.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Created by Administrator on 2017/3/23.
 */
public class spittrWebAppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer{


    protected Class<?>[] getRootConfigClasses() {
        return new Class<?>[]{RootConfig.class};
    }

    protected Class<?>[] getServletConfigClasses() {//指定装配类
        return new Class<?>[]{WebConfig.class};
    }

    protected String[] getServletMappings() { //将DispatcherServlet映射到"/"。"/"：是应用的默认Servlet，它会处理进入应用的所有请求
        return new String[]{"/"};
    }
}
