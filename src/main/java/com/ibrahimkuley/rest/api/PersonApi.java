package com.ibrahimkuley.rest.api;

import com.ibrahimkuley.rest.model.Person;

import com.ibrahimkuley.service.PersonService;
import io.swagger.annotations.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.math.BigDecimal;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/person", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/person", description = "the person API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-30T09:34:50.658Z")
public class PersonApi {

    @Autowired
    PersonService personService;

    @ApiOperation(value = "Delete Person", notes = "", response = Object.class)
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "", response = Object.class)})
    @RequestMapping(value = "/{personId}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.DELETE)
    public ResponseEntity<Object> dELETEPersonPersonId(
            @ApiParam(value = "", required = true) @PathVariable("personId") String personId

            ,


            @ApiParam(value = "") @RequestBody Person body
    )
            throws NotFoundException {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get Person", notes = "", response = Person.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = Person.class)})
    @RequestMapping(value = "/{personId}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.GET)
    public ResponseEntity<Person> gETPersonPersonId(
            @ApiParam(value = "", required = true) @PathVariable("personId") String personId

    )
            throws NotFoundException {
        // do some magic!
        Person person = personService.get(personId);
        return new ResponseEntity<Person>(person, HttpStatus.OK);
    }


    @ApiOperation(value = "Create Person", notes = "", response = Person.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "", response = Person.class),
            @ApiResponse(code = 403, message = "", response = Person.class)})
    @RequestMapping(value = "",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    public ResponseEntity<Person> pOSTPerson(

            @ApiParam(value = "") @RequestBody Person body
    )
            throws NotFoundException {
        // do some magic!
        return new ResponseEntity<Person>(HttpStatus.OK);
    }


    @ApiOperation(value = "Update Todo", notes = "", response = Person.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = Person.class),
            @ApiResponse(code = 403, message = "", response = Person.class)})
    @RequestMapping(value = "/{personId}",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    public ResponseEntity<Person> pUTPersonPersonId(
            @ApiParam(value = "", required = true) @PathVariable("personId") String personId

            ,


            @ApiParam(value = "") @RequestBody Person body
    )
            throws NotFoundException {
        // do some magic!
        return new ResponseEntity<Person>(HttpStatus.OK);
    }

}
