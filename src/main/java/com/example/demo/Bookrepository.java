package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;

public interface Bookrepository extends JpaRepository<book,Integer> {
}