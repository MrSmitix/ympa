# OpenapiClient::RatingsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_quality_rating_details**](RatingsApi.md#get_quality_rating_details) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества |
| [**get_quality_ratings**](RatingsApi.md#get_quality_ratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов |


## get_quality_rating_details

> <GetQualityRatingDetailsResponse> get_quality_rating_details(campaign_id)

Заказы, которые повлияли на индекс качества

Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::RatingsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Заказы, которые повлияли на индекс качества
  result = api_instance.get_quality_rating_details(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RatingsApi->get_quality_rating_details: #{e}"
end
```

#### Using the get_quality_rating_details_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetQualityRatingDetailsResponse>, Integer, Hash)> get_quality_rating_details_with_http_info(campaign_id)

```ruby
begin
  # Заказы, которые повлияли на индекс качества
  data, status_code, headers = api_instance.get_quality_rating_details_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetQualityRatingDetailsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RatingsApi->get_quality_rating_details_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetQualityRatingDetailsResponse**](GetQualityRatingDetailsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_quality_ratings

> <GetQualityRatingResponse> get_quality_ratings(business_id, get_quality_rating_request)

Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::RatingsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_quality_rating_request = OpenapiClient::GetQualityRatingRequest.new({campaign_ids: [3.56]}) # GetQualityRatingRequest | 

begin
  # Индекс качества магазинов
  result = api_instance.get_quality_ratings(business_id, get_quality_rating_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RatingsApi->get_quality_ratings: #{e}"
end
```

#### Using the get_quality_ratings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetQualityRatingResponse>, Integer, Hash)> get_quality_ratings_with_http_info(business_id, get_quality_rating_request)

```ruby
begin
  # Индекс качества магазинов
  data, status_code, headers = api_instance.get_quality_ratings_with_http_info(business_id, get_quality_rating_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetQualityRatingResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RatingsApi->get_quality_ratings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_quality_rating_request** | [**GetQualityRatingRequest**](GetQualityRatingRequest.md) |  |  |

### Return type

[**GetQualityRatingResponse**](GetQualityRatingResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

