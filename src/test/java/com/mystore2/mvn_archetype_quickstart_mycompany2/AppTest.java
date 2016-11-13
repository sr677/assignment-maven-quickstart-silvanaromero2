package com.mystore2.mvn_archetype_quickstart_mycompany2;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {    
    super( testName );
	System.out.println("silvana exiting AppTest(" + testName + ")");
    }

/**
 * @return the suite of tests being tested
 */
public static Test suite()
{
	System.out.println("silvana entered suite()");
    return new TestSuite( AppTest.class );
	}

/**
 * 
 */
public void testApp()
{
	System.out.println("silvana entered testApp()");
    assertTrue( true );
	}
}
