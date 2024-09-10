# ReportsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateBoostConsolidatedReport**](ReportsApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**generateCompetitorsPositionReport**](ReportsApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**generateGoodsFeedbackReport**](ReportsApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**generateGoodsMovementReport**](ReportsApi.md#generateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
[**generateGoodsRealizationReport**](ReportsApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**generateGoodsTurnoverReport**](ReportsApi.md#generateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
[**generateMassOrderLabelsReport**](ReportsApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**generatePricesReport**](ReportsApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**generateShelfsStatisticsReport**](ReportsApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**generateShipmentListDocumentReport**](ReportsApi.md#generateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
[**generateShowsSalesReport**](ReportsApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**generateStocksOnWarehousesReport**](ReportsApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**generateUnitedMarketplaceServicesReport**](ReportsApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**generateUnitedNettingReport**](ReportsApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
[**generateUnitedOrdersReport**](ReportsApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
[**getReportInfo**](ReportsApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета



## generateBoostConsolidatedReport

> GenerateReportResponse generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format)

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = new GenerateBoostConsolidatedRequest(); // GenerateBoostConsolidatedRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateBoostConsolidatedReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateBoostConsolidatedRequest** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateCompetitorsPositionReport

> GenerateReportResponse generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format)

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = new GenerateCompetitorsPositionReportRequest(); // GenerateCompetitorsPositionReportRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateCompetitorsPositionReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateCompetitorsPositionReportRequest** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateGoodsFeedbackReport

> GenerateReportResponse generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format)

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = new GenerateGoodsFeedbackRequest(); // GenerateGoodsFeedbackRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateGoodsFeedbackReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsFeedbackRequest** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateGoodsMovementReport

> GenerateReportResponse generateGoodsMovementReport(generateGoodsMovementReportRequest, format)

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = new GenerateGoodsMovementReportRequest(); // GenerateGoodsMovementReportRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateGoodsMovementReport(generateGoodsMovementReportRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateGoodsMovementReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsMovementReportRequest** | [**GenerateGoodsMovementReportRequest**](GenerateGoodsMovementReportRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateGoodsRealizationReport

> GenerateReportResponse generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format)

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = new GenerateGoodsRealizationReportRequest(); // GenerateGoodsRealizationReportRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateGoodsRealizationReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsRealizationReportRequest** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateGoodsTurnoverReport

> GenerateReportResponse generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format)

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = new GenerateGoodsTurnoverRequest(); // GenerateGoodsTurnoverRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateGoodsTurnoverReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsTurnoverRequest** | [**GenerateGoodsTurnoverRequest**](GenerateGoodsTurnoverRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateMassOrderLabelsReport

> GenerateReportResponse generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format)

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest = new GenerateMassOrderLabelsRequest(); // GenerateMassOrderLabelsRequest | 
PageFormatType format = null; // PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
try {
    GenerateReportResponse result = apiInstance.generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateMassOrderLabelsReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateMassOrderLabelsRequest** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md)|  |
 **format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] [default to null] [enum: A7, A4]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generatePricesReport

> GenerateReportResponse generatePricesReport(generatePricesReportRequest, format)

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GeneratePricesReportRequest generatePricesReportRequest = new GeneratePricesReportRequest(); // GeneratePricesReportRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generatePricesReport(generatePricesReportRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generatePricesReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generatePricesReportRequest** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateShelfsStatisticsReport

> GenerateReportResponse generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format)

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = new GenerateShelfsStatisticsRequest(); // GenerateShelfsStatisticsRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateShelfsStatisticsReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShelfsStatisticsRequest** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateShipmentListDocumentReport

> GenerateReportResponse generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest)

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest = new GenerateShipmentListDocumentReportRequest(); // GenerateShipmentListDocumentReportRequest | 
try {
    GenerateReportResponse result = apiInstance.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateShipmentListDocumentReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShipmentListDocumentReportRequest** | [**GenerateShipmentListDocumentReportRequest**](GenerateShipmentListDocumentReportRequest.md)|  |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateShowsSalesReport

> GenerateReportResponse generateShowsSalesReport(generateShowsSalesReportRequest, format)

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateShowsSalesReportRequest generateShowsSalesReportRequest = new GenerateShowsSalesReportRequest(); // GenerateShowsSalesReportRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateShowsSalesReport(generateShowsSalesReportRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateShowsSalesReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShowsSalesReportRequest** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateStocksOnWarehousesReport

> GenerateReportResponse generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format)

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = new GenerateStocksOnWarehousesReportRequest(); // GenerateStocksOnWarehousesReportRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateStocksOnWarehousesReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateStocksOnWarehousesReportRequest** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateUnitedMarketplaceServicesReport

> GenerateReportResponse generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format)

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = new GenerateUnitedMarketplaceServicesReportRequest(); // GenerateUnitedMarketplaceServicesReportRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateUnitedMarketplaceServicesReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedMarketplaceServicesReportRequest** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateUnitedNettingReport

> GenerateReportResponse generateUnitedNettingReport(generateUnitedNettingReportRequest, format)

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = new GenerateUnitedNettingReportRequest(); // GenerateUnitedNettingReportRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateUnitedNettingReport(generateUnitedNettingReportRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateUnitedNettingReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedNettingReportRequest** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generateUnitedOrdersReport

> GenerateReportResponse generateUnitedOrdersReport(generateUnitedOrdersRequest, format)

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
GenerateUnitedOrdersRequest generateUnitedOrdersRequest = new GenerateUnitedOrdersRequest(); // GenerateUnitedOrdersRequest | 
ReportFormatType format = null; // ReportFormatType | Формат отчета.
try {
    GenerateReportResponse result = apiInstance.generateUnitedOrdersReport(generateUnitedOrdersRequest, format);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#generateUnitedOrdersReport");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedOrdersRequest** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md)|  |
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## getReportInfo

> GetReportInfoResponse getReportInfo(reportId)

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example

```java
// Import classes:
//import org.openapitools.client.api.ReportsApi;

ReportsApi apiInstance = new ReportsApi();
String reportId = null; // String | Идентификатор отчета, который вы получили после запуска генерации. 
try {
    GetReportInfoResponse result = apiInstance.getReportInfo(reportId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportsApi#getReportInfo");
    e.printStackTrace();
}
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **String**| Идентификатор отчета, который вы получили после запуска генерации.  | [default to null]

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

