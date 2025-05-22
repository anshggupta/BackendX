package com.jpa.exmple.repository;

import com.jpa.exmple.entity.Material;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Material , Integer> {

}
