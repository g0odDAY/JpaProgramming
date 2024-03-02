package com.example.jpapractice;

import com.example.jpapractice.configuration.SpringDataConfiguration;
import com.example.jpapractice.model.BankAccount;
import com.example.jpapractice.model.BillingDetails;
import com.example.jpapractice.model.CreditCard;
import com.example.jpapractice.model.User;
import com.example.jpapractice.repository.BankAccountRepository;
import com.example.jpapractice.repository.BillingDetailsRepository;
import com.example.jpapractice.repository.CreditCardRepository;
import com.example.jpapractice.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringDataConfiguration.class})
public class MappingJoinTest {
    @Autowired
    UserRepository userRepository;
    @Autowired
    BillingDetailsRepository billingDetailsRepository;
    @Autowired
    CreditCardRepository creditCardRepository;
    @Autowired
    BankAccountRepository bankAccountRepository;
    @Test
    void stored(){
        CreditCard creditCard = new CreditCard(
                "John Smith", "1234123412341234", "06", "2015"
        );
        User john = new User("John Smith");
        creditCard.setUser(john);
        john.addBillingDetail(creditCard);

        userRepository.save(john);
        creditCardRepository.save(creditCard);

        List<User> users = userRepository.findAll();

        List<BillingDetails> billingDetails = billingDetailsRepository.findByOwner(users.get(0).getUsername());

        assertAll(
                () -> assertEquals(1, users.size()),
                () -> assertEquals(1, billingDetails.size())
        );
    }
}
