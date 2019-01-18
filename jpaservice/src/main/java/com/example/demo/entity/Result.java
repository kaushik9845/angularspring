package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;

	private int var1;
	private int var2;
	private int var3;
	private int test1;
	private Date createdDate;

	public int getVar1() {
		return var1;
	}

	public void setVar1(int var1) {
		this.var1 = var1;
	}

	public int getVar2() {
		return var2;
	}

	public void setVar2(int var2) {
		this.var2 = var2;
	}

	public int getVar3() {
		return var3;
	}

	public void setVar3(int var3) {
		this.var3 = var3;
	}

	public int getTest1() {
		return test1;
	}

	public void setTest1(int i) {
		this.test1 = i;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}
