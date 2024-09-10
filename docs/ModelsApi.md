# OpenapiClient::ModelsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_model**](ModelsApi.md#get_model) | **GET** /models/{modelId} | Информация об одной модели |
| [**get_model_offers**](ModelsApi.md#get_model_offers) | **GET** /models/{modelId}/offers | Список предложений для одной модели |
| [**get_models**](ModelsApi.md#get_models) | **POST** /models | Информация о нескольких моделях |
| [**get_models_offers**](ModelsApi.md#get_models_offers) | **POST** /models/offers | Список предложений для нескольких моделей |
| [**search_models**](ModelsApi.md#search_models) | **GET** /models | Поиск модели товара |


## get_model

> <GetModelsResponse> get_model(model_id, region_id, opts)

Информация об одной модели

Возвращает информацию о модели товара.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ModelsApi.new
model_id = 789 # Integer | Идентификатор модели товара.
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
opts = {
  currency: OpenapiClient::CurrencyType::RUR # CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
}

begin
  # Информация об одной модели
  result = api_instance.get_model(model_id, region_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ModelsApi->get_model: #{e}"
end
```

#### Using the get_model_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetModelsResponse>, Integer, Hash)> get_model_with_http_info(model_id, region_id, opts)

```ruby
begin
  # Информация об одной модели
  data, status_code, headers = api_instance.get_model_with_http_info(model_id, region_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetModelsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ModelsApi->get_model_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **model_id** | **Integer** | Идентификатор модели товара. |  |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] |

### Return type

[**GetModelsResponse**](GetModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_model_offers

> <GetModelsOffersResponse> get_model_offers(model_id, region_id, opts)

Список предложений для одной модели

Возвращает информацию о первых десяти предложениях, расположенных на карточке модели.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей метод не поддерживается. Идентификатор групповой модели игнорируется.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ModelsApi.new
model_id = 789 # Integer | Идентификатор модели товара.
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
opts = {
  currency: OpenapiClient::CurrencyType::RUR, # CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
  order_by_price: OpenapiClient::SortOrderType::ASC, # SortOrderType | Направление сортировки по цене.  Возможные значения: * `ASC` — сортировка по возрастанию. * `DESC` — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке. 
  count: 56, # Integer | Количество предложений на странице ответа.
  page: 56 # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Список предложений для одной модели
  result = api_instance.get_model_offers(model_id, region_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ModelsApi->get_model_offers: #{e}"
end
```

#### Using the get_model_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetModelsOffersResponse>, Integer, Hash)> get_model_offers_with_http_info(model_id, region_id, opts)

```ruby
begin
  # Список предложений для одной модели
  data, status_code, headers = api_instance.get_model_offers_with_http_info(model_id, region_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetModelsOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ModelsApi->get_model_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **model_id** | **Integer** | Идентификатор модели товара. |  |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] |
| **order_by_price** | [**SortOrderType**](.md) | Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  | [optional] |
| **count** | **Integer** | Количество предложений на странице ответа. | [optional][default to 10] |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |

### Return type

[**GetModelsOffersResponse**](GetModelsOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_models

> <GetModelsResponse> get_models(region_id, get_models_request, opts)

Информация о нескольких моделях

Возвращает информацию о моделях товаров.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ModelsApi.new
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
get_models_request = OpenapiClient::GetModelsRequest.new({models: [3.56]}) # GetModelsRequest | 
opts = {
  currency: OpenapiClient::CurrencyType::RUR # CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
}

begin
  # Информация о нескольких моделях
  result = api_instance.get_models(region_id, get_models_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ModelsApi->get_models: #{e}"
end
```

#### Using the get_models_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetModelsResponse>, Integer, Hash)> get_models_with_http_info(region_id, get_models_request, opts)

```ruby
begin
  # Информация о нескольких моделях
  data, status_code, headers = api_instance.get_models_with_http_info(region_id, get_models_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetModelsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ModelsApi->get_models_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **get_models_request** | [**GetModelsRequest**](GetModelsRequest.md) |  |  |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] |

### Return type

[**GetModelsResponse**](GetModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_models_offers

> <GetModelsOffersResponse> get_models_offers(region_id, get_models_request, opts)

Список предложений для нескольких моделей

Возвращает информацию о первых десяти предложениях, расположенных на карточках моделей, идентификаторы которых указаны в запросе.  Предложения выдаются для определенного региона и располагаются в том же порядке, в котором они показываются в выдаче Маркета на карточке модели.  Для групповых моделей выдача предложений не поддерживается. Идентификаторы групповых моделей игнорируются.  В одном запросе можно получить информацию о предложениях не более чем для 100 моделей.  Для методов `GET models/{modelId}/offers` и `POST models/offers` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ModelsApi.new
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
get_models_request = OpenapiClient::GetModelsRequest.new({models: [3.56]}) # GetModelsRequest | 
opts = {
  currency: OpenapiClient::CurrencyType::RUR, # CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
  order_by_price: OpenapiClient::SortOrderType::ASC # SortOrderType | Направление сортировки по цене.  Возможные значения: * `ASC` — сортировка по возрастанию. * `DESC` — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке. 
}

begin
  # Список предложений для нескольких моделей
  result = api_instance.get_models_offers(region_id, get_models_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ModelsApi->get_models_offers: #{e}"
end
```

#### Using the get_models_offers_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetModelsOffersResponse>, Integer, Hash)> get_models_offers_with_http_info(region_id, get_models_request, opts)

```ruby
begin
  # Список предложений для нескольких моделей
  data, status_code, headers = api_instance.get_models_offers_with_http_info(region_id, get_models_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetModelsOffersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ModelsApi->get_models_offers_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **get_models_request** | [**GetModelsRequest**](GetModelsRequest.md) |  |  |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] |
| **order_by_price** | [**SortOrderType**](.md) | Направление сортировки по цене.  Возможные значения: * &#x60;ASC&#x60; — сортировка по возрастанию. * &#x60;DESC&#x60; — сортировка по убыванию.  Значение по умолчанию: предложения выводятся в произвольном порядке.  | [optional] |

### Return type

[**GetModelsOffersResponse**](GetModelsOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## search_models

> <SearchModelsResponse> search_models(query, region_id, opts)

Поиск модели товара

Возвращает информацию о моделях, удовлетворяющих заданным в запросе условиям поиска.  В одном запросе можно получить информацию не более чем о 100 моделях.  Для методов `GET models`, `GET models/{modelId}` и `POST models` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество моделей, информация о которых запрошена при помощи этих методов.  |**⚙️ Лимит:** [рассчитывается индивидуально](*rule)| |-|  [//]: <> (rule: Суточный лимит зависит от количества предложений на карточках моделей и активных магазинов клиента. Количество предложений считается по данным за последние семь дней, не включая сегодня. Для новых магазинов, еще не разместивших предложения, ограничение равно 0 и пересчитывается на следующий день после размещения первых предложений. Для клиентов с несколькими магазинами ограничение рассчитывается с учетом количества предложений, являющегося максимальным среди всех магазинов клиента. Для агентств ограничение суммируется по всем субклиентам агентства.) 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ModelsApi.new
query = 'query_example' # String | Поисковый запрос по названию модели товара.
region_id = 789 # Integer | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). 
opts = {
  currency: OpenapiClient::CurrencyType::RUR, # CurrencyType | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * `BYN` — белорусский рубль.  * `KZT` — казахстанский тенге.  * `RUR` — российский рубль.  * `UAH` — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина). 
  page: 56, # Integer | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. 
  page_size: 56 # Integer | Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. 
}

begin
  # Поиск модели товара
  result = api_instance.search_models(query, region_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ModelsApi->search_models: #{e}"
end
```

#### Using the search_models_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<SearchModelsResponse>, Integer, Hash)> search_models_with_http_info(query, region_id, opts)

```ruby
begin
  # Поиск модели товара
  data, status_code, headers = api_instance.search_models_with_http_info(query, region_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <SearchModelsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ModelsApi->search_models_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **query** | **String** | Поисковый запрос по названию модели товара. |  |
| **region_id** | **Integer** | Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  |  |
| **currency** | [**CurrencyType**](.md) | Валюта, в которой отображаются цены предложений на страницах с результатами поиска.  Возможные значения:  * &#x60;BYN&#x60; — белорусский рубль.  * &#x60;KZT&#x60; — казахстанский тенге.  * &#x60;RUR&#x60; — российский рубль.  * &#x60;UAH&#x60; — украинская гривна.  Значение по умолчанию: используется национальная валюта магазина (национальная валюта страны происхождения магазина).  | [optional] |
| **page** | **Integer** | Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром &#x60;page_size&#x60;.  &#x60;page_number&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional][default to 1] |
| **page_size** | **Integer** | Размер страницы.  Используется вместе с параметром &#x60;page_number&#x60;.  &#x60;page_size&#x60; игнорируется, если задан &#x60;page_token&#x60;, &#x60;limit&#x60; или &#x60;offset&#x60;.  | [optional] |

### Return type

[**SearchModelsResponse**](SearchModelsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

