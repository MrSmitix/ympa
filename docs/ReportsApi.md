# ReportsApi

All URIs are relative to **

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

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateBoostConsolidatedReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateBoostConsolidatedRequest** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateCompetitorsPositionReport

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

{% note info \"Значение -1 в отчете\" %}

Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.

{% endnote %}

|**⚙️ Лимит:** 10 запросов в час|
|-|

### Example

```bash
 generateCompetitorsPositionReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateCompetitorsPositionReportRequest** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateGoodsFeedbackReport

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateGoodsFeedbackReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsFeedbackRequest** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateGoodsMovementReport

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateGoodsMovementReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsMovementReportRequest** | [**GenerateGoodsMovementReportRequest**](GenerateGoodsMovementReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateGoodsRealizationReport

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateGoodsRealizationReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsRealizationReportRequest** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateGoodsTurnoverReport

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateGoodsTurnoverReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsTurnoverRequest** | [**GenerateGoodsTurnoverRequest**](GenerateGoodsTurnoverRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateMassOrderLabelsReport

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 1000 запросов в час|
|-|

### Example

```bash
 generateMassOrderLabelsReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateMassOrderLabelsRequest** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md) |  |
 **format** | [**PageFormatType**](.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generatePricesReport

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generatePricesReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generatePricesReportRequest** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateShelfsStatisticsReport

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateShelfsStatisticsReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShelfsStatisticsRequest** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateShipmentListDocumentReport

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.

Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateShipmentListDocumentReport
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShipmentListDocumentReportRequest** | [**GenerateShipmentListDocumentReportRequest**](GenerateShipmentListDocumentReportRequest.md) |  |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateShowsSalesReport

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 10 запросов в час|
|-|

### Example

```bash
 generateShowsSalesReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShowsSalesReportRequest** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateStocksOnWarehousesReport

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:

* Для модели FBY — об остатках на складах Маркета.
* Для остальных моделей — об остатках на соответствующем складе магазина.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateStocksOnWarehousesReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateStocksOnWarehousesReportRequest** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateUnitedMarketplaceServicesReport

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**               |**Какие поля нужны**             |
|-----------------------------|---------------------------------|
|По дате начисления услуги    |'dateFrom' и 'dateTo'            |
|По дате формирования акта    |'year' и 'month'                 |

Заказать отчеты обоих типов одним запросом нельзя.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateUnitedMarketplaceServicesReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedMarketplaceServicesReportRequest** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateUnitedNettingReport

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**           |**Какие поля нужны**                   |
|-------------------------|---------------------------------------|
|О платежах за период     |'dateFrom' и 'dateTo'                  |
|О платежном поручении    |'bankOrderId' и 'bankOrderDateTime'    |

Заказать отчеты обоих типов одним запросом нельзя.

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateUnitedNettingReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedNettingReportRequest** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## generateUnitedOrdersReport

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)

{% note info \"\" %}

Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)

{% endnote %}

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|

### Example

```bash
 generateUnitedOrdersReport  format=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedOrdersRequest** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md) |  |
 **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] [default to null]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)


## getReportInfo

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.

Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)

|**⚙️ Лимит:** 100 запросов в минуту|
|-|

### Example

```bash
 getReportInfo reportId=value
```

### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string** | Идентификатор отчета, который вы получили после запуска генерации. | [default to null]

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not Applicable
- **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

