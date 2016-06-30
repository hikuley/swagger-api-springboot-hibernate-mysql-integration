package com.ibrahimkuley.rest.api;

import com.ibrahimkuley.service.ProfileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import com.ibrahimkuley.rest.model.Profile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "/me", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/me", description = "the me API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-30T00:00:55.606Z")
public class MeApi {


    @Autowired
    ProfileService profileService;

    @ApiOperation(value = "User Profile", notes = "The User Profile endpoint returns information about the Uber user that has authorized with the application.", response = Profile.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Profile information for a user", response = Profile.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = Profile.class)})
    @RequestMapping(value = "",
            produces = {"application/json"},

            method = RequestMethod.GET)
    public ResponseEntity<Profile> meGet()
            throws NotFoundException {
        // do some magic!
        Profile profile = profileService.getProfile();
        return new ResponseEntity<Profile>(profile, HttpStatus.OK);
    }

}
