package labshopmonolith.common;


import labshopmonolith.InventooryApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { InventooryApplication.class })
public class CucumberSpingConfiguration {
    
}
