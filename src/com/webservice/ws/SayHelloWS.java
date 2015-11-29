package com.webservice.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

@WebService
public interface SayHelloWS {

@WebMethod
public String sayHello();

@WebMethod(operationName="yinrongSayHello")
public String sayHello2SomeOne(@WebParam(name="onename") String name  );


@WebMethod
public Student getStudentById(String id);
}
