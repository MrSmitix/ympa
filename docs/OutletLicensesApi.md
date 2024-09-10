# OpenapiClient::OutletLicensesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**delete_outlet_licenses**](OutletLicensesApi.md#delete_outlet_licenses) | **DELETE** /campaigns/{campaignId}/outlets/licenses | Удаление лицензий для точек продаж |
| [**get_outlet_licenses**](OutletLicensesApi.md#get_outlet_licenses) | **GET** /campaigns/{campaignId}/outlets/licenses | Информация о лицензиях для точек продаж |
| [**update_outlet_licenses**](OutletLicensesApi.md#update_outlet_licenses) | **POST** /campaigns/{campaignId}/outlets/licenses | Создание и изменение лицензий для точек продаж |


## delete_outlet_licenses

> <EmptyApiResponse> delete_outlet_licenses(campaign_id, opts)

Удаление лицензий для точек продаж

Удаляет информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OutletLicensesApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  ids: [3.56] # Array<Integer> | Список идентификаторов лицензий.
}

begin
  # Удаление лицензий для точек продаж
  result = api_instance.delete_outlet_licenses(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletLicensesApi->delete_outlet_licenses: #{e}"
end
```

#### Using the delete_outlet_licenses_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> delete_outlet_licenses_with_http_info(campaign_id, opts)

```ruby
begin
  # Удаление лицензий для точек продаж
  data, status_code, headers = api_instance.delete_outlet_licenses_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletLicensesApi->delete_outlet_licenses_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **ids** | [**Array&lt;Integer&gt;**](Integer.md) | Список идентификаторов лицензий. | [optional] |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_outlet_licenses

> <GetOutletLicensesResponse> get_outlet_licenses(campaign_id, opts)

Информация о лицензиях для точек продаж

Возвращает информацию о лицензиях для точек продаж.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OutletLicensesApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  outlet_ids: [3.56], # Array<Integer> | Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр `outletIds`, либо параметр `ids`. Запрос с обоими параметрами или без них приведет к ошибке. 
  ids: [3.56] # Array<Integer> | Список идентификаторов лицензий.
}

begin
  # Информация о лицензиях для точек продаж
  result = api_instance.get_outlet_licenses(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletLicensesApi->get_outlet_licenses: #{e}"
end
```

#### Using the get_outlet_licenses_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOutletLicensesResponse>, Integer, Hash)> get_outlet_licenses_with_http_info(campaign_id, opts)

```ruby
begin
  # Информация о лицензиях для точек продаж
  data, status_code, headers = api_instance.get_outlet_licenses_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOutletLicensesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletLicensesApi->get_outlet_licenses_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **outlet_ids** | [**Array&lt;Integer&gt;**](Integer.md) | Список идентификаторов точек продаж, для которых нужно получить информацию о лицензиях. Идентификаторы указываются через запятую.  В запросе должен быть либо параметр &#x60;outletIds&#x60;, либо параметр &#x60;ids&#x60;. Запрос с обоими параметрами или без них приведет к ошибке.  | [optional] |
| **ids** | [**Array&lt;Integer&gt;**](Integer.md) | Список идентификаторов лицензий. | [optional] |

### Return type

[**GetOutletLicensesResponse**](GetOutletLicensesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## update_outlet_licenses

> <EmptyApiResponse> update_outlet_licenses(campaign_id, update_outlet_license_request)

Создание и изменение лицензий для точек продаж

Передает информацию о новых и существующих лицензиях для точек продаж. Поддерживаются только лицензии на розничную продажу алкоголя.  Чтобы размещать алкогольную продукцию на Маркете, надо также прислать гарантийное письмо (если вы еще не делали этого раньше) и правильно оформить предложения в прайс-листе. Далее информация о лицензиях проходит проверку.  В течение суток этим и другими запросами о точках продаж, кроме запроса [GET delivery/services](../../reference/orders/getDeliveryServices.md), можно получить и изменить информацию об определенном суммарном количестве точек продаж. Оно зависит от количества точек продаж магазина.  |**⚙️ Лимит:** 100 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::OutletLicensesApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_outlet_license_request = OpenapiClient::UpdateOutletLicenseRequest.new({licenses: [OpenapiClient::OutletLicenseDTO.new]}) # UpdateOutletLicenseRequest | 

begin
  # Создание и изменение лицензий для точек продаж
  result = api_instance.update_outlet_licenses(campaign_id, update_outlet_license_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletLicensesApi->update_outlet_licenses: #{e}"
end
```

#### Using the update_outlet_licenses_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_outlet_licenses_with_http_info(campaign_id, update_outlet_license_request)

```ruby
begin
  # Создание и изменение лицензий для точек продаж
  data, status_code, headers = api_instance.update_outlet_licenses_with_http_info(campaign_id, update_outlet_license_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling OutletLicensesApi->update_outlet_licenses_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_outlet_license_request** | [**UpdateOutletLicenseRequest**](UpdateOutletLicenseRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

