// DO NOT FUCKING TOUCH 

package com.example.demo.profileMan;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.objects.user;




// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete
@Repository
public interface profileRepository extends JpaRepository<user, Integer> {


	List<user> findByname(String name);
	
}