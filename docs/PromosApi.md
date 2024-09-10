# OpenapiClient::PromosApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**delete_promo_offers**](PromosApi.md#delete_promo_offers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции |
| [**get_promo_offers**](PromosApi.md#get_promo_offers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции |
| [**get_promos**](PromosApi.md#get_promos) | **POST** /businesses/{businessId}/promos | Получение списка акций |
| [**update_promo_offers**](PromosApi.md#update_promo_offers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен |


## delete_promo_offers

> <DeletePromoOffersResponse> delete_promo_offers(business_id, delete_promo_offers_request)

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PromosApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
delete_promo_offers_request = OpenapiClient::DeletePromoOffersRequest.new({promo_id: 'promo_id_example'}) # DeletePromoOffersRequest | 

begin
  # Удаление товаров из акции
  result = api_instance.delete_promo_offers(business_id, delete_promo_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PromosApi->delete_promo_offers: #{e}"
end
```

#### Using the delete_promo_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<DeletePromoOffersResponse>, Integer, Hash)> delete_promo_offers_with_http_info(business_id, delete_promo_offers_request)

```ruby
begin
  # Удаление товаров из акции
  data, status_code, headers = api_instance.delete_promo_offers_with_http_info(business_id, delete_promo_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <DeletePromoOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PromosApi->delete_promo_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **delete_promo_offers_request** | [**DeletePromoOffersRequest**](DeletePromoOffersRequest.md) |  |  |

### Return type

[**DeletePromoOffersResponse**](DeletePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_promo_offers

> <GetPromoOffersResponse> get_promo_offers(business_id, get_promo_offers_request, opts)

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PromosApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_promo_offers_request = OpenapiClient::GetPromoOffersRequest.new({promo_id: 'promo_id_example'}) # GetPromoOffersRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Получение списка товаров, которые участвуют или могут участвовать в акции
  result = api_instance.get_promo_offers(business_id, get_promo_offers_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PromosApi->get_promo_offers: #{e}"
end
```

#### Using the get_promo_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetPromoOffersResponse>, Integer, Hash)> get_promo_offers_with_http_info(business_id, get_promo_offers_request, opts)

```ruby
begin
  # Получение списка товаров, которые участвуют или могут участвовать в акции
  data, status_code, headers = api_instance.get_promo_offers_with_http_info(business_id, get_promo_offers_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetPromoOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PromosApi->get_promo_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_promo_offers_request** | [**GetPromoOffersRequest**](GetPromoOffersRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetPromoOffersResponse**](GetPromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_promos

> <GetPromosResponse> get_promos(business_id, opts)

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PromosApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  get_promos_request: OpenapiClient::GetPromosRequest.new # GetPromosRequest | 
}

begin
  # Получение списка акций
  result = api_instance.get_promos(business_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PromosApi->get_promos: #{e}"
end
```

#### Using the get_promos_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetPromosResponse>, Integer, Hash)> get_promos_with_http_info(business_id, opts)

```ruby
begin
  # Получение списка акций
  data, status_code, headers = api_instance.get_promos_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetPromosResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PromosApi->get_promos_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_promos_request** | [**GetPromosRequest**](GetPromosRequest.md) |  | [optional] |

### Return type

[**GetPromosResponse**](GetPromosResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_promo_offers

> <UpdatePromoOffersResponse> update_promo_offers(business_id, update_promo_offers_request)

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PromosApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_promo_offers_request = OpenapiClient::UpdatePromoOffersRequest.new({promo_id: 'promo_id_example', offers: [OpenapiClient::UpdatePromoOfferDTO.new({offer_id: 'offer_id_example'})]}) # UpdatePromoOffersRequest | 

begin
  # Добавление товаров в акцию или изменение их цен
  result = api_instance.update_promo_offers(business_id, update_promo_offers_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PromosApi->update_promo_offers: #{e}"
end
```

#### Using the update_promo_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdatePromoOffersResponse>, Integer, Hash)> update_promo_offers_with_http_info(business_id, update_promo_offers_request)

```ruby
begin
  # Добавление товаров в акцию или изменение их цен
  data, status_code, headers = api_instance.update_promo_offers_with_http_info(business_id, update_promo_offers_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdatePromoOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PromosApi->update_promo_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_promo_offers_request** | [**UpdatePromoOffersRequest**](UpdatePromoOffersRequest.md) |  |  |

### Return type

[**UpdatePromoOffersResponse**](UpdatePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

