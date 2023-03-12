package hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;
import java.sql.Timestamp;
import java.time.LocalDateTime;


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
        int second = LocalDateTime.now().getSecond(); 
		try {
	        LOGGER.info("Logback message - Second of the minute is {}", second);
	        if(second % 2 == 0) {
	            LOGGER.info("Logback message - second {} is even", second);
			      int a=5;
			      int b=0;
				  int c = a/b;
	        }else {
	        	LOGGER.info("Logback message - second {} is odd", second);
				  String str = null;
			       // Getting length of a string
			       int d = str.length();
	        }

			  
		  }  catch(Exception e) {
			  LOGGER.debug("Logback message - debug {}", second);
			  LOGGER.error("Logback message - Stacktrace", e);
		  }
		return "Labor omnia vincit.";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}