package com.RandomString.RandomString.Controllers;

import org.springframework.stereotype.Service;

@Service
public class JkServiceImpl implements com.RandomString.RandomString.Controllers.JkService {

    public JkServiceImpl() {
    }

    @Override
    public String getJokes() {
        return new com.RandomString.RandomString.Controllers.Jks().getRandomJokes();
    }
}
