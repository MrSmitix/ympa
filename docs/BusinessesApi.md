# BusinessesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getBusinessSettings**](BusinessesApi.md#getBusinessSettings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |


<a id="getBusinessSettings"></a>
# **getBusinessSettings**
> GetBusinessSettingsResponse getBusinessSettings(businessId)

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = BusinessesApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
try {
    val result : GetBusinessSettingsResponse = apiInstance.getBusinessSettings(businessId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling BusinessesApi#getBusinessSettings")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling BusinessesApi#getBusinessSettings")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |

### Return type

[**GetBusinessSettingsResponse**](GetBusinessSettingsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

