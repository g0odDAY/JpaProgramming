package com.example.jpapractice;

import com.example.jpapractice.configuration.SpringDataConfiguration;
import com.example.jpapractice.model.BankAccount;
import com.example.jpapractice.model.CreditCard;
import com.example.jpapractice.repository.BankAccountRepository;
import com.example.jpapractice.repository.BillingDetailsRepository;
import com.example.jpapractice.repository.CreditCardRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringDataConfiguration.class})
public class MappingJoinTest {
    @Autowired
    BillingDetailsRepository billingDetailsRepository;
    @Autowired
    CreditCardRepository creditCardRepository;
    @Autowired
    BankAccountRepository bankAccountRepository;
    @Test
    void stored(){
        billingDetailsRepository.findAll();
        creditCardRepository.findAll();
        bankAccountRepository.findAll();
    }
}
