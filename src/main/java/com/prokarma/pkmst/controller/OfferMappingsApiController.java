package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiLockedErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.EmptyApiResponse;
import com.prokarma.pkmst.model.GetOfferMappingEntriesResponse;
import com.prokarma.pkmst.model.GetSuggestedOfferMappingEntriesRequest;
import com.prokarma.pkmst.model.GetSuggestedOfferMappingEntriesResponse;
import java.util.List;
import com.prokarma.pkmst.model.OfferAvailabilityStatusType;
import com.prokarma.pkmst.model.OfferMappingKindType;
import com.prokarma.pkmst.model.OfferProcessingStatusType;
import com.prokarma.pkmst.model.UpdateOfferMappingEntryRequest;

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
public class OfferMappingsApiController implements OfferMappingsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public OfferMappingsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<GetOfferMappingEntriesResponse> getOfferMappingEntries(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор товара в каталоге.")  @RequestParam(value = "offer_id", required = false) List<String> offerId,
        @ApiParam(value = "Ваш SKU товара.  Параметр может быть указан несколько раз, например:  ``` ...shop_sku=123&shop_sku=129&shop_sku=141... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке. ")  @RequestParam(value = "shop_sku", required = false) List<String> shopSku,
        @ApiParam(value = "Тип маппинга.", allowableValues = "ACTIVE, ALL")  @RequestParam(value = "mapping_kind", required = false) OfferMappingKindType mappingKind,
        @ApiParam(value = "Фильтрация по статусу публикации товара:  * `READY` — товар прошел модерацию. * `IN_WORK` — товар проходит модерацию. * `NEED_CONTENT` — для товара без SKU на Маркете marketSku нужно найти карточку самостоятельно или создать ее. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. * `OTHER` — товар не прошел модерацию по другой причине.  Можно указать несколько статусов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...status=READY,IN_WORK... ...status=READY&status=IN_WORK... ```  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. ")  @RequestParam(value = "status", required = false) List<OfferProcessingStatusType> status,
        @ApiParam(value = "Фильтрация по планам поставок товара:  * `ACTIVE` — поставки будут. * `INACTIVE` — поставок не будет: товар есть на складе, но вы больше не планируете его поставлять. * `DELISTED` — архив: товар закончился на складе, и его поставок больше не будет.  Можно указать несколько значений в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...availability=INACTIVE,DELISTED... ...availability=INACTIVE&availability=DELISTED... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке. ")  @RequestParam(value = "availability", required = false) List<OfferAvailabilityStatusType> availability,
        @ApiParam(value = "Фильтрация по идентификатору категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  Можно указать несколько идентификаторов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...category_id=14727164,14382343... ...category_id=14727164&category_id=14382343... ```  В запросе можно указать либо параметр `shopSku`, либо любые параметры для фильтрации товаров. Совместное использование параметра `shopSku` и параметров для фильтрации приведет к ошибке. ")  @RequestParam(value = "category_id", required = false) List<Integer> categoryId,
        @ApiParam(value = "Фильтрация по бренду товара.  Можно указать несколько брендов в одном параметре, через запятую, или в нескольких одинаковых параметрах. Например:  ``` ...vendor=Aqua%20Minerale,Borjomi... ...vendor=Aqua%20Minerale&vendor=Borjomi... ```  Чтобы товар попал в результаты фильтрации, его бренд должен точно совпадать с одним из указанных в запросе. Например, если указан бренд Schwarzkopf, то в результатах не будет товаров Schwarzkopf Professional.  Если в названии бренда есть символы, которые не входят в таблицу ASCII (в том числе кириллические символы), используйте для них URL-кодирование. Например, пробел — %20, апостроф «'» — %27 и т. д. Подробнее см. в разделе [Кодирование URL русскоязычной Википедии](https://ru.wikipedia.org/wiki/URL#Кодирование_URL).  В запросе можно указать либо параметр shopSku, либо любые параметры для фильтрации товаров. Совместное использование параметра shopSku и параметров для фильтрации приведет к ошибке. ")  @RequestParam(value = "vendor", required = false) List<String> vendor,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingEntriesResponse>(objectMapper.readValue("", GetOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingEntriesResponse>(objectMapper.readValue("", GetOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingEntriesResponse>(objectMapper.readValue("", GetOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingEntriesResponse>(objectMapper.readValue("", GetOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingEntriesResponse>(objectMapper.readValue("", GetOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingEntriesResponse>(objectMapper.readValue("", GetOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOfferMappingEntriesResponse>(objectMapper.readValue("", GetOfferMappingEntriesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetOfferMappingEntriesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetSuggestedOfferMappingEntriesResponse> getSuggestedOfferMappingEntries(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "" ,required=true )   @RequestBody GetSuggestedOfferMappingEntriesRequest getSuggestedOfferMappingEntriesRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingEntriesResponse>(objectMapper.readValue("", GetSuggestedOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingEntriesResponse>(objectMapper.readValue("", GetSuggestedOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingEntriesResponse>(objectMapper.readValue("", GetSuggestedOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingEntriesResponse>(objectMapper.readValue("", GetSuggestedOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingEntriesResponse>(objectMapper.readValue("", GetSuggestedOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingEntriesResponse>(objectMapper.readValue("", GetSuggestedOfferMappingEntriesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetSuggestedOfferMappingEntriesResponse>(objectMapper.readValue("", GetSuggestedOfferMappingEntriesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetSuggestedOfferMappingEntriesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<EmptyApiResponse> updateOfferMappingEntries(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateOfferMappingEntryRequest updateOfferMappingEntryRequest,
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
