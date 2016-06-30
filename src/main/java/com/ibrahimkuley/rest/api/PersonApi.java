package com.ibrahimkuley.rest.api;

import com.ibrahimkuley.rest.model.PersonDto;
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

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "/person", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/person", description = "the person API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-30T12:45:00.864Z")
public class PersonApi {

    @Autowired
    PersonService personService;

    @ApiOperation(value = "Delete Person", notes = "", response = Object.class)
    @ApiResponses(value = {
            @ApiResponse(code = 204, message = "", response = Object.class)})
    @RequestMapping(value = "",
            produces = {"application/json"},

            method = RequestMethod.DELETE)
    public ResponseEntity<Object> dELETEPerson()
            throws NotFoundException {
        // do some magic!
        return new ResponseEntity<Object>(HttpStatus.OK);
    }


    @ApiOperation(value = "List Person", notes = "", response = PersonDto.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = PersonDto.class)})
    @RequestMapping(value = "/all",
            produces = {"application/json"},

            method = RequestMethod.GET)
    public ResponseEntity<List<PersonDto>> gETPersonAll()
            throws NotFoundException {
        // do some magic!
        return new ResponseEntity<List<PersonDto>>(HttpStatus.OK);
    }


    @ApiOperation(value = "Get Person", notes = "", response = PersonDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = PersonDto.class)})
    @RequestMapping(value = "/{id}",
            produces = {"application/json"},

            method = RequestMethod.GET)
    public ResponseEntity<PersonDto> gETPersonId(
            @ApiParam(value = "", required = true) @PathVariable("id") Integer id

    )
            throws NotFoundException {
        PersonDto personDto = personService.get(id);
        return new ResponseEntity<PersonDto>(personDto, HttpStatus.OK);
    }


    @ApiOperation(value = "Create Person", notes = "", response = PersonDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 201, message = "", response = PersonDto.class),
            @ApiResponse(code = 403, message = "", response = PersonDto.class)})
    @RequestMapping(value = "",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.POST)
    public ResponseEntity<PersonDto> pOSTPerson(

            @ApiParam(value = "") @RequestBody PersonDto body
    )
            throws NotFoundException {
        // do some magic!
        return new ResponseEntity<PersonDto>(HttpStatus.OK);
    }


    @ApiOperation(value = "Update Person", notes = "", response = PersonDto.class)
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "", response = PersonDto.class)})
    @RequestMapping(value = "",
            produces = {"application/json"},
            consumes = {"application/json"},
            method = RequestMethod.PUT)
    public ResponseEntity<PersonDto> pUTPerson(

            @ApiParam(value = "") @RequestBody PersonDto body
    )
            throws NotFoundException {
        // do some magic!
        return new ResponseEntity<PersonDto>(HttpStatus.OK);
    }

}
