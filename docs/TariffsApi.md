# TariffsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**calculateTariffs**](TariffsApi.md#calculateTariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг |


<a id="calculateTariffs"></a>
# **calculateTariffs**
> CalculateTariffsResponse calculateTariffs(calculateTariffsRequest)

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр &#x60;campaignId&#x60;, либо &#x60;sellingProgram&#x60;. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = TariffsApi()
val calculateTariffsRequest : CalculateTariffsRequest =  // CalculateTariffsRequest | 
try {
    val result : CalculateTariffsResponse = apiInstance.calculateTariffs(calculateTariffsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling TariffsApi#calculateTariffs")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling TariffsApi#calculateTariffs")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **calculateTariffsRequest** | [**CalculateTariffsRequest**](CalculateTariffsRequest.md)|  | |

### Return type

[**CalculateTariffsResponse**](CalculateTariffsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

