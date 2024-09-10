# GoodsStatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**getGoodsStats**](GoodsStatsApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам |


<a id="getGoodsStats"></a>
# **getGoodsStats**
> GetGoodsStatsResponse getGoodsStats(campaignId, getGoodsStatsRequest)

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = GoodsStatsApi()
val campaignId : kotlin.Long = 789 // kotlin.Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getGoodsStatsRequest : GetGoodsStatsRequest =  // GetGoodsStatsRequest | 
try {
    val result : GetGoodsStatsResponse = apiInstance.getGoodsStats(campaignId, getGoodsStatsRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling GoodsStatsApi#getGoodsStats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling GoodsStatsApi#getGoodsStats")
    e.printStackTrace()
}
```

### Parameters
| **campaignId** | **kotlin.Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **getGoodsStatsRequest** | [**GetGoodsStatsRequest**](GetGoodsStatsRequest.md)|  | |

### Return type

[**GetGoodsStatsResponse**](GetGoodsStatsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

