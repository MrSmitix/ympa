# OpenapiClient::ReturnsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_return**](ReturnsApi.md#get_return) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId} | Информация о невыкупе или возврате |
| [**get_return_application**](ReturnsApi.md#get_return_application) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/application | Получение заявления на возврат |
| [**get_return_photo**](ReturnsApi.md#get_return_photo) | **GET** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/{itemId}/image/{imageHash} | Получение фотографии возврата |
| [**get_returns**](ReturnsApi.md#get_returns) | **GET** /campaigns/{campaignId}/returns | Список невыкупов и возвратов |
| [**set_return_decision**](ReturnsApi.md#set_return_decision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision | Принятие или изменение решения по возврату |
| [**submit_return_decision**](ReturnsApi.md#submit_return_decision) | **POST** /campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit | Подтверждение решения по возврату |


## get_return

> <GetReturnResponse> get_return(campaign_id, order_id, return_id)

Информация о невыкупе или возврате

Получает информацию по одному невыкупу или возврату.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReturnsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
return_id = 789 # Integer | Идентификатор возврата.

begin
  # Информация о невыкупе или возврате
  result = api_instance.get_return(campaign_id, order_id, return_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->get_return: #{e}"
end
```

#### Using the get_return_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetReturnResponse>, Integer, Hash)> get_return_with_http_info(campaign_id, order_id, return_id)

```ruby
begin
  # Информация о невыкупе или возврате
  data, status_code, headers = api_instance.get_return_with_http_info(campaign_id, order_id, return_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetReturnResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->get_return_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **return_id** | **Integer** | Идентификатор возврата. |  |

### Return type

[**GetReturnResponse**](GetReturnResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_return_application

> File get_return_application(campaign_id, order_id, return_id)

Получение заявления на возврат

Загружает заявление покупателя на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReturnsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
return_id = 789 # Integer | Идентификатор возврата.

begin
  # Получение заявления на возврат
  result = api_instance.get_return_application(campaign_id, order_id, return_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->get_return_application: #{e}"
end
```

#### Using the get_return_application_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> get_return_application_with_http_info(campaign_id, order_id, return_id)

```ruby
begin
  # Получение заявления на возврат
  data, status_code, headers = api_instance.get_return_application_with_http_info(campaign_id, order_id, return_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->get_return_application_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **return_id** | **Integer** | Идентификатор возврата. |  |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


## get_return_photo

> File get_return_photo(campaign_id, order_id, return_id, item_id, image_hash)

Получение фотографии возврата

Получает фотографии, которые покупатель приложил к заявлению на возврат товара.  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReturnsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
return_id = 789 # Integer | Идентификатор возврата.
item_id = 789 # Integer | Идентификатор товара в возврате.
image_hash = 'image_hash_example' # String | Хеш ссылки изображения для загрузки.

begin
  # Получение фотографии возврата
  result = api_instance.get_return_photo(campaign_id, order_id, return_id, item_id, image_hash)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->get_return_photo: #{e}"
end
```

#### Using the get_return_photo_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(File, Integer, Hash)> get_return_photo_with_http_info(campaign_id, order_id, return_id, item_id, image_hash)

```ruby
begin
  # Получение фотографии возврата
  data, status_code, headers = api_instance.get_return_photo_with_http_info(campaign_id, order_id, return_id, item_id, image_hash)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => File
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->get_return_photo_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **return_id** | **Integer** | Идентификатор возврата. |  |
| **item_id** | **Integer** | Идентификатор товара в возврате. |  |
| **image_hash** | **String** | Хеш ссылки изображения для загрузки. |  |

### Return type

**File**

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


## get_returns

> <GetReturnsResponse> get_returns(campaign_id, opts)

Список невыкупов и возвратов

Получает список невыкупов и возвратов.  Чтобы получить информацию по одному возврату или невыкупу, выполните запрос [GET campaigns/{campaignId}/orders/{orderId}/returns/{returnId}](../../reference/orders/getReturn.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReturnsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  order_ids: [123543], # Array<Integer> | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50. 
  statuses: [OpenapiClient::RefundStatusType::STARTED_BY_USER], # Array<RefundStatusType> | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую. 
  type: OpenapiClient::ReturnType::UNREDEEMED, # ReturnType | Тип заказа для фильтрации:  * `RETURN` — возврат.  * `UNREDEEMED` — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы. 
  from_date: Date.parse('2022-10-31'), # Date | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
  to_date: Date.parse('2022-11-30'), # Date | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: `ГГГГ-ММ-ДД`. 
  from_date2: Date.parse('2022-10-31'), # Date | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `fromDate`.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления. 
  to_date2: Date.parse('2022-11-30') # Date | {% note warning \"\" %}  Этот параметр устарел. Вместо него используйте `toDate`.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления. 
}

begin
  # Список невыкупов и возвратов
  result = api_instance.get_returns(campaign_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->get_returns: #{e}"
end
```

#### Using the get_returns_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetReturnsResponse>, Integer, Hash)> get_returns_with_http_info(campaign_id, opts)

```ruby
begin
  # Список невыкупов и возвратов
  data, status_code, headers = api_instance.get_returns_with_http_info(campaign_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetReturnsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->get_returns_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **order_ids** | [**Array&lt;Integer&gt;**](Integer.md) | Идентификаторы заказов — для фильтрации результатов.  Несколько идентификаторов перечисляются через запятую без пробела. Максимальное количество идентификаторов — 50.  | [optional] |
| **statuses** | [**Array&lt;RefundStatusType&gt;**](RefundStatusType.md) | Статусы возвратов или невыкупов — для фильтрации результатов.  Несколько статусов перечисляются через запятую.  | [optional] |
| **type** | [**ReturnType**](.md) | Тип заказа для фильтрации:  * &#x60;RETURN&#x60; — возврат.  * &#x60;UNREDEEMED&#x60; — невыкуп.  Если не указывать, в ответе будут и возвраты, и невыкупы.  | [optional] |
| **from_date** | **Date** | Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **to_date** | **Date** | Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  Формат: &#x60;ГГГГ-ММ-ДД&#x60;.  | [optional] |
| **from_date2** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;fromDate&#x60;.  {% endnote %}  Начальная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] |
| **to_date2** | **Date** | {% note warning \&quot;\&quot; %}  Этот параметр устарел. Вместо него используйте &#x60;toDate&#x60;.  {% endnote %}  Конечная дата для фильтрации возвратов или невыкупов по дате обновления.  | [optional] |

### Return type

[**GetReturnsResponse**](GetReturnsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## set_return_decision

> <EmptyApiResponse> set_return_decision(campaign_id, order_id, return_id, set_return_decision_request)

Принятие или изменение решения по возврату

Выбирает решение по возврату от покупателя. После этого для подтверждения решения нужно выполнить запрос [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision/submit](../../reference/orders/submitReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReturnsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
return_id = 789 # Integer | Идентификатор возврата.
set_return_decision_request = OpenapiClient::SetReturnDecisionRequest.new({return_item_id: 3.56, decision_type: OpenapiClient::ReturnRequestDecisionType::REFUND_MONEY}) # SetReturnDecisionRequest | 

begin
  # Принятие или изменение решения по возврату
  result = api_instance.set_return_decision(campaign_id, order_id, return_id, set_return_decision_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->set_return_decision: #{e}"
end
```

#### Using the set_return_decision_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> set_return_decision_with_http_info(campaign_id, order_id, return_id, set_return_decision_request)

```ruby
begin
  # Принятие или изменение решения по возврату
  data, status_code, headers = api_instance.set_return_decision_with_http_info(campaign_id, order_id, return_id, set_return_decision_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->set_return_decision_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **return_id** | **Integer** | Идентификатор возврата. |  |
| **set_return_decision_request** | [**SetReturnDecisionRequest**](SetReturnDecisionRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## submit_return_decision

> <EmptyApiResponse> submit_return_decision(campaign_id, order_id, return_id)

Подтверждение решения по возврату

Подтверждает выбранное решение по возврату, отправленное в запросе [POST campaigns/{campaignId}/orders/{orderId}/returns/{returnId}/decision](../../reference/orders/setReturnDecision.md).  |**⚙️ Лимит:** 10 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReturnsApi.new
campaign_id = 789 # Integer | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
order_id = 789 # Integer | Идентификатор заказа.
return_id = 789 # Integer | Идентификатор возврата.

begin
  # Подтверждение решения по возврату
  result = api_instance.submit_return_decision(campaign_id, order_id, return_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->submit_return_decision: #{e}"
end
```

#### Using the submit_return_decision_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> submit_return_decision_with_http_info(campaign_id, order_id, return_id)

```ruby
begin
  # Подтверждение решения по возврату
  data, status_code, headers = api_instance.submit_return_decision_with_http_info(campaign_id, order_id, return_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReturnsApi->submit_return_decision_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **campaign_id** | **Integer** | Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **order_id** | **Integer** | Идентификатор заказа. |  |
| **return_id** | **Integer** | Идентификатор возврата. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

