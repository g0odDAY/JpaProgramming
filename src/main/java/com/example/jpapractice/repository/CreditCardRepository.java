package com.example.jpapractice.repository;

import com.example.jpapractice.model.CreditCard;

import java.util.List;

public interface CreditCardRepository extends BillingDetailsRepository<CreditCard,Long>{
    List<CreditCard> findByExpYear(String expYear);
}
