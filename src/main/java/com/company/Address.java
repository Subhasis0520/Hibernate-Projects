package com.company;

import java.util.Date;

import javax.persistence.*;


@Entity
@Table(name="student_address")
public class Address {

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name="adress_id")
	  private int addressId;
	  
	  @Column(length = 50)
      private String city;
	  
	  @Column(length = 100, name = "STREET")
      private String street;
      private boolean isOpen;
      
      @Transient
      private double x;
      
      @Column(name= "add_Date")
      @Temporal(TemporalType.DATE)
      private Date addedDate;
      
      @Lob
      private byte[] image;
      
      public Address(String city, String street, boolean isOpen, Date addedDate, byte[] image) {
		super();
		this.city = city;
		this.street = street;
		this.isOpen = isOpen;
		this.addedDate = addedDate;
		this.image = image;
	}

	public Address() {
		super();
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public Address(int addressId, String city, String street, boolean isOpen, double x, Date addedDate, byte[] image) {
		super();
		this.addressId = addressId;
		this.city = city;
		this.street = street;
		this.isOpen = isOpen;
		this.x = x;
		this.addedDate = addedDate;
		this.image = image;
	}
}
