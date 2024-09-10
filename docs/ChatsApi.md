# ChatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChat**](ChatsApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**getChatHistory**](ChatsApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**getChats**](ChatsApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**sendFileToChat**](ChatsApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**sendMessageToChat**](ChatsApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат



## createChat

> CreateChatResponse createChat(businessId, createChatRequest)

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ChatsApi;

ChatsApi apiInstance = new ChatsApi();
Long businessId = null; // Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
CreateChatRequest createChatRequest = new CreateChatRequest(); // CreateChatRequest | description
try {
    CreateChatResponse result = apiInstance.createChat(businessId, createChatRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#createChat");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **createChatRequest** | [**CreateChatRequest**](CreateChatRequest.md)| description |

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getChatHistory

> GetChatHistoryResponse getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ChatsApi;

ChatsApi apiInstance = new ChatsApi();
Long businessId = null; // Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
Long chatId = null; // Long | Идентификатор чата.
GetChatHistoryRequest getChatHistoryRequest = new GetChatHistoryRequest(); // GetChatHistoryRequest | description
String pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
Integer limit = 20; // Integer | Количество значений на одной странице. 
try {
    GetChatHistoryResponse result = apiInstance.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#getChatHistory");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **chatId** | **Long**| Идентификатор чата. | [default to null]
 **getChatHistoryRequest** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md)| description |
 **pageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] [default to null]
 **limit** | **Integer**| Количество значений на одной странице.  | [optional] [default to null]

### Return type

[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getChats

> GetChatsResponse getChats(businessId, getChatsRequest, pageToken, limit)

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ChatsApi;

ChatsApi apiInstance = new ChatsApi();
Long businessId = null; // Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
GetChatsRequest getChatsRequest = new GetChatsRequest(); // GetChatsRequest | description
String pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
Integer limit = 20; // Integer | Количество значений на одной странице. 
try {
    GetChatsResponse result = apiInstance.getChats(businessId, getChatsRequest, pageToken, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#getChats");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **getChatsRequest** | [**GetChatsRequest**](GetChatsRequest.md)| description |
 **pageToken** | **String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] [default to null]
 **limit** | **Integer**| Количество значений на одной странице.  | [optional] [default to null]

### Return type

[**GetChatsResponse**](GetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## sendFileToChat

> EmptyApiResponse sendFileToChat(businessId, chatId, file)

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ChatsApi;

ChatsApi apiInstance = new ChatsApi();
Long businessId = null; // Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
Long chatId = null; // Long | Идентификатор чата.
File file = null; // File | Содержимое файла. Максимальный размер файла — 5 Мбайт.
try {
    EmptyApiResponse result = apiInstance.sendFileToChat(businessId, chatId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#sendFileToChat");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **chatId** | **Long**| Идентификатор чата. | [default to null]
 **file** | **File**| Содержимое файла. Максимальный размер файла — 5 Мбайт. | [default to null]

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


## sendMessageToChat

> EmptyApiResponse sendMessageToChat(businessId, chatId, sendMessageToChatRequest)

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ChatsApi;

ChatsApi apiInstance = new ChatsApi();
Long businessId = null; // Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
Long chatId = null; // Long | Идентификатор чата.
SendMessageToChatRequest sendMessageToChatRequest = new SendMessageToChatRequest(); // SendMessageToChatRequest | description
try {
    EmptyApiResponse result = apiInstance.sendMessageToChat(businessId, chatId, sendMessageToChatRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ChatsApi#sendMessageToChat");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | [default to null]
 **chatId** | **Long**| Идентификатор чата. | [default to null]
 **sendMessageToChatRequest** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md)| description |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

