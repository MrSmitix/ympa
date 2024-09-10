# OrderDeliveryAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**OrderDeliveryAPI_getOrderBuyerInfo**](OrderDeliveryAPI.md#OrderDeliveryAPI_getOrderBuyerInfo) | **GET** /campaigns/{campaignId}/orders/{orderId}/buyer | Информация о покупателе — физическом лице
[**OrderDeliveryAPI_setOrderDeliveryDate**](OrderDeliveryAPI.md#OrderDeliveryAPI_setOrderDeliveryDate) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/date | Изменение даты доставки заказа
[**OrderDeliveryAPI_setOrderDeliveryTrackCode**](OrderDeliveryAPI.md#OrderDeliveryAPI_setOrderDeliveryTrackCode) | **POST** /campaigns/{campaignId}/orders/{orderId}/delivery/track | Передача трек‑номера посылки
[**OrderDeliveryAPI_updateOrderStorageLimit**](OrderDeliveryAPI.md#OrderDeliveryAPI_updateOrderStorageLimit) | **PUT** /campaigns/{campaignId}/orders/{orderId}/delivery/storage-limit | Продление срока хранения заказа
[**OrderDeliveryAPI_verifyOrderEac**](OrderDeliveryAPI.md#OrderDeliveryAPI_verifyOrderEac) | **PUT** /campaigns/{campaignId}/orders/{orderId}/verifyEac | Передача кода подтверждения


# **OrderDeliveryAPI_getOrderBuyerInfo**
```c
// Информация о покупателе — физическом лице
//
// Возвращает информацию о покупателе по идентификатору заказа.  {% note info \"\" %}  Чтобы получить информацию о покупателе, который является юридическим лицом, воспользуйтесь запросом [POST campaigns/{campaignId}/orders/{orderId}/business-buyer](../../reference/order-business-information/getOrderBusinessBuyerInfo.md).  {% endnote %}  Получить данные можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).  |**⚙️ Лимит:** 3 000 запросов в час| |-| 
//
get_order_buyer_info_response_t* OrderDeliveryAPI_getOrderBuyerInfo(apiClient_t *apiClient, long campaignId, long orderId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 

### Return type

[get_order_buyer_info_response_t](get_order_buyer_info_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderDeliveryAPI_setOrderDeliveryDate**
```c
// Изменение даты доставки заказа
//
// Метод изменяет дату доставки заказа в статусе `PROCESSING` или `DELIVERY`. Для заказов с другими статусами дату доставки изменить нельзя.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t* OrderDeliveryAPI_setOrderDeliveryDate(apiClient_t *apiClient, long campaignId, long orderId, set_order_delivery_date_request_t *set_order_delivery_date_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**set_order_delivery_date_request** | **[set_order_delivery_date_request_t](set_order_delivery_date_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderDeliveryAPI_setOrderDeliveryTrackCode**
```c
// Передача трек‑номера посылки
//
// {% note warning \"Этот запрос только для DBS\" %}  Вы можете использовать запрос, чтобы повысить лояльность покупателей. Если они могут узнать, на каком этапе доставки находятся их заказы, доверие покупателей к вашему магазину может возрасти.  {% endnote %}  Передает Маркету трек‑номер, по которому покупатель может отследить посылку со своим заказом через службу доставки.  Передать трек‑номер можно, только если заказ находится в статусе `PROCESSING`, `DELIVERY` или `PICKUP`.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t* OrderDeliveryAPI_setOrderDeliveryTrackCode(apiClient_t *apiClient, long campaignId, long orderId, set_order_delivery_track_code_request_t *set_order_delivery_track_code_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**set_order_delivery_track_code_request** | **[set_order_delivery_track_code_request_t](set_order_delivery_track_code_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderDeliveryAPI_updateOrderStorageLimit**
```c
// Продление срока хранения заказа
//
// Продлевает срок хранения заказа в пункте выдачи продавца.  Заказ должен быть в статусе `PICKUP`. Продлить срок можно только один раз, не больше чем на 30 дней.  Новый срок хранения можно получить в параметре `outletStorageLimitDate` запроса [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md).  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
empty_api_response_t* OrderDeliveryAPI_updateOrderStorageLimit(apiClient_t *apiClient, long campaignId, long orderId, update_order_storage_limit_request_t *update_order_storage_limit_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**update_order_storage_limit_request** | **[update_order_storage_limit_request_t](update_order_storage_limit_request.md) \*** |  | 

### Return type

[empty_api_response_t](empty_api_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **OrderDeliveryAPI_verifyOrderEac**
```c
// Передача кода подтверждения
//
// Отправляет Маркету код подтверждения для его проверки.  Код подтверждает передачу заказа или невыкупа:  * курьеру — курьер должен назвать магазину код; * магазину — магазин называет код курьеру.  Если магазин получает невыкупленный заказ, то ему нужно назвать курьеру код из кабинета или приложения.  Если у магазина настроена работа с кодами подтверждения, в запросах [POST order/status](../../pushapi/reference/postOrderStatus.md), [PUT campaigns/{campaignId}/orders/{orderId}/status](../../reference/orders/updateOrderStatus.md), [GET campaigns/{campaignId}/orders](../../reference/orders/getOrders.md), [GET campaigns/{campaignId}/orders/{orderId}](../../reference/orders/getOrder.md) в параметре `delivery`, вложенном в `order` будет возвращаться параметр `eacType` с типом `Enum` — тип кода подтверждения для передачи заказа.  Возможные значения: `MERCHANT_TO_COURIER` — магазин называет код курьеру, `COURIER_TO_MERCHANT` — курьер называет код магазину.  Параметр `eacType` возвращается при статусах заказа `COURIER_FOUND`, `COURIER_ARRIVED_TO_SENDER` и `DELIVERY_SERVICE_UNDELIVERED`. Если заказ в других статусах, параметр может отсутствовать.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 
//
verify_order_eac_response_t* OrderDeliveryAPI_verifyOrderEac(apiClient_t *apiClient, long campaignId, long orderId, verify_order_eac_request_t *verify_order_eac_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**orderId** | **long** | Идентификатор заказа. | 
**verify_order_eac_request** | **[verify_order_eac_request_t](verify_order_eac_request.md) \*** |  | 

### Return type

[verify_order_eac_response_t](verify_order_eac_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

