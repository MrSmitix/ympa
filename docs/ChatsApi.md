# ChatsApi

All URIs are relative to **

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChat**](ChatsApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**getChatHistory**](ChatsApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**getChats**](ChatsApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**sendFileToChat**](ChatsApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**sendMessageToChat**](ChatsApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат



## createChat

Создание нового чата с покупателем

Создает новый чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 createChat businessId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **createChatRequest** | [**CreateChatRequest**](CreateChatRequest.md) | description |

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getChatHistory

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 getChatHistory businessId=value  chatId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **chatId** | **integer** | Идентификатор чата. | [default to null]
 **getChatHistoryRequest** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md) | description |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getChats

Получение доступных чатов

Возвращает ваши чаты с покупателями.

|**⚙️ Лимит:** 10000 запросов в час|
|-|

### Example

```bash
 getChats businessId=value  page_token=value  limit=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **getChatsRequest** | [**GetChatsRequest**](GetChatsRequest.md) | description |
 **pageToken** | **string** | Идентификатор страницы c результатами.

Если параметр не указан, возвращается первая страница.

Рекомендуется передавать значение выходного параметра 'nextPageToken', полученное при последнем запросе.

Если задан 'page_token' и в запросе есть параметры 'offset', 'page_number' и 'page_size', они игнорируются. | [optional] [default to null]
 **limit** | **integer** | Количество значений на одной странице. | [optional] [default to null]

### Return type

[**GetChatsResponse**](GetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sendFileToChat

Отправка файла в чат

Отправляет файл в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 sendFileToChat businessId=value  chatId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **chatId** | **integer** | Идентификатор чата. | [default to null]
 **file** | **binary** | Содержимое файла. Максимальный размер файла — 5 Мбайт. | [default to null]

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## sendMessageToChat

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 sendMessageToChat businessId=value  chatId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **integer** | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).

ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) | [default to null]
 **chatId** | **integer** | Идентификатор чата. | [default to null]
 **sendMessageToChatRequest** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md) | description |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

