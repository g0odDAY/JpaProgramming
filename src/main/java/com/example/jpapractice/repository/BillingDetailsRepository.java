package com.example.jpapractice.repository;

import com.example.jpapractice.model.BillingDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;

public interface BillingDetailsRepository<T extends BillingDetails, ID> extends JpaRepository<T,ID> {
    List<T> findByOwner(String owner);
}
