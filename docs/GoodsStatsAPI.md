# GoodsStatsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GoodsStatsAPI_getGoodsStats**](GoodsStatsAPI.md#GoodsStatsAPI_getGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам


# **GoodsStatsAPI_getGoodsStats**
```c
// Отчет по товарам
//
// Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 
//
get_goods_stats_response_t* GoodsStatsAPI_getGoodsStats(apiClient_t *apiClient, long campaignId, get_goods_stats_request_t *get_goods_stats_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**campaignId** | **long** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
**get_goods_stats_request** | **[get_goods_stats_request_t](get_goods_stats_request.md) \*** |  | 

### Return type

[get_goods_stats_response_t](get_goods_stats_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

