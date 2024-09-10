# OpenapiClient::GoodsStatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_goods_stats**](GoodsStatsApi.md#get_goods_stats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам |


## get_goods_stats

> <GetGoodsStatsResponse> get_goods_stats(campaign_id, get_goods_stats_request)

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::GoodsStatsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_goods_stats_request = OpenapiClient::GetGoodsStatsRequest.new({shop_skus: ['shop_skus_example']}) # GetGoodsStatsRequest | 

begin
  # Отчет по товарам
  result = api_instance.get_goods_stats(campaign_id, get_goods_stats_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsStatsApi->get_goods_stats: #{e}"
end
```

#### Using the get_goods_stats_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetGoodsStatsResponse>, Integer, Hash)> get_goods_stats_with_http_info(campaign_id, get_goods_stats_request)

```ruby
begin
  # Отчет по товарам
  data, status_code, headers = api_instance.get_goods_stats_with_http_info(campaign_id, get_goods_stats_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetGoodsStatsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsStatsApi->get_goods_stats_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_goods_stats_request** | [**GetGoodsStatsRequest**](GetGoodsStatsRequest.md) |  |  |

### Return type

[**GetGoodsStatsResponse**](GetGoodsStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

