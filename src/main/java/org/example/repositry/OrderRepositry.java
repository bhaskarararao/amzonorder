package org.example.repositry;

import org.example.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepositry extends JpaRepository<Order,Long> {
    public List<Order> findByName(String name);
}
