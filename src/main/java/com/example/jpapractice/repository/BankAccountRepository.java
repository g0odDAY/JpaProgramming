package com.example.jpapractice.repository;

import com.example.jpapractice.model.BankAccount;

import java.util.List;

public interface BankAccountRepository extends BillingDetailsRepository<BankAccount,Long>{
    List<BankAccount> findBySwift(String swift);
}
