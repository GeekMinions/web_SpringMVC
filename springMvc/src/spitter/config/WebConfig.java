package spitter.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by Administrator on 2017/3/23.
 */
@Configuration                  //表示配置文件
@EnableWebMvc                   //启用mvc
@ComponentScan("spitter.web")   //启用组件扫描
public class WebConfig extends WebMvcConfigurerAdapter {


    @Bean
    public ViewResolver viewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/views/");
        resolver.setSuffix(".jsp");
        resolver.setExposeContextBeansAsAttributes(true);
        return resolver;
    /*  上面的代码类似在xml文件中如下的配置
        <bean id =“viewResolver”class =“org.springframework.web.servlet.view.InternalResourceViewResolver”>
            <property name =“prefix”value =“/ WEB-INF / jsp /”/>
            <property name =“suffix”value =“。jsp”/>
            <property name="exposeContextBeansAsAttributes" value="true"/>
        </ bean>
        setExposeContextBeansAsAttributes
    * */
    }

    public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer){  //配置静态资源的处理
        configurer.enable();
    }

}
