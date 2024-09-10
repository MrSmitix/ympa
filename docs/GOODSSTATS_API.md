# GOODSSTATS_API

All URIs are relative to *https://api.partner.market.yandex.ru*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**goods_stats**](GOODSSTATS_API.md#goods_stats) | **Post** /campaigns/{campaignId}/stats/skus | Отчет по товарам


# **goods_stats**
> goods_stats (campaign_id: INTEGER_64 ; get_goods_stats_request: GET_GOODS_STATS_REQUEST ): detachable GET_GOODS_STATS_RESPONSE


Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **INTEGER_64**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **get_goods_stats_request** | [**GET_GOODS_STATS_REQUEST**](GET_GOODS_STATS_REQUEST.md)|  | 

### Return type

[**GET_GOODS_STATS_RESPONSE**](GetGoodsStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

