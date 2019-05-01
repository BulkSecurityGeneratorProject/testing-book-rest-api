package com.vasit.uaa.repository;

import com.vasit.uaa.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Spring Data JPA repository for the User entity.
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}
