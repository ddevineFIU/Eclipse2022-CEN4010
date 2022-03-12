package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.security.PublicKey;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Service
public class BookService {

    @Autowired
    private Bookrepository repository;



    public List<book> findAll() {
        return repository.findAll();
    }


    public List<book> findProductsWithSorting(String field){
        return  repository.findAll(Sort.by(Sort.Direction.ASC,field));
    }


    public Page<book> findProductsWithPagination(int offset,int pageSize){
        Page<book> products = repository.findAll(PageRequest.of(offset, pageSize));
        return  products;
    }

    public Page<book> findProductsWithPaginationAndSorting(int offset,int pageSize,String field){
        Page<book> products = repository.findAll(PageRequest.of(offset, pageSize).withSort(Sort.by(field)));
        return  products;
    }

}