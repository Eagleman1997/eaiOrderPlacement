package eaiproject.eaiprojectOrderPlacement.business.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import eaiproject.eaiprojectOrderPlacement.data.domain.Order;
import eaiproject.eaiprojectOrderPlacement.data.repository.OrderPlacementRepository;

public class OrderPlacementService {
	
	@Autowired
	private OrderPlacementRepository orderPlacementRepository;
	
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

}
