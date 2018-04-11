package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Author implements Serializable {
    // member variables
    @Id
    @GeneratedValue
    @Column(name="A_ID")
    private int id;
    
    @Column(name="A_FNAME")
    private String firstName;
    
    @Column(name="A_LNAME")
    private String lastName;
    
    @Column(name="A_MNAME")
    private String mName;
    
    @Column(name="A_DOB")
    private String dop;
    
    @Column(name="A_BIO")
    private String aBio;

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

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getDop() {
		return dop;
	}

	public void setDop(String dop) {
		this.dop = dop;
	}

	public String getaBio() {
		return aBio;
	}

	public void setaBio(String aBio) {
		this.aBio = aBio;
	}

}
