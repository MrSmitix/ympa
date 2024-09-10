package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.DeletePromoOffersRequest;
import com.prokarma.pkmst.model.DeletePromoOffersResponse;
import com.prokarma.pkmst.model.GetPromoOffersRequest;
import com.prokarma.pkmst.model.GetPromoOffersResponse;
import com.prokarma.pkmst.model.GetPromosRequest;
import com.prokarma.pkmst.model.GetPromosResponse;
import com.prokarma.pkmst.model.UpdatePromoOffersRequest;
import com.prokarma.pkmst.model.UpdatePromoOffersResponse;

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
public class PromosApiController implements PromosApi {
    private final ObjectMapper objectMapper;
@Autowired
    public PromosApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<DeletePromoOffersResponse> deletePromoOffers(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody DeletePromoOffersRequest deletePromoOffersRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePromoOffersResponse>(objectMapper.readValue("", DeletePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePromoOffersResponse>(objectMapper.readValue("", DeletePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePromoOffersResponse>(objectMapper.readValue("", DeletePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePromoOffersResponse>(objectMapper.readValue("", DeletePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePromoOffersResponse>(objectMapper.readValue("", DeletePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePromoOffersResponse>(objectMapper.readValue("", DeletePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeletePromoOffersResponse>(objectMapper.readValue("", DeletePromoOffersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeletePromoOffersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetPromoOffersResponse> getPromoOffers(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody GetPromoOffersRequest getPromoOffersRequest,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromoOffersResponse>(objectMapper.readValue("", GetPromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromoOffersResponse>(objectMapper.readValue("", GetPromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromoOffersResponse>(objectMapper.readValue("", GetPromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromoOffersResponse>(objectMapper.readValue("", GetPromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromoOffersResponse>(objectMapper.readValue("", GetPromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromoOffersResponse>(objectMapper.readValue("", GetPromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromoOffersResponse>(objectMapper.readValue("", GetPromoOffersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetPromoOffersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetPromosResponse> getPromos(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = ""  )   @RequestBody GetPromosRequest getPromosRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromosResponse>(objectMapper.readValue("", GetPromosResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromosResponse>(objectMapper.readValue("", GetPromosResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromosResponse>(objectMapper.readValue("", GetPromosResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromosResponse>(objectMapper.readValue("", GetPromosResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromosResponse>(objectMapper.readValue("", GetPromosResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromosResponse>(objectMapper.readValue("", GetPromosResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetPromosResponse>(objectMapper.readValue("", GetPromosResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetPromosResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UpdatePromoOffersResponse> updatePromoOffers(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdatePromoOffersRequest updatePromoOffersRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePromoOffersResponse>(objectMapper.readValue("", UpdatePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePromoOffersResponse>(objectMapper.readValue("", UpdatePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePromoOffersResponse>(objectMapper.readValue("", UpdatePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePromoOffersResponse>(objectMapper.readValue("", UpdatePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePromoOffersResponse>(objectMapper.readValue("", UpdatePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePromoOffersResponse>(objectMapper.readValue("", UpdatePromoOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdatePromoOffersResponse>(objectMapper.readValue("", UpdatePromoOffersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdatePromoOffersResponse>(HttpStatus.OK);
    }

}
