package com.wipro.Epassport.Repository;

import com.wipro.Epassport.Entity.Application;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ApplicationRepository extends JpaRepository<Application,Integer> {
    Application findByEmail(String email);
    @Query(value = "SELECT u FROM Application u where u.email=?1")
    Application findByEmailId(String email);
}
