package com.limits.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.limits.Configration;
import com.limits.bean.LimitConfigration;

@RestController
public class LimitsConfigrationController {

	@Autowired
	Configration configration;
	@GetMapping("/limits")
	public LimitConfigration retrieveLimitsFromConfigration() {
		return new LimitConfigration(configration.getMaximum(),configration.getMinimum());
	}
}
