package com.jpa.exmple.repository;

import com.jpa.exmple.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// ek interface dusre interface ko extend krta hai..
public interface ProductRepository  extends JpaRepository<Product,Integer>
{

}
