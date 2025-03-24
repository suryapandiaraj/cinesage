package com.cinesage.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cinesage.model.Celebrity;
import com.cinesage.repository.CelebrityRepository;

@Service
public class CelebrityService {

    private CelebrityRepository celebrityRepository;

    public String addCelebrity(Celebrity celebrity) {
        celebrityRepository.save(celebrity);
        return "Celebrity saved!";
    }

    public Celebrity getCelebrity(Long celebrityId) {
        // return celebrityRepository.findById(celebrityId).get();
        Optional<Celebrity> celebrity = celebrityRepository.findById(celebrityId);
        return celebrity.get();
    }

}
