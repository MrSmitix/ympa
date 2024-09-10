package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.GetBusinessBuyerInfoResponse;
import com.prokarma.pkmst.model.GetBusinessDocumentsInfoResponse;

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
public class OrderBusinessInformationApiController implements OrderBusinessInformationApi {
    private final ObjectMapper objectMapper;
@Autowired
    public OrderBusinessInformationApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<GetBusinessBuyerInfoResponse> getOrderBusinessBuyerInfo(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessBuyerInfoResponse>(objectMapper.readValue("", GetBusinessBuyerInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessBuyerInfoResponse>(objectMapper.readValue("", GetBusinessBuyerInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessBuyerInfoResponse>(objectMapper.readValue("", GetBusinessBuyerInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessBuyerInfoResponse>(objectMapper.readValue("", GetBusinessBuyerInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessBuyerInfoResponse>(objectMapper.readValue("", GetBusinessBuyerInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessBuyerInfoResponse>(objectMapper.readValue("", GetBusinessBuyerInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessBuyerInfoResponse>(objectMapper.readValue("", GetBusinessBuyerInfoResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetBusinessBuyerInfoResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetBusinessDocumentsInfoResponse> getOrderBusinessDocumentsInfo(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessDocumentsInfoResponse>(objectMapper.readValue("", GetBusinessDocumentsInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessDocumentsInfoResponse>(objectMapper.readValue("", GetBusinessDocumentsInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessDocumentsInfoResponse>(objectMapper.readValue("", GetBusinessDocumentsInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessDocumentsInfoResponse>(objectMapper.readValue("", GetBusinessDocumentsInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessDocumentsInfoResponse>(objectMapper.readValue("", GetBusinessDocumentsInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessDocumentsInfoResponse>(objectMapper.readValue("", GetBusinessDocumentsInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetBusinessDocumentsInfoResponse>(objectMapper.readValue("", GetBusinessDocumentsInfoResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetBusinessDocumentsInfoResponse>(HttpStatus.OK);
    }

}
