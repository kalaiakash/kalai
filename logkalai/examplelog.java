package logkalai;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;



public class examplelog {
	public static void main (String[]args) {
		final Logger log=Logger.getLogger(examplelog.class);
		BasicConfigurator.configure();
		log.debug("debug error");
		log.info("information error");
		log.warn("warning error");
		log.error("errors");
		log.fatal("fatal errors");
	}

}
