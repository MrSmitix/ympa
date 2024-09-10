# WarehousesController

All URIs are relative to `""`

The controller class is defined in **[WarehousesController.java](../../src/main/java/org/openapitools/controller/WarehousesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFulfillmentWarehouses**](#getFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
[**getWarehouses**](#getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов

<a id="getFulfillmentWarehouses"></a>
# **getFulfillmentWarehouses**
```java
Mono<GetFulfillmentWarehousesResponse> WarehousesController.getFulfillmentWarehouses()
```

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 


### Return type
[**GetFulfillmentWarehousesResponse**](../../docs/models/GetFulfillmentWarehousesResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

<a id="getWarehouses"></a>
# **getWarehouses**
```java
Mono<GetWarehousesResponse> WarehousesController.getWarehouses(businessId)
```

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |

### Return type
[**GetWarehousesResponse**](../../docs/models/GetWarehousesResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

