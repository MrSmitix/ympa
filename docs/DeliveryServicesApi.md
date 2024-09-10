# OpenapiClient::DeliveryServicesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_delivery_services**](DeliveryServicesApi.md#get_delivery_services) | **GET** /delivery/services | Справочник служб доставки |


## get_delivery_services

> <GetDeliveryServicesResponse> get_delivery_services

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::DeliveryServicesApi.new

begin
  # Справочник служб доставки
  result = api_instance.get_delivery_services
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling DeliveryServicesApi->get_delivery_services: #{e}"
end
```

#### Using the get_delivery_services_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetDeliveryServicesResponse>, Integer, Hash)> get_delivery_services_with_http_info

```ruby
begin
  # Справочник служб доставки
  data, status_code, headers = api_instance.get_delivery_services_with_http_info
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetDeliveryServicesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling DeliveryServicesApi->get_delivery_services_with_http_info: #{e}"
end
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetDeliveryServicesResponse**](GetDeliveryServicesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

