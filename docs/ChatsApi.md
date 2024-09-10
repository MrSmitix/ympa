# ChatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**create_chat**](ChatsApi.md#create_chat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**get_chat_history**](ChatsApi.md#get_chat_history) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**get_chats**](ChatsApi.md#get_chats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**send_file_to_chat**](ChatsApi.md#send_file_to_chat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**send_message_to_chat**](ChatsApi.md#send_message_to_chat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат


# **create_chat**
> create_chat(_api::ChatsApi, business_id::Int64, create_chat_request::CreateChatRequest; _mediaType=nothing) -> CreateChatResponse, OpenAPI.Clients.ApiResponse <br/>
> create_chat(_api::ChatsApi, response_stream::Channel, business_id::Int64, create_chat_request::CreateChatRequest; _mediaType=nothing) -> Channel{ CreateChatResponse }, OpenAPI.Clients.ApiResponse

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ChatsApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**create_chat_request** | [**CreateChatRequest**](CreateChatRequest.md)| description | 

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_chat_history**
> get_chat_history(_api::ChatsApi, business_id::Int64, chat_id::Int64, get_chat_history_request::GetChatHistoryRequest; page_token=nothing, limit=nothing, _mediaType=nothing) -> GetChatHistoryResponse, OpenAPI.Clients.ApiResponse <br/>
> get_chat_history(_api::ChatsApi, response_stream::Channel, business_id::Int64, chat_id::Int64, get_chat_history_request::GetChatHistoryRequest; page_token=nothing, limit=nothing, _mediaType=nothing) -> Channel{ GetChatHistoryResponse }, OpenAPI.Clients.ApiResponse

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ChatsApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**chat_id** | **Int64**| Идентификатор чата. | [default to nothing]
**get_chat_history_request** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md)| description | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page_token** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [default to nothing]
 **limit** | **Int64**| Количество значений на одной странице.  | [default to nothing]

### Return type

[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_chats**
> get_chats(_api::ChatsApi, business_id::Int64, get_chats_request::GetChatsRequest; page_token=nothing, limit=nothing, _mediaType=nothing) -> GetChatsResponse, OpenAPI.Clients.ApiResponse <br/>
> get_chats(_api::ChatsApi, response_stream::Channel, business_id::Int64, get_chats_request::GetChatsRequest; page_token=nothing, limit=nothing, _mediaType=nothing) -> Channel{ GetChatsResponse }, OpenAPI.Clients.ApiResponse

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ChatsApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**get_chats_request** | [**GetChatsRequest**](GetChatsRequest.md)| description | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **page_token** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [default to nothing]
 **limit** | **Int64**| Количество значений на одной странице.  | [default to nothing]

### Return type

[**GetChatsResponse**](GetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **send_file_to_chat**
> send_file_to_chat(_api::ChatsApi, business_id::Int64, chat_id::Int64, file::String; _mediaType=nothing) -> EmptyApiResponse, OpenAPI.Clients.ApiResponse <br/>
> send_file_to_chat(_api::ChatsApi, response_stream::Channel, business_id::Int64, chat_id::Int64, file::String; _mediaType=nothing) -> Channel{ EmptyApiResponse }, OpenAPI.Clients.ApiResponse

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ChatsApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**chat_id** | **Int64**| Идентификатор чата. | [default to nothing]
**file** | **String****String**| Содержимое файла. Максимальный размер файла — 5 Мбайт. | [default to nothing]

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **send_message_to_chat**
> send_message_to_chat(_api::ChatsApi, business_id::Int64, chat_id::Int64, send_message_to_chat_request::SendMessageToChatRequest; _mediaType=nothing) -> EmptyApiResponse, OpenAPI.Clients.ApiResponse <br/>
> send_message_to_chat(_api::ChatsApi, response_stream::Channel, business_id::Int64, chat_id::Int64, send_message_to_chat_request::SendMessageToChatRequest; _mediaType=nothing) -> Channel{ EmptyApiResponse }, OpenAPI.Clients.ApiResponse

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ChatsApi** | API context | 
**business_id** | **Int64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to nothing]
**chat_id** | **Int64**| Идентификатор чата. | [default to nothing]
**send_message_to_chat_request** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md)| description | 

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

