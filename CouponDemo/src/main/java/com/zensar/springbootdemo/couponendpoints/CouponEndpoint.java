package com.zensar.springbootdemo.couponendpoints;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

@Component
@Endpoint(id = "coupon-details")
public class CouponEndpoint {
	private Map<Integer, String> couponDetails = new HashMap<>();

	@PostConstruct
	public void init() {
		couponDetails.put(1, "ShoppingCoupon");
		couponDetails.put(2, "FoodCoupon");
	}

	@ReadOperation
	public Map<Integer, String> getAllCourses() {
		return couponDetails;

	}

	@ReadOperation
	public String getCourseById(@Selector int id) {
		return couponDetails.get(id);

	}

	@WriteOperation
	public void addCourse(@Selector int id, @Selector String course) {
		couponDetails.put(id, course);
	}

	@DeleteOperation
	public void deleteCourse(@Selector int id) {
		couponDetails.remove(id);
	}
}