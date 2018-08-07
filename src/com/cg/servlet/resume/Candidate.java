package com.cg.servlet.resume;

public class Candidate {
	private String address, firstName, lastName, gender, emailId, website, description, highestQualification;
	private String contactNumber;
	private String dateOfBirth;
	private String Hobbies[];
	private String Skills[];

//	private LocalDate getDate(String dobStr) {
//		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/mm/yyyy");
//		LocalDate date = LocalDate.parse(dobStr, formatter);
//		return date;
//	}

//	public Candidate(String firstName, String lastName, String gender, String dateOfBirth,
//			String highestQualification, String address, String emailId, String website, String description,
//			String contactNumber, String[] hobbies, String[] skills) {
//		this.address = address;
//		this.firstName = firstName;
//		this.lastName = lastName;
//		this.gender = gender;
//		this.emailId = emailId;
//		this.website = website;
//		this.description = description;
//		this.highestQualification = highestQualification;
//		this.contactNumber = contactNumber;
//		this.dateOfBirth = dateOfBirth;
//		Hobbies = hobbies;
//		Skills = skills;
//	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getWebsite() {
		return website;
	}

	public void setWebsite(String website) {
		this.website = website;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getHighestQualification() {
		return highestQualification;
	}

	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String[] getHobbies() {
		return Hobbies;
	}

	public void setHobbies(String[] hobbies) {
		Hobbies = hobbies;
	}

	public String[] getSkills() {
		return Skills;
	}

	public void setSkills(String[] skills) {
		Skills = skills;
	}

}
