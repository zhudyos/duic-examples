package sample;

import io.zhudy.duic.config.ReloadPlot;
import io.zhudy.duic.config.spring.DuicConfigBeanFactoryPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.util.concurrent.TimeUnit;

/**
 * @author Kevin Zou (kevinz@weghst.com)
 */
@EnableWebMvc
@Configuration
@Order(Ordered.HIGHEST_PRECEDENCE)
public class AppConfig {

    /**
     * 将 {@code DuicConfigBeanFactoryPostProcessor} 注册至 IoC 容器中。
     */
    @Bean
    public static DuicConfigBeanFactoryPostProcessor duicConfigBeanFactoryPostProcessor() {
        DuicConfigBeanFactoryPostProcessor fpp = new DuicConfigBeanFactoryPostProcessor();
        fpp.setBaseUri("https://duic.zhudy.io/api/v1");
        fpp.setName("sample");
        fpp.setProfile("first");

        // 配置重载周期
        fpp.setReloadPlot(new ReloadPlot(10, TimeUnit.SECONDS));
        return fpp;
    }
}
