# OAIPromosApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deletePromoOffers**](OAIPromosApi.md#deletepromooffers) | **POST** /businesses/{businessId}/promos/offers/delete | Удаление товаров из акции
[**getPromoOffers**](OAIPromosApi.md#getpromooffers) | **POST** /businesses/{businessId}/promos/offers | Получение списка товаров, которые участвуют или могут участвовать в акции
[**getPromos**](OAIPromosApi.md#getpromos) | **POST** /businesses/{businessId}/promos | Получение списка акций
[**updatePromoOffers**](OAIPromosApi.md#updatepromooffers) | **POST** /businesses/{businessId}/promos/offers/update | Добавление товаров в акцию или изменение их цен


# **deletePromoOffers**
```objc
-(NSURLSessionTask*) deletePromoOffersWithBusinessId: (NSNumber*) businessId
    deletePromoOffersRequest: (OAIDeletePromoOffersRequest*) deletePromoOffersRequest
        completionHandler: (void (^)(OAIDeletePromoOffersResponse* output, NSError* error)) handler;
```

Удаление товаров из акции

Убирает товары из акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIDeletePromoOffersRequest* deletePromoOffersRequest = [[OAIDeletePromoOffersRequest alloc] init]; // 

OAIPromosApi*apiInstance = [[OAIPromosApi alloc] init];

// Удаление товаров из акции
[apiInstance deletePromoOffersWithBusinessId:businessId
              deletePromoOffersRequest:deletePromoOffersRequest
          completionHandler: ^(OAIDeletePromoOffersResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPromosApi->deletePromoOffers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **deletePromoOffersRequest** | [**OAIDeletePromoOffersRequest***](OAIDeletePromoOffersRequest.md)|  | 

### Return type

[**OAIDeletePromoOffersResponse***](OAIDeletePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPromoOffers**
```objc
-(NSURLSessionTask*) getPromoOffersWithBusinessId: (NSNumber*) businessId
    getPromoOffersRequest: (OAIGetPromoOffersRequest*) getPromoOffersRequest
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIGetPromoOffersResponse* output, NSError* error)) handler;
```

Получение списка товаров, которые участвуют или могут участвовать в акции

Возвращает список товаров, которые участвуют или могут участвовать в акции.  {% note warning %}  В параметре `limit` не передавайте значение больше 500.  {% endnote %}  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIGetPromoOffersRequest* getPromoOffersRequest = [[OAIGetPromoOffersRequest alloc] init]; // 
NSString* pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
NSNumber* limit = 20; // Количество значений на одной странице.  (optional)

OAIPromosApi*apiInstance = [[OAIPromosApi alloc] init];

// Получение списка товаров, которые участвуют или могут участвовать в акции
[apiInstance getPromoOffersWithBusinessId:businessId
              getPromoOffersRequest:getPromoOffersRequest
              pageToken:pageToken
              limit:limit
          completionHandler: ^(OAIGetPromoOffersResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPromosApi->getPromoOffers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **getPromoOffersRequest** | [**OAIGetPromoOffersRequest***](OAIGetPromoOffersRequest.md)|  | 
 **pageToken** | **NSString***| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **NSNumber***| Количество значений на одной странице.  | [optional] 

### Return type

[**OAIGetPromoOffersResponse***](OAIGetPromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getPromos**
```objc
-(NSURLSessionTask*) getPromosWithBusinessId: (NSNumber*) businessId
    getPromosRequest: (OAIGetPromosRequest*) getPromosRequest
        completionHandler: (void (^)(OAIGetPromosResponse* output, NSError* error)) handler;
```

Получение списка акций

Возвращает информацию об акциях Маркета.  По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.  Чтобы получить текущие или завершенные акции, передайте параметр `participation`.  Типы акций, которые возвращаются в ответе:  * прямая скидка; * флеш-акция; * скидка по промокоду.  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIGetPromosRequest* getPromosRequest = [[OAIGetPromosRequest alloc] init]; //  (optional)

OAIPromosApi*apiInstance = [[OAIPromosApi alloc] init];

// Получение списка акций
[apiInstance getPromosWithBusinessId:businessId
              getPromosRequest:getPromosRequest
          completionHandler: ^(OAIGetPromosResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPromosApi->getPromos: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **getPromosRequest** | [**OAIGetPromosRequest***](OAIGetPromosRequest.md)|  | [optional] 

### Return type

[**OAIGetPromosResponse***](OAIGetPromosResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **updatePromoOffers**
```objc
-(NSURLSessionTask*) updatePromoOffersWithBusinessId: (NSNumber*) businessId
    updatePromoOffersRequest: (OAIUpdatePromoOffersRequest*) updatePromoOffersRequest
        completionHandler: (void (^)(OAIUpdatePromoOffersResponse* output, NSError* error)) handler;
```

Добавление товаров в акцию или изменение их цен

Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.  Изменения начинают действовать в течение 4–6 часов.  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIUpdatePromoOffersRequest* updatePromoOffersRequest = [[OAIUpdatePromoOffersRequest alloc] init]; // 

OAIPromosApi*apiInstance = [[OAIPromosApi alloc] init];

// Добавление товаров в акцию или изменение их цен
[apiInstance updatePromoOffersWithBusinessId:businessId
              updatePromoOffersRequest:updatePromoOffersRequest
          completionHandler: ^(OAIUpdatePromoOffersResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPromosApi->updatePromoOffers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **updatePromoOffersRequest** | [**OAIUpdatePromoOffersRequest***](OAIUpdatePromoOffersRequest.md)|  | 

### Return type

[**OAIUpdatePromoOffersResponse***](OAIUpdatePromoOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

