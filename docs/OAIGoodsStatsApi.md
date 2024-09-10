# OAIGoodsStatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getGoodsStats**](OAIGoodsStatsApi.md#getgoodsstats) | **POST** /campaigns/{campaignId}/stats/skus | Отчет по товарам


# **getGoodsStats**
```objc
-(NSURLSessionTask*) getGoodsStatsWithCampaignId: (NSNumber*) campaignId
    getGoodsStatsRequest: (OAIGetGoodsStatsRequest*) getGoodsStatsRequest
        completionHandler: (void (^)(OAIGetGoodsStatsResponse* output, NSError* error)) handler;
```

Отчет по товарам

Возвращает подробный отчет по товарам, которые вы разместили на Маркете. С помощью отчета вы можете узнать, например, об остатках на складе, об условиях хранения ваших товаров и т. д.  |**⚙️ Лимит:** 5000 товаров в минуту| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* campaignId = @56; // Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
OAIGetGoodsStatsRequest* getGoodsStatsRequest = [[OAIGetGoodsStatsRequest alloc] init]; // 

OAIGoodsStatsApi*apiInstance = [[OAIGoodsStatsApi alloc] init];

// Отчет по товарам
[apiInstance getGoodsStatsWithCampaignId:campaignId
              getGoodsStatsRequest:getGoodsStatsRequest
          completionHandler: ^(OAIGetGoodsStatsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIGoodsStatsApi->getGoodsStats: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **NSNumber***| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **getGoodsStatsRequest** | [**OAIGetGoodsStatsRequest***](OAIGetGoodsStatsRequest.md)|  | 

### Return type

[**OAIGetGoodsStatsResponse***](OAIGetGoodsStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

