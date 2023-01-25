package com.megazone.springbootbackend.repository;

import com.megazone.springbootbackend.model.entity.StaffsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffsRepository extends JpaRepository<StaffsEntity, String> {
}
