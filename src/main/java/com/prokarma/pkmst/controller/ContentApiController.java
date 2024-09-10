package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiLockedErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.GetCategoryContentParametersResponse;
import com.prokarma.pkmst.model.GetOfferCardsContentStatusRequest;
import com.prokarma.pkmst.model.GetOfferCardsContentStatusResponse;
import com.prokarma.pkmst.model.UpdateOfferContentRequest;
import com.prokarma.pkmst.model.UpdateOfferContentResponse;

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
public class ContentApiController implements ContentApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ContentApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<GetCategoryContentParametersResponse> getCategoryContentParameters(@ApiParam(value = "Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). ",required=true ) @PathVariable("categoryId") Long categoryId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoryContentParametersResponse>(objectMapper.readValue("", GetCategoryContentParametersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoryContentParametersResponse>(objectMapper.readValue("", GetCategoryContentParametersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoryContentParametersResponse>(objectMapper.readValue("", GetCategoryContentParametersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoryContentParametersResponse>(objectMapper.readValue("", GetCategoryContentParametersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoryContentParametersResponse>(objectMapper.readValue("", GetCategoryContentParametersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoryContentParametersResponse>(objectMapper.readValue("", GetCategoryContentParametersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCategoryContentParametersResponse>(objectMapper.readValue("", GetCategoryContentParametersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetCategoryContentParametersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetOfferCardsContentStatusResponse> getOfferCardsContentStatus(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = ""  )   @RequestBody GetOfferCardsContentStatusRequest getOfferCardsContentStatusRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferCardsContentStatusResponse>(objectMapper.readValue("", GetOfferCardsContentStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferCardsContentStatusResponse>(objectMapper.readValue("", GetOfferCardsContentStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferCardsContentStatusResponse>(objectMapper.readValue("", GetOfferCardsContentStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferCardsContentStatusResponse>(objectMapper.readValue("", GetOfferCardsContentStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferCardsContentStatusResponse>(objectMapper.readValue("", GetOfferCardsContentStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferCardsContentStatusResponse>(objectMapper.readValue("", GetOfferCardsContentStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferCardsContentStatusResponse>(objectMapper.readValue("", GetOfferCardsContentStatusResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetOfferCardsContentStatusResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UpdateOfferContentResponse> updateOfferContent(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateOfferContentRequest updateOfferContentRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferContentResponse>(objectMapper.readValue("", UpdateOfferContentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferContentResponse>(objectMapper.readValue("", UpdateOfferContentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferContentResponse>(objectMapper.readValue("", UpdateOfferContentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferContentResponse>(objectMapper.readValue("", UpdateOfferContentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferContentResponse>(objectMapper.readValue("", UpdateOfferContentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferContentResponse>(objectMapper.readValue("", UpdateOfferContentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferContentResponse>(objectMapper.readValue("", UpdateOfferContentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOfferContentResponse>(objectMapper.readValue("", UpdateOfferContentResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdateOfferContentResponse>(HttpStatus.OK);
    }

}
