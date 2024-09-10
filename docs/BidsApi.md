# OpenapiClient::BidsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_bids_info_for_business**](BidsApi.md#get_bids_info_for_business) | **POST** /businesses/{businessId}/bids/info | Информация об установленных ставках |
| [**get_bids_recommendations**](BidsApi.md#get_bids_recommendations) | **POST** /businesses/{businessId}/bids/recommendations | Рекомендованные ставки для заданных товаров |
| [**put_bids_for_business**](BidsApi.md#put_bids_for_business) | **PUT** /businesses/{businessId}/bids | Включение буста продаж и установка ставок |
| [**put_bids_for_campaign**](BidsApi.md#put_bids_for_campaign) | **PUT** /campaigns/{campaignId}/bids | Включение буста продаж и установка ставок для магазина |


## get_bids_info_for_business

> <GetBidsInfoResponse> get_bids_info_for_business(business_id, opts)

Информация об установленных ставках

Возвращает значения ставок для заданных товаров.  {% note warning \"\" %}  В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::BidsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_bids_info_request: OpenapiClient::GetBidsInfoRequest.new # GetBidsInfoRequest | description
}

begin
  # Информация об установленных ставках
  result = api_instance.get_bids_info_for_business(business_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling BidsApi->get_bids_info_for_business: #{e}"
end
```

#### Using the get_bids_info_for_business_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBidsInfoResponse>, Integer, Hash)> get_bids_info_for_business_with_http_info(business_id, opts)

```ruby
begin
  # Информация об установленных ставках
  data, status_code, headers = api_instance.get_bids_info_for_business_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBidsInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling BidsApi->get_bids_info_for_business_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_bids_info_request** | [**GetBidsInfoRequest**](GetBidsInfoRequest.md) | description | [optional] |

### Return type

[**GetBidsInfoResponse**](GetBidsInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_bids_recommendations

> <GetBidsRecommendationsResponse> get_bids_recommendations(business_id, get_bids_recommendations_request)

Рекомендованные ставки для заданных товаров

Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.  Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.  Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::BidsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_bids_recommendations_request = OpenapiClient::GetBidsRecommendationsRequest.new({skus: ['skus_example']}) # GetBidsRecommendationsRequest | description.

begin
  # Рекомендованные ставки для заданных товаров
  result = api_instance.get_bids_recommendations(business_id, get_bids_recommendations_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling BidsApi->get_bids_recommendations: #{e}"
end
```

#### Using the get_bids_recommendations_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetBidsRecommendationsResponse>, Integer, Hash)> get_bids_recommendations_with_http_info(business_id, get_bids_recommendations_request)

```ruby
begin
  # Рекомендованные ставки для заданных товаров
  data, status_code, headers = api_instance.get_bids_recommendations_with_http_info(business_id, get_bids_recommendations_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetBidsRecommendationsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling BidsApi->get_bids_recommendations_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_bids_recommendations_request** | [**GetBidsRecommendationsRequest**](GetBidsRecommendationsRequest.md) | description. |  |

### Return type

[**GetBidsRecommendationsResponse**](GetBidsRecommendationsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## put_bids_for_business

> <EmptyApiResponse> put_bids_for_business(business_id, put_sku_bids_request)

Включение буста продаж и установка ставок

Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  {% cut \"Как в кабинете выглядит кампания, созданная через API\" %}  ![](../../_images/api-boost.png)  {% endcut %}  При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::BidsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
put_sku_bids_request = OpenapiClient::PutSkuBidsRequest.new({bids: [OpenapiClient::SkuBidItemDTO.new({sku: 'sku_example', bid: 570})]}) # PutSkuBidsRequest | description

begin
  # Включение буста продаж и установка ставок
  result = api_instance.put_bids_for_business(business_id, put_sku_bids_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling BidsApi->put_bids_for_business: #{e}"
end
```

#### Using the put_bids_for_business_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> put_bids_for_business_with_http_info(business_id, put_sku_bids_request)

```ruby
begin
  # Включение буста продаж и установка ставок
  data, status_code, headers = api_instance.put_bids_for_business_with_http_info(business_id, put_sku_bids_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling BidsApi->put_bids_for_business_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **put_sku_bids_request** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md) | description |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## put_bids_for_campaign

> <EmptyApiResponse> put_bids_for_campaign(campaign_id, put_sku_bids_request)

Включение буста продаж и установка ставок для магазина

Запускает буст продаж в указанном магазине — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.  При первом использовании запроса Маркет: создаст кампанию, добавит в нее товары с указанными ставками для заданного магазина, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).  Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.  Запрос всегда работает с одной и той же кампанией, созданной через этот запрос или [PUT businesses/{businessId}/bids](/reference/bids/putBidsForBusiness). Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.  Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.  Внести другие изменения в созданную через API кампанию можно в кабинете:  * выключить или включить кампанию; * изменить ее название; * выключить или включить ценовую стратегию.  Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.  Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).  {% note info \"𝓠 Как посмотреть расходы на буст продаж?\" %}  𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.  {% endnote %}  В одном запросе может быть максимум 1500 товаров.  |**⚙️ Лимит:** 1000 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::BidsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
put_sku_bids_request = OpenapiClient::PutSkuBidsRequest.new({bids: [OpenapiClient::SkuBidItemDTO.new({sku: 'sku_example', bid: 570})]}) # PutSkuBidsRequest | description

begin
  # Включение буста продаж и установка ставок для магазина
  result = api_instance.put_bids_for_campaign(campaign_id, put_sku_bids_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling BidsApi->put_bids_for_campaign: #{e}"
end
```

#### Using the put_bids_for_campaign_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> put_bids_for_campaign_with_http_info(campaign_id, put_sku_bids_request)

```ruby
begin
  # Включение буста продаж и установка ставок для магазина
  data, status_code, headers = api_instance.put_bids_for_campaign_with_http_info(campaign_id, put_sku_bids_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling BidsApi->put_bids_for_campaign_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **put_sku_bids_request** | [**PutSkuBidsRequest**](PutSkuBidsRequest.md) | description |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

