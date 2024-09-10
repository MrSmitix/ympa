# ChatsController

All URIs are relative to `""`

The controller class is defined in **[ChatsController.java](../../src/main/java/org/openapitools/controller/ChatsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChat**](#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**getChatHistory**](#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**getChats**](#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**sendFileToChat**](#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**sendMessageToChat**](#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат

<a id="createChat"></a>
# **createChat**
```java
Mono<CreateChatResponse> ChatsController.createChat(businessIdcreateChatRequest)
```

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**createChatRequest** | [**CreateChatRequest**](../../docs/models/CreateChatRequest.md) | description |

### Return type
[**CreateChatResponse**](../../docs/models/CreateChatResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="getChatHistory"></a>
# **getChatHistory**
```java
Mono<GetChatHistoryResponse> ChatsController.getChatHistory(businessIdchatIdgetChatHistoryRequestpageTokenlimit)
```

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**chatId** | `Long` | Идентификатор чата. |
**getChatHistoryRequest** | [**GetChatHistoryRequest**](../../docs/models/GetChatHistoryRequest.md) | description |
**pageToken** | `String` | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter]
**limit** | `Integer` | Количество значений на одной странице.  | [optional parameter]

### Return type
[**GetChatHistoryResponse**](../../docs/models/GetChatHistoryResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="getChats"></a>
# **getChats**
```java
Mono<GetChatsResponse> ChatsController.getChats(businessIdgetChatsRequestpageTokenlimit)
```

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**getChatsRequest** | [**GetChatsRequest**](../../docs/models/GetChatsRequest.md) | description |
**pageToken** | `String` | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional parameter]
**limit** | `Integer` | Количество значений на одной странице.  | [optional parameter]

### Return type
[**GetChatsResponse**](../../docs/models/GetChatsResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="sendFileToChat"></a>
# **sendFileToChat**
```java
Mono<EmptyApiResponse> ChatsController.sendFileToChat(businessIdchatId_file)
```

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**chatId** | `Long` | Идентификатор чата. |
**_file** | `CompletedFileUpload` | Содержимое файла. Максимальный размер файла — 5 Мбайт. |

### Return type
[**EmptyApiResponse**](../../docs/models/EmptyApiResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `multipart/form-data`
 - **Produces Content-Type**: `application/json`

<a id="sendMessageToChat"></a>
# **sendMessageToChat**
```java
Mono<EmptyApiResponse> ChatsController.sendMessageToChat(businessIdchatIdsendMessageToChatRequest)
```

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**businessId** | `Long` | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  |
**chatId** | `Long` | Идентификатор чата. |
**sendMessageToChatRequest** | [**SendMessageToChatRequest**](../../docs/models/SendMessageToChatRequest.md) | description |

### Return type
[**EmptyApiResponse**](../../docs/models/EmptyApiResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

