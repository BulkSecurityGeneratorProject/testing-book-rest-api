package com.vasit.uaa.repository;

import com.vasit.uaa.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the User entity.
 */
@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
