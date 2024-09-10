# OpenapiClient::HiddenOffersApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**add_hidden_offers**](HiddenOffersApi.md#add_hidden_offers) | **POST** /campaigns/{campaignId}/hidden-offers | Скрытие товаров и настройки скрытия |
| [**delete_hidden_offers**](HiddenOffersApi.md#delete_hidden_offers) | **POST** /campaigns/{campaignId}/hidden-offers/delete | Возобновление показа товаров |
| [**get_hidden_offers**](HiddenOffersApi.md#get_hidden_offers) | **GET** /campaigns/{campaignId}/hidden-offers | Информация о скрытых вами товарах |


## add_hidden_offers

> <EmptyApiResponse> add_hidden_offers(campaign_id, add_hidden_offers_request)

Скрытие товаров и настройки скрытия

Скрывает товары магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::HiddenOffersApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
add_hidden_offers_request = OpenapiClient::AddHiddenOffersRequest.new({hidden_offers: [OpenapiClient::HiddenOfferDTO.new({offer_id: 'offer_id_example'})]}) # AddHiddenOffersRequest | Запрос на скрытие оферов.

begin
  # Скрытие товаров и настройки скрытия
  result = api_instance.add_hidden_offers(campaign_id, add_hidden_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling HiddenOffersApi->add_hidden_offers: #{e}"
end
```

#### Using the add_hidden_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> add_hidden_offers_with_http_info(campaign_id, add_hidden_offers_request)

```ruby
begin
  # Скрытие товаров и настройки скрытия
  data, status_code, headers = api_instance.add_hidden_offers_with_http_info(campaign_id, add_hidden_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling HiddenOffersApi->add_hidden_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **add_hidden_offers_request** | [**AddHiddenOffersRequest**](AddHiddenOffersRequest.md) | Запрос на скрытие оферов. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## delete_hidden_offers

> <EmptyApiResponse> delete_hidden_offers(campaign_id, delete_hidden_offers_request)

Возобновление показа товаров

Возобновляет показ скрытых вами товаров магазина на Маркете.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::HiddenOffersApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
delete_hidden_offers_request = OpenapiClient::DeleteHiddenOffersRequest.new({hidden_offers: [OpenapiClient::HiddenOfferDTO.new({offer_id: 'offer_id_example'})]}) # DeleteHiddenOffersRequest | Запрос на возобновление показа оферов.

begin
  # Возобновление показа товаров
  result = api_instance.delete_hidden_offers(campaign_id, delete_hidden_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling HiddenOffersApi->delete_hidden_offers: #{e}"
end
```

#### Using the delete_hidden_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> delete_hidden_offers_with_http_info(campaign_id, delete_hidden_offers_request)

```ruby
begin
  # Возобновление показа товаров
  data, status_code, headers = api_instance.delete_hidden_offers_with_http_info(campaign_id, delete_hidden_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling HiddenOffersApi->delete_hidden_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **delete_hidden_offers_request** | [**DeleteHiddenOffersRequest**](DeleteHiddenOffersRequest.md) | Запрос на возобновление показа оферов. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_hidden_offers

> <GetHiddenOffersResponse> get_hidden_offers(campaign_id, opts)

Информация о скрытых вами товарах

Возвращает список скрытых вами товаров для заданного магазина.  В списке будут товары, скрытые любым способом — по API, с помощью YML-фида, в кабинете и так далее.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::HiddenOffersApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  offer_id: ['inner_example'], # Array<String> | Идентификатор скрытого предложения. 
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  offset: 56, # Integer | Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром `limit`.  Если задан `offset`, параметры `page_number` и `page_size` игнорируются.  `offset` игнорируется, если задан `page_token`. 
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Информация о скрытых вами товарах
  result = api_instance.get_hidden_offers(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling HiddenOffersApi->get_hidden_offers: #{e}"
end
```

#### Using the get_hidden_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetHiddenOffersResponse>, Integer, Hash)> get_hidden_offers_with_http_info(campaign_id, opts)

```ruby
begin
  # Информация о скрытых вами товарах
  data, status_code, headers = api_instance.get_hidden_offers_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetHiddenOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling HiddenOffersApi->get_hidden_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **offer_id** | [**Array&lt;String&gt;**](String.md) | Идентификатор скрытого предложения.  | [optional] |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **offset** | **Integer** | Позиция в списке, начиная с которой возвращаются результаты ответа.  Используется вместе с параметром &#x60;limit&#x60;.  Если задан &#x60;offset&#x60;, параметры &#x60;page_number&#x60; и &#x60;page_size&#x60; игнорируются.  &#x60;offset&#x60; игнорируется, если задан &#x60;page_token&#x60;.  | [optional] |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**GetHiddenOffersResponse**](GetHiddenOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

