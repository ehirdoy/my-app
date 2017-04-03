package com.mycompany.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	Logger LOG = LoggerFactory.getLogger(App.class);
	LOG.trace("Hello World");
	LOG.debug("Hello World");
	LOG.info("Hello World");
	LOG.warn("Hello World");
	LOG.error("Hello World");
        System.out.println( "Hello World!" );
    }
}
