# OAITariffsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**calculateTariffs**](OAITariffsApi.md#calculatetariffs) | **POST** /tariffs/calculate | Калькулятор стоимости услуг


# **calculateTariffs**
```objc
-(NSURLSessionTask*) calculateTariffsWithCalculateTariffsRequest: (OAICalculateTariffsRequest*) calculateTariffsRequest
        completionHandler: (void (^)(OAICalculateTariffsResponse* output, NSError* error)) handler;
```

Калькулятор стоимости услуг

Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить, для какого товара рассчитана стоимость услуги.  Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.  В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAICalculateTariffsRequest* calculateTariffsRequest = [[OAICalculateTariffsRequest alloc] init]; // 

OAITariffsApi*apiInstance = [[OAITariffsApi alloc] init];

// Калькулятор стоимости услуг
[apiInstance calculateTariffsWithCalculateTariffsRequest:calculateTariffsRequest
          completionHandler: ^(OAICalculateTariffsResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAITariffsApi->calculateTariffs: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **calculateTariffsRequest** | [**OAICalculateTariffsRequest***](OAICalculateTariffsRequest.md)|  | 

### Return type

[**OAICalculateTariffsResponse***](OAICalculateTariffsResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

