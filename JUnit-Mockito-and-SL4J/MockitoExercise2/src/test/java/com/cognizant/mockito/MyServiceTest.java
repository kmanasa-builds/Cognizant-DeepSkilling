package com.cognizant.mockito;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    public void testVerifyInteraction() {

        // Create mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Create service with mock
        MyService service = new MyService(mockApi);

        // Call the method
        service.processData("Hello Mockito");

        // Verify interaction
        verify(mockApi).sendData("Hello Mockito");
    }
}