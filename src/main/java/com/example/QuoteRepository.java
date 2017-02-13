package com.example;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

/**
 * Created by jennifer on 2/13/17.
 */
@RepositoryRestResource
public interface QuoteRepository extends CrudRepository<Quote, Long> {
    @Query("select q from Quote q order by rand()")
    List<Quote> getQuotesRandomOrder();
}
