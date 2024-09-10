package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.DeleteGoodsFeedbackCommentRequest;
import com.prokarma.pkmst.model.EmptyApiResponse;
import com.prokarma.pkmst.model.GetGoodsFeedbackCommentsRequest;
import com.prokarma.pkmst.model.GetGoodsFeedbackCommentsResponse;
import com.prokarma.pkmst.model.GetGoodsFeedbackRequest;
import com.prokarma.pkmst.model.GetGoodsFeedbackResponse;
import com.prokarma.pkmst.model.SkipGoodsFeedbackReactionRequest;
import com.prokarma.pkmst.model.UpdateGoodsFeedbackCommentRequest;
import com.prokarma.pkmst.model.UpdateGoodsFeedbackCommentResponse;

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
public class GoodsFeedbackApiController implements GoodsFeedbackApi {
    private final ObjectMapper objectMapper;
@Autowired
    public GoodsFeedbackApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<EmptyApiResponse> deleteGoodsFeedbackComment(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody DeleteGoodsFeedbackCommentRequest deleteGoodsFeedbackCommentRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<EmptyApiResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetGoodsFeedbackCommentsResponse> getGoodsFeedbackComments(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody GetGoodsFeedbackCommentsRequest getGoodsFeedbackCommentsRequest,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackCommentsResponse>(objectMapper.readValue("", GetGoodsFeedbackCommentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackCommentsResponse>(objectMapper.readValue("", GetGoodsFeedbackCommentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackCommentsResponse>(objectMapper.readValue("", GetGoodsFeedbackCommentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackCommentsResponse>(objectMapper.readValue("", GetGoodsFeedbackCommentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackCommentsResponse>(objectMapper.readValue("", GetGoodsFeedbackCommentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackCommentsResponse>(objectMapper.readValue("", GetGoodsFeedbackCommentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackCommentsResponse>(objectMapper.readValue("", GetGoodsFeedbackCommentsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetGoodsFeedbackCommentsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetGoodsFeedbackResponse> getGoodsFeedbacks(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = ""  )   @RequestBody GetGoodsFeedbackRequest getGoodsFeedbackRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackResponse>(objectMapper.readValue("", GetGoodsFeedbackResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackResponse>(objectMapper.readValue("", GetGoodsFeedbackResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackResponse>(objectMapper.readValue("", GetGoodsFeedbackResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackResponse>(objectMapper.readValue("", GetGoodsFeedbackResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackResponse>(objectMapper.readValue("", GetGoodsFeedbackResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackResponse>(objectMapper.readValue("", GetGoodsFeedbackResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetGoodsFeedbackResponse>(objectMapper.readValue("", GetGoodsFeedbackResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetGoodsFeedbackResponse>(HttpStatus.OK);
    }

    public ResponseEntity<EmptyApiResponse> skipGoodsFeedbacksReaction(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody SkipGoodsFeedbackReactionRequest skipGoodsFeedbackReactionRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<EmptyApiResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UpdateGoodsFeedbackCommentResponse> updateGoodsFeedbackComment(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateGoodsFeedbackCommentRequest updateGoodsFeedbackCommentRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateGoodsFeedbackCommentResponse>(objectMapper.readValue("", UpdateGoodsFeedbackCommentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateGoodsFeedbackCommentResponse>(objectMapper.readValue("", UpdateGoodsFeedbackCommentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateGoodsFeedbackCommentResponse>(objectMapper.readValue("", UpdateGoodsFeedbackCommentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateGoodsFeedbackCommentResponse>(objectMapper.readValue("", UpdateGoodsFeedbackCommentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateGoodsFeedbackCommentResponse>(objectMapper.readValue("", UpdateGoodsFeedbackCommentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateGoodsFeedbackCommentResponse>(objectMapper.readValue("", UpdateGoodsFeedbackCommentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateGoodsFeedbackCommentResponse>(objectMapper.readValue("", UpdateGoodsFeedbackCommentResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdateGoodsFeedbackCommentResponse>(HttpStatus.OK);
    }

}
