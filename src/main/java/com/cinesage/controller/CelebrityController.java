package com.cinesage.controller;

import com.cinesage.model.Celebrity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cinesage.service.CelebrityService;

@RestController
@RequestMapping("/celebrity")
public class CelebrityController {

    @Autowired
    private CelebrityService celebrityService;

    public CelebrityController(CelebrityService celebrityService){
        this.celebrityService = celebrityService;
    }

    @PostMapping("/save")
    public String addCelebrity(@RequestBody Celebrity celebrity) {
        return celebrityService.addCelebrity(celebrity);
    }

    @GetMapping("/getCelebrity/{celebrityId}")
    public Celebrity getCelebrity(@PathVariable Long celebrityId) {
        return celebrityService.getCelebrity(celebrityId);
    }

}
