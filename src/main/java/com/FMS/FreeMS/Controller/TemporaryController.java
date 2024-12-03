package com.FMS.FreeMS.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TemporaryController {

    @GetMapping("/test")
    public ResponseEntity<?> liveCheck() {
        return new ResponseEntity<>(HttpStatus.OK);
    }
}