# OpenapiClient::OutletsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_outlet**](OutletsApi.md#create_outlet) | **POST** /campaigns/{campaignId}/outlets | Создание точки продаж |
| [**delete_outlet**](OutletsApi.md#delete_outlet) | **DELETE** /campaigns/{campaignId}/outlets/{outletId} | Удаление точки продаж |
| [**get_outlet**](OutletsApi.md#get_outlet) | **GET** /campaigns/{campaignId}/outlets/{outletId} | Информация об одной точке продаж |
| [**get_outlets**](OutletsApi.md#get_outlets) | **GET** /campaigns/{campaignId}/outlets | Информация о нескольких точках продаж |
| [**update_outlet**](OutletsApi.md#update_outlet) | **PUT** /campaigns/{campaignId}/outlets/{outletId} | Изменение информации о точке продаж |


## create_outlet

> <CreateOutletResponse> create_outlet(campaign_id, change_outlet_request)

Создание точки продаж

Создает точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OutletsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
change_outlet_request = OpenapiClient::ChangeOutletRequest.new({name: 'name_example', type: OpenapiClient::OutletType::DEPOT, address: OpenapiClient::OutletAddressDTO.new({region_id: 3.56}), phones: ['phones_example'], working_schedule: OpenapiClient::OutletWorkingScheduleDTO.new({schedule_items: [OpenapiClient::OutletWorkingScheduleItemDTO.new({start_day: OpenapiClient::DayOfWeekType::MONDAY, end_day: OpenapiClient::DayOfWeekType::MONDAY, start_time: 'start_time_example', end_time: 'end_time_example'})]})}) # ChangeOutletRequest | 

begin
  # Создание точки продаж
  result = api_instance.create_outlet(campaign_id, change_outlet_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletsApi->create_outlet: #{e}"
end
```

#### Using the create_outlet_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateOutletResponse>, Integer, Hash)> create_outlet_with_http_info(campaign_id, change_outlet_request)

```ruby
begin
  # Создание точки продаж
  data, status_code, headers = api_instance.create_outlet_with_http_info(campaign_id, change_outlet_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateOutletResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletsApi->create_outlet_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **change_outlet_request** | [**ChangeOutletRequest**](ChangeOutletRequest.md) |  |  |

### Return type

[**CreateOutletResponse**](CreateOutletResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_outlet

> <EmptyApiResponse> delete_outlet(campaign_id, outlet_id)

Удаление точки продаж

Удаляет точку продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OutletsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
outlet_id = 789 # Integer | Идентификатор точки продаж.

begin
  # Удаление точки продаж
  result = api_instance.delete_outlet(campaign_id, outlet_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletsApi->delete_outlet: #{e}"
end
```

#### Using the delete_outlet_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> delete_outlet_with_http_info(campaign_id, outlet_id)

```ruby
begin
  # Удаление точки продаж
  data, status_code, headers = api_instance.delete_outlet_with_http_info(campaign_id, outlet_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletsApi->delete_outlet_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **outlet_id** | **Integer** | Идентификатор точки продаж. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_outlet

> <GetOutletResponse> get_outlet(campaign_id, outlet_id)

Информация об одной точке продаж

Возвращает информацию о точках продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OutletsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
outlet_id = 789 # Integer | Идентификатор точки продаж.

begin
  # Информация об одной точке продаж
  result = api_instance.get_outlet(campaign_id, outlet_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletsApi->get_outlet: #{e}"
end
```

#### Using the get_outlet_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOutletResponse>, Integer, Hash)> get_outlet_with_http_info(campaign_id, outlet_id)

```ruby
begin
  # Информация об одной точке продаж
  data, status_code, headers = api_instance.get_outlet_with_http_info(campaign_id, outlet_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOutletResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletsApi->get_outlet_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **outlet_id** | **Integer** | Идентификатор точки продаж. |  |

### Return type

[**GetOutletResponse**](GetOutletResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_outlets

> <GetOutletsResponse> get_outlets(campaign_id, opts)

Информация о нескольких точках продаж

Возвращает список точек продаж магазина.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OutletsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  region_id: 789, # Integer | Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md). 
  shop_outlet_code: 'shop_outlet_code_example', # String | Идентификатор точки продаж, присвоенный магазином.
  region_id2: 789 # Integer | {% note warning \"\" %}  Этот параметр устарел. Для указания региона используйте `region_id`.  {% endnote %} 
}

begin
  # Информация о нескольких точках продаж
  result = api_instance.get_outlets(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletsApi->get_outlets: #{e}"
end
```

#### Using the get_outlets_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOutletsResponse>, Integer, Hash)> get_outlets_with_http_info(campaign_id, opts)

```ruby
begin
  # Информация о нескольких точках продаж
  data, status_code, headers = api_instance.get_outlets_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOutletsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletsApi->get_outlets_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **region_id** | **Integer** | Идентификатор региона. Если задать идентификатор родительского региона любого уровня, в выходных данных будут отображены точки продаж всех дочерних регионов. Идентификатор региона можно получить c помощью метода [GET regions](../../reference/regions/searchRegionsByName.md).  | [optional] |
| **shop_outlet_code** | **String** | Идентификатор точки продаж, присвоенный магазином. | [optional] |
| **region_id2** | **Integer** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Для указания региона используйте &#x60;region_id&#x60;.  {% endnote %}  | [optional] |

### Return type

[**GetOutletsResponse**](GetOutletsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_outlet

> <EmptyApiResponse> update_outlet(campaign_id, outlet_id, change_outlet_request)

Изменение информации о точке продаж

Изменяет информацию о точке продаж магазина на Маркете.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OutletsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
outlet_id = 789 # Integer | Идентификатор точки продаж.
change_outlet_request = OpenapiClient::ChangeOutletRequest.new({name: 'name_example', type: OpenapiClient::OutletType::DEPOT, address: OpenapiClient::OutletAddressDTO.new({region_id: 3.56}), phones: ['phones_example'], working_schedule: OpenapiClient::OutletWorkingScheduleDTO.new({schedule_items: [OpenapiClient::OutletWorkingScheduleItemDTO.new({start_day: OpenapiClient::DayOfWeekType::MONDAY, end_day: OpenapiClient::DayOfWeekType::MONDAY, start_time: 'start_time_example', end_time: 'end_time_example'})]})}) # ChangeOutletRequest | 

begin
  # Изменение информации о точке продаж
  result = api_instance.update_outlet(campaign_id, outlet_id, change_outlet_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletsApi->update_outlet: #{e}"
end
```

#### Using the update_outlet_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_outlet_with_http_info(campaign_id, outlet_id, change_outlet_request)

```ruby
begin
  # Изменение информации о точке продаж
  data, status_code, headers = api_instance.update_outlet_with_http_info(campaign_id, outlet_id, change_outlet_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletsApi->update_outlet_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **outlet_id** | **Integer** | Идентификатор точки продаж. |  |
| **change_outlet_request** | [**ChangeOutletRequest**](ChangeOutletRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

