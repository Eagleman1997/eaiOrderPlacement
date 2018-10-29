package eaiproject.eaiprojectOrderPlacement.business.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import eaiproject.eaiprojectOrderPlacement.data.domain.Order;
import eaiproject.eaiprojectOrderPlacement.data.domain.Shampoo;
import eaiproject.eaiprojectOrderPlacement.data.domain.Customer;
import eaiproject.eaiprojectOrderPlacement.data.repository.CustomerRepository;
import eaiproject.eaiprojectOrderPlacement.data.repository.OrderRepository;
import eaiproject.eaiprojectOrderPlacement.data.repository.ShampooRepository;

public class OrderPlacementService {
	
	@Autowired
	private OrderRepository orderPlacementRepository;
	private ShampooRepository shampooRespository;
	private CustomerRepository customerRepository;
	
	
	/**
	 * 
	 * Order
	 */
	public Order createORder(Integer order_id, Double total_order_price, Date creation_date) {
		Order order = new Order(order_id, total_order_price, creation_date);
		return orderPlacementRepository.save(order);
	}
	
	public Order readOrderById(String orderId) {
		return orderPlacementRepository.findById(Integer.parseInt(orderId)).orElse(null);
	}
	
	public Order updateOrder(String order_id, Double total_order_price, Date creation_date) {
		Order order = new Order(Integer.parseInt(order_id), total_order_price, creation_date);
		order.setOrder_id(Integer.parseInt(order_id));
		return orderPlacementRepository.save(order);
	}


	/**
	 * Shampoo
	 */
	public Shampoo createShampoo(Integer shampoo_id, String name, String brand, String type, Double price) {
		Shampoo shampoo = new Shampoo(shampoo_id, name, brand, type, price);
		return shampooRespository.save(shampoo);
	}
	
	public List<Shampoo> readShampooById(String shampooId) {
		return shampooRespository.findShampoosByShampooId(Integer.parseInt(shampooId));
	}
	
	public Shampoo updateShampoo(String shampoo_id, String name, String brand, String type, Double price) {
		Shampoo shampoo = new Shampoo(Integer.parseInt(shampoo_id), name , brand, type, price);
		shampoo.setShampoo_id(Integer.parseInt(shampoo_id));
		return shampooRespository.save(shampoo);
	}
	
	/**
	 * Customer
	 */

	public Customer createCustomer(Integer customer_id, String first_name,String last_name, String shipping_address_name, String shipping_address_street, String shipping_address_location) {
		Customer customer = new Customer(customer_id, first_name, last_name, shipping_address_name, shipping_address_street, shipping_address_location);
		return customerRepository.save(customer);
	}
	
	public Customer readCustomerById(String customer_id) {
		return customerRepository.findCustomerByCustomerId(Integer.parseInt(customer_id));
	}
	
	public Customer updateCustomer(String customer_id, String first_name,String last_name, String shipping_address_name, String shipping_address_street, String shipping_address_location) {
		Customer customer = new Customer(Integer.parseInt(customer_id), first_name, last_name, shipping_address_name, shipping_address_street, shipping_address_location);
		customer.setCustomer_id(Integer.parseInt(customer_id));
		return customerRepository.save(customer);
	}
	
}
