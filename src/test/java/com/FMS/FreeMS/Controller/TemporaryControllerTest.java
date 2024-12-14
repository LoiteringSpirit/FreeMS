package com.FMS.FreeMS.Controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;

@ExtendWith(MockitoExtension.class)
public class TemporaryControllerTest {
    @InjectMocks
    TemporaryController tC;

    @Test
    public void testController(){
        ResponseEntity<?> responseEntity = tC.liveCheck();
        Assertions.assertEquals(ResponseEntity.ok(), responseEntity.getStatusCode());
    }
}
