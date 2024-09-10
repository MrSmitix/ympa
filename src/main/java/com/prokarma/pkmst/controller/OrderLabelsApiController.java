package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import java.io.File;
import com.prokarma.pkmst.model.GetOrderLabelsDataResponse;
import com.prokarma.pkmst.model.PageFormatType;

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
public class OrderLabelsApiController implements OrderLabelsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public OrderLabelsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<File> generateOrderLabel(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @ApiParam(value = "Идентификатор грузоместа.",required=true ) @PathVariable("shipmentId") Long shipmentId,
        @ApiParam(value = "Идентификатор коробки.",required=true ) @PathVariable("boxId") Long boxId,
        @ApiParam(value = "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.", allowableValues = "A7, A4")  @RequestParam(value = "format", required = false) PageFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }

        return new ResponseEntity<File>(HttpStatus.OK);
    }

    public ResponseEntity<File> generateOrderLabels(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @ApiParam(value = "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.", allowableValues = "A7, A4")  @RequestParam(value = "format", required = false) PageFormatType format,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<File>(objectMapper.readValue("", File.class), HttpStatus.OK);
        }

        return new ResponseEntity<File>(HttpStatus.OK);
    }

    public ResponseEntity<GetOrderLabelsDataResponse> getOrderLabelsData(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderLabelsDataResponse>(objectMapper.readValue("", GetOrderLabelsDataResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderLabelsDataResponse>(objectMapper.readValue("", GetOrderLabelsDataResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderLabelsDataResponse>(objectMapper.readValue("", GetOrderLabelsDataResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderLabelsDataResponse>(objectMapper.readValue("", GetOrderLabelsDataResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderLabelsDataResponse>(objectMapper.readValue("", GetOrderLabelsDataResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderLabelsDataResponse>(objectMapper.readValue("", GetOrderLabelsDataResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderLabelsDataResponse>(objectMapper.readValue("", GetOrderLabelsDataResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetOrderLabelsDataResponse>(HttpStatus.OK);
    }

}
