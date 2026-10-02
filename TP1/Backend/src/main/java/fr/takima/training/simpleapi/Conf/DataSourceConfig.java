package fr.takima.training.simpleapi.Conf;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.beans.factory.annotation.Value;
 
import javax.sql.DataSource;
import java.util.Properties;

import java.util.logging.Logger;

@Configuration
public class DataSourceConfig {
 
    @Value("${POSTGRES_PASSWORD:pwd}")  // Fetched from : secret/myapp/db.password
    private String password;
    
    @Bean
    public DataSource dataSource() {

        //Logger.getLogger("src.main.java.fr.takima.training.simpleApi.Conf.DataSourceConfig").info("The password to be set is: "+password);
        //Log to see easily the value being used. (for debug purposes)

        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:postgresql://database:5432/db");
        config.setUsername("usr");
        config.setPassword(password);
        config.setDriverClassName("org.postgresql.Driver");
        return new HikariDataSource(config);
    }
}
