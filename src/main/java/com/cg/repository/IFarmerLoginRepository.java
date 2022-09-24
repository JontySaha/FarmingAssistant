package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entity.FarmerLogin;

@Repository
public interface IFarmerLoginRepository extends JpaRepository<FarmerLogin, String> {

}
