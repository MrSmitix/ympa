# OpenapiClient::ChatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**create_chat**](ChatsApi.md#create_chat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем |
| [**get_chat_history**](ChatsApi.md#get_chat_history) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате |
| [**get_chats**](ChatsApi.md#get_chats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов |
| [**send_file_to_chat**](ChatsApi.md#send_file_to_chat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат |
| [**send_message_to_chat**](ChatsApi.md#send_message_to_chat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат |


## create_chat

> <CreateChatResponse> create_chat(business_id, create_chat_request)

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ChatsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
create_chat_request = OpenapiClient::CreateChatRequest.new({order_id: 3.56}) # CreateChatRequest | description

begin
  # Создание нового чата с покупателем
  result = api_instance.create_chat(business_id, create_chat_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ChatsApi->create_chat: #{e}"
end
```

#### Using the create_chat_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<CreateChatResponse>, Integer, Hash)> create_chat_with_http_info(business_id, create_chat_request)

```ruby
begin
  # Создание нового чата с покупателем
  data, status_code, headers = api_instance.create_chat_with_http_info(business_id, create_chat_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <CreateChatResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ChatsApi->create_chat_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **create_chat_request** | [**CreateChatRequest**](CreateChatRequest.md) | description |  |

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_chat_history

> <GetChatHistoryResponse> get_chat_history(business_id, chat_id, get_chat_history_request, opts)

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ChatsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
chat_id = 789 # Integer | Идентификатор чата.
get_chat_history_request = OpenapiClient::GetChatHistoryRequest.new # GetChatHistoryRequest | description
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Получение истории сообщений в чате
  result = api_instance.get_chat_history(business_id, chat_id, get_chat_history_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ChatsApi->get_chat_history: #{e}"
end
```

#### Using the get_chat_history_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetChatHistoryResponse>, Integer, Hash)> get_chat_history_with_http_info(business_id, chat_id, get_chat_history_request, opts)

```ruby
begin
  # Получение истории сообщений в чате
  data, status_code, headers = api_instance.get_chat_history_with_http_info(business_id, chat_id, get_chat_history_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetChatHistoryResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ChatsApi->get_chat_history_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **chat_id** | **Integer** | Идентификатор чата. |  |
| **get_chat_history_request** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md) | description |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_chats

> <GetChatsResponse> get_chats(business_id, get_chats_request, opts)

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ChatsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
get_chats_request = OpenapiClient::GetChatsRequest.new # GetChatsRequest | description
opts = {
  page_token: 'eyBuZXh0SWQ6IDIzNDIgfQ==', # String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
  limit: 20 # Integer | Количество значений на одной странице. 
}

begin
  # Получение доступных чатов
  result = api_instance.get_chats(business_id, get_chats_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ChatsApi->get_chats: #{e}"
end
```

#### Using the get_chats_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetChatsResponse>, Integer, Hash)> get_chats_with_http_info(business_id, get_chats_request, opts)

```ruby
begin
  # Получение доступных чатов
  data, status_code, headers = api_instance.get_chats_with_http_info(business_id, get_chats_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetChatsResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ChatsApi->get_chats_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **get_chats_request** | [**GetChatsRequest**](GetChatsRequest.md) | description |  |
| **page_token** | **String** | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| **limit** | **Integer** | Количество значений на одной странице.  | [optional] |

### Return type

[**GetChatsResponse**](GetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## send_file_to_chat

> <EmptyApiResponse> send_file_to_chat(business_id, chat_id, file)

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ChatsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
chat_id = 789 # Integer | Идентификатор чата.
file = File.new('/path/to/some/file') # File | Содержимое файла. Максимальный размер файла — 5 Мбайт.

begin
  # Отправка файла в чат
  result = api_instance.send_file_to_chat(business_id, chat_id, file)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ChatsApi->send_file_to_chat: #{e}"
end
```

#### Using the send_file_to_chat_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> send_file_to_chat_with_http_info(business_id, chat_id, file)

```ruby
begin
  # Отправка файла в чат
  data, status_code, headers = api_instance.send_file_to_chat_with_http_info(business_id, chat_id, file)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ChatsApi->send_file_to_chat_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **chat_id** | **Integer** | Идентификатор чата. |  |
| **file** | **File** | Содержимое файла. Максимальный размер файла — 5 Мбайт. |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## send_message_to_chat

> <EmptyApiResponse> send_message_to_chat(business_id, chat_id, send_message_to_chat_request)

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ChatsApi.new
business_id = 789 # Integer | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
chat_id = 789 # Integer | Идентификатор чата.
send_message_to_chat_request = OpenapiClient::SendMessageToChatRequest.new({message: 'message_example'}) # SendMessageToChatRequest | description

begin
  # Отправка сообщения в чат
  result = api_instance.send_message_to_chat(business_id, chat_id, send_message_to_chat_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ChatsApi->send_message_to_chat: #{e}"
end
```

#### Using the send_message_to_chat_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<EmptyApiResponse>, Integer, Hash)> send_message_to_chat_with_http_info(business_id, chat_id, send_message_to_chat_request)

```ruby
begin
  # Отправка сообщения в чат
  data, status_code, headers = api_instance.send_message_to_chat_with_http_info(business_id, chat_id, send_message_to_chat_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <EmptyApiResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ChatsApi->send_message_to_chat_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **business_id** | **Integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |  |
| **chat_id** | **Integer** | Идентификатор чата. |  |
| **send_message_to_chat_request** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md) | description |  |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

