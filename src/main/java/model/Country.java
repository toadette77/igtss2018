package model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADDRESS")
public class Country implements Serializable {
    // member variables
    @Id
    @GeneratedValue
    @Column(name="CO_ID")
    private int id;
    
    @Column(name="CO_NAME")
    private String name;
    
    @Column(name="CO_EXCHANGE")
    private String exchange;
    
    @Column(name="CO_CURRENCY")
    private String currency;

	public int getId() {
		return id;
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

	public String getExchange() {
		return exchange;
	}

	public void setExchange(String exchange) {
		this.exchange = exchange;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
    
}
