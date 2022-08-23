package com.cts.code.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.code.entity.PensionerDetailEntity;

@Repository
public interface DetailRepository extends JpaRepository<PensionerDetailEntity, String> {

}
