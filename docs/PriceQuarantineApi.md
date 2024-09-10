# OpenapiClient::PriceQuarantineApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**confirm_business_prices**](PriceQuarantineApi.md#confirm_business_prices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете |
| [**confirm_campaign_prices**](PriceQuarantineApi.md#confirm_campaign_prices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине |
| [**get_business_quarantine_offers**](PriceQuarantineApi.md#get_business_quarantine_offers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете |
| [**get_campaign_quarantine_offers**](PriceQuarantineApi.md#get_campaign_quarantine_offers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине |


## confirm_business_prices

> <EmptyApiResponse> confirm_business_prices(business_id, confirm_prices_request)

Удаление товара из карантина по цене в кабинете

Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PriceQuarantineApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
confirm_prices_request = OpenapiClient::ConfirmPricesRequest.new({offer_ids: ['offer_ids_example']}) # ConfirmPricesRequest | 

begin
  # Удаление товара из карантина по цене в кабинете
  result = api_instance.confirm_business_prices(business_id, confirm_prices_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PriceQuarantineApi->confirm_business_prices: #{e}"
end
```

#### Using the confirm_business_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> confirm_business_prices_with_http_info(business_id, confirm_prices_request)

```ruby
begin
  # Удаление товара из карантина по цене в кабинете
  data, status_code, headers = api_instance.confirm_business_prices_with_http_info(business_id, confirm_prices_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PriceQuarantineApi->confirm_business_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **confirm_prices_request** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## confirm_campaign_prices

> <EmptyApiResponse> confirm_campaign_prices(campaign_id, confirm_prices_request)

Удаление товара из карантина по цене в магазине

Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PriceQuarantineApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
confirm_prices_request = OpenapiClient::ConfirmPricesRequest.new({offer_ids: ['offer_ids_example']}) # ConfirmPricesRequest | 

begin
  # Удаление товара из карантина по цене в магазине
  result = api_instance.confirm_campaign_prices(campaign_id, confirm_prices_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PriceQuarantineApi->confirm_campaign_prices: #{e}"
end
```

#### Using the confirm_campaign_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> confirm_campaign_prices_with_http_info(campaign_id, confirm_prices_request)

```ruby
begin
  # Удаление товара из карантина по цене в магазине
  data, status_code, headers = api_instance.confirm_campaign_prices_with_http_info(campaign_id, confirm_prices_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PriceQuarantineApi->confirm_campaign_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **confirm_prices_request** | [**ConfirmPricesRequest**](ConfirmPricesRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_business_quarantine_offers

> <GetQuarantineOffersResponse> get_business_quarantine_offers(business_id, get_quarantine_offers_request, opts)

Список товаров, находящихся в карантине по цене в кабинете

Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PriceQuarantineApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_quarantine_offers_request = OpenapiClient::GetQuarantineOffersRequest.new # GetQuarantineOffersRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Список товаров, находящихся в карантине по цене в кабинете
  result = api_instance.get_business_quarantine_offers(business_id, get_quarantine_offers_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PriceQuarantineApi->get_business_quarantine_offers: #{e}"
end
```

#### Using the get_business_quarantine_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetQuarantineOffersResponse>, Integer, Hash)> get_business_quarantine_offers_with_http_info(business_id, get_quarantine_offers_request, opts)

```ruby
begin
  # Список товаров, находящихся в карантине по цене в кабинете
  data, status_code, headers = api_instance.get_business_quarantine_offers_with_http_info(business_id, get_quarantine_offers_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetQuarantineOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PriceQuarantineApi->get_business_quarantine_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_quarantine_offers_request** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_campaign_quarantine_offers

> <GetQuarantineOffersResponse> get_campaign_quarantine_offers(campaign_id, get_quarantine_offers_request, opts)

Список товаров, находящихся в карантине по цене в магазине

Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PriceQuarantineApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_quarantine_offers_request = OpenapiClient::GetQuarantineOffersRequest.new # GetQuarantineOffersRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Список товаров, находящихся в карантине по цене в магазине
  result = api_instance.get_campaign_quarantine_offers(campaign_id, get_quarantine_offers_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PriceQuarantineApi->get_campaign_quarantine_offers: #{e}"
end
```

#### Using the get_campaign_quarantine_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetQuarantineOffersResponse>, Integer, Hash)> get_campaign_quarantine_offers_with_http_info(campaign_id, get_quarantine_offers_request, opts)

```ruby
begin
  # Список товаров, находящихся в карантине по цене в магазине
  data, status_code, headers = api_instance.get_campaign_quarantine_offers_with_http_info(campaign_id, get_quarantine_offers_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetQuarantineOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PriceQuarantineApi->get_campaign_quarantine_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_quarantine_offers_request** | [**GetQuarantineOffersRequest**](GetQuarantineOffersRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetQuarantineOffersResponse**](GetQuarantineOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

