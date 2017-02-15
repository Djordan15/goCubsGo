package com.jruffin.app;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import static java.lang.System.out;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
	out.println("Welcome Dev + Ops");
        assertTrue( true );
    }
}
