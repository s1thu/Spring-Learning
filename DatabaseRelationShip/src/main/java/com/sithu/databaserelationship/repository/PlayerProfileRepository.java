package com.sithu.databaserelationship.repository;

import com.sithu.databaserelationship.onetoone.PlayerProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerProfileRepository extends JpaRepository<PlayerProfile,Integer> {
}
