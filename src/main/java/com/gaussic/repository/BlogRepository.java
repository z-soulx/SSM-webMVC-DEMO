package com.gaussic.repository;

import com.gaussic.model.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by dzkan on 2016/3/18.
 */
@Repository
public interface BlogRepository extends JpaRepository<BlogEntity, Integer> {
}
