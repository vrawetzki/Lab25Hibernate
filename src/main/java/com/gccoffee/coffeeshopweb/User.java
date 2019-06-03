package com.gccoffee.coffeeshopweb;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id // this is referring to the primary key for hibernate
	@GeneratedValue(strategy = GenerationType.IDENTITY) // allows sql to manage AI and creation of primary key -- lets
														// mysql generate and AI the PK
	private Integer id;
	private String firstname;
	private String lastname;
	private String email;
	@Column(name="phonenumber")
	private Integer phone;
	private String password;
	private Integer birthday;
	private String address;
	private String state;
	private Integer zipcode;
	private String gender;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(Integer id, String firstname, String lastname, String email, Integer phone, String password,
			Integer birthday, String address, String state, Integer zipcode, String gender) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.birthday = birthday;
		this.address = address;
		this.state = state;
		this.zipcode = zipcode;
		this.gender = gender;
	}

	public User(String firstname, String lastname, String email, Integer phone, String password, Integer birthday,
			String address, String state, Integer zipcode, String gender) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.phone = phone;
		this.password = password;
		this.birthday = birthday;
		this.address = address;
		this.state = state;
		this.zipcode = zipcode;
		this.gender = gender;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
		this.phone = phone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getBirthday() {
		return birthday;
	}

	public void setBirthday(Integer birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getZipcode() {
		return zipcode;
	}

	public void setZipcode(Integer zipcode) {
		this.zipcode = zipcode;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", email=" + email
				+ ", phone=" + phone + ", password=" + password + ", birthday=" + birthday + ", address=" + address
				+ ", state=" + state + ", zipcode=" + zipcode + ", gender=" + gender + "]";
	}

	
	
	
	
}