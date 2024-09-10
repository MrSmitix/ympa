# OpenapiClient::CampaignsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_campaign**](CampaignsApi.md#get_campaign) | **GET** /campaigns/{campaignId} | Информация о магазине |
| [**get_campaign_logins**](CampaignsApi.md#get_campaign_logins) | **GET** /campaigns/{campaignId}/logins | Логины, связанные с магазином |
| [**get_campaign_region**](CampaignsApi.md#get_campaign_region) | **GET** /campaigns/{campaignId}/region | Регион магазина |
| [**get_campaign_settings**](CampaignsApi.md#get_campaign_settings) | **GET** /campaigns/{campaignId}/settings | Настройки магазина |
| [**get_campaigns**](CampaignsApi.md#get_campaigns) | **GET** /campaigns | Список магазинов пользователя |
| [**get_campaigns_by_login**](CampaignsApi.md#get_campaigns_by_login) | **GET** /campaigns/by_login/{login} | Магазины, доступные логину |


## get_campaign

> <GetCampaignResponse> get_campaign(campaign_id)

Информация о магазине

Возвращает информацию о магазине. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::CampaignsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Информация о магазине
  result = api_instance.get_campaign(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaign: #{e}"
end
```

#### Using the get_campaign_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignResponse>, Integer, Hash)> get_campaign_with_http_info(campaign_id)

```ruby
begin
  # Информация о магазине
  data, status_code, headers = api_instance.get_campaign_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaign_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetCampaignResponse**](GetCampaignResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaign_logins

> <GetCampaignLoginsResponse> get_campaign_logins(campaign_id)

Логины, связанные с магазином

Возвращает список логинов, у которых есть доступ к магазину. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::CampaignsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Логины, связанные с магазином
  result = api_instance.get_campaign_logins(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaign_logins: #{e}"
end
```

#### Using the get_campaign_logins_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignLoginsResponse>, Integer, Hash)> get_campaign_logins_with_http_info(campaign_id)

```ruby
begin
  # Логины, связанные с магазином
  data, status_code, headers = api_instance.get_campaign_logins_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignLoginsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaign_logins_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetCampaignLoginsResponse**](GetCampaignLoginsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaign_region

> <GetCampaignRegionResponse> get_campaign_region(campaign_id)

Регион магазина

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [GET campaigns/{campaignId}/settings](../../reference/campaigns/getCampaignSettings.md).  {% endnote %}  Возвращает регион, в котором находится магазин. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::CampaignsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Регион магазина
  result = api_instance.get_campaign_region(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaign_region: #{e}"
end
```

#### Using the get_campaign_region_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignRegionResponse>, Integer, Hash)> get_campaign_region_with_http_info(campaign_id)

```ruby
begin
  # Регион магазина
  data, status_code, headers = api_instance.get_campaign_region_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignRegionResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaign_region_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetCampaignRegionResponse**](GetCampaignRegionResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaign_settings

> <GetCampaignSettingsResponse> get_campaign_settings(campaign_id)

Настройки магазина

Возвращает информацию о настройках магазина, идентификатор которого указан в запросе. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::CampaignsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Настройки магазина
  result = api_instance.get_campaign_settings(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaign_settings: #{e}"
end
```

#### Using the get_campaign_settings_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignSettingsResponse>, Integer, Hash)> get_campaign_settings_with_http_info(campaign_id)

```ruby
begin
  # Настройки магазина
  data, status_code, headers = api_instance.get_campaign_settings_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignSettingsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaign_settings_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetCampaignSettingsResponse**](GetCampaignSettingsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaigns

> <GetCampaignsResponse> get_campaigns(opts)

Список магазинов пользователя

Возвращает список магазинов, к которым имеет доступ пользователь — владелец авторизационного токена, использованного в запросе. Для агентских пользователей список состоит из подагентских магазинов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::CampaignsApi.new
opts = {
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Список магазинов пользователя
  result = api_instance.get_campaigns(opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaigns: #{e}"
end
```

#### Using the get_campaigns_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignsResponse>, Integer, Hash)> get_campaigns_with_http_info(opts)

```ruby
begin
  # Список магазинов пользователя
  data, status_code, headers = api_instance.get_campaigns_with_http_info(opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaigns_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_campaigns_by_login

> <GetCampaignsResponse> get_campaigns_by_login(login, opts)

Магазины, доступные логину

Возвращает список магазинов, к которым у пользователя с указанным логином есть доступ. |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::CampaignsApi.new
login = 'login_example' # String | Логин пользователя.
opts = {
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Магазины, доступные логину
  result = api_instance.get_campaigns_by_login(login, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaigns_by_login: #{e}"
end
```

#### Using the get_campaigns_by_login_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCampaignsResponse>, Integer, Hash)> get_campaigns_by_login_with_http_info(login, opts)

```ruby
begin
  # Магазины, доступные логину
  data, status_code, headers = api_instance.get_campaigns_by_login_with_http_info(login, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCampaignsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling CampaignsApi->get_campaigns_by_login_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **login** | **String** | Логин пользователя. |  |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetCampaignsResponse**](GetCampaignsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

