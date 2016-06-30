package com.ibrahimkuley.service;

import com.ibrahimkuley.rest.model.Profile;
import org.springframework.stereotype.Service;

/**
 * Created by hikuley on 30.06.2016.
 */
@Service
public class ProfileService {

    public Profile getProfile() {
        Profile profile = new Profile();
        profile.setFirstName("Halil Ibrahim");
        profile.setLastName("Kuley");
        profile.setPromoCode("135");
        profile.setEmail("ssoulless25@gmail.com");
        profile.setPicture("profile_image.jpeg.");
        return profile;
    }

}
