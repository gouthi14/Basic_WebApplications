package com.web.service;

@javax.jws.WebService(targetNamespace = "http://service.web.com/", serviceName = "HelloWorldService", portName = "HelloWorldPort")
public class HelloWorldDelegate {

	com.web.service.HelloWorld helloWorld = new com.web.service.HelloWorld();

	public float addValue(float value) {
		return helloWorld.addValue(value);
	}

	public float subtractValue(float value) {
		return helloWorld.subtractValue(value);
	}

}