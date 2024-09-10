# ChatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**createChat**](ChatsApi.md#createChat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем |
| [**getChatHistory**](ChatsApi.md#getChatHistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате |
| [**getChats**](ChatsApi.md#getChats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов |
| [**sendFileToChat**](ChatsApi.md#sendFileToChat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат |
| [**sendMessageToChat**](ChatsApi.md#sendMessageToChat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат |


<a id="createChat"></a>
# **createChat**
> CreateChatResponse createChat(businessId, createChatRequest)

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ChatsApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val createChatRequest : CreateChatRequest =  // CreateChatRequest | description
try {
    val result : CreateChatResponse = apiInstance.createChat(businessId, createChatRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#createChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#createChat")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **createChatRequest** | [**CreateChatRequest**](CreateChatRequest.md)| description | |

### Return type

[**CreateChatResponse**](CreateChatResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getChatHistory"></a>
# **getChatHistory**
> GetChatHistoryResponse getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ChatsApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val chatId : kotlin.Long = 789 // kotlin.Long | Идентификатор чата.
val getChatHistoryRequest : GetChatHistoryRequest =  // GetChatHistoryRequest | description
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetChatHistoryResponse = apiInstance.getChatHistory(businessId, chatId, getChatHistoryRequest, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#getChatHistory")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#getChatHistory")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **chatId** | **kotlin.Long**| Идентификатор чата. | |
| **getChatHistoryRequest** | [**GetChatHistoryRequest**](GetChatHistoryRequest.md)| description | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetChatHistoryResponse**](GetChatHistoryResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getChats"></a>
# **getChats**
> GetChatsResponse getChats(businessId, getChatsRequest, pageToken, limit)

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ChatsApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val getChatsRequest : GetChatsRequest =  // GetChatsRequest | description
val pageToken : kotlin.String = eyBuZXh0SWQ6IDIzNDIgfQ== // kotlin.String | Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. 
val limit : kotlin.Int = 20 // kotlin.Int | Количество значений на одной странице. 
try {
    val result : GetChatsResponse = apiInstance.getChats(businessId, getChatsRequest, pageToken, limit)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#getChats")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#getChats")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **getChatsRequest** | [**GetChatsRequest**](GetChatsRequest.md)| description | |
| **pageToken** | **kotlin.String**| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **limit** | **kotlin.Int**| Количество значений на одной странице.  | [optional] |

### Return type

[**GetChatsResponse**](GetChatsResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="sendFileToChat"></a>
# **sendFileToChat**
> EmptyApiResponse sendFileToChat(businessId, chatId, file)

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ChatsApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val chatId : kotlin.Long = 789 // kotlin.Long | Идентификатор чата.
val file : java.io.File = BINARY_DATA_HERE // java.io.File | Содержимое файла. Максимальный размер файла — 5 Мбайт.
try {
    val result : EmptyApiResponse = apiInstance.sendFileToChat(businessId, chatId, file)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#sendFileToChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#sendFileToChat")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **chatId** | **kotlin.Long**| Идентификатор чата. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **file** | **java.io.File**| Содержимое файла. Максимальный размер файла — 5 Мбайт. | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a id="sendMessageToChat"></a>
# **sendMessageToChat**
> EmptyApiResponse sendMessageToChat(businessId, chatId, sendMessageToChatRequest)

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ChatsApi()
val businessId : kotlin.Long = 789 // kotlin.Long | Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
val chatId : kotlin.Long = 789 // kotlin.Long | Идентификатор чата.
val sendMessageToChatRequest : SendMessageToChatRequest =  // SendMessageToChatRequest | description
try {
    val result : EmptyApiResponse = apiInstance.sendMessageToChat(businessId, chatId, sendMessageToChatRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ChatsApi#sendMessageToChat")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ChatsApi#sendMessageToChat")
    e.printStackTrace()
}
```

### Parameters
| **businessId** | **kotlin.Long**| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | |
| **chatId** | **kotlin.Long**| Идентификатор чата. | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **sendMessageToChatRequest** | [**SendMessageToChatRequest**](SendMessageToChatRequest.md)| description | |

### Return type

[**EmptyApiResponse**](EmptyApiResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

