package com.example.flightsapp.flight_reservation_project.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;

public class DateConverter implements Converter<String, LocalDate> {

   
        @Override
        public LocalDate convert(String s) {
            DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            return LocalDate.parse(s, fmt);
        }

        @Override
        public JavaType getInputType(TypeFactory typeFactory) {
            // TODO Auto-generated method stub
            return null;
        }

        @Override
        public JavaType getOutputType(TypeFactory typeFactory) {
            // TODO Auto-generated method stub
            return null;
        }

       
    
    
}
