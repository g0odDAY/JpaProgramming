package com.example.jpapractice;

import com.example.jpapractice.configuration.SpringDataConfiguration;
import com.example.jpapractice.model.Item;
import com.example.jpapractice.repository.ItemRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {SpringDataConfiguration.class})
public class MappingCollectionsSpringDataJPATest {
    @Autowired
    ItemRepository itemRepository;
    @Test
    void storedLoadEntities(){

    }
}
