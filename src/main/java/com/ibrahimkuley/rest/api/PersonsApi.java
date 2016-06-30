package com.ibrahimkuley.rest.api;

import com.ibrahimkuley.rest.model.Person;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

import static org.springframework.http.MediaType.*;

@Controller
@RequestMapping(value = "/persons", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/persons", description = "the persons API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-30T12:23:25.609Z")
public class PersonsApi {

  @ApiOperation(value = "List Person", notes = "", response = Person.class, responseContainer = "List")
  @ApiResponses(value = { 
    @ApiResponse(code = 200, message = "", response = Person.class) })
  @RequestMapping(value = "",
    produces = { "application/json" }, 
    
    method = RequestMethod.GET)
  public ResponseEntity<List<Person>> gETPersons()
      throws NotFoundException {
      // do some magic!
      return new ResponseEntity<List<Person>>(HttpStatus.OK);
  }

}
