# OAIContentApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoryContentParameters**](OAIContentApi.md#getcategorycontentparameters) | **POST** /category/{categoryId}/parameters | Списки характеристик товаров по категориям
[**getOfferCardsContentStatus**](OAIContentApi.md#getoffercardscontentstatus) | **POST** /businesses/{businessId}/offer-cards | Получение информации о заполненности карточек магазина
[**updateOfferContent**](OAIContentApi.md#updateoffercontent) | **POST** /businesses/{businessId}/offer-cards/update | Редактирование категорийных характеристик товара


# **getCategoryContentParameters**
```objc
-(NSURLSessionTask*) getCategoryContentParametersWithCategoryId: (NSNumber*) categoryId
        completionHandler: (void (^)(OAIGetCategoryContentParametersResponse* output, NSError* error)) handler;
```

Списки характеристик товаров по категориям

Возвращает список характеристик с допустимыми значениями для заданной категории.  |**⚙️ Лимит:** 50 категорий в минуту | |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* categoryId = @56; // Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 

OAIContentApi*apiInstance = [[OAIContentApi alloc] init];

// Списки характеристик товаров по категориям
[apiInstance getCategoryContentParametersWithCategoryId:categoryId
          completionHandler: ^(OAIGetCategoryContentParametersResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIContentApi->getCategoryContentParameters: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **categoryId** | **NSNumber***| Идентификатор категории на Маркете.  Чтобы узнать идентификатор категории, к которой относится интересующий вас товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md).  | 

### Return type

[**OAIGetCategoryContentParametersResponse***](OAIGetCategoryContentParametersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getOfferCardsContentStatus**
```objc
-(NSURLSessionTask*) getOfferCardsContentStatusWithBusinessId: (NSNumber*) businessId
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
    getOfferCardsContentStatusRequest: (OAIGetOfferCardsContentStatusRequest*) getOfferCardsContentStatusRequest
        completionHandler: (void (^)(OAIGetOfferCardsContentStatusResponse* output, NSError* error)) handler;
```

Получение информации о заполненности карточек магазина

Возвращает сведения о состоянии контента для заданных товаров:  * создана ли карточка товара и в каком она статусе; * заполненность карточки в процентах; * переданные характеристики товаров; * есть ли ошибки или предупреждения, связанные с контентом; * рекомендации по заполнению карточки.  |**⚙️ Лимит:** 600 запросов в минуту| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
NSString* pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
NSNumber* limit = 20; // Количество значений на одной странице.  (optional)
OAIGetOfferCardsContentStatusRequest* getOfferCardsContentStatusRequest = [[OAIGetOfferCardsContentStatusRequest alloc] init]; //  (optional)

OAIContentApi*apiInstance = [[OAIContentApi alloc] init];

// Получение информации о заполненности карточек магазина
[apiInstance getOfferCardsContentStatusWithBusinessId:businessId
              pageToken:pageToken
              limit:limit
              getOfferCardsContentStatusRequest:getOfferCardsContentStatusRequest
          completionHandler: ^(OAIGetOfferCardsContentStatusResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIContentApi->getOfferCardsContentStatus: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **pageToken** | **NSString***| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **NSNumber***| Количество значений на одной странице.  | [optional] 
 **getOfferCardsContentStatusRequest** | [**OAIGetOfferCardsContentStatusRequest***](OAIGetOfferCardsContentStatusRequest.md)|  | [optional] 

### Return type

[**OAIGetOfferCardsContentStatusResponse***](OAIGetOfferCardsContentStatusResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updateOfferContent**
```objc
-(NSURLSessionTask*) updateOfferContentWithBusinessId: (NSNumber*) businessId
    updateOfferContentRequest: (OAIUpdateOfferContentRequest*) updateOfferContentRequest
        completionHandler: (void (^)(OAIUpdateOfferContentResponse* output, NSError* error)) handler;
```

Редактирование категорийных характеристик товара

Редактирует характеристики товара, которые специфичны для категории, к которой он относится.  {% note warning \"Здесь только то, что относится к конкретной категории\" %}  Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).  {% endnote %}  Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.  {% note info \"Данные в каталоге обновляются не мгновенно\" %}  Это занимает до нескольких минут.  {% endnote %}  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIUpdateOfferContentRequest* updateOfferContentRequest = [[OAIUpdateOfferContentRequest alloc] init]; // 

OAIContentApi*apiInstance = [[OAIContentApi alloc] init];

// Редактирование категорийных характеристик товара
[apiInstance updateOfferContentWithBusinessId:businessId
              updateOfferContentRequest:updateOfferContentRequest
          completionHandler: ^(OAIUpdateOfferContentResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIContentApi->updateOfferContent: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **updateOfferContentRequest** | [**OAIUpdateOfferContentRequest***](OAIUpdateOfferContentRequest.md)|  | 

### Return type

[**OAIUpdateOfferContentResponse***](OAIUpdateOfferContentResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

