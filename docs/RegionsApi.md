# OpenapiClient::RegionsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**search_region_children**](RegionsApi.md#search_region_children) | **GET** /regions/{regionId}/children | Информация о дочерних регионах |
| [**search_regions_by_id**](RegionsApi.md#search_regions_by_id) | **GET** /regions/{regionId} | Информация о регионе |
| [**search_regions_by_name**](RegionsApi.md#search_regions_by_name) | **GET** /regions | Поиск регионов по их имени |


## search_region_children

> <GetRegionWithChildrenResponse> search_region_children(region_id, opts)

Информация о дочерних регионах

Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::RegionsApi.new
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
opts = {
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Информация о дочерних регионах
  result = api_instance.search_region_children(region_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RegionsApi->search_region_children: #{e}"
end
```

#### Using the search_region_children_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetRegionWithChildrenResponse>, Integer, Hash)> search_region_children_with_http_info(region_id, opts)

```ruby
begin
  # Информация о дочерних регионах
  data, status_code, headers = api_instance.search_region_children_with_http_info(region_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetRegionWithChildrenResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RegionsApi->search_region_children_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetRegionWithChildrenResponse**](GetRegionWithChildrenResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## search_regions_by_id

> <GetRegionsResponse> search_regions_by_id(region_id)

Информация о регионе

Возвращает информацию о регионе.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::RegionsApi.new
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 

begin
  # Информация о регионе
  result = api_instance.search_regions_by_id(region_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RegionsApi->search_regions_by_id: #{e}"
end
```

#### Using the search_regions_by_id_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetRegionsResponse>, Integer, Hash)> search_regions_by_id_with_http_info(region_id)

```ruby
begin
  # Информация о регионе
  data, status_code, headers = api_instance.search_regions_by_id_with_http_info(region_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetRegionsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RegionsApi->search_regions_by_id_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## search_regions_by_name

> <GetRegionsResponse> search_regions_by_name(name, opts)

Поиск регионов по их имени

Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.  Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.  Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).  Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.  |**⚙️ Лимит:** 50 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::RegionsApi.new
name = 'name_example' # String | Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Поиск регионов по их имени
  result = api_instance.search_regions_by_name(name, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling RegionsApi->search_regions_by_name: #{e}"
end
```

#### Using the search_regions_by_name_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetRegionsResponse>, Integer, Hash)> search_regions_by_name_with_http_info(name, opts)

```ruby
begin
  # Поиск регионов по их имени
  data, status_code, headers = api_instance.search_regions_by_name_with_http_info(name, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetRegionsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling RegionsApi->search_regions_by_name_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **name** | **String** | Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, &#x60;Москва&#x60;.  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetRegionsResponse**](GetRegionsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

