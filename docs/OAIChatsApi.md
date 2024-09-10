# OAIChatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**createChat**](OAIChatsApi.md#createchat) | **POST** /businesses/{businessId}/chats/new | Создание нового чата с покупателем
[**getChatHistory**](OAIChatsApi.md#getchathistory) | **POST** /businesses/{businessId}/chats/history | Получение истории сообщений в чате
[**getChats**](OAIChatsApi.md#getchats) | **POST** /businesses/{businessId}/chats | Получение доступных чатов
[**sendFileToChat**](OAIChatsApi.md#sendfiletochat) | **POST** /businesses/{businessId}/chats/file/send | Отправка файла в чат
[**sendMessageToChat**](OAIChatsApi.md#sendmessagetochat) | **POST** /businesses/{businessId}/chats/message | Отправка сообщения в чат


# **createChat**
```objc
-(NSURLSessionTask*) createChatWithBusinessId: (NSNumber*) businessId
    createChatRequest: (OAICreateChatRequest*) createChatRequest
        completionHandler: (void (^)(OAICreateChatResponse* output, NSError* error)) handler;
```

Создание нового чата с покупателем

Создает новый чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAICreateChatRequest* createChatRequest = [[OAICreateChatRequest alloc] init]; // description

OAIChatsApi*apiInstance = [[OAIChatsApi alloc] init];

// Создание нового чата с покупателем
[apiInstance createChatWithBusinessId:businessId
              createChatRequest:createChatRequest
          completionHandler: ^(OAICreateChatResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIChatsApi->createChat: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **createChatRequest** | [**OAICreateChatRequest***](OAICreateChatRequest.md)| description | 

### Return type

[**OAICreateChatResponse***](OAICreateChatResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getChatHistory**
```objc
-(NSURLSessionTask*) getChatHistoryWithBusinessId: (NSNumber*) businessId
    chatId: (NSNumber*) chatId
    getChatHistoryRequest: (OAIGetChatHistoryRequest*) getChatHistoryRequest
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIGetChatHistoryResponse* output, NSError* error)) handler;
```

Получение истории сообщений в чате

Возвращает историю сообщений в чате с покупателем.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
NSNumber* chatId = @56; // Идентификатор чата.
OAIGetChatHistoryRequest* getChatHistoryRequest = [[OAIGetChatHistoryRequest alloc] init]; // description
NSString* pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
NSNumber* limit = 20; // Количество значений на одной странице.  (optional)

OAIChatsApi*apiInstance = [[OAIChatsApi alloc] init];

// Получение истории сообщений в чате
[apiInstance getChatHistoryWithBusinessId:businessId
              chatId:chatId
              getChatHistoryRequest:getChatHistoryRequest
              pageToken:pageToken
              limit:limit
          completionHandler: ^(OAIGetChatHistoryResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIChatsApi->getChatHistory: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **chatId** | **NSNumber***| Идентификатор чата. | 
 **getChatHistoryRequest** | [**OAIGetChatHistoryRequest***](OAIGetChatHistoryRequest.md)| description | 
 **pageToken** | **NSString***| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **NSNumber***| Количество значений на одной странице.  | [optional] 

### Return type

[**OAIGetChatHistoryResponse***](OAIGetChatHistoryResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getChats**
```objc
-(NSURLSessionTask*) getChatsWithBusinessId: (NSNumber*) businessId
    getChatsRequest: (OAIGetChatsRequest*) getChatsRequest
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIGetChatsResponse* output, NSError* error)) handler;
```

Получение доступных чатов

Возвращает ваши чаты с покупателями.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIGetChatsRequest* getChatsRequest = [[OAIGetChatsRequest alloc] init]; // description
NSString* pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
NSNumber* limit = 20; // Количество значений на одной странице.  (optional)

OAIChatsApi*apiInstance = [[OAIChatsApi alloc] init];

// Получение доступных чатов
[apiInstance getChatsWithBusinessId:businessId
              getChatsRequest:getChatsRequest
              pageToken:pageToken
              limit:limit
          completionHandler: ^(OAIGetChatsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIChatsApi->getChats: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **getChatsRequest** | [**OAIGetChatsRequest***](OAIGetChatsRequest.md)| description | 
 **pageToken** | **NSString***| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **NSNumber***| Количество значений на одной странице.  | [optional] 

### Return type

[**OAIGetChatsResponse***](OAIGetChatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sendFileToChat**
```objc
-(NSURLSessionTask*) sendFileToChatWithBusinessId: (NSNumber*) businessId
    chatId: (NSNumber*) chatId
    file: (NSURL*) file
        completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;
```

Отправка файла в чат

Отправляет файл в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
NSNumber* chatId = @56; // Идентификатор чата.
NSURL* file = [NSURL fileURLWithPath:@"/path/to/file"]; // Содержимое файла. Максимальный размер файла — 5 Мбайт.

OAIChatsApi*apiInstance = [[OAIChatsApi alloc] init];

// Отправка файла в чат
[apiInstance sendFileToChatWithBusinessId:businessId
              chatId:chatId
              file:file
          completionHandler: ^(OAIEmptyApiResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIChatsApi->sendFileToChat: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **chatId** | **NSNumber***| Идентификатор чата. | 
 **file** | **NSURL*****NSURL***| Содержимое файла. Максимальный размер файла — 5 Мбайт. | 

### Return type

[**OAIEmptyApiResponse***](OAIEmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **sendMessageToChat**
```objc
-(NSURLSessionTask*) sendMessageToChatWithBusinessId: (NSNumber*) businessId
    chatId: (NSNumber*) chatId
    sendMessageToChatRequest: (OAISendMessageToChatRequest*) sendMessageToChatRequest
        completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;
```

Отправка сообщения в чат

Отправляет сообщение в чат с покупателем.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
NSNumber* chatId = @56; // Идентификатор чата.
OAISendMessageToChatRequest* sendMessageToChatRequest = [[OAISendMessageToChatRequest alloc] init]; // description

OAIChatsApi*apiInstance = [[OAIChatsApi alloc] init];

// Отправка сообщения в чат
[apiInstance sendMessageToChatWithBusinessId:businessId
              chatId:chatId
              sendMessageToChatRequest:sendMessageToChatRequest
          completionHandler: ^(OAIEmptyApiResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIChatsApi->sendMessageToChat: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **chatId** | **NSNumber***| Идентификатор чата. | 
 **sendMessageToChatRequest** | [**OAISendMessageToChatRequest***](OAISendMessageToChatRequest.md)| description | 

### Return type

[**OAIEmptyApiResponse***](OAIEmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

