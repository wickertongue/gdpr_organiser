package com.clients.organiser.controllers;

import com.clients.organiser.models.ClientRecord;
import com.clients.organiser.repositories.ClientRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/client_records")
public class ClientRecordController {
    @Autowired
    ClientRecordRepository clientRecordRepository;

    @GetMapping
    public List<ClientRecord> getAllClientRecords() {
        return clientRecordRepository.findAll();
    }
}