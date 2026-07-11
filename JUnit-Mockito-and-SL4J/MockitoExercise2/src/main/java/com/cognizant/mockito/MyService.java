package com.cognizant.mockito;

public class MyService {

    private ExternalApi externalApi;

    public MyService(ExternalApi externalApi) {
        this.externalApi = externalApi;
    }

    public void processData(String data) {
        externalApi.sendData(data);
    }
}