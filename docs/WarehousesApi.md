# WarehousesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_fulfillment_warehouses**](WarehousesApi.md#get_fulfillment_warehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
[**get_warehouses**](WarehousesApi.md#get_warehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


# **get_fulfillment_warehouses**
> get_fulfillment_warehouses(_api::WarehousesApi; _mediaType=nothing) -> GetFulfillmentWarehousesResponse, OpenAPI.Clients.ApiResponse <br/>
> get_fulfillment_warehouses(_api::WarehousesApi, response_stream::Channel; _mediaType=nothing) -> Channel{ GetFulfillmentWarehousesResponse }, OpenAPI.Clients.ApiResponse

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Required Parameters
This endpoint does not need any parameter.

### Return type

[**GetFulfillmentWarehousesResponse**](GetFulfillmentWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_warehouses**
> get_warehouses(_api::WarehousesApi, business_id::Int64; _mediaType=nothing) -> GetWarehousesResponse, OpenAPI.Clients.ApiResponse <br/>
> get_warehouses(_api::WarehousesApi, response_stream::Channel, business_id::Int64; _mediaType=nothing) -> Channel{ GetWarehousesResponse }, OpenAPI.Clients.ApiResponse

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **WarehousesApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]

### Return type

[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

