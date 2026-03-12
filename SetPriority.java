package Sampletest;

import org.testng.annotations.Test;

public class SetPriority {
	
	@Test(priority=3,groups="Non-Functional")
	public void nonFunctional() {
		System.out.println("Non-Functional Test");
	}
	
	@Test(priority=2,groups="Functional")
	public void functional() {
		System.out.println("Functional Test");
	}
    
	@Test(priority=1,groups="Adhoc")
	public void adhoc() {
		System.out.println("Adhoc Test");
	}
	
	@Test(priority=4,groups="UI")
	public void ui() {
		System.out.println("UI Test");
	}
}
