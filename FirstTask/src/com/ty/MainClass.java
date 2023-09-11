package com.ty;
import java.util.HashMap;
import java.util.Map;

public class MainClass {
	public static void main(String[] args) {
		
		Map<String, Person> AdharToPerson=new HashMap<>();
		
		Person person1=new Person("abc", 18, 89564732, "abc@gmail.com");
		Person person2=new Person("xyz", 20, 569874125, "xyz@gmail.com");
		
		AdharCard adhar1=new AdharCard("123456789123");
		AdharCard adhar2=new AdharCard("987654321987");
		
		AdharToPerson.put(adhar2.getAdharno(), person1);
		AdharToPerson.put(adhar2.getAdharno(), person2);
		
		
		 String searchAdharNumber = "987654321987";
	        Person Personfound= AdharToPerson.get(searchAdharNumber);

	        if (Personfound != null) {
	            System.out.println("Person found with a Adhar Number: "+searchAdharNumber);
	            System.out.println("Name: " + Personfound.getName());
	            System.out.println("Age: " + Personfound.getAge());
	            System.out.println("Phone Number:" + Personfound.getPhno());
	            System.out.println("Email: " + Personfound.getEmail());
	        } else {
	            System.out.println("can't find a Person for Adhar number: " + searchAdharNumber);
	        }
		
		
	}
}
