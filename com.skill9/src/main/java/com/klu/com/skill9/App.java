package com.klu.com.skill9;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 190030061
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext c = new ClassPathXmlApplicationContext("skill9.xml");
    	
    	Prescription p =(Prescription) c.getBean("prescription");
    	
    	System.out.println("Doctor Details :--- "+p.getDoctor().toString());
		System.out.println("Patient Details :--- "+p.getPatient().toString());
    	
    	
    }
}
