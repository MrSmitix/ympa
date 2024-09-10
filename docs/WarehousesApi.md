# OpenapiClient::WarehousesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_fulfillment_warehouses**](WarehousesApi.md#get_fulfillment_warehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY) |
| [**get_warehouses**](WarehousesApi.md#get_warehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов |


## get_fulfillment_warehouses

> <GetFulfillmentWarehousesResponse> get_fulfillment_warehouses

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::WarehousesApi.new

begin
  # Идентификаторы складов Маркета (FBY)
  result = api_instance.get_fulfillment_warehouses
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling WarehousesApi->get_fulfillment_warehouses: #{e}"
end
```

#### Using the get_fulfillment_warehouses_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetFulfillmentWarehousesResponse>, Integer, Hash)> get_fulfillment_warehouses_with_http_info

```ruby
begin
  # Идентификаторы складов Маркета (FBY)
  data, status_code, headers = api_instance.get_fulfillment_warehouses_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetFulfillmentWarehousesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling WarehousesApi->get_fulfillment_warehouses_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetFulfillmentWarehousesResponse**](GetFulfillmentWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_warehouses

> <GetWarehousesResponse> get_warehouses(business_id)

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::WarehousesApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Список складов и групп складов
  result = api_instance.get_warehouses(business_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling WarehousesApi->get_warehouses: #{e}"
end
```

#### Using the get_warehouses_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetWarehousesResponse>, Integer, Hash)> get_warehouses_with_http_info(business_id)

```ruby
begin
  # Список складов и групп складов
  data, status_code, headers = api_instance.get_warehouses_with_http_info(business_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetWarehousesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling WarehousesApi->get_warehouses_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetWarehousesResponse**](GetWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

