package com.megazone.springbootbackend.repository;

import com.megazone.springbootbackend.model.entity.PlayersEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayersRepository extends JpaRepository<PlayersEntity, String> {
}
