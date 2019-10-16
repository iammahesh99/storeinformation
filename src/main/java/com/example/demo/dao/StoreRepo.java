package com.example.demo.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.demo.model.Store;


@RepositoryRestResource(collectionResourceRel="Store",path="Store")
public interface StoreRepo extends JpaRepository<Store, Integer>
{
	
}
	

