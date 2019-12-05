package dk.stud.kea.assignments.mandatory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class MandatoryApplication extends SpringBootServletInitializer {

  public static void main(String[] args) {
    SpringApplication.run(MandatoryApplication.class, args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(MandatoryApplication.class);
  }

}
