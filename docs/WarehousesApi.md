# WarehousesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFulfillmentWarehouses**](WarehousesApi.md#getFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
[**getWarehouses**](WarehousesApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов



## getFulfillmentWarehouses

> GetFulfillmentWarehousesResponse getFulfillmentWarehouses()

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.WarehousesApi;

WarehousesApi apiInstance = new WarehousesApi();
try {
    GetFulfillmentWarehousesResponse result = apiInstance.getFulfillmentWarehouses();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehousesApi#getFulfillmentWarehouses");
    e.printStackTrace();
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetFulfillmentWarehousesResponse**](GetFulfillmentWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## getWarehouses

> GetWarehousesResponse getWarehouses(businessId)

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.WarehousesApi;

WarehousesApi apiInstance = new WarehousesApi();
Long businessId = null; // Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    GetWarehousesResponse result = apiInstance.getWarehouses(businessId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling WarehousesApi#getWarehouses");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]

### Return type

[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

