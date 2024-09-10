# BusinessesApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBusinessSettings**](BusinessesApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета



## getBusinessSettings

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 getBusinessSettings businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]

### Return type

[**GetBusinessSettingsResponse**](GetBusinessSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

