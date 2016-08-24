package com.mickyli.util.rpc.framework.provider;

import com.mickyli.util.rpc.framework.RpcFramework;
import com.mickyli.util.rpc.framework.service.HelloService;
import com.mickyli.util.rpc.framework.service.impl.HelloServiceImpl;

public class RpcProvicer {
	public static void main(String[] args) throws Exception {
		HelloService service = new HelloServiceImpl();
		RpcFramework.export(service, 1234);
	}
}
