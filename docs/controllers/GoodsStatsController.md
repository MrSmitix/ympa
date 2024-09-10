# GoodsStatsController

All URIs are relative to `""`

The controller class is defined in **[GoodsStatsController.java](../../src/main/java/org/openapitools/controller/GoodsStatsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGoodsStats**](#getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам

<a id="getGoodsStats"></a>
# **getGoodsStats**
```java
Mono<GetGoodsStatsResponse> GoodsStatsController.getGoodsStats(campaignIdgetGoodsStatsRequest)
```

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**campaignId** | `Long` | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**getGoodsStatsRequest** | [**GetGoodsStatsRequest**](../../docs/models/GetGoodsStatsRequest.md) |  |

### Return type
[**GetGoodsStatsResponse**](../../docs/models/GetGoodsStatsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

