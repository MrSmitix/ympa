# OpenapiClient::FeedsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_feed**](FeedsApi.md#get_feed) | **GET** /campaigns/{campaignId}/feeds/{feedId} | Информация о прайс-листе |
| [**get_feed_index_logs**](FeedsApi.md#get_feed_index_logs) | **GET** /campaigns/{campaignId}/feeds/{feedId}/index-logs | Отчет по индексации прайс-листа |
| [**get_feeds**](FeedsApi.md#get_feeds) | **GET** /campaigns/{campaignId}/feeds | Список прайс-листов магазина |
| [**refresh_feed**](FeedsApi.md#refresh_feed) | **POST** /campaigns/{campaignId}/feeds/{feedId}/refresh | Сообщить, что прайс-лист обновился |
| [**set_feed_params**](FeedsApi.md#set_feed_params) | **POST** /campaigns/{campaignId}/feeds/{feedId}/params | Изменение параметров прайс-листа |


## get_feed

> <GetFeedResponse> get_feed(campaign_id, feed_id)

Информация о прайс-листе

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает информацию о прайс-листе, размещенном на Маркете для заданного магазина. Также ресурс возвращает результаты автоматических проверок прайс-листа. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::FeedsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
feed_id = 789 # Integer | Идентификатор прайс-листа.

begin
  # Информация о прайс-листе
  result = api_instance.get_feed(campaign_id, feed_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling FeedsApi->get_feed: #{e}"
end
```

#### Using the get_feed_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetFeedResponse>, Integer, Hash)> get_feed_with_http_info(campaign_id, feed_id)

```ruby
begin
  # Информация о прайс-листе
  data, status_code, headers = api_instance.get_feed_with_http_info(campaign_id, feed_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetFeedResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling FeedsApi->get_feed_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **feed_id** | **Integer** | Идентификатор прайс-листа. |  |

### Return type

[**GetFeedResponse**](GetFeedResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_feed_index_logs

> <GetFeedIndexLogsResponse> get_feed_index_logs(campaign_id, feed_id, opts)

Отчет по индексации прайс-листа

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает отчет по индексации прайс-листа для заданного магазина. Отчет позволяет получить статистику загрузки прайс-листа и результаты его автоматических проверок.  Данные в отчете возвращаются в порядке убывания значений параметра `generationId`.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::FeedsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
feed_id = 789 # Integer | Идентификатор прайс-листа.
opts = {
  limit: 20, # Integer | Количество значений на одной странице. 
  published_time_from: Time.parse('2013-10-20T19:20:30+01:00'), # Time | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`.  Значение по умолчанию: последние восемь дней со времени отправки запроса. 
  published_time_to: Time.parse('2013-10-20T19:20:30+01:00'), # Time | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-31T00:42:42+03:00`.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра `published_time_to`. Значение параметра не должно быть датой из будущего.  {% endnote %} 
  status: OpenapiClient::FeedIndexLogsStatusType::ERROR # FeedIndexLogsStatusType | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * `ERROR` — произошли ошибки. * `OK` — обработан без ошибок. * `WARNING` — наблюдались некритичные проблемы. 
}

begin
  # Отчет по индексации прайс-листа
  result = api_instance.get_feed_index_logs(campaign_id, feed_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling FeedsApi->get_feed_index_logs: #{e}"
end
```

#### Using the get_feed_index_logs_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetFeedIndexLogsResponse>, Integer, Hash)> get_feed_index_logs_with_http_info(campaign_id, feed_id, opts)

```ruby
begin
  # Отчет по индексации прайс-листа
  data, status_code, headers = api_instance.get_feed_index_logs_with_http_info(campaign_id, feed_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetFeedIndexLogsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling FeedsApi->get_feed_index_logs_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **feed_id** | **Integer** | Идентификатор прайс-листа. |  |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **published_time_from** | **Time** | Начальная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;.  Значение по умолчанию: последние восемь дней со времени отправки запроса.  | [optional] |
| **published_time_to** | **Time** | Конечная дата. Используется для фильтрации записей — по дате и времени публикации предложений на Яндекс Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-31T00:42:42+03:00&#x60;.  Значение по умолчанию: дата и время отправки запроса.  {% note info %}  Если во время переключения между страницами выходных данных на Яндекс Маркете появятся новые результаты индексации прайс-листа, вы не получите часть данных. Чтобы этого не произошло, зафиксируйте выходные данные с помощью входного параметра &#x60;published_time_to&#x60;. Значение параметра не должно быть датой из будущего.  {% endnote %}  | [optional] |
| **status** | [**FeedIndexLogsStatusType**](.md) | Статус индексации и проверки прайс-листа на соответствие техническим требованиям.  Возможные значения: * &#x60;ERROR&#x60; — произошли ошибки. * &#x60;OK&#x60; — обработан без ошибок. * &#x60;WARNING&#x60; — наблюдались некритичные проблемы.  | [optional] |

### Return type

[**GetFeedIndexLogsResponse**](GetFeedIndexLogsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_feeds

> <GetFeedsResponse> get_feeds(campaign_id)

Список прайс-листов магазина

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Возвращает список прайс-листов, размещенных на Маркете для магазина. Также ресурс возвращает результаты автоматических проверок прайс-листов. |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::FeedsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

begin
  # Список прайс-листов магазина
  result = api_instance.get_feeds(campaign_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling FeedsApi->get_feeds: #{e}"
end
```

#### Using the get_feeds_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetFeedsResponse>, Integer, Hash)> get_feeds_with_http_info(campaign_id)

```ruby
begin
  # Список прайс-листов магазина
  data, status_code, headers = api_instance.get_feeds_with_http_info(campaign_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetFeedsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling FeedsApi->get_feeds_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |

### Return type

[**GetFeedsResponse**](GetFeedsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## refresh_feed

> <EmptyApiResponse> refresh_feed(campaign_id, feed_id)

Сообщить, что прайс-лист обновился

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет сообщить, что магазин обновил прайс-лист. После этого Маркет начнет обновление данных на сервисе. 1. Магазин обновляет прайс-лист, ссылку на который он указал в кабинете. 2. Магазин отправляет Маркету запрос методом `POST campaigns/{campaignId}/feeds/{feedId}/refresh`. 3. Маркет начинает обновление данных магазина на сервисе.  {% note alert %}  Запрос работает только для включенных магазинов. Если магазин выключен, данные на Маркете не обновятся, даже если HTTP-код — `200 OK`. Проверить статус магазина можно с помощью базовых запросов или на странице бизнес-аккаунта.  {% endnote %}  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::FeedsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
feed_id = 789 # Integer | Идентификатор прайс-листа.

begin
  # Сообщить, что прайс-лист обновился
  result = api_instance.refresh_feed(campaign_id, feed_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling FeedsApi->refresh_feed: #{e}"
end
```

#### Using the refresh_feed_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> refresh_feed_with_http_info(campaign_id, feed_id)

```ruby
begin
  # Сообщить, что прайс-лист обновился
  data, status_code, headers = api_instance.refresh_feed_with_http_info(campaign_id, feed_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling FeedsApi->refresh_feed_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **feed_id** | **Integer** | Идентификатор прайс-листа. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## set_feed_params

> <EmptyApiResponse> set_feed_params(campaign_id, feed_id, set_feed_params_request)

Изменение параметров прайс-листа

{% note warning \"\" %}  Этот метод устарел. Не используйте его.  {% endnote %}  Позволяет магазину изменить параметры прайс-листа.  Чтобы отредактировать параметр прайс-листа, передайте в теле запроса: `name` (название параметра) и `value` (значение параметра).  Чтобы отменить установленное значение, передайте в теле запроса: `name` (название параметра) и `delete=true` (удалить значение).  |**⚙️ Лимит:** 3 запроса в час для одного прайс-листа| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::FeedsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
feed_id = 789 # Integer | Идентификатор прайс-листа.
set_feed_params_request = OpenapiClient::SetFeedParamsRequest.new({parameters: [OpenapiClient::FeedParameterDTO.new({name: 'name_example'})]}) # SetFeedParamsRequest | 

begin
  # Изменение параметров прайс-листа
  result = api_instance.set_feed_params(campaign_id, feed_id, set_feed_params_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling FeedsApi->set_feed_params: #{e}"
end
```

#### Using the set_feed_params_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> set_feed_params_with_http_info(campaign_id, feed_id, set_feed_params_request)

```ruby
begin
  # Изменение параметров прайс-листа
  data, status_code, headers = api_instance.set_feed_params_with_http_info(campaign_id, feed_id, set_feed_params_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling FeedsApi->set_feed_params_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **feed_id** | **Integer** | Идентификатор прайс-листа. |  |
| **set_feed_params_request** | [**SetFeedParamsRequest**](SetFeedParamsRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

