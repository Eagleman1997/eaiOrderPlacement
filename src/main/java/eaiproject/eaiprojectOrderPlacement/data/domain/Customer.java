package eaiproject.eaiprojectOrderPlacement.data.domain;

import java.util.List;

import javax.persistence.*;

@Entity
public class Customer {
	
	@Id @GeneratedValue
	private Integer customer_id;
	private String first_name;
	private String last_name;
	private String creditcard_provider;
	private String creditcard_number;
	private String shipping_address_name;
	private String shipping_address_street;
	private String shipping_address_location;
	private Integer nmbr_of_loyalty_points;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "customer_fk")
	private List<Order> orders;
	

	public Customer() {
		super();
	}
	
}
