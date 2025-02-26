package ma.ac.inpt.security.services;

import java.util.List;

import org.springframework.stereotype.Service;

import ma.ac.inpt.security.models.Orders;

@Service
public interface OrderService {
	public Orders addOrder(Orders order);
	public List<Orders> getAllOrders();
	public Orders updateOrder(Long order_id, Orders order);
	public void deleteOrder(Orders order);
	public Orders serchOrderById(Long id);
}
