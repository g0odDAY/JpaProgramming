package com.example.jpapractice.converter;

import com.example.jpapractice.model.zipcode.GermanZipcode;
import com.example.jpapractice.model.zipcode.SwissZipcode;
import com.example.jpapractice.model.zipcode.Zipcode;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter
public class ZipcodeConverter implements AttributeConverter<Zipcode,String> {
    @Override
    public String convertToDatabaseColumn(Zipcode attribute) {
        return attribute.getValue();
    }

    @Override
    public Zipcode convertToEntityAttribute(String dbData) {
        if(dbData.length() == 5){
            return new GermanZipcode(dbData);
        }else if(dbData.length() == 4){
            return new SwissZipcode(dbData);
        }else{
            throw new IllegalArgumentException("Unsupported zipcode in database:"+dbData);
        }
    }
}
