# ReportsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
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


<a name="generateBoostConsolidatedReport"></a>
# **generateBoostConsolidatedReport**
> GenerateReportResponse generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest, format)

Отчет по бусту продаж

    Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateBoostConsolidatedRequest** | [**GenerateBoostConsolidatedRequest**](../Models/GenerateBoostConsolidatedRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateCompetitorsPositionReport"></a>
# **generateCompetitorsPositionReport**
> GenerateReportResponse generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest, format)

Отчет «Конкурентная позиция»

    Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateCompetitorsPositionReportRequest** | [**GenerateCompetitorsPositionReportRequest**](../Models/GenerateCompetitorsPositionReportRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateGoodsFeedbackReport"></a>
# **generateGoodsFeedbackReport**
> GenerateReportResponse generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest, format)

Отчет по отзывам о товарах

    Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateGoodsFeedbackRequest** | [**GenerateGoodsFeedbackRequest**](../Models/GenerateGoodsFeedbackRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateGoodsMovementReport"></a>
# **generateGoodsMovementReport**
> GenerateReportResponse generateGoodsMovementReport(GenerateGoodsMovementReportRequest, format)

Отчет по движению товаров

    Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateGoodsMovementReportRequest** | [**GenerateGoodsMovementReportRequest**](../Models/GenerateGoodsMovementReportRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateGoodsRealizationReport"></a>
# **generateGoodsRealizationReport**
> GenerateReportResponse generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest, format)

Отчет по реализации

    Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateGoodsRealizationReportRequest** | [**GenerateGoodsRealizationReportRequest**](../Models/GenerateGoodsRealizationReportRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateGoodsTurnoverReport"></a>
# **generateGoodsTurnoverReport**
> GenerateReportResponse generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest, format)

Отчет по оборачиваемости

    Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateGoodsTurnoverRequest** | [**GenerateGoodsTurnoverRequest**](../Models/GenerateGoodsTurnoverRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateMassOrderLabelsReport"></a>
# **generateMassOrderLabelsReport**
> GenerateReportResponse generateMassOrderLabelsReport(GenerateMassOrderLabelsRequest, format)

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

    Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateMassOrderLabelsRequest** | [**GenerateMassOrderLabelsRequest**](../Models/GenerateMassOrderLabelsRequest.md)|  | |
| **format** | [**PageFormatType**](../Models/.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] [default to null] [enum: A7, A4] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generatePricesReport"></a>
# **generatePricesReport**
> GenerateReportResponse generatePricesReport(GeneratePricesReportRequest, format)

Отчет «Цены на рынке»

    Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GeneratePricesReportRequest** | [**GeneratePricesReportRequest**](../Models/GeneratePricesReportRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateShelfsStatisticsReport"></a>
# **generateShelfsStatisticsReport**
> GenerateReportResponse generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest, format)

Отчет по полкам

    Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateShelfsStatisticsRequest** | [**GenerateShelfsStatisticsRequest**](../Models/GenerateShelfsStatisticsRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateShipmentListDocumentReport"></a>
# **generateShipmentListDocumentReport**
> GenerateReportResponse generateShipmentListDocumentReport(GenerateShipmentListDocumentReportRequest)

Получение листа сборки

    Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateShipmentListDocumentReportRequest** | [**GenerateShipmentListDocumentReportRequest**](../Models/GenerateShipmentListDocumentReportRequest.md)|  | |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateShowsSalesReport"></a>
# **generateShowsSalesReport**
> GenerateReportResponse generateShowsSalesReport(GenerateShowsSalesReportRequest, format)

Отчет «Аналитика продаж»

    Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateShowsSalesReportRequest** | [**GenerateShowsSalesReportRequest**](../Models/GenerateShowsSalesReportRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateStocksOnWarehousesReport"></a>
# **generateStocksOnWarehousesReport**
> GenerateReportResponse generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest, format)

Отчет по остаткам на складах

    Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateStocksOnWarehousesReportRequest** | [**GenerateStocksOnWarehousesReportRequest**](../Models/GenerateStocksOnWarehousesReportRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateUnitedMarketplaceServicesReport"></a>
# **generateUnitedMarketplaceServicesReport**
> GenerateReportResponse generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest, format)

Отчет по стоимости услуг

    Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateUnitedMarketplaceServicesReportRequest** | [**GenerateUnitedMarketplaceServicesReportRequest**](../Models/GenerateUnitedMarketplaceServicesReportRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateUnitedNettingReport"></a>
# **generateUnitedNettingReport**
> GenerateReportResponse generateUnitedNettingReport(GenerateUnitedNettingReportRequest, format)

Отчет по платежам

    Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateUnitedNettingReportRequest** | [**GenerateUnitedNettingReportRequest**](../Models/GenerateUnitedNettingReportRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="generateUnitedOrdersReport"></a>
# **generateUnitedOrdersReport**
> GenerateReportResponse generateUnitedOrdersReport(GenerateUnitedOrdersRequest, format)

Отчет по заказам

    Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **GenerateUnitedOrdersRequest** | [**GenerateUnitedOrdersRequest**](../Models/GenerateUnitedOrdersRequest.md)|  | |
| **format** | [**ReportFormatType**](../Models/.md)| Формат отчета. | [optional] [default to null] [enum: FILE, CSV] |

### Return type

[**GenerateReportResponse**](../Models/GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

<a name="getReportInfo"></a>
# **getReportInfo**
> GetReportInfoResponse getReportInfo(reportId)

Получение заданного отчета

    Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Parameters

|Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **reportId** | **String**| Идентификатор отчета, который вы получили после запуска генерации.  | [default to null] |

### Return type

[**GetReportInfoResponse**](../Models/GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

