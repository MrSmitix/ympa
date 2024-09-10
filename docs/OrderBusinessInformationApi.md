# OrderBusinessInformationApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrderBusinessBuyerInfo**](OrderBusinessInformationApi.md#getOrderBusinessBuyerInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/business-buyer | Информация о покупателе — юридическом лице
[**getOrderBusinessDocumentsInfo**](OrderBusinessInformationApi.md#getOrderBusinessDocumentsInfo) | **POST** /campaigns/{campaignId}/orders/{orderId}/documents | Информация о документах



## getOrderBusinessBuyerInfo

Информация о покупателе — юридическом лице

Возвращает информацию о покупателе по идентификатору заказа.

{% note info \"\" %}

Чтобы получить информацию о покупателе, который является физическим лицом, воспользуйтесь запросом [GET campaigns/{campaignId}/orders/{orderId}/buyer](../../reference/orders/getOrderBuyerInfo.md).

{% endnote %}

Получить данные можно, только если заказ находится в статусе 'PROCESSING', 'DELIVERY', 'PICKUP' или 'DELIVERED'.

Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).

|**⚙️ Лимит:** 3 000 запросов в час|
|-|

### Example

```bash
 getOrderBusinessBuyerInfo campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]

### Return type

[**GetBusinessBuyerInfoResponse**](GetBusinessBuyerInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getOrderBusinessDocumentsInfo

Информация о документах

Возвращает информацию о документах по идентификатору заказа.

Получить данные можно после того, как заказ перейдет в статус 'DELIVERED'.

Если у вас настроена работа с push-компонентом, Маркет отправит уведомление о смене статуса заказа с помощью запроса [POST order/status](../../pushapi/reference/postOrderStatus.md).

|**⚙️ Лимит:** 3 000 запросов в час|
|-|

### Example

```bash
 getOrderBusinessDocumentsInfo campaignId=value orderId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.

Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **orderId** | **integer** | Идентификатор заказа. | [default to null]

### Return type

[**GetBusinessDocumentsInfoResponse**](GetBusinessDocumentsInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

