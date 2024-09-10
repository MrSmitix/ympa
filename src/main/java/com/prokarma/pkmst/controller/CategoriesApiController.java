package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.GetCategoriesMaxSaleQuantumRequest;
import com.prokarma.pkmst.model.GetCategoriesMaxSaleQuantumResponse;
import com.prokarma.pkmst.model.GetCategoriesRequest;
import com.prokarma.pkmst.model.GetCategoriesResponse;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
/**
 * Api implementation
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Controller
public class CategoriesApiController implements CategoriesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CategoriesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<GetCategoriesMaxSaleQuantumResponse> getCategoriesMaxSaleQuantum(@ApiParam(value = "" ,required=true )   @RequestBody GetCategoriesMaxSaleQuantumRequest getCategoriesMaxSaleQuantumRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesMaxSaleQuantumResponse>(objectMapper.readValue("", GetCategoriesMaxSaleQuantumResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesMaxSaleQuantumResponse>(objectMapper.readValue("", GetCategoriesMaxSaleQuantumResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesMaxSaleQuantumResponse>(objectMapper.readValue("", GetCategoriesMaxSaleQuantumResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesMaxSaleQuantumResponse>(objectMapper.readValue("", GetCategoriesMaxSaleQuantumResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesMaxSaleQuantumResponse>(objectMapper.readValue("", GetCategoriesMaxSaleQuantumResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesMaxSaleQuantumResponse>(objectMapper.readValue("", GetCategoriesMaxSaleQuantumResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesMaxSaleQuantumResponse>(objectMapper.readValue("", GetCategoriesMaxSaleQuantumResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetCategoriesMaxSaleQuantumResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCategoriesResponse> getCategoriesTree(@ApiParam(value = ""  )   @RequestBody GetCategoriesRequest getCategoriesRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesResponse>(objectMapper.readValue("", GetCategoriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesResponse>(objectMapper.readValue("", GetCategoriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesResponse>(objectMapper.readValue("", GetCategoriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesResponse>(objectMapper.readValue("", GetCategoriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesResponse>(objectMapper.readValue("", GetCategoriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesResponse>(objectMapper.readValue("", GetCategoriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoriesResponse>(objectMapper.readValue("", GetCategoriesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetCategoriesResponse>(HttpStatus.OK);
    }

}
