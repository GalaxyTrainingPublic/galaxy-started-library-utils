package pe.edu.galaxy.training.java.library.utils.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pe.edu.galaxy.training.java.library.utils.date.DateUtilWrapper;
import pe.edu.galaxy.training.java.library.utils.date.DateUtilWrapperImpl;
import pe.edu.galaxy.training.java.library.utils.sql.SQLUtilWrapper;
import pe.edu.galaxy.training.java.library.utils.string.DataUtilWrapper;

@Configuration
public class UtilsConfig {

    @Bean
    SQLUtilWrapper sqlUtilWrapper(){
        return new SQLUtilWrapper();
    }

    @Bean
    DataUtilWrapper dataUtilWrapper(){
        return new DataUtilWrapper();
    }
    @Bean
    DateUtilWrapper dateUtilWrapper(){
        return new DateUtilWrapperImpl();
    }
}
