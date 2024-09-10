# DeliveryServicesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getDeliveryServices**](DeliveryServicesApi.md#getDeliveryServices) | **GET** /delivery/services | Справочник служб доставки |


<a id="getDeliveryServices"></a>
# **getDeliveryServices**
> GetDeliveryServicesResponse getDeliveryServices()

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = DeliveryServicesApi()
try {
    val result : GetDeliveryServicesResponse = apiInstance.getDeliveryServices()
    println(result)
} catch (e: ClientException) {
    println("4xx response calling DeliveryServicesApi#getDeliveryServices")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling DeliveryServicesApi#getDeliveryServices")
    e.printStackTrace()
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

