# ReportsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**generateBoostConsolidatedReport**](ReportsApi.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж |
| [**generateCompetitorsPositionReport**](ReportsApi.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция» |
| [**generateGoodsFeedbackReport**](ReportsApi.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах |
| [**generateGoodsMovementReport**](ReportsApi.md#generateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров |
| [**generateGoodsRealizationReport**](ReportsApi.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации |
| [**generateGoodsTurnoverReport**](ReportsApi.md#generateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости |
| [**generateMassOrderLabelsReport**](ReportsApi.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах |
| [**generatePricesReport**](ReportsApi.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке» |
| [**generateShelfsStatisticsReport**](ReportsApi.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам |
| [**generateShipmentListDocumentReport**](ReportsApi.md#generateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки |
| [**generateShowsSalesReport**](ReportsApi.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж» |
| [**generateStocksOnWarehousesReport**](ReportsApi.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах |
| [**generateUnitedMarketplaceServicesReport**](ReportsApi.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг |
| [**generateUnitedNettingReport**](ReportsApi.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам |
| [**generateUnitedOrdersReport**](ReportsApi.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам |
| [**getReportInfo**](ReportsApi.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета |


<a id="generateBoostConsolidatedReport"></a>
# **generateBoostConsolidatedReport**
> GenerateReportResponse generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format)

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateBoostConsolidatedRequest : GenerateBoostConsolidatedRequest =  // GenerateBoostConsolidatedRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateBoostConsolidatedReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateBoostConsolidatedReport")
    e.printStackTrace()
}
```

### Parameters
| **generateBoostConsolidatedRequest** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateCompetitorsPositionReport"></a>
# **generateCompetitorsPositionReport**
> GenerateReportResponse generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format)

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateCompetitorsPositionReportRequest : GenerateCompetitorsPositionReportRequest =  // GenerateCompetitorsPositionReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateCompetitorsPositionReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateCompetitorsPositionReport")
    e.printStackTrace()
}
```

### Parameters
| **generateCompetitorsPositionReportRequest** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateGoodsFeedbackReport"></a>
# **generateGoodsFeedbackReport**
> GenerateReportResponse generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format)

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateGoodsFeedbackRequest : GenerateGoodsFeedbackRequest =  // GenerateGoodsFeedbackRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateGoodsFeedbackReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateGoodsFeedbackReport")
    e.printStackTrace()
}
```

### Parameters
| **generateGoodsFeedbackRequest** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateGoodsMovementReport"></a>
# **generateGoodsMovementReport**
> GenerateReportResponse generateGoodsMovementReport(generateGoodsMovementReportRequest, format)

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateGoodsMovementReportRequest : GenerateGoodsMovementReportRequest =  // GenerateGoodsMovementReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateGoodsMovementReport(generateGoodsMovementReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateGoodsMovementReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateGoodsMovementReport")
    e.printStackTrace()
}
```

### Parameters
| **generateGoodsMovementReportRequest** | [**GenerateGoodsMovementReportRequest**](GenerateGoodsMovementReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateGoodsRealizationReport"></a>
# **generateGoodsRealizationReport**
> GenerateReportResponse generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format)

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateGoodsRealizationReportRequest : GenerateGoodsRealizationReportRequest =  // GenerateGoodsRealizationReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateGoodsRealizationReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateGoodsRealizationReport")
    e.printStackTrace()
}
```

### Parameters
| **generateGoodsRealizationReportRequest** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateGoodsTurnoverReport"></a>
# **generateGoodsTurnoverReport**
> GenerateReportResponse generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format)

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateGoodsTurnoverRequest : GenerateGoodsTurnoverRequest =  // GenerateGoodsTurnoverRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateGoodsTurnoverReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateGoodsTurnoverReport")
    e.printStackTrace()
}
```

### Parameters
| **generateGoodsTurnoverRequest** | [**GenerateGoodsTurnoverRequest**](GenerateGoodsTurnoverRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateMassOrderLabelsReport"></a>
# **generateMassOrderLabelsReport**
> GenerateReportResponse generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format)

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateMassOrderLabelsRequest : GenerateMassOrderLabelsRequest =  // GenerateMassOrderLabelsRequest | 
val format : PageFormatType =  // PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
try {
    val result : GenerateReportResponse = apiInstance.generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateMassOrderLabelsReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateMassOrderLabelsReport")
    e.printStackTrace()
}
```

### Parameters
| **generateMassOrderLabelsRequest** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] [enum: A7, A4] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generatePricesReport"></a>
# **generatePricesReport**
> GenerateReportResponse generatePricesReport(generatePricesReportRequest, format)

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generatePricesReportRequest : GeneratePricesReportRequest =  // GeneratePricesReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generatePricesReport(generatePricesReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generatePricesReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generatePricesReport")
    e.printStackTrace()
}
```

### Parameters
| **generatePricesReportRequest** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateShelfsStatisticsReport"></a>
# **generateShelfsStatisticsReport**
> GenerateReportResponse generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format)

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateShelfsStatisticsRequest : GenerateShelfsStatisticsRequest =  // GenerateShelfsStatisticsRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateShelfsStatisticsReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateShelfsStatisticsReport")
    e.printStackTrace()
}
```

### Parameters
| **generateShelfsStatisticsRequest** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateShipmentListDocumentReport"></a>
# **generateShipmentListDocumentReport**
> GenerateReportResponse generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest)

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateShipmentListDocumentReportRequest : GenerateShipmentListDocumentReportRequest =  // GenerateShipmentListDocumentReportRequest | 
try {
    val result : GenerateReportResponse = apiInstance.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateShipmentListDocumentReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateShipmentListDocumentReport")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **generateShipmentListDocumentReportRequest** | [**GenerateShipmentListDocumentReportRequest**](GenerateShipmentListDocumentReportRequest.md)|  | |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateShowsSalesReport"></a>
# **generateShowsSalesReport**
> GenerateReportResponse generateShowsSalesReport(generateShowsSalesReportRequest, format)

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateShowsSalesReportRequest : GenerateShowsSalesReportRequest =  // GenerateShowsSalesReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateShowsSalesReport(generateShowsSalesReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateShowsSalesReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateShowsSalesReport")
    e.printStackTrace()
}
```

### Parameters
| **generateShowsSalesReportRequest** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateStocksOnWarehousesReport"></a>
# **generateStocksOnWarehousesReport**
> GenerateReportResponse generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format)

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateStocksOnWarehousesReportRequest : GenerateStocksOnWarehousesReportRequest =  // GenerateStocksOnWarehousesReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateStocksOnWarehousesReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateStocksOnWarehousesReport")
    e.printStackTrace()
}
```

### Parameters
| **generateStocksOnWarehousesReportRequest** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateUnitedMarketplaceServicesReport"></a>
# **generateUnitedMarketplaceServicesReport**
> GenerateReportResponse generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format)

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateUnitedMarketplaceServicesReportRequest : GenerateUnitedMarketplaceServicesReportRequest =  // GenerateUnitedMarketplaceServicesReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateUnitedMarketplaceServicesReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateUnitedMarketplaceServicesReport")
    e.printStackTrace()
}
```

### Parameters
| **generateUnitedMarketplaceServicesReportRequest** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateUnitedNettingReport"></a>
# **generateUnitedNettingReport**
> GenerateReportResponse generateUnitedNettingReport(generateUnitedNettingReportRequest, format)

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateUnitedNettingReportRequest : GenerateUnitedNettingReportRequest =  // GenerateUnitedNettingReportRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateUnitedNettingReport(generateUnitedNettingReportRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateUnitedNettingReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateUnitedNettingReport")
    e.printStackTrace()
}
```

### Parameters
| **generateUnitedNettingReportRequest** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="generateUnitedOrdersReport"></a>
# **generateUnitedOrdersReport**
> GenerateReportResponse generateUnitedOrdersReport(generateUnitedOrdersRequest, format)

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val generateUnitedOrdersRequest : GenerateUnitedOrdersRequest =  // GenerateUnitedOrdersRequest | 
val format : ReportFormatType =  // ReportFormatType | Формат отчета.
try {
    val result : GenerateReportResponse = apiInstance.generateUnitedOrdersReport(generateUnitedOrdersRequest, format)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#generateUnitedOrdersReport")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#generateUnitedOrdersReport")
    e.printStackTrace()
}
```

### Parameters
| **generateUnitedOrdersRequest** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md)|  | |
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a id="getReportInfo"></a>
# **getReportInfo**
> GetReportInfoResponse getReportInfo(reportId)

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```kotlin
// Import classes:
//import ympa_kotlin_client.infrastructure.*
//import ympa_kotlin_client.models.*

val apiInstance = ReportsApi()
val reportId : kotlin.String = reportId_example // kotlin.String | Идентификатор отчета, который вы получили после запуска генерации. 
try {
    val result : GetReportInfoResponse = apiInstance.getReportInfo(reportId)
    println(result)
} catch (e: ClientException) {
    println("4xx response calling ReportsApi#getReportInfo")
    e.printStackTrace()
} catch (e: ServerException) {
    println("5xx response calling ReportsApi#getReportInfo")
    e.printStackTrace()
}
```

### Parameters
| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **reportId** | **kotlin.String**| Идентификатор отчета, который вы получили после запуска генерации.  | |

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization


Configure OAuth:
    ApiClient.accessToken = ""

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

