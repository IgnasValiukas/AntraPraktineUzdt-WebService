package com.example.demo;

import com.example.demo.wsdl.GetLegoRequest;
import com.example.demo.wsdl.GetLegoResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.ws.soap.client.core.SoapActionCallback;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;

public class LegoClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(LegoClient.class);

    public GetLegoResponse getLego(String lego) {

        GetLegoRequest request = new GetLegoRequest();
        request.setName(lego);

        log.info("Requesting location for " + lego);

        GetLegoResponse response = (GetLegoResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://localhost:8080/ws/legos", request,
                        new SoapActionCallback(
                                "http://example.com/legos/GetLegoRequest"));

        return response;
    }
}
