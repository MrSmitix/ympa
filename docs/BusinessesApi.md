# BusinessesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**get_business_settings**](BusinessesApi.md#get_business_settings) | **POST** /businesses/{businessId}/settings | Настройки кабинета


# **get_business_settings**
> get_business_settings(_api::BusinessesApi, business_id::Int64; _mediaType=nothing) -> GetBusinessSettingsResponse, OpenAPI.Clients.ApiResponse <br/>
> get_business_settings(_api::BusinessesApi, response_stream::Channel, business_id::Int64; _mediaType=nothing) -> Channel{ GetBusinessSettingsResponse }, OpenAPI.Clients.ApiResponse

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **BusinessesApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]

### Return type

[**GetBusinessSettingsResponse**](GetBusinessSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

