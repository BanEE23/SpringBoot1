package com.demo.admin.repository;

import com.demo.admin.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MyRepo extends JpaRepository<Contact,Integer>{
    @Query(value = "select * from contact",nativeQuery = true)
    public List<Contact> findDetials();
}
