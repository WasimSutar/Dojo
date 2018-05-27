package com.nextgen.nextgenairlines;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;


public class TestNextgenAirlines {

	
	private NextgenAirlines nextgenAirlines ;
	
	@Before
	public void setUp(){
		nextgenAirlines = new NextgenAirlines();
	}
	
	@Test
	public void testInputNotNull(){
		int output=nextgenAirlines.getPrice(new ArrayList<Request>());
		assertEquals(0, output);
	}
	
	@Test
	public void testInputNull(){
		int output=nextgenAirlines.getPrice(null);
		assertEquals(0, output);
	}
	
	@Test
	public void testInputRequest(){
		
		List<Request> inputRequest=new ArrayList<>();
		inputRequest.add(new Request("ABC01",0,5,10));
		int output=nextgenAirlines.getPrice(inputRequest);
		assertEquals(10, output);
	}
	
	@Test
	public void testInputForMultipleRequest(){
		
		List<Request> inputRequest=new ArrayList<>();
		inputRequest.add(new Request("ABC01",0,5,10));
		inputRequest.add(new Request("XYZ01",3,4,18));
		inputRequest.add(new Request("DEF02",4,7,14));
		inputRequest.add(new Request("YEF01",7,6,8));
		int output=nextgenAirlines.getPrice(inputRequest);
		assertEquals(26, output);
	}
	
	@Test
	public void testInputForMultipleRequest3(){
		
		List<Request> inputRequest=new ArrayList<>();
		inputRequest.add(new Request("ABC01",0,2,10));
		inputRequest.add(new Request("XYZ01",1,8,18));
		inputRequest.add(new Request("DEF02",5,4,14));
		inputRequest.add(new Request("YEF01",7,2,8));
		inputRequest.add(new Request("ABC01",12,3,13));
		inputRequest.add(new Request("XYZ01",16,2,6));
		inputRequest.add(new Request("DEF02",18,1,10));
		inputRequest.add(new Request("YEF01",19,2,11));
		inputRequest.add(new Request("YEF01",23,1,3));
		int output=nextgenAirlines.getPrice(inputRequest);
		assertEquals(67, output);
	}
	
	@Test
	public void testInputForMultipleRequest2(){
		
		List<Request> inputRequest=new ArrayList<>();
		inputRequest.add(new Request("ABC01",0,5,10));
		inputRequest.add(new Request("XYZ01",5,4,8));
		inputRequest.add(new Request("DEF02",9,7,14));
		inputRequest.add(new Request("YEF01",16,6,8));
		int output=nextgenAirlines.getPrice(inputRequest);
		assertEquals(40, output);
	}
	
	
}
