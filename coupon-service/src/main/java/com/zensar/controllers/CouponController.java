package com.zensar.controllers;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Data
@NoArgsConstructor
public class CouponController {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int couponId;
	private String couponCode;
	private Double discount;
	private String expDate;
	
}