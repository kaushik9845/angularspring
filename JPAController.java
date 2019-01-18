package com.example.demo.controller;

import java.net.Authenticator.RequestorType;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Result;
import com.example.demo.repository.ResultRepository;

@RestController
public class JPAController {

    @Autowired
    ResultRepository resultrepository;

    @RequestMapping(method=RequestMethod.POST,value="jpaservice")
    public Iterable<Result> inputservice(@RequestBody Result result) {
       
    	result.setTest1(/*result.getVar1()+result.getVar2()+result.getVar3()+","+
    			(result.getVar1()-result.getVar2()-result.getVar3())+","+*/
    			2*result.getVar1()*result.getVar2()*result.getVar3());
    	result.setCreatedDate(new Date());
    	resultrepository.save(result);
    	return resultrepository.findAll(new Sort(Sort.Direction.DESC, "id"));
    		}
}