# OpenapiClient::CategoriesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_categories_max_sale_quantum**](CategoriesApi.md#get_categories_max_sale_quantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе |
| [**get_categories_tree**](CategoriesApi.md#get_categories_tree) | **POST** /categories/tree | Дерево категорий |


## get_categories_max_sale_quantum

> <GetCategoriesMaxSaleQuantumResponse> get_categories_max_sale_quantum(get_categories_max_sale_quantum_request)

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::CategoriesApi.new
get_categories_max_sale_quantum_request = OpenapiClient::GetCategoriesMaxSaleQuantumRequest.new({market_category_ids: [3.56]}) # GetCategoriesMaxSaleQuantumRequest | 

begin
  # Лимит на установку кванта продажи и минимального количества товаров в заказе
  result = api_instance.get_categories_max_sale_quantum(get_categories_max_sale_quantum_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling CategoriesApi->get_categories_max_sale_quantum: #{e}"
end
```

#### Using the get_categories_max_sale_quantum_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCategoriesMaxSaleQuantumResponse>, Integer, Hash)> get_categories_max_sale_quantum_with_http_info(get_categories_max_sale_quantum_request)

```ruby
begin
  # Лимит на установку кванта продажи и минимального количества товаров в заказе
  data, status_code, headers = api_instance.get_categories_max_sale_quantum_with_http_info(get_categories_max_sale_quantum_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCategoriesMaxSaleQuantumResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling CategoriesApi->get_categories_max_sale_quantum_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **get_categories_max_sale_quantum_request** | [**GetCategoriesMaxSaleQuantumRequest**](GetCategoriesMaxSaleQuantumRequest.md) |  |  |

### Return type

[**GetCategoriesMaxSaleQuantumResponse**](GetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_categories_tree

> <GetCategoriesResponse> get_categories_tree(opts)

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::CategoriesApi.new
opts = {
  get_categories_request: OpenapiClient::GetCategoriesRequest.new # GetCategoriesRequest | 
}

begin
  # Дерево категорий
  result = api_instance.get_categories_tree(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling CategoriesApi->get_categories_tree: #{e}"
end
```

#### Using the get_categories_tree_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCategoriesResponse>, Integer, Hash)> get_categories_tree_with_http_info(opts)

```ruby
begin
  # Дерево категорий
  data, status_code, headers = api_instance.get_categories_tree_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCategoriesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling CategoriesApi->get_categories_tree_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **get_categories_request** | [**GetCategoriesRequest**](GetCategoriesRequest.md) |  | [optional] |

### Return type

[**GetCategoriesResponse**](GetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

