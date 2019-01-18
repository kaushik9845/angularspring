package com.example.demo.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.demo.entity.Result;

public interface ResultRepository extends PagingAndSortingRepository<Result, Integer>  {

	 
}
