# GoodsStatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GetGoodsStats**](GoodsStatsApi.md#GetGoodsStats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам


# **GetGoodsStats**
> GetGoodsStatsResponse GetGoodsStats(campaign_id, get_goods_stats_request)

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по товарам
#
# prepare function argument(s)
var_campaign_id <- 56 # integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
var_get_goods_stats_request <- GetGoodsStatsRequest$new(c("shopSkus_example")) # GetGoodsStatsRequest | 

api_instance <- GoodsStatsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetGoodsStats(var_campaign_id, var_get_goods_stats_requestdata_file = "result.txt")
result <- api_instance$GetGoodsStats(var_campaign_id, var_get_goods_stats_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaign_id** | **integer**| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **get_goods_stats_request** | [**GetGoodsStatsRequest**](GetGoodsStatsRequest.md)|  | 

### Return type

[**GetGoodsStatsResponse**](GetGoodsStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Отчет по товарам. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

