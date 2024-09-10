# OrderLabelsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateOrderLabel**](OrderLabelsApi.md#generateOrderLabel) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/shipments/{shipmentId}/boxes/{boxId}/label | Готовый ярлык‑наклейка для коробки в заказе
[**generateOrderLabels**](OrderLabelsApi.md#generateOrderLabels) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels | Готовые ярлыки‑наклейки на все коробки в одном заказе
[**getOrderLabelsData**](OrderLabelsApi.md#getOrderLabelsData) | **GET** /campaigns/{campaignId}/orders/{orderId}/delivery/labels/data | Данные для самостоятельного изготовления ярлыков



## generateOrderLabel

> File generateOrderLabel(campaignId, orderId, shipmentId, boxId, format)

Готовый ярлык‑наклейка для коробки в заказе

Формирует ярлык‑наклейку для коробки в заказе и возвращает ярлык в PDF‑файле.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderLabelsApi;

OrderLabelsApi apiInstance = new OrderLabelsApi();
Long campaignId = null; // Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
Long orderId = null; // Long | Идентификатор заказа.
Long shipmentId = null; // Long | Идентификатор грузоместа.
Long boxId = null; // Long | Идентификатор коробки.
PageFormatType format = null; // PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
try {
    File result = apiInstance.generateOrderLabel(campaignId, orderId, shipmentId, boxId, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLabelsApi#generateOrderLabel");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **orderId** | **Long**| Идентификатор заказа. | [default to null]
 **shipmentId** | **Long**| Идентификатор грузоместа. | [default to null]
 **boxId** | **Long**| Идентификатор коробки. | [default to null]
 **format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] [default to null] [enum: A7, A4]

### Return type

[**File**](File.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## generateOrderLabels

> File generateOrderLabels(campaignId, orderId, format)

Готовые ярлыки‑наклейки на все коробки в одном заказе

Возвращает PDF-файл с ярлыками, которые нужно наклеить на коробки перед отгрузкой. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  На вход нужно передать идентификатор заказа и один необязательный параметр, который управляет версткой PDF-файла.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderLabelsApi;

OrderLabelsApi apiInstance = new OrderLabelsApi();
Long campaignId = null; // Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
Long orderId = null; // Long | Идентификатор заказа.
PageFormatType format = null; // PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6.
try {
    File result = apiInstance.generateOrderLabels(campaignId, orderId, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLabelsApi#generateOrderLabels");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **orderId** | **Long**| Идентификатор заказа. | [default to null]
 **format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A6. | [optional] [default to null] [enum: A7, A4]

### Return type

[**File**](File.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/pdf, application/json


## getOrderLabelsData

> GetOrderLabelsDataResponse getOrderLabelsData(campaignId, orderId)

Данные для самостоятельного изготовления ярлыков

Возвращает информацию на ярлыках, которые клеятся на коробки в заказе.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.OrderLabelsApi;

OrderLabelsApi apiInstance = new OrderLabelsApi();
Long campaignId = null; // Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
Long orderId = null; // Long | Идентификатор заказа.
try {
    GetOrderLabelsDataResponse result = apiInstance.getOrderLabelsData(campaignId, orderId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OrderLabelsApi#getOrderLabelsData");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **orderId** | **Long**| Идентификатор заказа. | [default to null]

### Return type

[**GetOrderLabelsDataResponse**](GetOrderLabelsDataResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

