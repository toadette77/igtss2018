package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CC_XACTS")
public class Cc_xacts implements Serializable {
	// member variables
	@Id
	@GeneratedValue
	@Column(name = "CX_O_ID")
	private int id;

	@Column(name = "CX_TYPE")
	private String type;

	@Column(name = "CX_NUM")
	private String num;

	@Column(name = "CX_NAME")
	private String name;

	@Column(name = "CX_EXPIRE")
	private String expire;

	@Column(name = "CX_AUTH_ID")
	private String authId;

	@Column(name = "CX_XACT_AMT")
	private String xactAmt;

	@Column(name = "CX_XACT_DATE")
	private String xactDate;

	@Column(name = "CX_CO_ID")
	private String coId;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getExpire() {
		return expire;
	}

	public void setExpire(String expire) {
		this.expire = expire;
	}

	public String getAuthId() {
		return authId;
	}

	public void setAuthId(String authId) {
		this.authId = authId;
	}

	public String getXactAmt() {
		return xactAmt;
	}

	public void setXactAmt(String xactAmt) {
		this.xactAmt = xactAmt;
	}

	public String getXactDate() {
		return xactDate;
	}

	public void setXactDate(String xactDate) {
		this.xactDate = xactDate;
	}

	public String getCoId() {
		return coId;
	}

	public void setCoId(String coId) {
		this.coId = coId;
	}
}
