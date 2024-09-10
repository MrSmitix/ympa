# OAIOrdersStatsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getOrdersStats**](OAIOrdersStatsApi.md#getordersstats) | **POST** /campaigns/{campaignId}/stats/orders | Детальная информация по заказам


# **getOrdersStats**
```objc
-(NSURLSessionTask*) getOrdersStatsWithCampaignId: (NSNumber*) campaignId
    pageToken: (NSString*) pageToken
    limit: (NSNumber*) limit
    getOrdersStatsRequest: (OAIGetOrdersStatsRequest*) getOrdersStatsRequest
        completionHandler: (void (^)(OAIGetOrdersStatsResponse* output, NSError* error)) handler;
```

Детальная информация по заказам

Возвращает информацию по заказам на Маркете, в которых есть ваши товары. С помощью нее вы можете собрать статистику по вашим заказам и узнать, например, какие из товаров чаще всего возвращаются покупателями, какие, наоборот, пользуются большим спросом, какая комиссия начисляется за заказы и т. п.  {% note info \"\" %}  Раньше генерация детальной информации по заказам называлась **Отчет по заказам**. Сейчас это новый отчет. [Подробнее об отчете](../../reference/reports/generateUnitedOrdersReport.md)  {% endnote %}  В одном запросе можно получить информацию не более чем по 200 заказам.  |**⚙️ Лимит:** 1 000 000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSNumber* campaignId = @56; // Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) 
NSString* pageToken = eyBuZXh0SWQ6IDIzNDIgfQ==; // Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются.  (optional)
NSNumber* limit = 20; // Количество значений на одной странице.  (optional)
OAIGetOrdersStatsRequest* getOrdersStatsRequest = [[OAIGetOrdersStatsRequest alloc] init]; //  (optional)

OAIOrdersStatsApi*apiInstance = [[OAIOrdersStatsApi alloc] init];

// Детальная информация по заказам
[apiInstance getOrdersStatsWithCampaignId:campaignId
              pageToken:pageToken
              limit:limit
              getOrdersStatsRequest:getOrdersStatsRequest
          completionHandler: ^(OAIGetOrdersStatsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIOrdersStatsApi->getOrdersStats: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **NSNumber***| Идентификатор кампании в API и магазина в кабинете. Каждая кампания в API соответствует магазину в кабинете.  Чтобы узнать идентификаторы своих магазинов, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html)  | 
 **pageToken** | **NSString***| Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра &#x60;nextPageToken&#x60;, полученное при последнем запросе.  Если задан &#x60;page_token&#x60; и в запросе есть параметры &#x60;offset&#x60;, &#x60;page_number&#x60; и &#x60;page_size&#x60;, они игнорируются.  | [optional] 
 **limit** | **NSNumber***| Количество значений на одной странице.  | [optional] 
 **getOrdersStatsRequest** | [**OAIGetOrdersStatsRequest***](OAIGetOrdersStatsRequest.md)|  | [optional] 

### Return type

[**OAIGetOrdersStatsResponse***](OAIGetOrdersStatsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

