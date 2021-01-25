package com.api.contactapp.contactapp.dao;

import com.api.contactapp.contactapp.entities.Address;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AddressRepository extends JpaRepository<Address,Long> {
}
