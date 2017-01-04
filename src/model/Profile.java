package model;

import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import validation.IsNotNull;
import validation.IsNotNullImpl;

import org.springframework.stereotype.Component;

import validation.ValidEmail;

@Component("profile")
public class Profile {

	@Size(min = 1, max = 100, message = "Has to be at least one character.")
	private String name;
	@Size(min = 6, max = 15, message = "Has to be 6 to 15 characters")
	private String id;
	@Digits(integer = 3, fraction = 0, message = "Has to be a number.")
	private String age;
	@ValidEmail(min = 6, message = "The email has to be at least 6 characters. Email needs to contain \"@\"")
	private String email;
	@IsNotNull(message = "Cannot be blank")
	private String street;
	@Size(min = 2, message = "Has to be at least 2 characters.")
	private String city;
	@IsNotNull(message = "Cannot be blank")
	private String state;

	public Profile() {
	}

	public Profile(String name, String id, String age, String email, String street, String city, String state) {
		this.name = name;
		this.id = id;
		this.age = age;
		this.email = email;
		this.street = street;
		this.city = city;
		this.state = state;
	}

	// Getters & setters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	// Getters & setters

	@Override
	public String toString() {
		return "Profile [name=" + name + ", age=" + age + ", email=" + email + ", street=" + street + ", city=" + city
				+ ", state=" + state + "]";
	}

}
