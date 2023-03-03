package com.Spring.Jdbc.entites;

public class Student {
	private int id;
	private String name;
	private String city;
	
	// Now we make constructor to assign and initialize the values for the above 
   //creating default constructor from ( generate constructor from super class )
	
	public Student() {
		
	}
	
	
	//creating parameterize  constructor from (generate constructor using fields)

	public Student(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	

    //To set and get data use getter and setter from (generate getter and setter )
	
	public int getId() {
		return id;
	}

    // TO get all the methods of student class by typing the reference variable of student class
	//we use toString method 
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + "]";
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}
	
	
	
	

}
