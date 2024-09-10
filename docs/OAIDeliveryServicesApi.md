# OAIDeliveryServicesApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getDeliveryServices**](OAIDeliveryServicesApi.md#getdeliveryservices) | **GET** /delivery/services | Справочник служб доставки


# **getDeliveryServices**
```objc
-(NSURLSessionTask*) getDeliveryServicesWithCompletionHandler: 
        (void (^)(OAIGetDeliveryServicesResponse* output, NSError* error)) handler;
```

Справочник служб доставки

Возвращает справочник служб доставки: идентификаторы и наименования. |**⚙️ Лимит:** 5 000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];



OAIDeliveryServicesApi*apiInstance = [[OAIDeliveryServicesApi alloc] init];

// Справочник служб доставки
[apiInstance getDeliveryServicesWithCompletionHandler: 
          ^(OAIGetDeliveryServicesResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIDeliveryServicesApi->getDeliveryServices: %@", error);
                        }
                    }];
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**OAIGetDeliveryServicesResponse***](OAIGetDeliveryServicesResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

