# OpenapiClient::StocksApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_stocks**](StocksApi.md#get_stocks) | **POST** /campaigns/{campaignId}/offers/stocks | Информация об остатках и оборачиваемости |
| [**update_stocks**](StocksApi.md#update_stocks) | **PUT** /campaigns/{campaignId}/offers/stocks | Передача информации об остатках |


## get_stocks

> <GetWarehouseStocksResponse> get_stocks(campaign_id, opts)

Информация об остатках и оборачиваемости

Возвращает данные об остатках товаров (для всех моделей) и об [оборачиваемости](*turnover) товаров (для модели FBY).  {% note info \"По умолчанию данные по оборачивамости не возращаются\" %}  Чтобы они были в ответе, передавайте `true` в поле `withTurnover`.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-|  [//]: <> (turnover: Среднее количество дней, за которое товар продается. Подробно об оборачиваемости рассказано в Справке Маркета для продавцов https://yandex.ru/support/marketplace/analytics/turnover.html.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::StocksApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_warehouse_stocks_request: OpenapiClient::GetWarehouseStocksRequest.new # GetWarehouseStocksRequest | 
}

begin
  # Информация об остатках и оборачиваемости
  result = api_instance.get_stocks(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StocksApi->get_stocks: #{e}"
end
```

#### Using the get_stocks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetWarehouseStocksResponse>, Integer, Hash)> get_stocks_with_http_info(campaign_id, opts)

```ruby
begin
  # Информация об остатках и оборачиваемости
  data, status_code, headers = api_instance.get_stocks_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetWarehouseStocksResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StocksApi->get_stocks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_warehouse_stocks_request** | [**GetWarehouseStocksRequest**](GetWarehouseStocksRequest.md) |  | [optional] |

### Return type

[**GetWarehouseStocksResponse**](GetWarehouseStocksResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_stocks

> <EmptyApiResponse> update_stocks(campaign_id, update_stocks_request)

Передача информации об остатках

Передает данные об остатках товаров на витрине.  Обязательно указывайте SKU **в точности** так, как он указан в каталоге. Например, _557722_ и _0557722_ — это два разных SKU.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 100 000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::StocksApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_stocks_request = OpenapiClient::UpdateStocksRequest.new({skus: [OpenapiClient::UpdateStockDTO.new({sku: 'sku_example', items: [OpenapiClient::UpdateStockItemDTO.new({count: 3.56})]})]}) # UpdateStocksRequest | 

begin
  # Передача информации об остатках
  result = api_instance.update_stocks(campaign_id, update_stocks_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling StocksApi->update_stocks: #{e}"
end
```

#### Using the update_stocks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_stocks_with_http_info(campaign_id, update_stocks_request)

```ruby
begin
  # Передача информации об остатках
  data, status_code, headers = api_instance.update_stocks_with_http_info(campaign_id, update_stocks_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling StocksApi->update_stocks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_stocks_request** | [**UpdateStocksRequest**](UpdateStocksRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

