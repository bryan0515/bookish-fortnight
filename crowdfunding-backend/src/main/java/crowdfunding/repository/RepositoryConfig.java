package crowdfunding.repository;

import crowdfunding.entity.Pledge;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurerAdapter;

/**
 * Created by bryancheng on 2017/5/8.
 */
//@Configuration
//public static class RepositoryConfig extends
//        RepositoryRestConfigurerAdapter {
//
//    @Override
//    protected void configureRepositoryRestConfiguration(
//            RepositoryRestConfiguration config) {
//        config.exposeIdsFor(Request.class, Pledge.class);
//    }
//}

@Configuration
class SpringDataRestConfig {

    @Bean
    public RepositoryRestConfigurer repositoryRestConfigurer() {

        return new RepositoryRestConfigurerAdapter() {
            @Override
            public void configureRepositoryRestConfiguration(
                    RepositoryRestConfiguration config) {
                config.exposeIdsFor(Pledge.class);
            }
        };

    }

}