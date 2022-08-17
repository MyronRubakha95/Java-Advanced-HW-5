package ConfigJava;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    public PlusService plusService(){
        return new PlusService();
    }
    @Bean
    public MinusService minusService(){
        return new MinusService();
    }
    @Bean
    public Calculator calculator(){
        return new Calculator(plusService(), minusService());
    }
}
