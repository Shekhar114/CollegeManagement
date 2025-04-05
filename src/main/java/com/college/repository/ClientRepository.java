package com.college.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.college.entities.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client,Integer>{

}
