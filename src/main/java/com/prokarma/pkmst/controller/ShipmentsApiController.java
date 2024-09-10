package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.ConfirmShipmentRequest;
import com.prokarma.pkmst.model.EmptyApiResponse;
import java.io.File;
import com.prokarma.pkmst.model.GetShipmentOrdersInfoResponse;
import com.prokarma.pkmst.model.GetShipmentResponse;
import com.prokarma.pkmst.model.SearchShipmentsRequest;
import com.prokarma.pkmst.model.SearchShipmentsResponse;
import com.prokarma.pkmst.model.SetShipmentPalletsCountRequest;
import com.prokarma.pkmst.model.ShipmentPalletLabelPageFormatType;
import com.prokarma.pkmst.model.TransferOrdersFromShipmentRequest;

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
public class ShipmentsApiController implements ShipmentsApi {
    private final ObjectMapper objectMapper;
@Autowired
    public ShipmentsApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<EmptyApiResponse> confirmShipment(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор отгрузки.",required=true ) @PathVariable("shipmentId") Long shipmentId,
        @ApiParam(value = ""  )   @RequestBody ConfirmShipmentRequest confirmShipmentRequest,
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

    public ResponseEntity<File> downloadShipmentAct(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор отгрузки.",required=true ) @PathVariable("shipmentId") Long shipmentId,
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

    public ResponseEntity<File> downloadShipmentDiscrepancyAct(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор отгрузки.",required=true ) @PathVariable("shipmentId") Long shipmentId,
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

    public ResponseEntity<File> downloadShipmentInboundAct(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор отгрузки.",required=true ) @PathVariable("shipmentId") Long shipmentId,
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

    public ResponseEntity<File> downloadShipmentPalletLabels(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор отгрузки.",required=true ) @PathVariable("shipmentId") Long shipmentId,
        @ApiParam(value = "Формат страниц PDF-файла с ярлыками:  * `A4` — по 16 ярлыков на странице. * `A8` — по одному ярлыку на странице. ", allowableValues = "A4, A8", defaultValue = "A8")  @RequestParam(value = "format", required = false, defaultValue="A8") ShipmentPalletLabelPageFormatType format,
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

    public ResponseEntity<File> downloadShipmentReceptionTransferAct(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор склада.")  @RequestParam(value = "warehouse_id", required = false) Integer warehouseId,
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

    public ResponseEntity<File> downloadShipmentTransportationWaybill(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор отгрузки.",required=true ) @PathVariable("shipmentId") Long shipmentId,
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

    public ResponseEntity<GetShipmentResponse> getShipment(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор отгрузки.",required=true ) @PathVariable("shipmentId") Long shipmentId,
        @ApiParam(value = "Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. ", defaultValue = "true")  @RequestParam(value = "cancelledOrders", required = false, defaultValue="true") Boolean cancelledOrders,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentResponse>(objectMapper.readValue("", GetShipmentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentResponse>(objectMapper.readValue("", GetShipmentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentResponse>(objectMapper.readValue("", GetShipmentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentResponse>(objectMapper.readValue("", GetShipmentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentResponse>(objectMapper.readValue("", GetShipmentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentResponse>(objectMapper.readValue("", GetShipmentResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentResponse>(objectMapper.readValue("", GetShipmentResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetShipmentResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetShipmentOrdersInfoResponse> getShipmentOrdersInfo(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор отгрузки.",required=true ) @PathVariable("shipmentId") Long shipmentId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentOrdersInfoResponse>(objectMapper.readValue("", GetShipmentOrdersInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentOrdersInfoResponse>(objectMapper.readValue("", GetShipmentOrdersInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentOrdersInfoResponse>(objectMapper.readValue("", GetShipmentOrdersInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentOrdersInfoResponse>(objectMapper.readValue("", GetShipmentOrdersInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentOrdersInfoResponse>(objectMapper.readValue("", GetShipmentOrdersInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentOrdersInfoResponse>(objectMapper.readValue("", GetShipmentOrdersInfoResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetShipmentOrdersInfoResponse>(objectMapper.readValue("", GetShipmentOrdersInfoResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetShipmentOrdersInfoResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SearchShipmentsResponse> searchShipments(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "" ,required=true )   @RequestBody SearchShipmentsRequest searchShipmentsRequest,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchShipmentsResponse>(objectMapper.readValue("", SearchShipmentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchShipmentsResponse>(objectMapper.readValue("", SearchShipmentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchShipmentsResponse>(objectMapper.readValue("", SearchShipmentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchShipmentsResponse>(objectMapper.readValue("", SearchShipmentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchShipmentsResponse>(objectMapper.readValue("", SearchShipmentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchShipmentsResponse>(objectMapper.readValue("", SearchShipmentsResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SearchShipmentsResponse>(objectMapper.readValue("", SearchShipmentsResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SearchShipmentsResponse>(HttpStatus.OK);
    }

    public ResponseEntity<EmptyApiResponse> setShipmentPalletsCount(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор отгрузки.",required=true ) @PathVariable("shipmentId") Long shipmentId,
        @ApiParam(value = "" ,required=true )   @RequestBody SetShipmentPalletsCountRequest setShipmentPalletsCountRequest,
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

    public ResponseEntity<EmptyApiResponse> transferOrdersFromShipment(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор отгрузки.",required=true ) @PathVariable("shipmentId") Long shipmentId,
        @ApiParam(value = "" ,required=true )   @RequestBody TransferOrdersFromShipmentRequest transferOrdersFromShipmentRequest,
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

}
