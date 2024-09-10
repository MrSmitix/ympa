package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiLockedErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.CurrencyType;
import com.prokarma.pkmst.model.DeleteCampaignOffersRequest;
import com.prokarma.pkmst.model.DeleteCampaignOffersResponse;
import com.prokarma.pkmst.model.EmptyApiResponse;
import com.prokarma.pkmst.model.GetAllOffersResponse;
import com.prokarma.pkmst.model.GetCampaignOffersRequest;
import com.prokarma.pkmst.model.GetCampaignOffersResponse;
import com.prokarma.pkmst.model.GetOfferRecommendationsRequest;
import com.prokarma.pkmst.model.GetOfferRecommendationsResponse;
import com.prokarma.pkmst.model.GetOffersResponse;
import com.prokarma.pkmst.model.UpdateCampaignOffersRequest;

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
public class OffersApiController implements OffersApi {
    private final ObjectMapper objectMapper;
@Autowired
    public OffersApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<DeleteCampaignOffersResponse> deleteCampaignOffers(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "" ,required=true )   @RequestBody DeleteCampaignOffersRequest deleteCampaignOffersRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteCampaignOffersResponse>(objectMapper.readValue("", DeleteCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteCampaignOffersResponse>(objectMapper.readValue("", DeleteCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteCampaignOffersResponse>(objectMapper.readValue("", DeleteCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteCampaignOffersResponse>(objectMapper.readValue("", DeleteCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteCampaignOffersResponse>(objectMapper.readValue("", DeleteCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteCampaignOffersResponse>(objectMapper.readValue("", DeleteCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteCampaignOffersResponse>(objectMapper.readValue("", DeleteCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<DeleteCampaignOffersResponse>(objectMapper.readValue("", DeleteCampaignOffersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<DeleteCampaignOffersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetAllOffersResponse> getAllOffers(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор прайс-листа.")  @RequestParam(value = "feedId", required = false) Long feedId,
        @ApiParam(value = "Номер сегмента с результатами.  Значение по умолчанию: `0`.  {% note info %}  Номера сегментов запрашиваются последовательно, пока не будет получен сегмент с пустым ответом. Пустой ответ означает, что все предложения магазина получены.  {% endnote %}  {% note alert %}  Нумерация начинается с 0. Чтобы запросить первую страницу, необходимо указать `chunk=0` и т. д.  {% endnote %} ")  @RequestParam(value = "chunk", required = false) Integer chunk,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetAllOffersResponse>(objectMapper.readValue("", GetAllOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetAllOffersResponse>(objectMapper.readValue("", GetAllOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetAllOffersResponse>(objectMapper.readValue("", GetAllOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetAllOffersResponse>(objectMapper.readValue("", GetAllOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetAllOffersResponse>(objectMapper.readValue("", GetAllOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetAllOffersResponse>(objectMapper.readValue("", GetAllOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetAllOffersResponse>(objectMapper.readValue("", GetAllOffersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetAllOffersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetCampaignOffersResponse> getCampaignOffers(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "" ,required=true )   @RequestBody GetCampaignOffersRequest getCampaignOffersRequest,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignOffersResponse>(objectMapper.readValue("", GetCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignOffersResponse>(objectMapper.readValue("", GetCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignOffersResponse>(objectMapper.readValue("", GetCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignOffersResponse>(objectMapper.readValue("", GetCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignOffersResponse>(objectMapper.readValue("", GetCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignOffersResponse>(objectMapper.readValue("", GetCampaignOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetCampaignOffersResponse>(objectMapper.readValue("", GetCampaignOffersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetCampaignOffersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetOfferRecommendationsResponse> getOfferRecommendations(@ApiParam(value = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("businessId") Long businessId,
        @ApiParam(value = "" ,required=true )   @RequestBody GetOfferRecommendationsRequest getOfferRecommendationsRequest,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferRecommendationsResponse>(objectMapper.readValue("", GetOfferRecommendationsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferRecommendationsResponse>(objectMapper.readValue("", GetOfferRecommendationsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferRecommendationsResponse>(objectMapper.readValue("", GetOfferRecommendationsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferRecommendationsResponse>(objectMapper.readValue("", GetOfferRecommendationsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferRecommendationsResponse>(objectMapper.readValue("", GetOfferRecommendationsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferRecommendationsResponse>(objectMapper.readValue("", GetOfferRecommendationsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferRecommendationsResponse>(objectMapper.readValue("", GetOfferRecommendationsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetOfferRecommendationsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetOffersResponse> getOffers(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Поисковый запрос.  Поддерживается язык запросов.  Значение по умолчанию: все предложения магазина, размещенные на Маркете. ")  @RequestParam(value = "query", required = false) String query,
        @ApiParam(value = "Идентификатор прайс-листа.")  @RequestParam(value = "feedId", required = false) Long feedId,
        @ApiParam(value = "Идентификатор категории предложения, указанный магазином в прайс-листе.  Параметр выводится только для предложений, у которых указана категория в прайс-листе.  Параметр доступен начиная с версии 2.0 партнерского API. ")  @RequestParam(value = "shopCategoryId", required = false) String shopCategoryId,
        @ApiParam(value = "Валюта, в которой указана цена предложения.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна. ", allowableValues = "RUR, USD, EUR, UAH, AUD, GBP, BYR, BYN, DKK, ISK, KZT, CAD, CNY, NOK, XDR, SGD, TRY, SEK, CHF, JPY, AZN, ALL, DZD, AOA, ARS, AMD, AFN, BHD, BGN, BOB, BWP, BND, BRL, BIF, HUF, VEF, KPW, VND, GMD, GHS, GNF, HKD, GEL, AED, EGP, ZMK, ILS, INR, IDR, JOD, IQD, IRR, YER, QAR, KES, KGS, COP, CDF, CRC, KWD, CUP, LAK, LVL, SLL, LBP, LYD, SZL, LTL, MUR, MRO, MKD, MWK, MGA, MYR, MAD, MXN, MZN, MDL, MNT, NPR, NGN, NIO, NZD, OMR, PKR, PYG, PEN, PLN, KHR, SAR, RON, SCR, SYP, SKK, SOS, SDG, SRD, TJS, THB, TWD, BDT, TZS, TND, TMM, UGX, UZS, UYU, PHP, DJF, XAF, XOF, HRK, CZK, CLP, LKR, EEK, ETB, RSD, ZAR, KRW, NAD, TL, UE")  @RequestParam(value = "currency", required = false) CurrencyType currency,
        @ApiParam(value = "Фильтр по признаку соотнесения предложения и карточки модели.  Возможные значения:  * `0 / FALSE / NO` — поиск выполняется среди предложений, не соотнесенных ни с какой карточкой модели.  * `1 / TRUE / YES` — поиск выполняется среди предложений, соотнесенных с карточками моделей). ")  @RequestParam(value = "matched", required = false) Boolean matched,
        @ApiParam(value = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", defaultValue = "1")  @RequestParam(value = "page", required = false, defaultValue="1") Integer page,
        @ApiParam(value = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ")  @RequestParam(value = "pageSize", required = false) Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOffersResponse>(objectMapper.readValue("", GetOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOffersResponse>(objectMapper.readValue("", GetOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOffersResponse>(objectMapper.readValue("", GetOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOffersResponse>(objectMapper.readValue("", GetOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOffersResponse>(objectMapper.readValue("", GetOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOffersResponse>(objectMapper.readValue("", GetOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOffersResponse>(objectMapper.readValue("", GetOffersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetOffersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<EmptyApiResponse> updateCampaignOffers(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateCampaignOffersRequest updateCampaignOffersRequest,
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
