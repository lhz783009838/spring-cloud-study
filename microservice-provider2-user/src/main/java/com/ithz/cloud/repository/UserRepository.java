package com.ithz.cloud.repository;

import com.ithz.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author baker
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long>{
}
