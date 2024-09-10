# OpenapiClient::BusinessesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_business_settings**](BusinessesApi.md#get_business_settings) | **POST** /businesses/{businessId}/settings | Настройки кабинета |


## get_business_settings

> <GetBusinessSettingsResponse> get_business_settings(business_id)

Настройки кабинета

Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::BusinessesApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Настройки кабинета
  result = api_instance.get_business_settings(business_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling BusinessesApi->get_business_settings: #{e}"
end
```

#### Using the get_business_settings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBusinessSettingsResponse>, Integer, Hash)> get_business_settings_with_http_info(business_id)

```ruby
begin
  # Настройки кабинета
  data, status_code, headers = api_instance.get_business_settings_with_http_info(business_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBusinessSettingsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling BusinessesApi->get_business_settings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetBusinessSettingsResponse**](GetBusinessSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

