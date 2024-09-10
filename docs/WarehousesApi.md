# WarehousesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getFulfillmentWarehouses**](WarehousesApi.md#getFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY) |
| [**getWarehouses**](WarehousesApi.md#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов |


<a id="getFulfillmentWarehouses"></a>
# **getFulfillmentWarehouses**
> GetFulfillmentWarehousesResponse getFulfillmentWarehouses()

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = WarehousesApi()
try {
    val result : GetFulfillmentWarehousesResponse = apiInstance.getFulfillmentWarehouses()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarehousesApi#getFulfillmentWarehouses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarehousesApi#getFulfillmentWarehouses")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetFulfillmentWarehousesResponse**](GetFulfillmentWarehousesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getWarehouses"></a>
# **getWarehouses**
> GetWarehousesResponse getWarehouses(businessId)

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = WarehousesApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetWarehousesResponse = apiInstance.getWarehouses(businessId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling WarehousesApi#getWarehouses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling WarehousesApi#getWarehouses")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

