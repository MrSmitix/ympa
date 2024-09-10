# OAIWarehousesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFulfillmentWarehouses**](OAIWarehousesApi.md#getfulfillmentwarehouses) | **GET** /warehouses | Идентификаторы складов Маркета (FBY)
[**getWarehouses**](OAIWarehousesApi.md#getwarehouses) | **GET** /businesses/{businessId}/warehouses | Список складов и групп складов


# **getFulfillmentWarehouses**
```objc
-(NSURLSessionTask*) getFulfillmentWarehousesWithCompletionHandler: 
        (void (^)(OAIGetFulfillmentWarehousesResponse* output, NSError* error)) handler;
```

Идентификаторы складов Маркета (FBY)

Возвращает список складов Маркета с их идентификаторами.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];



OAIWarehousesApi*apiInstance = [[OAIWarehousesApi alloc] init];

// Идентификаторы складов Маркета (FBY)
[apiInstance getFulfillmentWarehousesWithCompletionHandler: 
          ^(OAIGetFulfillmentWarehousesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIWarehousesApi->getFulfillmentWarehouses: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIGetFulfillmentWarehousesResponse***](OAIGetFulfillmentWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getWarehouses**
```objc
-(NSURLSessionTask*) getWarehousesWithBusinessId: (NSNumber*) businessId
        completionHandler: (void (^)(OAIGetWarehousesResponse* output, NSError* error)) handler;
```

Список складов и групп складов

Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)  Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* businessId = @56; // Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 

OAIWarehousesApi*apiInstance = [[OAIWarehousesApi alloc] init];

// Список складов и групп складов
[apiInstance getWarehousesWithBusinessId:businessId
          completionHandler: ^(OAIGetWarehousesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIWarehousesApi->getWarehouses: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **businessId** | **NSNumber***| Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 

### Return type

[**OAIGetWarehousesResponse***](OAIGetWarehousesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

