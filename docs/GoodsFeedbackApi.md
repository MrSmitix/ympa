# OpenapiClient::GoodsFeedbackApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**delete_goods_feedback_comment**](GoodsFeedbackApi.md#delete_goods_feedback_comment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву |
| [**get_goods_feedback_comments**](GoodsFeedbackApi.md#get_goods_feedback_comments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву |
| [**get_goods_feedbacks**](GoodsFeedbackApi.md#get_goods_feedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца |
| [**skip_goods_feedbacks_reaction**](GoodsFeedbackApi.md#skip_goods_feedbacks_reaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы |
| [**update_goods_feedback_comment**](GoodsFeedbackApi.md#update_goods_feedback_comment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария |


## delete_goods_feedback_comment

> <EmptyApiResponse> delete_goods_feedback_comment(business_id, delete_goods_feedback_comment_request)

Удаление комментария к отзыву

Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::GoodsFeedbackApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
delete_goods_feedback_comment_request = OpenapiClient::DeleteGoodsFeedbackCommentRequest.new({id: 3.56}) # DeleteGoodsFeedbackCommentRequest | 

begin
  # Удаление комментария к отзыву
  result = api_instance.delete_goods_feedback_comment(business_id, delete_goods_feedback_comment_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsFeedbackApi->delete_goods_feedback_comment: #{e}"
end
```

#### Using the delete_goods_feedback_comment_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> delete_goods_feedback_comment_with_http_info(business_id, delete_goods_feedback_comment_request)

```ruby
begin
  # Удаление комментария к отзыву
  data, status_code, headers = api_instance.delete_goods_feedback_comment_with_http_info(business_id, delete_goods_feedback_comment_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsFeedbackApi->delete_goods_feedback_comment_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **delete_goods_feedback_comment_request** | [**DeleteGoodsFeedbackCommentRequest**](DeleteGoodsFeedbackCommentRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_goods_feedback_comments

> <GetGoodsFeedbackCommentsResponse> get_goods_feedback_comments(business_id, get_goods_feedback_comments_request, opts)

Получение комментариев к отзыву

Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::GoodsFeedbackApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_goods_feedback_comments_request = OpenapiClient::GetGoodsFeedbackCommentsRequest.new({feedback_id: 3.56}) # GetGoodsFeedbackCommentsRequest | 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Получение комментариев к отзыву
  result = api_instance.get_goods_feedback_comments(business_id, get_goods_feedback_comments_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsFeedbackApi->get_goods_feedback_comments: #{e}"
end
```

#### Using the get_goods_feedback_comments_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetGoodsFeedbackCommentsResponse>, Integer, Hash)> get_goods_feedback_comments_with_http_info(business_id, get_goods_feedback_comments_request, opts)

```ruby
begin
  # Получение комментариев к отзыву
  data, status_code, headers = api_instance.get_goods_feedback_comments_with_http_info(business_id, get_goods_feedback_comments_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetGoodsFeedbackCommentsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsFeedbackApi->get_goods_feedback_comments_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_goods_feedback_comments_request** | [**GetGoodsFeedbackCommentsRequest**](GetGoodsFeedbackCommentsRequest.md) |  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetGoodsFeedbackCommentsResponse**](GetGoodsFeedbackCommentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_goods_feedbacks

> <GetGoodsFeedbackResponse> get_goods_feedbacks(business_id, opts)

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::GoodsFeedbackApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20, # Integer | Количество значений на одной странице. 
  get_goods_feedback_request: OpenapiClient::GetGoodsFeedbackRequest.new # GetGoodsFeedbackRequest | 
}

begin
  # Получение отзывов о товарах продавца
  result = api_instance.get_goods_feedbacks(business_id, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsFeedbackApi->get_goods_feedbacks: #{e}"
end
```

#### Using the get_goods_feedbacks_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetGoodsFeedbackResponse>, Integer, Hash)> get_goods_feedbacks_with_http_info(business_id, opts)

```ruby
begin
  # Получение отзывов о товарах продавца
  data, status_code, headers = api_instance.get_goods_feedbacks_with_http_info(business_id, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetGoodsFeedbackResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsFeedbackApi->get_goods_feedbacks_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |
| **get_goods_feedback_request** | [**GetGoodsFeedbackRequest**](GetGoodsFeedbackRequest.md) |  | [optional] |

### Return type

[**GetGoodsFeedbackResponse**](GetGoodsFeedbackResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## skip_goods_feedbacks_reaction

> <EmptyApiResponse> skip_goods_feedbacks_reaction(business_id, skip_goods_feedback_reaction_request)

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::GoodsFeedbackApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
skip_goods_feedback_reaction_request = OpenapiClient::SkipGoodsFeedbackReactionRequest.new({feedback_ids: [3.56]}) # SkipGoodsFeedbackReactionRequest | 

begin
  # Отказ от ответа на отзывы
  result = api_instance.skip_goods_feedbacks_reaction(business_id, skip_goods_feedback_reaction_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsFeedbackApi->skip_goods_feedbacks_reaction: #{e}"
end
```

#### Using the skip_goods_feedbacks_reaction_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> skip_goods_feedbacks_reaction_with_http_info(business_id, skip_goods_feedback_reaction_request)

```ruby
begin
  # Отказ от ответа на отзывы
  data, status_code, headers = api_instance.skip_goods_feedbacks_reaction_with_http_info(business_id, skip_goods_feedback_reaction_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsFeedbackApi->skip_goods_feedbacks_reaction_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **skip_goods_feedback_reaction_request** | [**SkipGoodsFeedbackReactionRequest**](SkipGoodsFeedbackReactionRequest.md) |  |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## update_goods_feedback_comment

> <UpdateGoodsFeedbackCommentResponse> update_goods_feedback_comment(business_id, update_goods_feedback_comment_request)

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::GoodsFeedbackApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
update_goods_feedback_comment_request = OpenapiClient::UpdateGoodsFeedbackCommentRequest.new({feedback_id: 3.56, comment: OpenapiClient::UpdateGoodsFeedbackCommentDTO.new({text: 'text_example'})}) # UpdateGoodsFeedbackCommentRequest | 

begin
  # Добавление нового или изменение созданного комментария
  result = api_instance.update_goods_feedback_comment(business_id, update_goods_feedback_comment_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsFeedbackApi->update_goods_feedback_comment: #{e}"
end
```

#### Using the update_goods_feedback_comment_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<UpdateGoodsFeedbackCommentResponse>, Integer, Hash)> update_goods_feedback_comment_with_http_info(business_id, update_goods_feedback_comment_request)

```ruby
begin
  # Добавление нового или изменение созданного комментария
  data, status_code, headers = api_instance.update_goods_feedback_comment_with_http_info(business_id, update_goods_feedback_comment_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <UpdateGoodsFeedbackCommentResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling GoodsFeedbackApi->update_goods_feedback_comment_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **update_goods_feedback_comment_request** | [**UpdateGoodsFeedbackCommentRequest**](UpdateGoodsFeedbackCommentRequest.md) |  |  |

### Return type

[**UpdateGoodsFeedbackCommentResponse**](UpdateGoodsFeedbackCommentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

