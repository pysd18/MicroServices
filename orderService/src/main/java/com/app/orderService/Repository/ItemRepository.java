package com.app.orderService.Repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.orderService.Entity.Item;

public interface ItemRepository extends JpaRepository<Item,UUID> {

}
