# CHATS_API

All URIs are relative to *https://api.partner.market.yandex.ru*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**chat_history**](CHATS_API.md#chat_history) | **Post** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**chats**](CHATS_API.md#chats) | **Post** /businesses/{businessId}/chats | Получение доступных чатов
[**create_chat**](CHATS_API.md#create_chat) | **Post** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**send_file_to_chat**](CHATS_API.md#send_file_to_chat) | **Post** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**send_message_to_chat**](CHATS_API.md#send_message_to_chat) | **Post** /businesses/{businessId}/chats/message | Отправка сообщения в чат


# **chat_history**
> chat_history (business_id: INTEGER_64 ; chat_id: INTEGER_64 ; get_chat_history_request: GET_CHAT_HISTORY_REQUEST ; page_token:  detachable STRING_32 ; limit:  detachable INTEGER_32 ): detachable GET_CHAT_HISTORY_RESPONSE


Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **INTEGER_64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **chat_id** | **INTEGER_64**| Идентификатор чата. | [default to null]
 **get_chat_history_request** | [**GET_CHAT_HISTORY_REQUEST**](GET_CHAT_HISTORY_REQUEST.md)| description | 
 **page_token** | **STRING_32**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] [default to null]
 **limit** | **INTEGER_32**| Количество значений на одной странице.  | [optional] [default to null]

### Return type

[**GET_CHAT_HISTORY_RESPONSE**](GetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **chats**
> chats (business_id: INTEGER_64 ; get_chats_request: GET_CHATS_REQUEST ; page_token:  detachable STRING_32 ; limit:  detachable INTEGER_32 ): detachable GET_CHATS_RESPONSE


Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **INTEGER_64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **get_chats_request** | [**GET_CHATS_REQUEST**](GET_CHATS_REQUEST.md)| description | 
 **page_token** | **STRING_32**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] [default to null]
 **limit** | **INTEGER_32**| Количество значений на одной странице.  | [optional] [default to null]

### Return type

[**GET_CHATS_RESPONSE**](GetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **create_chat**
> create_chat (business_id: INTEGER_64 ; create_chat_request: CREATE_CHAT_REQUEST ): detachable CREATE_CHAT_RESPONSE


Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **INTEGER_64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **create_chat_request** | [**CREATE_CHAT_REQUEST**](CREATE_CHAT_REQUEST.md)| description | 

### Return type

[**CREATE_CHAT_RESPONSE**](CreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_file_to_chat**
> send_file_to_chat (business_id: INTEGER_64 ; chat_id: INTEGER_64 ; file: FILE ): detachable EMPTY_API_RESPONSE


Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **INTEGER_64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **chat_id** | **INTEGER_64**| Идентификатор чата. | [default to null]
 **file** | **FILE**| Содержимое файла. Максимальный размер файла — 5 Мбайт. | [default to null]

### Return type

[**EMPTY_API_RESPONSE**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **send_message_to_chat**
> send_message_to_chat (business_id: INTEGER_64 ; chat_id: INTEGER_64 ; send_message_to_chat_request: SEND_MESSAGE_TO_CHAT_REQUEST ): detachable EMPTY_API_RESPONSE


Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **business_id** | **INTEGER_64**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **chat_id** | **INTEGER_64**| Идентификатор чата. | [default to null]
 **send_message_to_chat_request** | [**SEND_MESSAGE_TO_CHAT_REQUEST**](SEND_MESSAGE_TO_CHAT_REQUEST.md)| description | 

### Return type

[**EMPTY_API_RESPONSE**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

