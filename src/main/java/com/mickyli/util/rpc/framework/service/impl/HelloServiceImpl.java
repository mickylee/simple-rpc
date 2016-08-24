package com.mickyli.util.rpc.framework.service.impl;

import com.mickyli.util.rpc.framework.service.HelloService;

public class HelloServiceImpl implements HelloService {

	@Override
	public String hello(String name) {
		return "Hello" + name;
	}

}
