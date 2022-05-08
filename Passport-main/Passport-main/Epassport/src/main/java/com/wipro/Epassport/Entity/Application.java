package com.wipro.Epassport.Entity;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "email" })})
public class Application {
    @Id
    @GeneratedValue
    private int id;
    private String firstName;
    private String lastName;
    private Date date_of_birth;
    private String place_of_birth;
    private String Gender;
    private String state;
    private String district;
    private String martial_status;
    private String pan;
    private String employmentType;
    private String educationDetails;
    private String fatherName;
    private String motherName;
    private String houseNo;
    private String streetName;
    private String city;
    private String pincode;
    private String telephoneNumber;
    private String email;
    private String referenceName;
    private String referenceAddress;
    private String referenceTelephoneNumber;

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

    public Date getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(Date date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getPlace_of_birth() {
        return place_of_birth;
    }

    public void setPlace_of_birth(String place_of_birth) {
        this.place_of_birth = place_of_birth;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getMartial_status() {
        return martial_status;
    }

    public void setMartial_status(String martial_status) {
        this.martial_status = martial_status;
    }

    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public String getEmploymentType() {
        return employmentType;
    }

    public void setEmploymentType(String employmentType) {
        this.employmentType = employmentType;
    }

    public String getEducationDetails() {
        return educationDetails;
    }

    public void setEducationDetails(String educationDetails) {
        this.educationDetails = educationDetails;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getHouseNo() {
        return houseNo;
    }

    public void setHouseNo(String houseNo) {
        this.houseNo = houseNo;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }


    public String getReferenceName() {
        return referenceName;
    }

    public void setReferenceName(String referenceName) {
        this.referenceName = referenceName;
    }

    public String getReferenceAddress() {
        return referenceAddress;
    }

    public void setReferenceAddress(String referenceAddress) {
        this.referenceAddress = referenceAddress;
    }

    public String getReferenceTelephoneNumber() {
        return referenceTelephoneNumber;
    }

    public void setReferenceTelephoneNumber(String referenceTelephoneNumber) {
        this.referenceTelephoneNumber = referenceTelephoneNumber;
    }

    public Application(String firstName, String lastName, Date date_of_birth, String place_of_birth, String gender, String state, String district, String martial_status, String pan, String employmentType, String educationDetails, String fatherName, String motherName, String houseNo, String streetName, String city, String pincode, String telephoneNumber, String email, String referenceName, String referenceAddress, String referenceTelephoneNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.date_of_birth = date_of_birth;
        this.place_of_birth = place_of_birth;
        Gender = gender;
        this.state = state;
        this.district = district;
        this.martial_status = martial_status;
        this.pan = pan;
        this.employmentType = employmentType;
        this.educationDetails = educationDetails;
        this.fatherName = fatherName;
        this.motherName = motherName;
        this.houseNo = houseNo;
        this.streetName = streetName;
        this.city = city;
        this.pincode = pincode;
        this.telephoneNumber = telephoneNumber;
        this.email = email;
        this.referenceName = referenceName;
        this.referenceAddress = referenceAddress;
        this.referenceTelephoneNumber = referenceTelephoneNumber;
    }

    public Application()
    {

    }
}
