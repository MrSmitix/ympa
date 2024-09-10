#
# Партнерский API Маркета
# 
# API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
# The version of the OpenAPI document: LATEST
# 
# Generated by: https://openapi-generator.tech
#

import httpclient
import json
import logging
import marshal
import options
import strformat
import strutils
import tables
import typetraits
import uri

import ../models/model_accept_order_cancellation_request
import ../models/model_api_client_data_error_response
import ../models/model_api_forbidden_error_response
import ../models/model_api_limit_error_response
import ../models/model_api_not_found_error_response
import ../models/model_api_server_error_response
import ../models/model_api_unauthorized_error_response
import ../models/model_empty_api_response
import ../models/model_get_order_response
import ../models/model_get_orders_response
import ../models/model_order_buyer_type
import ../models/model_order_delivery_dispatch_type
import ../models/model_order_status_type
import ../models/model_order_substatus_type
import ../models/model_provide_order_digital_codes_request
import ../models/model_provide_order_item_identifiers_request
import ../models/model_provide_order_item_identifiers_response
import ../models/model_set_order_box_layout_request
import ../models/model_set_order_box_layout_response
import ../models/model_set_order_shipment_boxes_request
import ../models/model_set_order_shipment_boxes_response
import ../models/model_update_order_item_request
import ../models/model_update_order_status_request
import ../models/model_update_order_status_response
import ../models/model_update_order_statuses_request
import ../models/model_update_order_statuses_response
import ../models/model_set

const basepath = "https://api.partner.market.yandex.ru"

template constructResult[T](response: Response): untyped =
  if response.code in {Http200, Http201, Http202, Http204, Http206}:
    try:
      when name(stripGenericParams(T.typedesc).typedesc) == name(Table):
        (some(json.to(parseJson(response.body), T.typedesc)), response)
      else:
        (some(marshal.to[T](response.body)), response)
    except JsonParsingError:
      # The server returned a malformed response though the response code is 2XX
      # TODO: need better error handling
      error("JsonParsingError")
      (none(T.typedesc), response)
  else:
    (none(T.typedesc), response)


proc acceptOrderCancellation*(httpClient: HttpClient, campaignId: int64, orderId: int64, acceptOrderCancellationRequest: AcceptOrderCancellationRequest): (Option[EmptyApiResponse], Response) =
  ## Отмена заказа покупателем
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.put(basepath & fmt"/campaigns/{campaignId}/orders/{orderId}/cancellation/accept", $(%acceptOrderCancellationRequest))
  constructResult[EmptyApiResponse](response)


proc getOrder*(httpClient: HttpClient, campaignId: int64, orderId: int64): (Option[GetOrderResponse], Response) =
  ## Информация об одном заказе

  let response = httpClient.get(basepath & fmt"/campaigns/{campaignId}/orders/{orderId}")
  constructResult[GetOrderResponse](response)


proc getOrders*(httpClient: HttpClient, campaignId: int64, orderIds: seq[int64], status: seq[OrderStatusType], substatus: seq[OrderSubstatusType], fromDate: string, toDate: string, supplierShipmentDateFrom: string, supplierShipmentDateTo: string, updatedAtFrom: string, updatedAtTo: string, dispatchType: OrderDeliveryDispatchType, fake: bool, hasCis: bool, onlyWaitingForCancellationApprove: bool, onlyEstimatedDelivery: bool, buyerType: OrderBuyerType, page: int, pageSize: int, pageToken: string, limit: int): (Option[GetOrdersResponse], Response) =
  ## Информация о нескольких заказах
  let query_for_api_call = encodeQuery([
    ("orderIds", $orderIds.join(",")), # Фильтрация заказов по идентификаторам. <br><br> ⚠️ Не используйте это поле одновременно с другими фильтрами. Если вы хотите воспользоваться ими, оставьте поле пустым. 
    ("status", $status.join(",")), # Статус заказа:  * `CANCELLED` — заказ отменен.  * `DELIVERED` — заказ получен покупателем.  * `DELIVERY` — заказ передан в службу доставки.  * `PICKUP` — заказ доставлен в пункт самовывоза.  * `PROCESSING` — заказ находится в обработке.  * `UNPAID` — заказ оформлен, но еще не оплачен (если выбрана оплата при оформлении).  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
    ("substatus", $substatus.join(",")), # Этап обработки заказа (если он имеет статус `PROCESSING`) или причина отмены заказа (если он имеет статус `CANCELLED`).  Возможные значения для заказа в статусе `PROCESSING`:  * `STARTED` — заказ подтвержден, его можно начать обрабатывать. * `READY_TO_SHIP` — заказ собран и готов к отправке. * `SHIPPED` — заказ передан службе доставки.  Возможные значения для заказа в статусе `CANCELLED`:  * `DELIVERY_SERVICE_UNDELIVERED` — служба доставки не смогла доставить заказ.  * `PROCESSING_EXPIRED` — значение более не используется.  * `REPLACING_ORDER` — покупатель решил заменить товар другим по собственной инициативе.  * `RESERVATION_EXPIRED` — покупатель не завершил оформление зарезервированного заказа в течение 10 минут.  * `RESERVATION_FAILED` — Маркет не может продолжить дальнейшую обработку заказа.  * `SHOP_FAILED` — магазин не может выполнить заказ.  * `USER_CHANGED_MIND` — покупатель отменил заказ по личным причинам.  * `USER_NOT_PAID` — покупатель не оплатил заказ (для типа оплаты `PREPAID`) в течение 30 минут.  * `USER_REFUSED_DELIVERY` — покупателя не устроили условия доставки.  * `USER_REFUSED_PRODUCT` — покупателю не подошел товар.  * `USER_REFUSED_QUALITY` — покупателя не устроило качество товара.  * `USER_UNREACHABLE` — не удалось связаться с покупателем. Для отмены с этой причиной необходимо выполнить условия:    * не менее 3 звонков с 8 до 21 в часовом поясе покупателя;   * перерыв между первым и третьим звонком не менее 90 минут;   * соединение не короче 5 секунд.    Если хотя бы одно из этих условий не выполнено (кроме случая, когда номер недоступен), отменить заказ не получится. Вернется ответ с кодом ошибки 400. * `USER_WANTS_TO_CHANGE_DELIVERY_DATE` — покупатель хочет получить заказ в другой день. * `CANCELLED_COURIER_NOT_FOUND` — не удалось найти курьера.  Также могут возвращаться другие значения. Обрабатывать их не требуется. 
    ("fromDate", $fromDate), # Начальная дата для фильтрации заказов по дате оформления.  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной и конечной датой (параметр `toDate`) должно быть не больше 30 дней.  Значение по умолчанию: 30 дней назад от текущей даты. 
    ("toDate", $toDate), # Конечная дата для фильтрации заказов по дате оформления.  Показываются заказы, созданные до 00:00 указанного дня.  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной (параметр `fromDate`) и конечной датой должно быть не больше 30 дней.  Значение по умолчанию: текущая дата. 
    ("supplierShipmentDateFrom", $supplierShipmentDateFrom), # Начальная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр `shipmentDate`).  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной и конечной датой (параметр `supplierShipmentDateTo`) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. 
    ("supplierShipmentDateTo", $supplierShipmentDateTo), # Конечная дата для фильтрации заказов по дате отгрузки в службу доставки (параметр `shipmentDate`).  Формат даты: `ДД-ММ-ГГГГ`.  Между начальной (параметр `supplierShipmentDateFrom`) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. 
    ("updatedAtFrom", $updatedAtFrom), # Начальная дата для фильтрации заказов по дате и времени обновления (параметр `updatedAt`).  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Между начальной и конечной датой (параметр `updatedAtTo`) должно быть не больше 30 дней.  Начальная дата включается в интервал для фильтрации. 
    ("updatedAtTo", $updatedAtTo), # Конечная дата для фильтрации заказов по дате и времени обновления (параметр `updatedAt`).  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Между начальной (параметр `updatedAtFrom`) и конечной датой должно быть не больше 30 дней.  Конечная дата не включается в интервал для фильтрации. 
    ("dispatchType", $dispatchType), # Способ отгрузки
    ("fake", $fake), # Фильтрация заказов по типам:  * `false` — настоящий заказ покупателя.  * `true` — [тестовый](../../pushapi/concepts/sandbox.md) заказ Маркета. 
    ("hasCis", $hasCis), # Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да.  * `false` — нет.  Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
    ("onlyWaitingForCancellationApprove", $onlyWaitingForCancellationApprove), # **Только для модели DBS**  Фильтрация заказов по наличию запросов покупателей на отмену.  При значение `true` возвращаются только заказы, которые находятся в статусе `DELIVERY` или `PICKUP` и которые пользователи решили отменить.  Чтобы подтвердить или отклонить отмену, отправьте запрос [PUT campaigns/{campaignId}/orders/{orderId}/cancellation/accept](../../reference/orders/acceptOrderCancellation). 
    ("onlyEstimatedDelivery", $onlyEstimatedDelivery), # Фильтрация заказов с долгой доставкой (31-60 дней) по подтвержденной дате доставки:  * `true` — возвращаются только заказы с неподтвержденной датой доставки. * `false` — фильтрация не применяется. 
    ("buyerType", $buyerType), # Фильтрация заказов по типу покупателя. 
    ("page", $page), # Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
    ("pageSize", $pageSize), # Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
    ("page_token", $pageToken), # Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
    ("limit", $limit), # Количество значений на одной странице. 
  ])

  let response = httpClient.get(basepath & fmt"/campaigns/{campaignId}/orders" & "?" & query_for_api_call)
  constructResult[GetOrdersResponse](response)


proc provideOrderDigitalCodes*(httpClient: HttpClient, campaignId: int64, orderId: int64, provideOrderDigitalCodesRequest: ProvideOrderDigitalCodesRequest): (Option[EmptyApiResponse], Response) =
  ## Передача ключей цифровых товаров
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.post(basepath & fmt"/campaigns/{campaignId}/orders/{orderId}/deliverDigitalGoods", $(%provideOrderDigitalCodesRequest))
  constructResult[EmptyApiResponse](response)


proc provideOrderItemIdentifiers*(httpClient: HttpClient, campaignId: int64, orderId: int64, provideOrderItemIdentifiersRequest: ProvideOrderItemIdentifiersRequest): (Option[ProvideOrderItemIdentifiersResponse], Response) =
  ## Передача кодов маркировки единиц товара
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.put(basepath & fmt"/campaigns/{campaignId}/orders/{orderId}/identifiers", $(%provideOrderItemIdentifiersRequest))
  constructResult[ProvideOrderItemIdentifiersResponse](response)


proc setOrderBoxLayout*(httpClient: HttpClient, campaignId: int64, orderId: int64, setOrderBoxLayoutRequest: SetOrderBoxLayoutRequest): (Option[SetOrderBoxLayoutResponse], Response) =
  ## Подготовка заказа
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.put(basepath & fmt"/campaigns/{campaignId}/orders/{orderId}/boxes", $(%setOrderBoxLayoutRequest))
  constructResult[SetOrderBoxLayoutResponse](response)


proc setOrderShipmentBoxes*(httpClient: HttpClient, campaignId: int64, orderId: int64, shipmentId: int64, setOrderShipmentBoxesRequest: SetOrderShipmentBoxesRequest): (Option[SetOrderShipmentBoxesResponse], Response) =
  ## Передача количества грузовых мест в заказе
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.put(basepath & fmt"/campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes", $(%setOrderShipmentBoxesRequest))
  constructResult[SetOrderShipmentBoxesResponse](response)


proc updateOrderItems*(httpClient: HttpClient, campaignId: int64, orderId: int64, updateOrderItemRequest: UpdateOrderItemRequest): Response =
  ## Удаление товара из заказа или уменьшение числа единиц
  httpClient.headers["Content-Type"] = "application/json"
  httpClient.put(basepath & fmt"/campaigns/{campaignId}/orders/{orderId}/items", $(%updateOrderItemRequest))


proc updateOrderStatus*(httpClient: HttpClient, campaignId: int64, orderId: int64, updateOrderStatusRequest: UpdateOrderStatusRequest): (Option[UpdateOrderStatusResponse], Response) =
  ## Изменение статуса одного заказа
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.put(basepath & fmt"/campaigns/{campaignId}/orders/{orderId}/status", $(%updateOrderStatusRequest))
  constructResult[UpdateOrderStatusResponse](response)


proc updateOrderStatuses*(httpClient: HttpClient, campaignId: int64, updateOrderStatusesRequest: UpdateOrderStatusesRequest): (Option[UpdateOrderStatusesResponse], Response) =
  ## Изменение статусов нескольких заказов
  httpClient.headers["Content-Type"] = "application/json"

  let response = httpClient.post(basepath & fmt"/campaigns/{campaignId}/orders/status-update", $(%updateOrderStatusesRequest))
  constructResult[UpdateOrderStatusesResponse](response)
