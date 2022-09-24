package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.entity.Farmer;

public interface IFarmerRepository extends JpaRepository<Farmer,Integer>{
}
