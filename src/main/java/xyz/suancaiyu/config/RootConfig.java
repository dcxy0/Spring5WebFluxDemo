package xyz.suancaiyu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.support.AbstractAnnotationConfigDispatcherHandlerInitializer;

/**
 * Created by puruidong on 2017/10/19.
 *
 * @author puruidong
 * @version 1.0 2017/10/19
 */
@Configuration
@ComponentScan("xyz.suancaiyu")
public class RootConfig extends AbstractAnnotationConfigDispatcherHandlerInitializer {

    @Override
    protected Class<?>[] getConfigClasses() {
        return new Class[]{WebConfig.class};
    }
}
