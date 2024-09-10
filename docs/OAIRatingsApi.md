# OAIRatingsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getQualityRatingDetails**](OAIRatingsApi.md#getqualityratingdetails) | **POST** /campaigns/{campaignId}/ratings/quality/details | Заказы, которые повлияли на индекс качества
[**getQualityRatings**](OAIRatingsApi.md#getqualityratings) | **POST** /businesses/{businessId}/ratings/quality | Индекс качества магазинов


# **getQualityRatingDetails**
```objc
-(NSURLSessionTask*) getQualityRatingDetailsWithCampaignId: (NSNumber*) campaignId
        completionHandler: (void (^)(OAIGetQualityRatingDetailsResponse* output, NSError* error)) handler;
```

Заказы, которые повлияли на индекс качества

Возвращает список заказов, которые повлияли на индекс качества магазина. Чтобы узнать значение индекса качества, выполните запрос [POST businesses/{businessId}/ratings/quality](../../reference/ratings/getQualityRatings.md).  |**⚙️ Лимит:** 100000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* campaignId = @56; // Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

OAIRatingsApi*apiInstance = [[OAIRatingsApi alloc] init];

// Заказы, которые повлияли на индекс качества
[apiInstance getQualityRatingDetailsWithCampaignId:campaignId
          completionHandler: ^(OAIGetQualityRatingDetailsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRatingsApi->getQualityRatingDetails: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **NSNumber***| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[**OAIGetQualityRatingDetailsResponse***](OAIGetQualityRatingDetailsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getQualityRatings**
```objc
-(NSURLSessionTask*) getQualityRatingsWithBusinessId: (NSNumber*) businessId
    getQualityRatingRequest: (OAIGetQualityRatingRequest*) getQualityRatingRequest
        completionHandler: (void (^)(OAIGetQualityRatingResponse* output, NSError* error)) handler;
```

Индекс качества магазинов

Возвращает значение индекса качества магазинов и его составляющие.  Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).  |**⚙️ Лимит:** 10000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIGetQualityRatingRequest* getQualityRatingRequest = [[OAIGetQualityRatingRequest alloc] init]; // 

OAIRatingsApi*apiInstance = [[OAIRatingsApi alloc] init];

// Индекс качества магазинов
[apiInstance getQualityRatingsWithBusinessId:businessId
              getQualityRatingRequest:getQualityRatingRequest
          completionHandler: ^(OAIGetQualityRatingResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIRatingsApi->getQualityRatings: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **getQualityRatingRequest** | [**OAIGetQualityRatingRequest***](OAIGetQualityRatingRequest.md)|  | 

### Return type

[**OAIGetQualityRatingResponse***](OAIGetQualityRatingResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

