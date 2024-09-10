# OpenapiClient::PricesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_prices**](PricesApi.md#get_prices) | **GET** /campaigns/{campaignId}/offer-prices | Список цен |
| [**get_prices_by_offer_ids**](PricesApi.md#get_prices_by_offer_ids) | **POST** /campaigns/{campaignId}/offer-prices | Просмотр цен на указанные товары в магазине |
| [**get_suggested_prices**](PricesApi.md#get_suggested_prices) | **POST** /campaigns/{campaignId}/offer-prices/suggestions | Цены для продвижения товаров |
| [**update_business_prices**](PricesApi.md#update_business_prices) | **POST** /businesses/{businessId}/offer-prices/updates | Установка цен на товары во всех магазинах |
| [**update_prices**](PricesApi.md#update_prices) | **POST** /campaigns/{campaignId}/offer-prices/updates | Установка цен на товары в конкретном магазине |


## get_prices

> <GetPricesResponse> get_prices(campaign_id, opts)

Список цен

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [POST campaigns/{campaignId}/offer-prices](../../reference/assortment/getPricesByOfferIds.md).  {% endnote %}  Возвращает список цен, установленных вами на товары любым способом: например, через партнерский API или в файле с каталогом.  {% note info %}  Общее количество товаров считается по данным за последние семь дней (не включая сегодня) и не может быть выше 2 миллионов.  {% endnote %}  Способы установки цен описаны [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/assortment/operations/prices.html).  |**⚙️ Лимит:** ```(количество товаров партнера на витрине) * 25``` товаров в сутки| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PricesApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  archived: true # Boolean | Фильтр по нахождению в архиве.
}

begin
  # Список цен
  result = api_instance.get_prices(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PricesApi->get_prices: #{e}"
end
```

#### Using the get_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetPricesResponse>, Integer, Hash)> get_prices_with_http_info(campaign_id, opts)

```ruby
begin
  # Список цен
  data, status_code, headers = api_instance.get_prices_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetPricesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PricesApi->get_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **archived** | **Boolean** | Фильтр по нахождению в архиве. | [optional][default to false] |

### Return type

[**GetPricesResponse**](GetPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_prices_by_offer_ids

> <GetPricesByOfferIdsResponse> get_prices_by_offer_ids(campaign_id, opts)

Просмотр цен на указанные товары в магазине

Возвращает список цен на указанные товары в магазине.  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для просмотра базовых цен используйте [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md).  {% endnote %}  |**⚙️ Лимит:** рассчитывается по [формуле](*rule)| |-|  [//]: <> (rule: суточный лимит товаров — количество товаров на витрине * 25) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PricesApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_prices_by_offer_ids_request: OpenapiClient::GetPricesByOfferIdsRequest.new # GetPricesByOfferIdsRequest | 
}

begin
  # Просмотр цен на указанные товары в магазине
  result = api_instance.get_prices_by_offer_ids(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PricesApi->get_prices_by_offer_ids: #{e}"
end
```

#### Using the get_prices_by_offer_ids_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetPricesByOfferIdsResponse>, Integer, Hash)> get_prices_by_offer_ids_with_http_info(campaign_id, opts)

```ruby
begin
  # Просмотр цен на указанные товары в магазине
  data, status_code, headers = api_instance.get_prices_by_offer_ids_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetPricesByOfferIdsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PricesApi->get_prices_by_offer_ids_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_prices_by_offer_ids_request** | [**GetPricesByOfferIdsRequest**](GetPricesByOfferIdsRequest.md) |  | [optional] |

### Return type

[**GetPricesByOfferIdsResponse**](GetPricesByOfferIdsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_suggested_prices

> <SuggestPricesResponse> get_suggested_prices(campaign_id, suggest_prices_request)

Цены для продвижения товаров

{% note warning \"\" %}  Этот метод устарел. Вместо него используйте [отчет «Цены на рынке»](../../reference/reports/generatePricesReport.md).  {% endnote %}  {% note warning \"\" %}  Этот метод подходит только тем магазинам, которые устанавливают цены на товары в рублях.  {% endnote %}  Возвращает цены для продвижения товаров, которые вы размещаете на Маркете.  Товары, для которых нужно получить цены, передаются в теле POST-запроса.  Цены для продвижения зависят от цен, установленных на товары другими партнерами. Если один товар поставляют несколько партнеров, на Маркете сначала продается товар с более низкой ценой. Когда закончится товар по низкой цене, начнет продаваться товар по более высокой цене.  Выходные данные содержат для каждого товара несколько цен, соответствующих разным типам продвижения.  Установить цены на товары можно с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md) или другими способами: например, указать их в файле с каталогом. Также вы можете использовать стратегии для автоматической установки рекомендованных цен или минимальных цен на Маркете.  Подробно об автоматическом управлении ценами рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/prices.html).  |**⚙️ Лимит:** 100 000 товаров в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PricesApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
suggest_prices_request = OpenapiClient::SuggestPricesRequest.new({offers: [OpenapiClient::SuggestOfferPriceDTO.new]}) # SuggestPricesRequest | 

begin
  # Цены для продвижения товаров
  result = api_instance.get_suggested_prices(campaign_id, suggest_prices_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PricesApi->get_suggested_prices: #{e}"
end
```

#### Using the get_suggested_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SuggestPricesResponse>, Integer, Hash)> get_suggested_prices_with_http_info(campaign_id, suggest_prices_request)

```ruby
begin
  # Цены для продвижения товаров
  data, status_code, headers = api_instance.get_suggested_prices_with_http_info(campaign_id, suggest_prices_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SuggestPricesResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PricesApi->get_suggested_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **suggest_prices_request** | [**SuggestPricesRequest**](SuggestPricesRequest.md) |  |  |

### Return type

[**SuggestPricesResponse**](SuggestPricesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_business_prices

> <EmptyApiResponse> update_business_prices(business_id, update_business_prices_request)

Установка цен на товары во всех магазинах

Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PricesApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_business_prices_request = OpenapiClient::UpdateBusinessPricesRequest.new({offers: [OpenapiClient::UpdateBusinessOfferPriceDTO.new({offer_id: 'offer_id_example', price: OpenapiClient::UpdatePriceWithDiscountDTO.new({value: 3.56, currency_id: OpenapiClient::CurrencyType::RUR})})]}) # UpdateBusinessPricesRequest | 

begin
  # Установка цен на товары во всех магазинах
  result = api_instance.update_business_prices(business_id, update_business_prices_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PricesApi->update_business_prices: #{e}"
end
```

#### Using the update_business_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_business_prices_with_http_info(business_id, update_business_prices_request)

```ruby
begin
  # Установка цен на товары во всех магазинах
  data, status_code, headers = api_instance.update_business_prices_with_http_info(business_id, update_business_prices_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PricesApi->update_business_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_business_prices_request** | [**UpdateBusinessPricesRequest**](UpdateBusinessPricesRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_prices

> <EmptyApiResponse> update_prices(campaign_id, update_prices_request)

Установка цен на товары в конкретном магазине

Устанавливает цены на товары в магазине. Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).  {% note warning \"Метод только для отдельных магазинов\" %}  Используйте этот метод, только если в кабинете установлены уникальные цены в отдельных магазинах.  Для управления базовыми ценами используйте [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% endnote %}  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::PricesApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_prices_request = OpenapiClient::UpdatePricesRequest.new({offers: [OpenapiClient::OfferPriceDTO.new]}) # UpdatePricesRequest | 

begin
  # Установка цен на товары в конкретном магазине
  result = api_instance.update_prices(campaign_id, update_prices_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling PricesApi->update_prices: #{e}"
end
```

#### Using the update_prices_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> update_prices_with_http_info(campaign_id, update_prices_request)

```ruby
begin
  # Установка цен на товары в конкретном магазине
  data, status_code, headers = api_instance.update_prices_with_http_info(campaign_id, update_prices_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling PricesApi->update_prices_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_prices_request** | [**UpdatePricesRequest**](UpdatePricesRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

