package ea.slartibarfast.demo.graphql.configuration;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = {"ea.slartibarfast.demo.graphql"})
@EntityScan(basePackages = "ea.slartibarfast.demo.graphql.domain")
@EnableJpaRepositories(basePackages = "ea.slartibarfast.demo.graphql.domain.repository")
public class DemoGraphqlAppConfiguration {

}
