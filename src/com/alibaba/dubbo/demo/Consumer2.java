package com.alibaba.dubbo.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer2 {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "http://localhost/consumer.xml" });
		context.start();
		DemoService demoService = (DemoService) context.getBean("demoService"); // 获取远程服务代理
		String hello = demoService.sayHello("world"); // 执行远程方法
		System.out.println(hello); // 显示调用结果
		
		UserService userService = (UserService) context.getBean("userService"); // 获取远程服务代理
		
		
		System.out.println(userService.doit("zongxing"));
	}
}
