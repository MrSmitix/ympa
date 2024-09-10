# OAIPriceQuarantineApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**confirmBusinessPrices**](OAIPriceQuarantineApi.md#confirmbusinessprices) | **POST** /businesses/{businessId}/price-quarantine/confirm | Удаление товара из карантина по цене в кабинете
[**confirmCampaignPrices**](OAIPriceQuarantineApi.md#confirmcampaignprices) | **POST** /campaigns/{campaignId}/price-quarantine/confirm | Удаление товара из карантина по цене в магазине
[**getBusinessQuarantineOffers**](OAIPriceQuarantineApi.md#getbusinessquarantineoffers) | **POST** /businesses/{businessId}/price-quarantine | Список товаров, находящихся в карантине по цене в кабинете
[**getCampaignQuarantineOffers**](OAIPriceQuarantineApi.md#getcampaignquarantineoffers) | **POST** /campaigns/{campaignId}/price-quarantine | Список товаров, находящихся в карантине по цене в магазине


# **confirmBusinessPrices**
```objc
-(NSURLSessionTask*) confirmBusinessPricesWithBusinessId: (NSNumber*) businessId
    confirmPricesRequest: (OAIConfirmPricesRequest*) confirmPricesRequest
        completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;
```

Удаление товара из карантина по цене в кабинете

Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.  Основная цена задается в каталоге и действует во всех магазинах кабинета.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIConfirmPricesRequest* confirmPricesRequest = [[OAIConfirmPricesRequest alloc] init]; // 

OAIPriceQuarantineApi*apiInstance = [[OAIPriceQuarantineApi alloc] init];

// Удаление товара из карантина по цене в кабинете
[apiInstance confirmBusinessPricesWithBusinessId:businessId
              confirmPricesRequest:confirmPricesRequest
          completionHandler: ^(OAIEmptyApiResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPriceQuarantineApi->confirmBusinessPrices: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **confirmPricesRequest** | [**OAIConfirmPricesRequest***](OAIConfirmPricesRequest.md)|  | 

### Return type

[**OAIEmptyApiResponse***](OAIEmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **confirmCampaignPrices**
```objc
-(NSURLSessionTask*) confirmCampaignPricesWithCampaignId: (NSNumber*) campaignId
    confirmPricesRequest: (OAIConfirmPricesRequest*) confirmPricesRequest
        completionHandler: (void (^)(OAIEmptyApiResponse* output, NSError* error)) handler;
```

Удаление товара из карантина по цене в магазине

Подтверждает в заданном магазине цену на товары, которые попали в карантин, и удаляет их из карантина.  Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST campaigns/{campaignId}/price-quarantine](getCampaignQuarantineOffers.md).  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* campaignId = @56; // Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIConfirmPricesRequest* confirmPricesRequest = [[OAIConfirmPricesRequest alloc] init]; // 

OAIPriceQuarantineApi*apiInstance = [[OAIPriceQuarantineApi alloc] init];

// Удаление товара из карантина по цене в магазине
[apiInstance confirmCampaignPricesWithCampaignId:campaignId
              confirmPricesRequest:confirmPricesRequest
          completionHandler: ^(OAIEmptyApiResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPriceQuarantineApi->confirmCampaignPrices: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **NSNumber***| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **confirmPricesRequest** | [**OAIConfirmPricesRequest***](OAIConfirmPricesRequest.md)|  | 

### Return type

[**OAIEmptyApiResponse***](OAIEmptyApiResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getBusinessQuarantineOffers**
```objc
-(NSURLSessionTask*) getBusinessQuarantineOffersWithBusinessId: (NSNumber*) businessId
    getQuarantineOffersRequest: (OAIGetQuarantineOffersRequest*) getQuarantineOffersRequest
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIGetQuarantineOffersResponse* output, NSError* error)) handler;
```

Список товаров, находящихся в карантине по цене в кабинете

Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIGetQuarantineOffersRequest* getQuarantineOffersRequest = [[OAIGetQuarantineOffersRequest alloc] init]; // 
NSString* pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
NSNumber* limit = 20; // Количество значений на одной странице.  (optional)

OAIPriceQuarantineApi*apiInstance = [[OAIPriceQuarantineApi alloc] init];

// Список товаров, находящихся в карантине по цене в кабинете
[apiInstance getBusinessQuarantineOffersWithBusinessId:businessId
              getQuarantineOffersRequest:getQuarantineOffersRequest
              pageToken:pageToken
              limit:limit
          completionHandler: ^(OAIGetQuarantineOffersResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPriceQuarantineApi->getBusinessQuarantineOffers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **getQuarantineOffersRequest** | [**OAIGetQuarantineOffersRequest***](OAIGetQuarantineOffersRequest.md)|  | 
 **pageToken** | **NSString***| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **NSNumber***| Количество значений на одной странице.  | [optional] 

### Return type

[**OAIGetQuarantineOffersResponse***](OAIGetQuarantineOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCampaignQuarantineOffers**
```objc
-(NSURLSessionTask*) getCampaignQuarantineOffersWithCampaignId: (NSNumber*) campaignId
    getQuarantineOffersRequest: (OAIGetQuarantineOffersRequest*) getQuarantineOffersRequest
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
        completionHandler: (void (^)(OAIGetQuarantineOffersResponse* output, NSError* error)) handler;
```

Список товаров, находящихся в карантине по цене в магазине

Возвращает список товаров, которые находятся в карантине по цене, установленной в заданном магазине.  Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST campaigns/{campaignId}/price-quarantine/confirm](../../reference/assortment/confirmCampaignPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST campaigns/{campaignId}/offer-prices/updates](../../reference/assortment/updatePrices.md).  {% note info \"𝓠 Что такое карантин?\" %}  𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)  {% endnote %}  В запросе можно использовать фильтры.  Результаты возвращаются постранично.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* campaignId = @56; // Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIGetQuarantineOffersRequest* getQuarantineOffersRequest = [[OAIGetQuarantineOffersRequest alloc] init]; // 
NSString* pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
NSNumber* limit = 20; // Количество значений на одной странице.  (optional)

OAIPriceQuarantineApi*apiInstance = [[OAIPriceQuarantineApi alloc] init];

// Список товаров, находящихся в карантине по цене в магазине
[apiInstance getCampaignQuarantineOffersWithCampaignId:campaignId
              getQuarantineOffersRequest:getQuarantineOffersRequest
              pageToken:pageToken
              limit:limit
          completionHandler: ^(OAIGetQuarantineOffersResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIPriceQuarantineApi->getCampaignQuarantineOffers: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **NSNumber***| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **getQuarantineOffersRequest** | [**OAIGetQuarantineOffersRequest***](OAIGetQuarantineOffersRequest.md)|  | 
 **pageToken** | **NSString***| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **NSNumber***| Количество значений на одной странице.  | [optional] 

### Return type

[**OAIGetQuarantineOffersResponse***](OAIGetQuarantineOffersResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

