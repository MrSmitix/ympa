package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiLockedErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.EmptyApiResponse;
import com.prokarma.pkmst.model.FeedIndexLogsStatusType;
import com.prokarma.pkmst.model.GetFeedIndexLogsResponse;
import com.prokarma.pkmst.model.GetFeedResponse;
import com.prokarma.pkmst.model.GetFeedsResponse;
import java.time.OffsetDateTime;
import com.prokarma.pkmst.model.SetFeedParamsRequest;

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
public class FeedsApiController implements FeedsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public FeedsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<GetFeedResponse> getFeed(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор прайс-листа.",required=true ) @PathVariable("feedId") Long feedId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedResponse>(objectMapper.readValue("", GetFeedResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedResponse>(objectMapper.readValue("", GetFeedResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedResponse>(objectMapper.readValue("", GetFeedResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedResponse>(objectMapper.readValue("", GetFeedResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedResponse>(objectMapper.readValue("", GetFeedResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedResponse>(objectMapper.readValue("", GetFeedResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedResponse>(objectMapper.readValue("", GetFeedResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetFeedResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetFeedIndexLogsResponse> getFeedIndexLogs(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор прайс-листа.",required=true ) @PathVariable("feedId") Long feedId,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @ApiParam(value = "Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Значение по умолчанию: последние восемь дней со времени отправки запроса. ")  @RequestParam(value = "published_time_from", required = false) OffsetDateTime publishedTimeFrom,
        @ApiParam(value = "Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-31T00:42:42+03:00`.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра `published_time_to`. Значение параметра не должно быть датой из будущего.  {% endnote %} ")  @RequestParam(value = "published_time_to", required = false) OffsetDateTime publishedTimeTo,
        @ApiParam(value = "Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. ", allowableValues = "ERROR, OK, WARNING")  @RequestParam(value = "status", required = false) FeedIndexLogsStatusType status,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedIndexLogsResponse>(objectMapper.readValue("", GetFeedIndexLogsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedIndexLogsResponse>(objectMapper.readValue("", GetFeedIndexLogsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedIndexLogsResponse>(objectMapper.readValue("", GetFeedIndexLogsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedIndexLogsResponse>(objectMapper.readValue("", GetFeedIndexLogsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedIndexLogsResponse>(objectMapper.readValue("", GetFeedIndexLogsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedIndexLogsResponse>(objectMapper.readValue("", GetFeedIndexLogsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedIndexLogsResponse>(objectMapper.readValue("", GetFeedIndexLogsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetFeedIndexLogsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetFeedsResponse> getFeeds(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedsResponse>(objectMapper.readValue("", GetFeedsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedsResponse>(objectMapper.readValue("", GetFeedsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedsResponse>(objectMapper.readValue("", GetFeedsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedsResponse>(objectMapper.readValue("", GetFeedsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedsResponse>(objectMapper.readValue("", GetFeedsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedsResponse>(objectMapper.readValue("", GetFeedsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetFeedsResponse>(objectMapper.readValue("", GetFeedsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetFeedsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<EmptyApiResponse> refreshFeed(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор прайс-листа.",required=true ) @PathVariable("feedId") Long feedId,
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

    public ResponseEntity<EmptyApiResponse> setFeedParams(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор прайс-листа.",required=true ) @PathVariable("feedId") Long feedId,
        @ApiParam(value = "" ,required=true )   @RequestBody SetFeedParamsRequest setFeedParamsRequest,
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


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<EmptyApiResponse>(objectMapper.readValue("", EmptyApiResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<EmptyApiResponse>(HttpStatus.OK);
    }

}
