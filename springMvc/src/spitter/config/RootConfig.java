package spitter.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created by Administrator on 2017/3/23.
 */
@Configuration  //表示一个配置文件
//启动组件扫面，basePackages：指定扫描那些包，excludeFilters：指定哪些类型不适合进行组件扫描，@Filter：过滤器，FilterType：枚举类，ANNOTATION：用给定的注释过滤候选人。
@ComponentScan(basePackages={"spitter"},excludeFilters = {@Filter(type= FilterType.ANNOTATION,value= EnableWebMvc.class)})
public class RootConfig {
}
