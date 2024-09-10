# WarehousesAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**WarehousesAPI_getFulfillmentWarehouses**](WarehousesAPI.md#WarehousesAPI_getFulfillmentWarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
[**WarehousesAPI_getWarehouses**](WarehousesAPI.md#WarehousesAPI_getWarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


# **WarehousesAPI_getFulfillmentWarehouses**
```c
// Идентификаторы складов Маркета (FBY)
//
// Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_fulfillment_warehouses_response_t* WarehousesAPI_getFulfillmentWarehouses(apiClient_t *apiClient);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |

### Return type

[get_fulfillment_warehouses_response_t](get_fulfillment_warehouses_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **WarehousesAPI_getWarehouses**
```c
// Список складов и групп складов
//
// Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_warehouses_response_t* WarehousesAPI_getWarehouses(apiClient_t *apiClient, long businessId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[get_warehouses_response_t](get_warehouses_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

