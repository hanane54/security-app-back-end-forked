package ma.ac.inpt.security.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import ma.ac.inpt.security.models.Orders;

@Repository 
public interface OrderRepository extends JpaRepository<Orders, Long>{
	
	@Query(value = "SELECT order_id, client_id, order_date, libelle FROM orders WHERE client_id = ?#{[0]}", nativeQuery= true)
	List<Orders> findAllClientOrders( String id);
	
}
