package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;
import java.sql.Timestamp;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.impl.StaticLoggerBinder;


@SpringBootApplication
@RestController
public class Application {

	
	// SLF4J's logging instance for this class
    // We could have used LoggerFactory.getLogger(Slf4jSpringBootApplication.class) as well
    private static final Logger LOGGER = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());
    
    // This is what SLF4J uses to bind to a specific logging implementation
    final StaticLoggerBinder binder = StaticLoggerBinder.getSingleton();
    
	@RequestMapping("/")
	public String home() {
		try {
		      int a=5;
		      int b=0;
			  int c = a/b;
			 // String str = null;
		        // Getting length of a string
		       // System.out.println(str.length());
			  
		  }  catch(Exception e) {
			  LOGGER.debug("Logback message - debug {}", new Timestamp(System.currentTimeMillis()));
			  LOGGER.info("Logback message - info {}", new Timestamp(System.currentTimeMillis()));
			  LOGGER.error("Logback message - Stacktrace", e);
		  }
		return "Labor omnia vincit.";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
