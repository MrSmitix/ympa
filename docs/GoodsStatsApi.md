# GoodsStatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGoodsStats**](GoodsStatsApi.md#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам



## getGoodsStats

> GetGoodsStatsResponse getGoodsStats(campaignId, getGoodsStatsRequest)

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.GoodsStatsApi;

GoodsStatsApi apiInstance = new GoodsStatsApi();
Long campaignId = null; // Long | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
GetGoodsStatsRequest getGoodsStatsRequest = new GetGoodsStatsRequest(); // GetGoodsStatsRequest | 
try {
    GetGoodsStatsResponse result = apiInstance.getGoodsStats(campaignId, getGoodsStatsRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling GoodsStatsApi#getGoodsStats");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **Long**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **getGoodsStatsRequest** | [**GetGoodsStatsRequest**](GetGoodsStatsRequest.md)|  |

### Return type

[**GetGoodsStatsResponse**](GetGoodsStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

