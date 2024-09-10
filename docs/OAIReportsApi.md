# OAIReportsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateBoostConsolidatedReport**](OAIReportsApi.md#generateboostconsolidatedreport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**generateCompetitorsPositionReport**](OAIReportsApi.md#generatecompetitorspositionreport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**generateGoodsFeedbackReport**](OAIReportsApi.md#generategoodsfeedbackreport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**generateGoodsMovementReport**](OAIReportsApi.md#generategoodsmovementreport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
[**generateGoodsRealizationReport**](OAIReportsApi.md#generategoodsrealizationreport) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**generateGoodsTurnoverReport**](OAIReportsApi.md#generategoodsturnoverreport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
[**generateMassOrderLabelsReport**](OAIReportsApi.md#generatemassorderlabelsreport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**generatePricesReport**](OAIReportsApi.md#generatepricesreport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**generateShelfsStatisticsReport**](OAIReportsApi.md#generateshelfsstatisticsreport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**generateShipmentListDocumentReport**](OAIReportsApi.md#generateshipmentlistdocumentreport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
[**generateShowsSalesReport**](OAIReportsApi.md#generateshowssalesreport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**generateStocksOnWarehousesReport**](OAIReportsApi.md#generatestocksonwarehousesreport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**generateUnitedMarketplaceServicesReport**](OAIReportsApi.md#generateunitedmarketplaceservicesreport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**generateUnitedNettingReport**](OAIReportsApi.md#generateunitednettingreport) | **POST** /reports/united-netting/generate | Отчет по платежам
[**generateUnitedOrdersReport**](OAIReportsApi.md#generateunitedordersreport) | **POST** /reports/united-orders/generate | Отчет по заказам
[**getReportInfo**](OAIReportsApi.md#getreportinfo) | **GET** /reports/info/{reportId} | Получение заданного отчета


# **generateBoostConsolidatedReport**
```objc
-(NSURLSessionTask*) generateBoostConsolidatedReportWithGenerateBoostConsolidatedRequest: (OAIGenerateBoostConsolidatedRequest*) generateBoostConsolidatedRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateBoostConsolidatedRequest* generateBoostConsolidatedRequest = [[OAIGenerateBoostConsolidatedRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет по бусту продаж
[apiInstance generateBoostConsolidatedReportWithGenerateBoostConsolidatedRequest:generateBoostConsolidatedRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateBoostConsolidatedReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateBoostConsolidatedRequest** | [**OAIGenerateBoostConsolidatedRequest***](OAIGenerateBoostConsolidatedRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateCompetitorsPositionReport**
```objc
-(NSURLSessionTask*) generateCompetitorsPositionReportWithGenerateCompetitorsPositionReportRequest: (OAIGenerateCompetitorsPositionReportRequest*) generateCompetitorsPositionReportRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateCompetitorsPositionReportRequest* generateCompetitorsPositionReportRequest = [[OAIGenerateCompetitorsPositionReportRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет «Конкурентная позиция»
[apiInstance generateCompetitorsPositionReportWithGenerateCompetitorsPositionReportRequest:generateCompetitorsPositionReportRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateCompetitorsPositionReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateCompetitorsPositionReportRequest** | [**OAIGenerateCompetitorsPositionReportRequest***](OAIGenerateCompetitorsPositionReportRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateGoodsFeedbackReport**
```objc
-(NSURLSessionTask*) generateGoodsFeedbackReportWithGenerateGoodsFeedbackRequest: (OAIGenerateGoodsFeedbackRequest*) generateGoodsFeedbackRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateGoodsFeedbackRequest* generateGoodsFeedbackRequest = [[OAIGenerateGoodsFeedbackRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет по отзывам о товарах
[apiInstance generateGoodsFeedbackReportWithGenerateGoodsFeedbackRequest:generateGoodsFeedbackRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateGoodsFeedbackReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsFeedbackRequest** | [**OAIGenerateGoodsFeedbackRequest***](OAIGenerateGoodsFeedbackRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateGoodsMovementReport**
```objc
-(NSURLSessionTask*) generateGoodsMovementReportWithGenerateGoodsMovementReportRequest: (OAIGenerateGoodsMovementReportRequest*) generateGoodsMovementReportRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateGoodsMovementReportRequest* generateGoodsMovementReportRequest = [[OAIGenerateGoodsMovementReportRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет по движению товаров
[apiInstance generateGoodsMovementReportWithGenerateGoodsMovementReportRequest:generateGoodsMovementReportRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateGoodsMovementReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsMovementReportRequest** | [**OAIGenerateGoodsMovementReportRequest***](OAIGenerateGoodsMovementReportRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateGoodsRealizationReport**
```objc
-(NSURLSessionTask*) generateGoodsRealizationReportWithGenerateGoodsRealizationReportRequest: (OAIGenerateGoodsRealizationReportRequest*) generateGoodsRealizationReportRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateGoodsRealizationReportRequest* generateGoodsRealizationReportRequest = [[OAIGenerateGoodsRealizationReportRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет по реализации
[apiInstance generateGoodsRealizationReportWithGenerateGoodsRealizationReportRequest:generateGoodsRealizationReportRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateGoodsRealizationReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsRealizationReportRequest** | [**OAIGenerateGoodsRealizationReportRequest***](OAIGenerateGoodsRealizationReportRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateGoodsTurnoverReport**
```objc
-(NSURLSessionTask*) generateGoodsTurnoverReportWithGenerateGoodsTurnoverRequest: (OAIGenerateGoodsTurnoverRequest*) generateGoodsTurnoverRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateGoodsTurnoverRequest* generateGoodsTurnoverRequest = [[OAIGenerateGoodsTurnoverRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет по оборачиваемости
[apiInstance generateGoodsTurnoverReportWithGenerateGoodsTurnoverRequest:generateGoodsTurnoverRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateGoodsTurnoverReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsTurnoverRequest** | [**OAIGenerateGoodsTurnoverRequest***](OAIGenerateGoodsTurnoverRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateMassOrderLabelsReport**
```objc
-(NSURLSessionTask*) generateMassOrderLabelsReportWithGenerateMassOrderLabelsRequest: (OAIGenerateMassOrderLabelsRequest*) generateMassOrderLabelsRequest
    format: (OAIPageFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateMassOrderLabelsRequest* generateMassOrderLabelsRequest = [[OAIGenerateMassOrderLabelsRequest alloc] init]; // 
OAIPageFormatType format = [[OAIPageFormatType alloc] init]; // Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[apiInstance generateMassOrderLabelsReportWithGenerateMassOrderLabelsRequest:generateMassOrderLabelsRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateMassOrderLabelsReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateMassOrderLabelsRequest** | [**OAIGenerateMassOrderLabelsRequest***](OAIGenerateMassOrderLabelsRequest.md)|  | 
 **format** | [**OAIPageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generatePricesReport**
```objc
-(NSURLSessionTask*) generatePricesReportWithGeneratePricesReportRequest: (OAIGeneratePricesReportRequest*) generatePricesReportRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGeneratePricesReportRequest* generatePricesReportRequest = [[OAIGeneratePricesReportRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет «Цены на рынке»
[apiInstance generatePricesReportWithGeneratePricesReportRequest:generatePricesReportRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generatePricesReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generatePricesReportRequest** | [**OAIGeneratePricesReportRequest***](OAIGeneratePricesReportRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateShelfsStatisticsReport**
```objc
-(NSURLSessionTask*) generateShelfsStatisticsReportWithGenerateShelfsStatisticsRequest: (OAIGenerateShelfsStatisticsRequest*) generateShelfsStatisticsRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateShelfsStatisticsRequest* generateShelfsStatisticsRequest = [[OAIGenerateShelfsStatisticsRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет по полкам
[apiInstance generateShelfsStatisticsReportWithGenerateShelfsStatisticsRequest:generateShelfsStatisticsRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateShelfsStatisticsReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShelfsStatisticsRequest** | [**OAIGenerateShelfsStatisticsRequest***](OAIGenerateShelfsStatisticsRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateShipmentListDocumentReport**
```objc
-(NSURLSessionTask*) generateShipmentListDocumentReportWithGenerateShipmentListDocumentReportRequest: (OAIGenerateShipmentListDocumentReportRequest*) generateShipmentListDocumentReportRequest
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateShipmentListDocumentReportRequest* generateShipmentListDocumentReportRequest = [[OAIGenerateShipmentListDocumentReportRequest alloc] init]; // 

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Получение листа сборки
[apiInstance generateShipmentListDocumentReportWithGenerateShipmentListDocumentReportRequest:generateShipmentListDocumentReportRequest
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateShipmentListDocumentReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShipmentListDocumentReportRequest** | [**OAIGenerateShipmentListDocumentReportRequest***](OAIGenerateShipmentListDocumentReportRequest.md)|  | 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateShowsSalesReport**
```objc
-(NSURLSessionTask*) generateShowsSalesReportWithGenerateShowsSalesReportRequest: (OAIGenerateShowsSalesReportRequest*) generateShowsSalesReportRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateShowsSalesReportRequest* generateShowsSalesReportRequest = [[OAIGenerateShowsSalesReportRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет «Аналитика продаж»
[apiInstance generateShowsSalesReportWithGenerateShowsSalesReportRequest:generateShowsSalesReportRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateShowsSalesReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShowsSalesReportRequest** | [**OAIGenerateShowsSalesReportRequest***](OAIGenerateShowsSalesReportRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateStocksOnWarehousesReport**
```objc
-(NSURLSessionTask*) generateStocksOnWarehousesReportWithGenerateStocksOnWarehousesReportRequest: (OAIGenerateStocksOnWarehousesReportRequest*) generateStocksOnWarehousesReportRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateStocksOnWarehousesReportRequest* generateStocksOnWarehousesReportRequest = [[OAIGenerateStocksOnWarehousesReportRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет по остаткам на складах
[apiInstance generateStocksOnWarehousesReportWithGenerateStocksOnWarehousesReportRequest:generateStocksOnWarehousesReportRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateStocksOnWarehousesReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateStocksOnWarehousesReportRequest** | [**OAIGenerateStocksOnWarehousesReportRequest***](OAIGenerateStocksOnWarehousesReportRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateUnitedMarketplaceServicesReport**
```objc
-(NSURLSessionTask*) generateUnitedMarketplaceServicesReportWithGenerateUnitedMarketplaceServicesReportRequest: (OAIGenerateUnitedMarketplaceServicesReportRequest*) generateUnitedMarketplaceServicesReportRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateUnitedMarketplaceServicesReportRequest* generateUnitedMarketplaceServicesReportRequest = [[OAIGenerateUnitedMarketplaceServicesReportRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет по стоимости услуг
[apiInstance generateUnitedMarketplaceServicesReportWithGenerateUnitedMarketplaceServicesReportRequest:generateUnitedMarketplaceServicesReportRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateUnitedMarketplaceServicesReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedMarketplaceServicesReportRequest** | [**OAIGenerateUnitedMarketplaceServicesReportRequest***](OAIGenerateUnitedMarketplaceServicesReportRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateUnitedNettingReport**
```objc
-(NSURLSessionTask*) generateUnitedNettingReportWithGenerateUnitedNettingReportRequest: (OAIGenerateUnitedNettingReportRequest*) generateUnitedNettingReportRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateUnitedNettingReportRequest* generateUnitedNettingReportRequest = [[OAIGenerateUnitedNettingReportRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет по платежам
[apiInstance generateUnitedNettingReportWithGenerateUnitedNettingReportRequest:generateUnitedNettingReportRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateUnitedNettingReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedNettingReportRequest** | [**OAIGenerateUnitedNettingReportRequest***](OAIGenerateUnitedNettingReportRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generateUnitedOrdersReport**
```objc
-(NSURLSessionTask*) generateUnitedOrdersReportWithGenerateUnitedOrdersRequest: (OAIGenerateUnitedOrdersRequest*) generateUnitedOrdersRequest
    format: (OAIReportFormatType) format
        completionHandler: (void (^)(OAIGenerateReportResponse* output, NSError* error)) handler;
```

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


OAIGenerateUnitedOrdersRequest* generateUnitedOrdersRequest = [[OAIGenerateUnitedOrdersRequest alloc] init]; // 
OAIReportFormatType format = [[OAIReportFormatType alloc] init]; // Формат отчета. (optional)

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Отчет по заказам
[apiInstance generateUnitedOrdersReportWithGenerateUnitedOrdersRequest:generateUnitedOrdersRequest
              format:format
          completionHandler: ^(OAIGenerateReportResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->generateUnitedOrdersReport: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedOrdersRequest** | [**OAIGenerateUnitedOrdersRequest***](OAIGenerateUnitedOrdersRequest.md)|  | 
 **format** | [**OAIReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**OAIGenerateReportResponse***](OAIGenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **getReportInfo**
```objc
-(NSURLSessionTask*) getReportInfoWithReportId: (NSString*) reportId
        completionHandler: (void (^)(OAIGetReportInfoResponse* output, NSError* error)) handler;
```

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```objc
OAIDefaultConfiguration *apiConfig = [OAIDefaultConfiguration sharedConfig];

// Configure OAuth2 access token for authorization: (authentication scheme: OAuth)
[apiConfig setAccessToken:@"YOUR_ACCESS_TOKEN"];


NSString* reportId = @"reportId_example"; // Идентификатор отчета, который вы получили после запуска генерации. 

OAIReportsApi*apiInstance = [[OAIReportsApi alloc] init];

// Получение заданного отчета
[apiInstance getReportInfoWithReportId:reportId
          completionHandler: ^(OAIGetReportInfoResponse* output, NSError* error) {
                        if (output) {
                            NSLog(@"%@", output);
                        }
                        if (error) {
                            NSLog(@"Error calling OAIReportsApi->getReportInfo: %@", error);
                        }
                    }];
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **NSString***| Идентификатор отчета, который вы получили после запуска генерации.  | 

### Return type

[**OAIGetReportInfoResponse***](OAIGetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

