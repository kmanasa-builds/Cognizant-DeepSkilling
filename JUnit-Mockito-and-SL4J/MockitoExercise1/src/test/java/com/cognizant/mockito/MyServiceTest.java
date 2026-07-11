package com.cognizant.mockito;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MyServiceTest {

    @Test
    void testFetchData() {

        // Create a mock object
        ExternalApi mockApi = mock(ExternalApi.class);

        // Stub the mock
        when(mockApi.getData()).thenReturn("Mock Data");

        // Inject mock into service
        MyService service = new MyService(mockApi);

        // Verify result
        assertEquals("Mock Data", service.fetchData());
    }
}