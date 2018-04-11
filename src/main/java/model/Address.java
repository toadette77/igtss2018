package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Address implements Serializable {
    // member variables
    @Id
    @GeneratedValue
    @Column(name="ADDR_ID")
    private int id;
    
    @Column(name="ADDR_STREET1")
    private String street1;
    
    @Column(name="ADDR_CITY")
    private String street2;
    
    @Column(name="ADDR_STATE")
    private String state;
    
    @Column(name="ADDR_ZIP")
    private String zip;
    
    @Column(name="ADDR_CO_ID")
    private String co_id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getCo_id() {
		return co_id;
	}

	public void setCo_id(String co_id) {
		this.co_id = co_id;
	}

}
