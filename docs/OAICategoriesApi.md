# OAICategoriesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCategoriesMaxSaleQuantum**](OAICategoriesApi.md#getcategoriesmaxsalequantum) | **POST** /categories/max-sale-quantum | Лимит на установку кванта продажи и минимального количества товаров в заказе
[**getCategoriesTree**](OAICategoriesApi.md#getcategoriestree) | **POST** /categories/tree | Дерево категорий


# **getCategoriesMaxSaleQuantum**
```objc
-(NSURLSessionTask*) getCategoriesMaxSaleQuantumWithGetCategoriesMaxSaleQuantumRequest: (OAIGetCategoriesMaxSaleQuantumRequest*) getCategoriesMaxSaleQuantumRequest
        completionHandler: (void (^)(OAIGetCategoriesMaxSaleQuantumResponse* output, NSError* error)) handler;
```

Лимит на установку кванта продажи и минимального количества товаров в заказе

Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.  Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.  Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGetCategoriesMaxSaleQuantumRequest* getCategoriesMaxSaleQuantumRequest = [[OAIGetCategoriesMaxSaleQuantumRequest alloc] init]; // 

OAICategoriesApi*apiInstance = [[OAICategoriesApi alloc] init];

// Лимит на установку кванта продажи и минимального количества товаров в заказе
[apiInstance getCategoriesMaxSaleQuantumWithGetCategoriesMaxSaleQuantumRequest:getCategoriesMaxSaleQuantumRequest
          completionHandler: ^(OAIGetCategoriesMaxSaleQuantumResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICategoriesApi->getCategoriesMaxSaleQuantum: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCategoriesMaxSaleQuantumRequest** | [**OAIGetCategoriesMaxSaleQuantumRequest***](OAIGetCategoriesMaxSaleQuantumRequest.md)|  | 

### Return type

[**OAIGetCategoriesMaxSaleQuantumResponse***](OAIGetCategoriesMaxSaleQuantumResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getCategoriesTree**
```objc
-(NSURLSessionTask*) getCategoriesTreeWithGetCategoriesRequest: (OAIGetCategoriesRequest*) getCategoriesRequest
        completionHandler: (void (^)(OAIGetCategoriesResponse* output, NSError* error)) handler;
```

Дерево категорий

Возвращает дерево категорий Маркета.  |**⚙️ Лимит:** 1 000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGetCategoriesRequest* getCategoriesRequest = [[OAIGetCategoriesRequest alloc] init]; //  (optional)

OAICategoriesApi*apiInstance = [[OAICategoriesApi alloc] init];

// Дерево категорий
[apiInstance getCategoriesTreeWithGetCategoriesRequest:getCategoriesRequest
          completionHandler: ^(OAIGetCategoriesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAICategoriesApi->getCategoriesTree: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **getCategoriesRequest** | [**OAIGetCategoriesRequest***](OAIGetCategoriesRequest.md)|  | [optional] 

### Return type

[**OAIGetCategoriesResponse***](OAIGetCategoriesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

