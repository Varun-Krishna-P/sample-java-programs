package code.practise.WebExample;
import org.apache.log4j.Logger;
import java.io.*;
import java.util.*;
import java.util.Date;

public class log4jExample {
	//static Logger log = Logger.getLogger("log4jExample");
	static Logger log = Logger.getLogger(log4jExample.class.getName());
	//static Logger log1 = Logger.getRootLogger();

	public static void main (String logs[]) throws IOException{
		for (int i = 0; i<=10; i++){
			//Date date = new Date();			
			log.info("[INFO]The logging started at: ");			
			log.debug("This is a debugging message: " + i);
		}
		log.info("[INFO]This is an information log");
		log.info("[INFO]The logs are successfully written");
		
	}
}
