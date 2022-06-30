package com.ITicket.repository;


import com.ITicket.entity.Concert;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface ConcertRepository extends CrudRepository<Concert,Integer>{
    
}
