package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.GetCampaignLoginsResponse;
import com.prokarma.pkmst.model.GetCampaignRegionResponse;
import com.prokarma.pkmst.model.GetCampaignResponse;
import com.prokarma.pkmst.model.GetCampaignSettingsResponse;
import com.prokarma.pkmst.model.GetCampaignsResponse;

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
public class CampaignsApiController implements CampaignsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public CampaignsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<GetCampaignResponse> getCampaign(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignResponse>(objectMapper.readValue("", GetCampaignResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignResponse>(objectMapper.readValue("", GetCampaignResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignResponse>(objectMapper.readValue("", GetCampaignResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignResponse>(objectMapper.readValue("", GetCampaignResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignResponse>(objectMapper.readValue("", GetCampaignResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignResponse>(objectMapper.readValue("", GetCampaignResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignResponse>(objectMapper.readValue("", GetCampaignResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetCampaignResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCampaignLoginsResponse> getCampaignLogins(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignLoginsResponse>(objectMapper.readValue("", GetCampaignLoginsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignLoginsResponse>(objectMapper.readValue("", GetCampaignLoginsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignLoginsResponse>(objectMapper.readValue("", GetCampaignLoginsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignLoginsResponse>(objectMapper.readValue("", GetCampaignLoginsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignLoginsResponse>(objectMapper.readValue("", GetCampaignLoginsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignLoginsResponse>(objectMapper.readValue("", GetCampaignLoginsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignLoginsResponse>(objectMapper.readValue("", GetCampaignLoginsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetCampaignLoginsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCampaignRegionResponse> getCampaignRegion(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignRegionResponse>(objectMapper.readValue("", GetCampaignRegionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignRegionResponse>(objectMapper.readValue("", GetCampaignRegionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignRegionResponse>(objectMapper.readValue("", GetCampaignRegionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignRegionResponse>(objectMapper.readValue("", GetCampaignRegionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignRegionResponse>(objectMapper.readValue("", GetCampaignRegionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignRegionResponse>(objectMapper.readValue("", GetCampaignRegionResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignRegionResponse>(objectMapper.readValue("", GetCampaignRegionResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetCampaignRegionResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCampaignSettingsResponse> getCampaignSettings(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignSettingsResponse>(objectMapper.readValue("", GetCampaignSettingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignSettingsResponse>(objectMapper.readValue("", GetCampaignSettingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignSettingsResponse>(objectMapper.readValue("", GetCampaignSettingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignSettingsResponse>(objectMapper.readValue("", GetCampaignSettingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignSettingsResponse>(objectMapper.readValue("", GetCampaignSettingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignSettingsResponse>(objectMapper.readValue("", GetCampaignSettingsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignSettingsResponse>(objectMapper.readValue("", GetCampaignSettingsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetCampaignSettingsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCampaignsResponse> getCampaigns(@ApiParam(value = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", defaultValue = "1")  @RequestParam(value = "page", required = false, defaultValue="1") Integer page,
        @ApiParam(value = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ")  @RequestParam(value = "pageSize", required = false) Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetCampaignsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCampaignsResponse> getCampaignsByLogin(@ApiParam(value = "Логин пользователя.",required=true ) @PathVariable("login") String login,
        @ApiParam(value = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", defaultValue = "1")  @RequestParam(value = "page", required = false, defaultValue="1") Integer page,
        @ApiParam(value = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ")  @RequestParam(value = "pageSize", required = false) Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignsResponse>(objectMapper.readValue("", GetCampaignsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetCampaignsResponse>(HttpStatus.OK);
    }

}
