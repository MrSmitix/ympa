# OutletLicensesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**deleteOutletLicenses**](OutletLicensesApi.md#deleteOutletLicenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж |
| [**getOutletLicenses**](OutletLicensesApi.md#getOutletLicenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж |
| [**updateOutletLicenses**](OutletLicensesApi.md#updateOutletLicenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж |


<a id="deleteOutletLicenses"></a>
# **deleteOutletLicenses**
> EmptyApiResponse deleteOutletLicenses(campaignId, ids)

Удаление лицензий для точек продаж

Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = OutletLicensesApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val ids : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | Список идентификаторов лицензий.
try {
    val result : EmptyApiResponse = apiInstance.deleteOutletLicenses(campaignId, ids)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutletLicensesApi#deleteOutletLicenses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutletLicensesApi#deleteOutletLicenses")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ids** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)| Список идентификаторов лицензий. | [optional] |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOutletLicenses"></a>
# **getOutletLicenses**
> GetOutletLicensesResponse getOutletLicenses(campaignId, outletIds, ids)

Информация о лицензиях для точек продаж

Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = OutletLicensesApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val outletIds : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр `outletIds`, либо параметр `ids`. Запрос с обоими параметрами или без них приведет к ошибке. 
val ids : kotlin.collections.Set<kotlin.Long> =  // kotlin.collections.Set<kotlin.Long> | Список идентификаторов лицензий.
try {
    val result : GetOutletLicensesResponse = apiInstance.getOutletLicenses(campaignId, outletIds, ids)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutletLicensesApi#getOutletLicenses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutletLicensesApi#getOutletLicenses")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **outletIds** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)| Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр &#x60;outletIds&#x60;, либо параметр &#x60;ids&#x60;. Запрос с обоими параметрами или без них приведет к ошибке.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **ids** | [**kotlin.collections.Set&lt;kotlin.Long&gt;**](kotlin.Long.md)| Список идентификаторов лицензий. | [optional] |

### Return type

[**GetOutletLicensesResponse**](GetOutletLicensesResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateOutletLicenses"></a>
# **updateOutletLicenses**
> EmptyApiResponse updateOutletLicenses(campaignId, updateOutletLicenseRequest)

Создание и изменение лицензий для точек продаж

Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = OutletLicensesApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val updateOutletLicenseRequest : UpdateOutletLicenseRequest =  // UpdateOutletLicenseRequest | 
try {
    val result : EmptyApiResponse = apiInstance.updateOutletLicenses(campaignId, updateOutletLicenseRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutletLicensesApi#updateOutletLicenses")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutletLicensesApi#updateOutletLicenses")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **updateOutletLicenseRequest** | [**UpdateOutletLicenseRequest**](UpdateOutletLicenseRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

