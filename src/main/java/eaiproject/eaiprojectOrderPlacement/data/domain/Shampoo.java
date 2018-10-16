package eaiproject.eaiprojectOrderPlacement.data.domain;

import javax.persistence.*;

@Entity
public class Shampoo {
	
	@Id
	private Integer shampoo_id;
	private String name;
	private String brand;
	private String type;
	private Double price;
	
	public Shampoo() {
		super();
	}

}
