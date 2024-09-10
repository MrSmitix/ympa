# OAIGoodsFeedbackApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteGoodsFeedbackComment**](OAIGoodsFeedbackApi.md#deletegoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/delete | Удаление комментария к отзыву
[**getGoodsFeedbackComments**](OAIGoodsFeedbackApi.md#getgoodsfeedbackcomments) | **POST** /businesses/{businessId}/goods-feedback/comments | Получение комментариев к отзыву
[**getGoodsFeedbacks**](OAIGoodsFeedbackApi.md#getgoodsfeedbacks) | **POST** /businesses/{businessId}/goods-feedback | Получение отзывов о товарах продавца
[**skipGoodsFeedbacksReaction**](OAIGoodsFeedbackApi.md#skipgoodsfeedbacksreaction) | **POST** /businesses/{businessId}/goods-feedback/skip-reaction | Отказ от ответа на отзывы
[**updateGoodsFeedbackComment**](OAIGoodsFeedbackApi.md#updategoodsfeedbackcomment) | **POST** /businesses/{businessId}/goods-feedback/comments/update | Добавление нового или изменение созданного комментария


# **deleteGoodsFeedbackComment**
```objc
-(NSURLSessionTask*) deleteGoodsFeedbackCommentWithBusinessId: (NSNumber*) businessId
    deleteGoodsFeedbackCommentRequest: (OAIDeleteGoodsFeedbackCommentRequest*) deleteGoodsFeedbackCommentRequest
        completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;
```

Удаление комментария к отзыву

Удаляет комментарий магазина.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIDeleteGoodsFeedbackCommentRequest* deleteGoodsFeedbackCommentRequest = [[OAIDeleteGoodsFeedbackCommentRequest alloc] init]; // 

OAIGoodsFeedbackApi*apiInstance = [[OAIGoodsFeedbackApi alloc] init];

// Удаление комментария к отзыву
[apiInstance deleteGoodsFeedbackCommentWithBusinessId:businessId
              deleteGoodsFeedbackCommentRequest:deleteGoodsFeedbackCommentRequest
          completionHandler: ^(OAIEmptyApiResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGoodsFeedbackApi->deleteGoodsFeedbackComment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **deleteGoodsFeedbackCommentRequest** | [**OAIDeleteGoodsFeedbackCommentRequest***](OAIDeleteGoodsFeedbackCommentRequest.md)|  | 

### Return type

[**OAIEmptyApiResponse***](OAIEmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getGoodsFeedbackComments**
```objc
-(NSURLSessionTask*) getGoodsFeedbackCommentsWithBusinessId: (NSNumber*) businessId
    getGoodsFeedbackCommentsRequest: (OAIGetGoodsFeedbackCommentsRequest*) getGoodsFeedbackCommentsRequest
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIGetGoodsFeedbackCommentsResponse* output, NSError* error)) handler;
```

Получение комментариев к отзыву

Возвращает комментарии к отзыву.  Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.  Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIGetGoodsFeedbackCommentsRequest* getGoodsFeedbackCommentsRequest = [[OAIGetGoodsFeedbackCommentsRequest alloc] init]; // 
NSString* pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
NSNumber* limit = 20; // Количество значений на одной странице.  (optional)

OAIGoodsFeedbackApi*apiInstance = [[OAIGoodsFeedbackApi alloc] init];

// Получение комментариев к отзыву
[apiInstance getGoodsFeedbackCommentsWithBusinessId:businessId
              getGoodsFeedbackCommentsRequest:getGoodsFeedbackCommentsRequest
              pageToken:pageToken
              limit:limit
          completionHandler: ^(OAIGetGoodsFeedbackCommentsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGoodsFeedbackApi->getGoodsFeedbackComments: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **getGoodsFeedbackCommentsRequest** | [**OAIGetGoodsFeedbackCommentsRequest***](OAIGetGoodsFeedbackCommentsRequest.md)|  | 
 **pageToken** | **NSString***| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **NSNumber***| Количество значений на одной странице.  | [optional] 

### Return type

[**OAIGetGoodsFeedbackCommentsResponse***](OAIGetGoodsFeedbackCommentsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getGoodsFeedbacks**
```objc
-(NSURLSessionTask*) getGoodsFeedbacksWithBusinessId: (NSNumber*) businessId
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
    getGoodsFeedbackRequest: (OAIGetGoodsFeedbackRequest*) getGoodsFeedbackRequest
        completionHandler: (void (^)(OAIGetGoodsFeedbackResponse* output, NSError* error)) handler;
```

Получение отзывов о товарах продавца

Возвращает все отзывы о товарах продавца по указанным фильтрам.  Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.  Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
NSString* pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
NSNumber* limit = 20; // Количество значений на одной странице.  (optional)
OAIGetGoodsFeedbackRequest* getGoodsFeedbackRequest = [[OAIGetGoodsFeedbackRequest alloc] init]; //  (optional)

OAIGoodsFeedbackApi*apiInstance = [[OAIGoodsFeedbackApi alloc] init];

// Получение отзывов о товарах продавца
[apiInstance getGoodsFeedbacksWithBusinessId:businessId
              pageToken:pageToken
              limit:limit
              getGoodsFeedbackRequest:getGoodsFeedbackRequest
          completionHandler: ^(OAIGetGoodsFeedbackResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGoodsFeedbackApi->getGoodsFeedbacks: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **pageToken** | **NSString***| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **NSNumber***| Количество значений на одной странице.  | [optional] 
 **getGoodsFeedbackRequest** | [**OAIGetGoodsFeedbackRequest***](OAIGetGoodsFeedbackRequest.md)|  | [optional] 

### Return type

[**OAIGetGoodsFeedbackResponse***](OAIGetGoodsFeedbackResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **skipGoodsFeedbacksReaction**
```objc
-(NSURLSessionTask*) skipGoodsFeedbacksReactionWithBusinessId: (NSNumber*) businessId
    skipGoodsFeedbackReactionRequest: (OAISkipGoodsFeedbackReactionRequest*) skipGoodsFeedbackReactionRequest
        completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;
```

Отказ от ответа на отзывы

Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAISkipGoodsFeedbackReactionRequest* skipGoodsFeedbackReactionRequest = [[OAISkipGoodsFeedbackReactionRequest alloc] init]; // 

OAIGoodsFeedbackApi*apiInstance = [[OAIGoodsFeedbackApi alloc] init];

// Отказ от ответа на отзывы
[apiInstance skipGoodsFeedbacksReactionWithBusinessId:businessId
              skipGoodsFeedbackReactionRequest:skipGoodsFeedbackReactionRequest
          completionHandler: ^(OAIEmptyApiResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGoodsFeedbackApi->skipGoodsFeedbacksReaction: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **skipGoodsFeedbackReactionRequest** | [**OAISkipGoodsFeedbackReactionRequest***](OAISkipGoodsFeedbackReactionRequest.md)|  | 

### Return type

[**OAIEmptyApiResponse***](OAIEmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateGoodsFeedbackComment**
```objc
-(NSURLSessionTask*) updateGoodsFeedbackCommentWithBusinessId: (NSNumber*) businessId
    updateGoodsFeedbackCommentRequest: (OAIUpdateGoodsFeedbackCommentRequest*) updateGoodsFeedbackCommentRequest
        completionHandler: (void (^)(OAIUpdateGoodsFeedbackCommentResponse* output, NSError* error)) handler;
```

Добавление нового или изменение созданного комментария

Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.  Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.  Чтобы добавить комментарий к другому комментарию, передайте:  * `feedbackId` — идентификатор отзыва; * `comment.parentId` — идентификатор родительского комментария.  Чтобы изменить комментарий, передайте:  * `feedbackId`— идентификатор отзыва; * `comment.id` — идентификатор комментария, который нужно изменить.  Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIUpdateGoodsFeedbackCommentRequest* updateGoodsFeedbackCommentRequest = [[OAIUpdateGoodsFeedbackCommentRequest alloc] init]; // 

OAIGoodsFeedbackApi*apiInstance = [[OAIGoodsFeedbackApi alloc] init];

// Добавление нового или изменение созданного комментария
[apiInstance updateGoodsFeedbackCommentWithBusinessId:businessId
              updateGoodsFeedbackCommentRequest:updateGoodsFeedbackCommentRequest
          completionHandler: ^(OAIUpdateGoodsFeedbackCommentResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGoodsFeedbackApi->updateGoodsFeedbackComment: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **updateGoodsFeedbackCommentRequest** | [**OAIUpdateGoodsFeedbackCommentRequest***](OAIUpdateGoodsFeedbackCommentRequest.md)|  | 

### Return type

[**OAIUpdateGoodsFeedbackCommentResponse***](OAIUpdateGoodsFeedbackCommentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

