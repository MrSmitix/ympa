# OpenapiClient::ContentApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**get_category_content_parameters**](ContentApi.md#get_category_content_parameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям |
| [**get_offer_cards_content_status**](ContentApi.md#get_offer_cards_content_status) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина |
| [**update_offer_content**](ContentApi.md#update_offer_content) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара |


## get_category_content_parameters

> <GetCategoryContentParametersResponse> get_category_content_parameters(category_id)

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ContentApi.new
category_id = 789 # Integer | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 

begin
  # Списки характеристик товаров по категориям
  result = api_instance.get_category_content_parameters(category_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ContentApi->get_category_content_parameters: #{e}"
end
```

#### Using the get_category_content_parameters_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetCategoryContentParametersResponse>, Integer, Hash)> get_category_content_parameters_with_http_info(category_id)

```ruby
begin
  # Списки характеристик товаров по категориям
  data, status_code, headers = api_instance.get_category_content_parameters_with_http_info(category_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetCategoryContentParametersResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ContentApi->get_category_content_parameters_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **category_id** | **Integer** | Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  |  |

### Return type

[**GetCategoryContentParametersResponse**](GetCategoryContentParametersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


## get_offer_cards_content_status

> <GetOfferCardsContentStatusResponse> get_offer_cards_content_status(business_id, opts)

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ContentApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_offer_cards_content_status_request: OpenapiClient::GetOfferCardsContentStatusRequest.new # GetOfferCardsContentStatusRequest | 
}

begin
  # Получение информации о заполненности карточек магазина
  result = api_instance.get_offer_cards_content_status(business_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ContentApi->get_offer_cards_content_status: #{e}"
end
```

#### Using the get_offer_cards_content_status_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetOfferCardsContentStatusResponse>, Integer, Hash)> get_offer_cards_content_status_with_http_info(business_id, opts)

```ruby
begin
  # Получение информации о заполненности карточек магазина
  data, status_code, headers = api_instance.get_offer_cards_content_status_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetOfferCardsContentStatusResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ContentApi->get_offer_cards_content_status_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_offer_cards_content_status_request** | [**GetOfferCardsContentStatusRequest**](GetOfferCardsContentStatusRequest.md) |  | [optional] |

### Return type

[**GetOfferCardsContentStatusResponse**](GetOfferCardsContentStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_offer_content

> <UpdateOfferContentResponse> update_offer_content(business_id, update_offer_content_request)

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ContentApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_offer_content_request = OpenapiClient::UpdateOfferContentRequest.new({offers_content: [OpenapiClient::OfferContentDTO.new({offer_id: 'offer_id_example', category_id: 37, parameter_values: [OpenapiClient::ParameterValueDTO.new({parameter_id: 3.56})]})]}) # UpdateOfferContentRequest | 

begin
  # Редактирование категорийных характеристик товара
  result = api_instance.update_offer_content(business_id, update_offer_content_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ContentApi->update_offer_content: #{e}"
end
```

#### Using the update_offer_content_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateOfferContentResponse>, Integer, Hash)> update_offer_content_with_http_info(business_id, update_offer_content_request)

```ruby
begin
  # Редактирование категорийных характеристик товара
  data, status_code, headers = api_instance.update_offer_content_with_http_info(business_id, update_offer_content_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateOfferContentResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ContentApi->update_offer_content_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_offer_content_request** | [**UpdateOfferContentRequest**](UpdateOfferContentRequest.md) |  |  |

### Return type

[**UpdateOfferContentResponse**](UpdateOfferContentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

