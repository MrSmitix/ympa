# BusinessesController

All URIs are relative to `""`

The controller class is defined in **[BusinessesController.java](../../src/main/java/org/openapitools/controller/BusinessesController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getBusinessSettings**](#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета

<a id="getBusinessSettings"></a>
# **getBusinessSettings**
```java
Mono<GetBusinessSettingsResponse> BusinessesController.getBusinessSettings(businessId)
```

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |

### Return type
[**GetBusinessSettingsResponse**](../../docs/models/GetBusinessSettingsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

