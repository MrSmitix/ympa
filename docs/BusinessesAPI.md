# BusinessesAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**BusinessesAPI_getBusinessSettings**](BusinessesAPI.md#BusinessesAPI_getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета


# **BusinessesAPI_getBusinessSettings**
```c
// Настройки кабинета
//
// Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
get_business_settings_response_t* BusinessesAPI_getBusinessSettings(apiClient_t *apiClient, long businessId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**businessId** | **long** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[get_business_settings_response_t](get_business_settings_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

