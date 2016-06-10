package com.aa.bb.service.spi;

import com.aa.bb.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public void sayHello() {
		System.out.println("hello world!");
	}

}
