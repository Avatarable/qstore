package com.interswitch.qstoreecrservice.controller;

import com.interswitch.qstoreecrservice.MerchantRepo;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StoreController {
    private final MerchantRepo merchantRepo;

    @GetMapping(value = "/merchants")
    public ResponseEntity<?> merchant(){
        return ResponseEntity.status(HttpStatus.CREATED).body(merchantRepo.findAll());
    }
}
