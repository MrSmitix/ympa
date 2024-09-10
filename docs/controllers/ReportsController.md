# ReportsController

All URIs are relative to `""`

The controller class is defined in **[ReportsController.java](../../src/main/java/org/openapitools/controller/ReportsController.java)**

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateBoostConsolidatedReport**](#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**generateCompetitorsPositionReport**](#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**generateGoodsFeedbackReport**](#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**generateGoodsMovementReport**](#generateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
[**generateGoodsRealizationReport**](#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**generateGoodsTurnoverReport**](#generateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
[**generateMassOrderLabelsReport**](#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**generatePricesReport**](#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**generateShelfsStatisticsReport**](#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**generateShipmentListDocumentReport**](#generateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
[**generateShowsSalesReport**](#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**generateStocksOnWarehousesReport**](#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**generateUnitedMarketplaceServicesReport**](#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**generateUnitedNettingReport**](#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
[**generateUnitedOrdersReport**](#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
[**getReportInfo**](#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета

<a id="generateBoostConsolidatedReport"></a>
# **generateBoostConsolidatedReport**
```java
Mono<GenerateReportResponse> ReportsController.generateBoostConsolidatedReport(generateBoostConsolidatedRequest_format)
```

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateBoostConsolidatedRequest** | [**GenerateBoostConsolidatedRequest**](../../docs/models/GenerateBoostConsolidatedRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateCompetitorsPositionReport"></a>
# **generateCompetitorsPositionReport**
```java
Mono<GenerateReportResponse> ReportsController.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest_format)
```

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateCompetitorsPositionReportRequest** | [**GenerateCompetitorsPositionReportRequest**](../../docs/models/GenerateCompetitorsPositionReportRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateGoodsFeedbackReport"></a>
# **generateGoodsFeedbackReport**
```java
Mono<GenerateReportResponse> ReportsController.generateGoodsFeedbackReport(generateGoodsFeedbackRequest_format)
```

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateGoodsFeedbackRequest** | [**GenerateGoodsFeedbackRequest**](../../docs/models/GenerateGoodsFeedbackRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateGoodsMovementReport"></a>
# **generateGoodsMovementReport**
```java
Mono<GenerateReportResponse> ReportsController.generateGoodsMovementReport(generateGoodsMovementReportRequest_format)
```

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateGoodsMovementReportRequest** | [**GenerateGoodsMovementReportRequest**](../../docs/models/GenerateGoodsMovementReportRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateGoodsRealizationReport"></a>
# **generateGoodsRealizationReport**
```java
Mono<GenerateReportResponse> ReportsController.generateGoodsRealizationReport(generateGoodsRealizationReportRequest_format)
```

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateGoodsRealizationReportRequest** | [**GenerateGoodsRealizationReportRequest**](../../docs/models/GenerateGoodsRealizationReportRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateGoodsTurnoverReport"></a>
# **generateGoodsTurnoverReport**
```java
Mono<GenerateReportResponse> ReportsController.generateGoodsTurnoverReport(generateGoodsTurnoverRequest_format)
```

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateGoodsTurnoverRequest** | [**GenerateGoodsTurnoverRequest**](../../docs/models/GenerateGoodsTurnoverRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateMassOrderLabelsReport"></a>
# **generateMassOrderLabelsReport**
```java
Mono<GenerateReportResponse> ReportsController.generateMassOrderLabelsReport(generateMassOrderLabelsRequest_format)
```

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateMassOrderLabelsRequest** | [**GenerateMassOrderLabelsRequest**](../../docs/models/GenerateMassOrderLabelsRequest.md) |  |
**_format** | [**PageFormatType**](../../docs/models/.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional parameter] [enum: `A7`, `A4`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generatePricesReport"></a>
# **generatePricesReport**
```java
Mono<GenerateReportResponse> ReportsController.generatePricesReport(generatePricesReportRequest_format)
```

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generatePricesReportRequest** | [**GeneratePricesReportRequest**](../../docs/models/GeneratePricesReportRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateShelfsStatisticsReport"></a>
# **generateShelfsStatisticsReport**
```java
Mono<GenerateReportResponse> ReportsController.generateShelfsStatisticsReport(generateShelfsStatisticsRequest_format)
```

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateShelfsStatisticsRequest** | [**GenerateShelfsStatisticsRequest**](../../docs/models/GenerateShelfsStatisticsRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateShipmentListDocumentReport"></a>
# **generateShipmentListDocumentReport**
```java
Mono<GenerateReportResponse> ReportsController.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest)
```

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateShipmentListDocumentReportRequest** | [**GenerateShipmentListDocumentReportRequest**](../../docs/models/GenerateShipmentListDocumentReportRequest.md) |  |

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateShowsSalesReport"></a>
# **generateShowsSalesReport**
```java
Mono<GenerateReportResponse> ReportsController.generateShowsSalesReport(generateShowsSalesReportRequest_format)
```

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateShowsSalesReportRequest** | [**GenerateShowsSalesReportRequest**](../../docs/models/GenerateShowsSalesReportRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateStocksOnWarehousesReport"></a>
# **generateStocksOnWarehousesReport**
```java
Mono<GenerateReportResponse> ReportsController.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest_format)
```

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateStocksOnWarehousesReportRequest** | [**GenerateStocksOnWarehousesReportRequest**](../../docs/models/GenerateStocksOnWarehousesReportRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateUnitedMarketplaceServicesReport"></a>
# **generateUnitedMarketplaceServicesReport**
```java
Mono<GenerateReportResponse> ReportsController.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest_format)
```

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateUnitedMarketplaceServicesReportRequest** | [**GenerateUnitedMarketplaceServicesReportRequest**](../../docs/models/GenerateUnitedMarketplaceServicesReportRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateUnitedNettingReport"></a>
# **generateUnitedNettingReport**
```java
Mono<GenerateReportResponse> ReportsController.generateUnitedNettingReport(generateUnitedNettingReportRequest_format)
```

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateUnitedNettingReportRequest** | [**GenerateUnitedNettingReportRequest**](../../docs/models/GenerateUnitedNettingReportRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="generateUnitedOrdersReport"></a>
# **generateUnitedOrdersReport**
```java
Mono<GenerateReportResponse> ReportsController.generateUnitedOrdersReport(generateUnitedOrdersRequest_format)
```

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**generateUnitedOrdersRequest** | [**GenerateUnitedOrdersRequest**](../../docs/models/GenerateUnitedOrdersRequest.md) |  |
**_format** | [**ReportFormatType**](../../docs/models/.md) | Формат отчета. | [optional parameter] [enum: `FILE`, `CSV`]

### Return type
[**GenerateReportResponse**](../../docs/models/GenerateReportResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: `application/json`
 - **Produces Content-Type**: `application/json`

<a id="getReportInfo"></a>
# **getReportInfo**
```java
Mono<GetReportInfoResponse> ReportsController.getReportInfo(reportId)
```

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**reportId** | `String` | Идентификатор отчета, который вы получили после запуска генерации.  |

### Return type
[**GetReportInfoResponse**](../../docs/models/GetReportInfoResponse.md)

### Authorization
* **OAuth**, scopes: `market:partner-api`

### HTTP request headers
 - **Accepts Content-Type**: Not defined
 - **Produces Content-Type**: `application/json`

