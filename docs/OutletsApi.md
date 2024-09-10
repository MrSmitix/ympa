# OutletsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createOutlet**](OutletsApi.md#createOutlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж |
| [**deleteOutlet**](OutletsApi.md#deleteOutlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж |
| [**getOutlet**](OutletsApi.md#getOutlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж |
| [**getOutlets**](OutletsApi.md#getOutlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж |
| [**updateOutlet**](OutletsApi.md#updateOutlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж |


<a id="createOutlet"></a>
# **createOutlet**
> CreateOutletResponse createOutlet(campaignId, changeOutletRequest)

Создание точки продаж

Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = OutletsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val changeOutletRequest : ChangeOutletRequest =  // ChangeOutletRequest | 
try {
    val result : CreateOutletResponse = apiInstance.createOutlet(campaignId, changeOutletRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutletsApi#createOutlet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutletsApi#createOutlet")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **changeOutletRequest** | [**ChangeOutletRequest**](ChangeOutletRequest.md)|  | |

### Return type

[**CreateOutletResponse**](CreateOutletResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="deleteOutlet"></a>
# **deleteOutlet**
> EmptyApiResponse deleteOutlet(campaignId, outletId)

Удаление точки продаж

Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = OutletsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val outletId : kotlin.Long = 789 // kotlin.Long | Идентификатор точки продаж.
try {
    val result : EmptyApiResponse = apiInstance.deleteOutlet(campaignId, outletId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutletsApi#deleteOutlet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutletsApi#deleteOutlet")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **outletId** | **kotlin.Long**| Идентификатор точки продаж. | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOutlet"></a>
# **getOutlet**
> GetOutletResponse getOutlet(campaignId, outletId)

Информация об одной точке продаж

Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = OutletsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val outletId : kotlin.Long = 789 // kotlin.Long | Идентификатор точки продаж.
try {
    val result : GetOutletResponse = apiInstance.getOutlet(campaignId, outletId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutletsApi#getOutlet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutletsApi#getOutlet")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **outletId** | **kotlin.Long**| Идентификатор точки продаж. | |

### Return type

[**GetOutletResponse**](GetOutletResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="getOutlets"></a>
# **getOutlets**
> GetOutletsResponse getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2)

Информация о нескольких точках продаж

Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = OutletsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val regionId : kotlin.Long = 789 // kotlin.Long | Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md). 
val shopOutletCode : kotlin.String = shopOutletCode_example // kotlin.String | Идентификатор точки продаж, присвоенный магазином.
val regionId2 : kotlin.Long = 789 // kotlin.Long | {% note warning \"\" %}  Этот параметр устарел. Для указания региона используйте `region_id`.  {% endnote %} 
try {
    val result : GetOutletsResponse = apiInstance.getOutlets(campaignId, pageToken, regionId, shopOutletCode, regionId2)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutletsApi#getOutlets")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutletsApi#getOutlets")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **regionId** | **kotlin.Long**| Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md).  | [optional] |
| **shopOutletCode** | **kotlin.String**| Идентификатор точки продаж, присвоенный магазином. | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **regionId2** | **kotlin.Long**| {% note warning \&quot;\&quot; %}  Этот параметр устарел. Для указания региона используйте &#x60;region_id&#x60;.  {% endnote %}  | [optional] |

### Return type

[**GetOutletsResponse**](GetOutletsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a id="updateOutlet"></a>
# **updateOutlet**
> EmptyApiResponse updateOutlet(campaignId, outletId, changeOutletRequest)

Изменение информации о точке продаж

Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = OutletsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val outletId : kotlin.Long = 789 // kotlin.Long | Идентификатор точки продаж.
val changeOutletRequest : ChangeOutletRequest =  // ChangeOutletRequest | 
try {
    val result : EmptyApiResponse = apiInstance.updateOutlet(campaignId, outletId, changeOutletRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling OutletsApi#updateOutlet")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling OutletsApi#updateOutlet")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **outletId** | **kotlin.Long**| Идентификатор точки продаж. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **changeOutletRequest** | [**ChangeOutletRequest**](ChangeOutletRequest.md)|  | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

