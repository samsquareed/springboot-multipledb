package com.datagrokr.multitenant.repository.secondary;

import com.datagrokr.multitenant.entity.primary.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
