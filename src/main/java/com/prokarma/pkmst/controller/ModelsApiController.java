package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.CurrencyType;
import com.prokarma.pkmst.model.GetModelsOffersResponse;
import com.prokarma.pkmst.model.GetModelsRequest;
import com.prokarma.pkmst.model.GetModelsResponse;
import com.prokarma.pkmst.model.SearchModelsResponse;
import com.prokarma.pkmst.model.SortOrderType;

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
public class ModelsApiController implements ModelsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ModelsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<GetModelsResponse> getModel(@ApiParam(value = "Идентификатор модели товара.",required=true ) @PathVariable("modelId") Long modelId,
        @ApiParam(value = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true)  @RequestParam(value = "regionId", required = true) Long regionId,
        @ApiParam(value = "Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). ", allowableValues = "RUR, USD, EUR, UAH, AUD, GBP, BYR, BYN, DKK, ISK, KZT, CAD, CNY, NOK, XDR, SGD, TRY, SEK, CHF, JPY, AZN, ALL, DZD, AOA, ARS, AMD, AFN, BHD, BGN, BOB, BWP, BND, BRL, BIF, HUF, VEF, KPW, VND, GMD, GHS, GNF, HKD, GEL, AED, EGP, ZMK, ILS, INR, IDR, JOD, IQD, IRR, YER, QAR, KES, KGS, COP, CDF, CRC, KWD, CUP, LAK, LVL, SLL, LBP, LYD, SZL, LTL, MUR, MRO, MKD, MWK, MGA, MYR, MAD, MXN, MZN, MDL, MNT, NPR, NGN, NIO, NZD, OMR, PKR, PYG, PEN, PLN, KHR, SAR, RON, SCR, SYP, SKK, SOS, SDG, SRD, TJS, THB, TWD, BDT, TZS, TND, TMM, UGX, UZS, UYU, PHP, DJF, XAF, XOF, HRK, CZK, CLP, LKR, EEK, ETB, RSD, ZAR, KRW, NAD, TL, UE")  @RequestParam(value = "currency", required = false) CurrencyType currency,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetModelsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetModelsOffersResponse> getModelOffers(@ApiParam(value = "Идентификатор модели товара.",required=true ) @PathVariable("modelId") Long modelId,
        @ApiParam(value = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true)  @RequestParam(value = "regionId", required = true) Long regionId,
        @ApiParam(value = "Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). ", allowableValues = "RUR, USD, EUR, UAH, AUD, GBP, BYR, BYN, DKK, ISK, KZT, CAD, CNY, NOK, XDR, SGD, TRY, SEK, CHF, JPY, AZN, ALL, DZD, AOA, ARS, AMD, AFN, BHD, BGN, BOB, BWP, BND, BRL, BIF, HUF, VEF, KPW, VND, GMD, GHS, GNF, HKD, GEL, AED, EGP, ZMK, ILS, INR, IDR, JOD, IQD, IRR, YER, QAR, KES, KGS, COP, CDF, CRC, KWD, CUP, LAK, LVL, SLL, LBP, LYD, SZL, LTL, MUR, MRO, MKD, MWK, MGA, MYR, MAD, MXN, MZN, MDL, MNT, NPR, NGN, NIO, NZD, OMR, PKR, PYG, PEN, PLN, KHR, SAR, RON, SCR, SYP, SKK, SOS, SDG, SRD, TJS, THB, TWD, BDT, TZS, TND, TMM, UGX, UZS, UYU, PHP, DJF, XAF, XOF, HRK, CZK, CLP, LKR, EEK, ETB, RSD, ZAR, KRW, NAD, TL, UE")  @RequestParam(value = "currency", required = false) CurrencyType currency,
        @ApiParam(value = "Направление сортировки по цене.  Возможные значения: * `ASC` — сортировка по возрастанию. * `DESC` — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке. ", allowableValues = "ASC, DESC")  @RequestParam(value = "orderByPrice", required = false) SortOrderType orderByPrice,
        @ApiParam(value = "Количество предложений на странице ответа.", defaultValue = "10")  @RequestParam(value = "count", required = false, defaultValue="10") Integer count,
        @ApiParam(value = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", defaultValue = "1")  @RequestParam(value = "page", required = false, defaultValue="1") Integer page,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetModelsOffersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetModelsResponse> getModels(@ApiParam(value = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true)  @RequestParam(value = "regionId", required = true) Long regionId,
        @ApiParam(value = "" ,required=true )   @RequestBody GetModelsRequest getModelsRequest,
        @ApiParam(value = "Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). ", allowableValues = "RUR, USD, EUR, UAH, AUD, GBP, BYR, BYN, DKK, ISK, KZT, CAD, CNY, NOK, XDR, SGD, TRY, SEK, CHF, JPY, AZN, ALL, DZD, AOA, ARS, AMD, AFN, BHD, BGN, BOB, BWP, BND, BRL, BIF, HUF, VEF, KPW, VND, GMD, GHS, GNF, HKD, GEL, AED, EGP, ZMK, ILS, INR, IDR, JOD, IQD, IRR, YER, QAR, KES, KGS, COP, CDF, CRC, KWD, CUP, LAK, LVL, SLL, LBP, LYD, SZL, LTL, MUR, MRO, MKD, MWK, MGA, MYR, MAD, MXN, MZN, MDL, MNT, NPR, NGN, NIO, NZD, OMR, PKR, PYG, PEN, PLN, KHR, SAR, RON, SCR, SYP, SKK, SOS, SDG, SRD, TJS, THB, TWD, BDT, TZS, TND, TMM, UGX, UZS, UYU, PHP, DJF, XAF, XOF, HRK, CZK, CLP, LKR, EEK, ETB, RSD, ZAR, KRW, NAD, TL, UE")  @RequestParam(value = "currency", required = false) CurrencyType currency,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsResponse>(objectMapper.readValue("", GetModelsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetModelsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetModelsOffersResponse> getModelsOffers(@ApiParam(value = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true)  @RequestParam(value = "regionId", required = true) Long regionId,
        @ApiParam(value = "" ,required=true )   @RequestBody GetModelsRequest getModelsRequest,
        @ApiParam(value = "Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). ", allowableValues = "RUR, USD, EUR, UAH, AUD, GBP, BYR, BYN, DKK, ISK, KZT, CAD, CNY, NOK, XDR, SGD, TRY, SEK, CHF, JPY, AZN, ALL, DZD, AOA, ARS, AMD, AFN, BHD, BGN, BOB, BWP, BND, BRL, BIF, HUF, VEF, KPW, VND, GMD, GHS, GNF, HKD, GEL, AED, EGP, ZMK, ILS, INR, IDR, JOD, IQD, IRR, YER, QAR, KES, KGS, COP, CDF, CRC, KWD, CUP, LAK, LVL, SLL, LBP, LYD, SZL, LTL, MUR, MRO, MKD, MWK, MGA, MYR, MAD, MXN, MZN, MDL, MNT, NPR, NGN, NIO, NZD, OMR, PKR, PYG, PEN, PLN, KHR, SAR, RON, SCR, SYP, SKK, SOS, SDG, SRD, TJS, THB, TWD, BDT, TZS, TND, TMM, UGX, UZS, UYU, PHP, DJF, XAF, XOF, HRK, CZK, CLP, LKR, EEK, ETB, RSD, ZAR, KRW, NAD, TL, UE")  @RequestParam(value = "currency", required = false) CurrencyType currency,
        @ApiParam(value = "Направление сортировки по цене.  Возможные значения: * `ASC` — сортировка по возрастанию. * `DESC` — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке. ", allowableValues = "ASC, DESC")  @RequestParam(value = "orderByPrice", required = false) SortOrderType orderByPrice,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetModelsOffersResponse>(objectMapper.readValue("", GetModelsOffersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetModelsOffersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SearchModelsResponse> searchModels(@ApiParam(value = "Поисковый запрос по названию модели товара.", required = true)  @RequestParam(value = "query", required = true) String query,
        @ApiParam(value = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true)  @RequestParam(value = "regionId", required = true) Long regionId,
        @ApiParam(value = "Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). ", allowableValues = "RUR, USD, EUR, UAH, AUD, GBP, BYR, BYN, DKK, ISK, KZT, CAD, CNY, NOK, XDR, SGD, TRY, SEK, CHF, JPY, AZN, ALL, DZD, AOA, ARS, AMD, AFN, BHD, BGN, BOB, BWP, BND, BRL, BIF, HUF, VEF, KPW, VND, GMD, GHS, GNF, HKD, GEL, AED, EGP, ZMK, ILS, INR, IDR, JOD, IQD, IRR, YER, QAR, KES, KGS, COP, CDF, CRC, KWD, CUP, LAK, LVL, SLL, LBP, LYD, SZL, LTL, MUR, MRO, MKD, MWK, MGA, MYR, MAD, MXN, MZN, MDL, MNT, NPR, NGN, NIO, NZD, OMR, PKR, PYG, PEN, PLN, KHR, SAR, RON, SCR, SYP, SKK, SOS, SDG, SRD, TJS, THB, TWD, BDT, TZS, TND, TMM, UGX, UZS, UYU, PHP, DJF, XAF, XOF, HRK, CZK, CLP, LKR, EEK, ETB, RSD, ZAR, KRW, NAD, TL, UE")  @RequestParam(value = "currency", required = false) CurrencyType currency,
        @ApiParam(value = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", defaultValue = "1")  @RequestParam(value = "page", required = false, defaultValue="1") Integer page,
        @ApiParam(value = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ")  @RequestParam(value = "pageSize", required = false) Integer pageSize,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchModelsResponse>(objectMapper.readValue("", SearchModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchModelsResponse>(objectMapper.readValue("", SearchModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchModelsResponse>(objectMapper.readValue("", SearchModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchModelsResponse>(objectMapper.readValue("", SearchModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchModelsResponse>(objectMapper.readValue("", SearchModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchModelsResponse>(objectMapper.readValue("", SearchModelsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchModelsResponse>(objectMapper.readValue("", SearchModelsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SearchModelsResponse>(HttpStatus.OK);
    }

}
