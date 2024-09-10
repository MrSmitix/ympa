package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.GetFulfillmentWarehousesResponse;
import com.prokarma.pkmst.model.GetWarehousesResponse;

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
public class WarehousesApiController implements WarehousesApi {
    private final ObjectMapper objectMapper;
@Autowired
    public WarehousesApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<GetFulfillmentWarehousesResponse> getFulfillmentWarehouses(@RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFulfillmentWarehousesResponse>(objectMapper.readValue("", GetFulfillmentWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFulfillmentWarehousesResponse>(objectMapper.readValue("", GetFulfillmentWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFulfillmentWarehousesResponse>(objectMapper.readValue("", GetFulfillmentWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFulfillmentWarehousesResponse>(objectMapper.readValue("", GetFulfillmentWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFulfillmentWarehousesResponse>(objectMapper.readValue("", GetFulfillmentWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFulfillmentWarehousesResponse>(objectMapper.readValue("", GetFulfillmentWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFulfillmentWarehousesResponse>(objectMapper.readValue("", GetFulfillmentWarehousesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetFulfillmentWarehousesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetWarehousesResponse> getWarehouses(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetWarehousesResponse>(objectMapper.readValue("", GetWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetWarehousesResponse>(objectMapper.readValue("", GetWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetWarehousesResponse>(objectMapper.readValue("", GetWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetWarehousesResponse>(objectMapper.readValue("", GetWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetWarehousesResponse>(objectMapper.readValue("", GetWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetWarehousesResponse>(objectMapper.readValue("", GetWarehousesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetWarehousesResponse>(objectMapper.readValue("", GetWarehousesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetWarehousesResponse>(HttpStatus.OK);
    }

}
