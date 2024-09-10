package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AddOffersToArchiveRequest;
import com.prokarma.pkmst.model.AddOffersToArchiveResponse;
import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiLockedErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.DeleteOffersFromArchiveRequest;
import com.prokarma.pkmst.model.DeleteOffersFromArchiveResponse;
import com.prokarma.pkmst.model.DeleteOffersRequest;
import com.prokarma.pkmst.model.DeleteOffersResponse;
import com.prokarma.pkmst.model.GetOfferMappingsRequest;
import com.prokarma.pkmst.model.GetOfferMappingsResponse;
import com.prokarma.pkmst.model.GetSuggestedOfferMappingsRequest;
import com.prokarma.pkmst.model.GetSuggestedOfferMappingsResponse;
import com.prokarma.pkmst.model.UpdateOfferMappingsRequest;
import com.prokarma.pkmst.model.UpdateOfferMappingsResponse;

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
public class BusinessOfferMappingsApiController implements BusinessOfferMappingsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public BusinessOfferMappingsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<AddOffersToArchiveResponse> addOffersToArchive(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody AddOffersToArchiveRequest addOffersToArchiveRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AddOffersToArchiveResponse>(objectMapper.readValue("", AddOffersToArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AddOffersToArchiveResponse>(objectMapper.readValue("", AddOffersToArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AddOffersToArchiveResponse>(objectMapper.readValue("", AddOffersToArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AddOffersToArchiveResponse>(objectMapper.readValue("", AddOffersToArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AddOffersToArchiveResponse>(objectMapper.readValue("", AddOffersToArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AddOffersToArchiveResponse>(objectMapper.readValue("", AddOffersToArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AddOffersToArchiveResponse>(objectMapper.readValue("", AddOffersToArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<AddOffersToArchiveResponse>(objectMapper.readValue("", AddOffersToArchiveResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<AddOffersToArchiveResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteOffersResponse> deleteOffers(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody DeleteOffersRequest deleteOffersRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersResponse>(objectMapper.readValue("", DeleteOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersResponse>(objectMapper.readValue("", DeleteOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersResponse>(objectMapper.readValue("", DeleteOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersResponse>(objectMapper.readValue("", DeleteOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersResponse>(objectMapper.readValue("", DeleteOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersResponse>(objectMapper.readValue("", DeleteOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersResponse>(objectMapper.readValue("", DeleteOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersResponse>(objectMapper.readValue("", DeleteOffersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteOffersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<DeleteOffersFromArchiveResponse> deleteOffersFromArchive(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody DeleteOffersFromArchiveRequest deleteOffersFromArchiveRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersFromArchiveResponse>(objectMapper.readValue("", DeleteOffersFromArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersFromArchiveResponse>(objectMapper.readValue("", DeleteOffersFromArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersFromArchiveResponse>(objectMapper.readValue("", DeleteOffersFromArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersFromArchiveResponse>(objectMapper.readValue("", DeleteOffersFromArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersFromArchiveResponse>(objectMapper.readValue("", DeleteOffersFromArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersFromArchiveResponse>(objectMapper.readValue("", DeleteOffersFromArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersFromArchiveResponse>(objectMapper.readValue("", DeleteOffersFromArchiveResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteOffersFromArchiveResponse>(objectMapper.readValue("", DeleteOffersFromArchiveResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteOffersFromArchiveResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetOfferMappingsResponse> getOfferMappings(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = ""  )   @RequestBody GetOfferMappingsRequest getOfferMappingsRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingsResponse>(objectMapper.readValue("", GetOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingsResponse>(objectMapper.readValue("", GetOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingsResponse>(objectMapper.readValue("", GetOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingsResponse>(objectMapper.readValue("", GetOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingsResponse>(objectMapper.readValue("", GetOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingsResponse>(objectMapper.readValue("", GetOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingsResponse>(objectMapper.readValue("", GetOfferMappingsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetOfferMappingsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetSuggestedOfferMappingsResponse> getSuggestedOfferMappings(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = ""  )   @RequestBody GetSuggestedOfferMappingsRequest getSuggestedOfferMappingsRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingsResponse>(objectMapper.readValue("", GetSuggestedOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingsResponse>(objectMapper.readValue("", GetSuggestedOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingsResponse>(objectMapper.readValue("", GetSuggestedOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingsResponse>(objectMapper.readValue("", GetSuggestedOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingsResponse>(objectMapper.readValue("", GetSuggestedOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingsResponse>(objectMapper.readValue("", GetSuggestedOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingsResponse>(objectMapper.readValue("", GetSuggestedOfferMappingsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetSuggestedOfferMappingsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UpdateOfferMappingsResponse> updateOfferMappings(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateOfferMappingsRequest updateOfferMappingsRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferMappingsResponse>(objectMapper.readValue("", UpdateOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferMappingsResponse>(objectMapper.readValue("", UpdateOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferMappingsResponse>(objectMapper.readValue("", UpdateOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferMappingsResponse>(objectMapper.readValue("", UpdateOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferMappingsResponse>(objectMapper.readValue("", UpdateOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferMappingsResponse>(objectMapper.readValue("", UpdateOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferMappingsResponse>(objectMapper.readValue("", UpdateOfferMappingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferMappingsResponse>(objectMapper.readValue("", UpdateOfferMappingsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdateOfferMappingsResponse>(HttpStatus.OK);
    }

}
