package com.course.hibernate;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class order {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String ordername;
	private String ordermail;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOrdername() {
		return ordername;
	}

	public void setOrdername(String ordername) {
		this.ordername = ordername;
	}

	public String getOrdermail() {
		return ordermail;
	}

	public void setOrdermail(String ordermail) {
		this.ordermail = ordermail;
	}

	public order(int id, String ordername, String ordermail) {
		super();
		this.id = id;
		this.ordername = ordername;
		this.ordermail = ordermail;
	}

	public order() {
		super();

	}

}
