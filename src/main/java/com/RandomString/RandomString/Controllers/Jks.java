package com.RandomString.RandomString.Controllers;

import java.util.ArrayList;
import java.util.List;

public class Jks {

    List<String> jokes = new ArrayList<>();

    public Jks() {
        for(int i=0;i<100;i++){
            String s = generateRandomString(20);
            jokes.add(s);
        }
    }

    public String generateRandomString(int i) {

        String AlphaNUmericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "0123456789 "+ "abcdefghijklmnopqrstuvwxyz";

        StringBuilder sb = new StringBuilder(i);

        for(int k = 0; k<i ; k++){
            int index = (int)(AlphaNUmericString.length() * Math.random());
            sb.append(AlphaNUmericString.charAt(index));
        }
        return sb.toString();
    }


    public String getRandomJokes(){

        int i = (int)(100 * Math.random());
        return jokes.get(i);

    }
}
