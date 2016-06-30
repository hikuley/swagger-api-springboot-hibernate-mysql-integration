package io.swagger.api;

import io.swagger.annotations.*;
import io.swagger.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
@RequestMapping(value = "/products", produces = {APPLICATION_JSON_VALUE})
@Api(value = "/products", description = "the products API")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringBootServerCodegen", date = "2016-06-30T00:00:55.606Z")
public class ProductsApi {

    @ApiOperation(value = "Product Types", notes = "The Products endpoint returns information about the *Uber* products offered at a given location. The response includes the display name and other details about each product, and lists the products in the proper display order. ", response = Product.class, responseContainer = "List")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "An array of products", response = Product.class),
            @ApiResponse(code = 200, message = "Unexpected error", response = Product.class)})
    @RequestMapping(value = "",
            produces = {"application/json"},

            method = RequestMethod.GET)
    public ResponseEntity<List<Product>> productsGet(@ApiParam(value = "Latitude component of location.", required = true) @RequestParam(value = "latitude", required = true) Double latitude


            ,
                                                     @ApiParam(value = "Longitude component of location.", required = true) @RequestParam(value = "longitude", required = true) Double longitude


    )
            throws NotFoundException {
        // do some magic!
        return new ResponseEntity<List<Product>>(HttpStatus.OK);
    }

}
