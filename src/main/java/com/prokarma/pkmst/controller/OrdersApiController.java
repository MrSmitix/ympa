package com.prokarma.pkmst.controller;

import com.prokarma.pkmst.model.AcceptOrderCancellationRequest;
import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.EmptyApiResponse;
import com.prokarma.pkmst.model.GetOrderResponse;
import com.prokarma.pkmst.model.GetOrdersResponse;
import java.util.List;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import com.prokarma.pkmst.model.OrderBuyerType;
import com.prokarma.pkmst.model.OrderDeliveryDispatchType;
import com.prokarma.pkmst.model.OrderStatusType;
import com.prokarma.pkmst.model.OrderSubstatusType;
import com.prokarma.pkmst.model.ProvideOrderDigitalCodesRequest;
import com.prokarma.pkmst.model.ProvideOrderItemIdentifiersRequest;
import com.prokarma.pkmst.model.ProvideOrderItemIdentifiersResponse;
import java.util.Set;
import com.prokarma.pkmst.model.SetOrderBoxLayoutRequest;
import com.prokarma.pkmst.model.SetOrderBoxLayoutResponse;
import com.prokarma.pkmst.model.SetOrderShipmentBoxesRequest;
import com.prokarma.pkmst.model.SetOrderShipmentBoxesResponse;
import com.prokarma.pkmst.model.UpdateOrderItemRequest;
import com.prokarma.pkmst.model.UpdateOrderStatusRequest;
import com.prokarma.pkmst.model.UpdateOrderStatusResponse;
import com.prokarma.pkmst.model.UpdateOrderStatusesRequest;
import com.prokarma.pkmst.model.UpdateOrderStatusesResponse;

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
public class OrdersApiController implements OrdersApi {
    private final ObjectMapper objectMapper;
@Autowired
    public OrdersApiController(ObjectMapper objectMapper) {
        this.objectMapper = objectMapper;
    }

    public ResponseEntity<EmptyApiResponse> acceptOrderCancellation(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @ApiParam(value = "" ,required=true )   @RequestBody AcceptOrderCancellationRequest acceptOrderCancellationRequest,
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

    public ResponseEntity<GetOrderResponse> getOrder(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderResponse>(objectMapper.readValue("", GetOrderResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderResponse>(objectMapper.readValue("", GetOrderResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderResponse>(objectMapper.readValue("", GetOrderResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderResponse>(objectMapper.readValue("", GetOrderResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderResponse>(objectMapper.readValue("", GetOrderResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderResponse>(objectMapper.readValue("", GetOrderResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrderResponse>(objectMapper.readValue("", GetOrderResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetOrderResponse>(HttpStatus.OK);
    }

    public ResponseEntity<GetOrdersResponse> getOrders(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Фильтрация заказов по идентификаторам. <br><br> ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым. ")  @RequestParam(value = "orderIds", required = false) List<Long> orderIds,
        @ApiParam(value = "Статус заказа:  * `CANCELLED` — заказ отменен.  * `DELIVERED` — заказ получен покупателем.  * `DELIVERY` — заказ передан в службу доставки.  * `PICKUP` — заказ доставлен в пункт самовывоза.  * `PROCESSING` — заказ находится в обработке.  * `UNPAID` — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется. ")  @RequestParam(value = "status", required = false) Set<OrderStatusType> status,
        @ApiParam(value = "Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  Возможные значения для заказа в статусе `PROCESSING`:  * `STARTED` — заказ подтвержден, его можно начать обрабатывать. * `READY_TO_SHIP` — заказ собран и готов к отправке. * `SHIPPED` — заказ передан службе доставки.  Возможные значения для заказа в статусе `CANCELLED`:  * `DELIVERY_SERVICE_UNDELIVERED` — служба доставки не смогла доставить заказ.  * `PROCESSING_EXPIRED` — значение более не используется.  * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.  * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * `RESERVATION_FAILED` — Маркет не может продолжить дальнейшую обработку заказа.  * `SHOP_FAILED` — магазин не может выполнить заказ.  * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.  * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.  * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.  * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.  * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.  * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * `USER_WANTS_TO_CHANGE_DELIVERY_DATE` — покупатель хочет получить заказ в другой день. * `CANCELLED_COURIER_NOT_FOUND` — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется. ")  @RequestParam(value = "substatus", required = false) Set<OrderSubstatusType> substatus,
        @ApiParam(value = "Начальная дата для фильтрации заказов по дате оформления.  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной и конечной датой (параметр `toDate`) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты. ")  @RequestParam(value = "fromDate", required = false) LocalDate fromDate,
        @ApiParam(value = "Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной (параметр `fromDate`) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата. ")  @RequestParam(value = "toDate", required = false) LocalDate toDate,
        @ApiParam(value = "Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр `shipmentDate`).  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной и конечной датой (параметр `supplierShipmentDateTo`) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. ")  @RequestParam(value = "supplierShipmentDateFrom", required = false) LocalDate supplierShipmentDateFrom,
        @ApiParam(value = "Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр `shipmentDate`).  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной (параметр `supplierShipmentDateFrom`) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. ")  @RequestParam(value = "supplierShipmentDateTo", required = false) LocalDate supplierShipmentDateTo,
        @ApiParam(value = "Начальная дата для фильтрации заказов по дате и времени обновления (параметр `updatedAt`).  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Между начальной и конечной датой (параметр `updatedAtTo`) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. ")  @RequestParam(value = "updatedAtFrom", required = false) OffsetDateTime updatedAtFrom,
        @ApiParam(value = "Конечная дата для фильтрации заказов по дате и времени обновления (параметр `updatedAt`).  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Между начальной (параметр `updatedAtFrom`) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. ")  @RequestParam(value = "updatedAtTo", required = false) OffsetDateTime updatedAtTo,
        @ApiParam(value = "Способ отгрузки", allowableValues = "UNKNOWN, BUYER, MARKET_PARTNER_OUTLET, MARKET_BRANDED_OUTLET, SHOP_OUTLET, DROPOFF")  @RequestParam(value = "dispatchType", required = false) OrderDeliveryDispatchType dispatchType,
        @ApiParam(value = "Фильтрация заказов по типам:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. ", defaultValue = "false")  @RequestParam(value = "fake", required = false, defaultValue="false") Boolean fake,
        @ApiParam(value = "Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да.  * `false` — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. ", defaultValue = "false")  @RequestParam(value = "hasCis", required = false, defaultValue="false") Boolean hasCis,
        @ApiParam(value = "**Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение `true` возвращаются только заказы, которые находятся в статусе `DELIVERY` или `PICKUP` и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation). ", defaultValue = "false")  @RequestParam(value = "onlyWaitingForCancellationApprove", required = false, defaultValue="false") Boolean onlyWaitingForCancellationApprove,
        @ApiParam(value = "Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * `true` — возвращаются только заказы с неподтвержденной датой доставки. * `false` — фильтрация не применяется. ", defaultValue = "false")  @RequestParam(value = "onlyEstimatedDelivery", required = false, defaultValue="false") Boolean onlyEstimatedDelivery,
        @ApiParam(value = "Фильтрация заказов по типу покупателя. ", allowableValues = "PERSON, BUSINESS")  @RequestParam(value = "buyerType", required = false) OrderBuyerType buyerType,
        @ApiParam(value = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", defaultValue = "1")  @RequestParam(value = "page", required = false, defaultValue="1") Integer page,
        @ApiParam(value = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ")  @RequestParam(value = "pageSize", required = false) Integer pageSize,
        @ApiParam(value = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ")  @RequestParam(value = "page_token", required = false) String pageToken,
        @ApiParam(value = "Количество значений на одной странице. ")  @RequestParam(value = "limit", required = false) Integer limit,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrdersResponse>(objectMapper.readValue("", GetOrdersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrdersResponse>(objectMapper.readValue("", GetOrdersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrdersResponse>(objectMapper.readValue("", GetOrdersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrdersResponse>(objectMapper.readValue("", GetOrdersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrdersResponse>(objectMapper.readValue("", GetOrdersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrdersResponse>(objectMapper.readValue("", GetOrdersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<GetOrdersResponse>(objectMapper.readValue("", GetOrdersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<GetOrdersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<EmptyApiResponse> provideOrderDigitalCodes(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @ApiParam(value = "" ,required=true )   @RequestBody ProvideOrderDigitalCodesRequest provideOrderDigitalCodesRequest,
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

    public ResponseEntity<ProvideOrderItemIdentifiersResponse> provideOrderItemIdentifiers(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @ApiParam(value = "" ,required=true )   @RequestBody ProvideOrderItemIdentifiersRequest provideOrderItemIdentifiersRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProvideOrderItemIdentifiersResponse>(objectMapper.readValue("", ProvideOrderItemIdentifiersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProvideOrderItemIdentifiersResponse>(objectMapper.readValue("", ProvideOrderItemIdentifiersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProvideOrderItemIdentifiersResponse>(objectMapper.readValue("", ProvideOrderItemIdentifiersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProvideOrderItemIdentifiersResponse>(objectMapper.readValue("", ProvideOrderItemIdentifiersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProvideOrderItemIdentifiersResponse>(objectMapper.readValue("", ProvideOrderItemIdentifiersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProvideOrderItemIdentifiersResponse>(objectMapper.readValue("", ProvideOrderItemIdentifiersResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<ProvideOrderItemIdentifiersResponse>(objectMapper.readValue("", ProvideOrderItemIdentifiersResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<ProvideOrderItemIdentifiersResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SetOrderBoxLayoutResponse> setOrderBoxLayout(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @ApiParam(value = "" ,required=true )   @RequestBody SetOrderBoxLayoutRequest setOrderBoxLayoutRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderBoxLayoutResponse>(objectMapper.readValue("", SetOrderBoxLayoutResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderBoxLayoutResponse>(objectMapper.readValue("", SetOrderBoxLayoutResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderBoxLayoutResponse>(objectMapper.readValue("", SetOrderBoxLayoutResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderBoxLayoutResponse>(objectMapper.readValue("", SetOrderBoxLayoutResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderBoxLayoutResponse>(objectMapper.readValue("", SetOrderBoxLayoutResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderBoxLayoutResponse>(objectMapper.readValue("", SetOrderBoxLayoutResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderBoxLayoutResponse>(objectMapper.readValue("", SetOrderBoxLayoutResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SetOrderBoxLayoutResponse>(HttpStatus.OK);
    }

    public ResponseEntity<SetOrderShipmentBoxesResponse> setOrderShipmentBoxes(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @ApiParam(value = "Параметр больше не используется. Вставьте любое число — просто чтобы получился корректный URL. ",required=true ) @PathVariable("shipmentId") Long shipmentId,
        @ApiParam(value = "" ,required=true )   @RequestBody SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderShipmentBoxesResponse>(objectMapper.readValue("", SetOrderShipmentBoxesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderShipmentBoxesResponse>(objectMapper.readValue("", SetOrderShipmentBoxesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderShipmentBoxesResponse>(objectMapper.readValue("", SetOrderShipmentBoxesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderShipmentBoxesResponse>(objectMapper.readValue("", SetOrderShipmentBoxesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderShipmentBoxesResponse>(objectMapper.readValue("", SetOrderShipmentBoxesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderShipmentBoxesResponse>(objectMapper.readValue("", SetOrderShipmentBoxesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<SetOrderShipmentBoxesResponse>(objectMapper.readValue("", SetOrderShipmentBoxesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<SetOrderShipmentBoxesResponse>(HttpStatus.OK);
    }

    public ResponseEntity<Void> updateOrderItems(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateOrderItemRequest updateOrderItemRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<Void>(objectMapper.readValue("", Void.class), HttpStatus.OK);
        }

        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<UpdateOrderStatusResponse> updateOrderStatus(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "Идентификатор заказа.",required=true ) @PathVariable("orderId") Long orderId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateOrderStatusRequest updateOrderStatusRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusResponse>(objectMapper.readValue("", UpdateOrderStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusResponse>(objectMapper.readValue("", UpdateOrderStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusResponse>(objectMapper.readValue("", UpdateOrderStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusResponse>(objectMapper.readValue("", UpdateOrderStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusResponse>(objectMapper.readValue("", UpdateOrderStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusResponse>(objectMapper.readValue("", UpdateOrderStatusResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusResponse>(objectMapper.readValue("", UpdateOrderStatusResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdateOrderStatusResponse>(HttpStatus.OK);
    }

    public ResponseEntity<UpdateOrderStatusesResponse> updateOrderStatuses(@ApiParam(value = "Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ",required=true ) @PathVariable("campaignId") Long campaignId,
        @ApiParam(value = "" ,required=true )   @RequestBody UpdateOrderStatusesRequest updateOrderStatusesRequest,
        @RequestHeader(value = "Accept", required = false) String accept) throws Exception {
        // do some magic!

        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusesResponse>(objectMapper.readValue("", UpdateOrderStatusesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusesResponse>(objectMapper.readValue("", UpdateOrderStatusesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusesResponse>(objectMapper.readValue("", UpdateOrderStatusesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusesResponse>(objectMapper.readValue("", UpdateOrderStatusesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusesResponse>(objectMapper.readValue("", UpdateOrderStatusesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusesResponse>(objectMapper.readValue("", UpdateOrderStatusesResponse.class), HttpStatus.OK);
        }


        if (accept != null && accept.contains("application/json")) {
            return new ResponseEntity<UpdateOrderStatusesResponse>(objectMapper.readValue("", UpdateOrderStatusesResponse.class), HttpStatus.OK);
        }

        return new ResponseEntity<UpdateOrderStatusesResponse>(HttpStatus.OK);
    }

}
