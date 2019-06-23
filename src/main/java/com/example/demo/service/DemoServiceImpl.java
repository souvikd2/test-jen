package com.example.demo.service;

import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl implements DemoService {

	@Override
	public int addTwoNumber(int a, int b) {
		return a+b;
	}

	@Override
	public int devideNumber(int a, int b) {
		return a/b;
	}

}
