package eaiproject.eaiprojectOrderPlacement.data.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.*;

@Entity
public class Order {
	
	@Id @GeneratedValue
	private Integer order_id;
	private Double total_order_price;
	@Temporal(TemporalType.TIMESTAMP)
	private Date creation_date;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "order_fk")
	private List<Shampoo> shampoos;
	
	public Order() {
		super();
	}

}
