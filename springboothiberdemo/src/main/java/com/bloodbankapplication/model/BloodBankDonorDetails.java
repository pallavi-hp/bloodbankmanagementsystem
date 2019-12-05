package com.bloodbankapplication.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
@Entity
@Table(name = "DonorDetails")

public class BloodBankDonorDetails implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@NotNull(message = "id cannot be empty")
	private int id;
	@Column(name = "firstName")
	@NotNull(message = "firstName cannot be empty")
	private String firstName;
	@Column(name = "lastName")
	private String lastName;
	@Column(name = "password")
	@NotNull(message = "password cannot be empty")
	@Size(min = 8, message="password must be minimum 8 characters")
	private String password;
	@Column(name = "age")
	@NotNull(message = "age cannot be empty")
	private int age;
	@Column(name = "address")
	@NotNull(message = "address cannot be empty")
	private String address;
	@Column(name = "contactNumber")
	@NotNull(message = "contactNumber cannot be empty")
	private long contactNumber;
	@Column(name = "email")
	@NotNull(message = "email cannot be empty")
	private String email;
	@Column(name = "gender")
	@NotNull(message = "gender cannot be empty")
	private String gender;
	@Column(name = "bloodGroup")
	@NotNull(message = "BloodGroup cannot be empty")
	private String bloodGroup;
	@Column(name = "status")
	private String status;
	@Column(name = "role")
	private String role;
	@Column(name = "heamoglobin")
	@NotNull(message = "heamoglobin cannot be empty")
	private float heamoglobin;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public float getHeamoglobin() {
		return heamoglobin;
	}

	public void setHeamoglobin(float heamoglobin) {
		this.heamoglobin = heamoglobin;
	}

	public BloodBankDonorDetails() {
		super();

	}

	public BloodBankDonorDetails(int id, String firstName, String lastName, String password, int age, String address,
			long contactNumber, String email, String gender, String bloodGroup, String status, String role,
			float heamoglobin) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.age = age;
		this.address = address;
		this.contactNumber = contactNumber;
		this.email = email;
		this.gender = gender;
		this.bloodGroup = bloodGroup;
		this.status = status;
		this.role = role;
		this.heamoglobin = heamoglobin;
	}

}
