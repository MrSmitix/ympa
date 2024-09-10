# ReportsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GenerateBoostConsolidatedReport**](ReportsApi.md#GenerateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**GenerateCompetitorsPositionReport**](ReportsApi.md#GenerateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**GenerateGoodsFeedbackReport**](ReportsApi.md#GenerateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**GenerateGoodsMovementReport**](ReportsApi.md#GenerateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
[**GenerateGoodsRealizationReport**](ReportsApi.md#GenerateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**GenerateGoodsTurnoverReport**](ReportsApi.md#GenerateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
[**GenerateMassOrderLabelsReport**](ReportsApi.md#GenerateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**GeneratePricesReport**](ReportsApi.md#GeneratePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**GenerateShelfsStatisticsReport**](ReportsApi.md#GenerateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**GenerateShipmentListDocumentReport**](ReportsApi.md#GenerateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
[**GenerateShowsSalesReport**](ReportsApi.md#GenerateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**GenerateStocksOnWarehousesReport**](ReportsApi.md#GenerateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**GenerateUnitedMarketplaceServicesReport**](ReportsApi.md#GenerateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**GenerateUnitedNettingReport**](ReportsApi.md#GenerateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
[**GenerateUnitedOrdersReport**](ReportsApi.md#GenerateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
[**GetReportInfo**](ReportsApi.md#GetReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета


# **GenerateBoostConsolidatedReport**
> GenerateReportResponse GenerateBoostConsolidatedReport(generate_boost_consolidated_request, format = var.format)

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по бусту продаж
#
# prepare function argument(s)
var_generate_boost_consolidated_request <- GenerateBoostConsolidatedRequest$new(123, "dateFrom_example", "dateTo_example") # GenerateBoostConsolidatedRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateBoostConsolidatedReport(var_generate_boost_consolidated_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateBoostConsolidatedReport(var_generate_boost_consolidated_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_boost_consolidated_request** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateCompetitorsPositionReport**
> GenerateReportResponse GenerateCompetitorsPositionReport(generate_competitors_position_report_request, format = var.format)

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет «Конкурентная позиция»
#
# prepare function argument(s)
var_generate_competitors_position_report_request <- GenerateCompetitorsPositionReportRequest$new(123, 123, "dateFrom_example", "dateTo_example") # GenerateCompetitorsPositionReportRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateCompetitorsPositionReport(var_generate_competitors_position_report_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateCompetitorsPositionReport(var_generate_competitors_position_report_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_competitors_position_report_request** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateGoodsFeedbackReport**
> GenerateReportResponse GenerateGoodsFeedbackReport(generate_goods_feedback_request, format = var.format)

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по отзывам о товарах
#
# prepare function argument(s)
var_generate_goods_feedback_request <- GenerateGoodsFeedbackRequest$new(123) # GenerateGoodsFeedbackRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateGoodsFeedbackReport(var_generate_goods_feedback_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateGoodsFeedbackReport(var_generate_goods_feedback_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_goods_feedback_request** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateGoodsMovementReport**
> GenerateReportResponse GenerateGoodsMovementReport(generate_goods_movement_report_request, format = var.format)

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по движению товаров
#
# prepare function argument(s)
var_generate_goods_movement_report_request <- GenerateGoodsMovementReportRequest$new(123, "dateFrom_example", "dateTo_example", "shopSku_example") # GenerateGoodsMovementReportRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateGoodsMovementReport(var_generate_goods_movement_report_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateGoodsMovementReport(var_generate_goods_movement_report_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_goods_movement_report_request** | [**GenerateGoodsMovementReportRequest**](GenerateGoodsMovementReportRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateGoodsRealizationReport**
> GenerateReportResponse GenerateGoodsRealizationReport(generate_goods_realization_report_request, format = var.format)

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по реализации
#
# prepare function argument(s)
var_generate_goods_realization_report_request <- GenerateGoodsRealizationReportRequest$new(123, 123, 123) # GenerateGoodsRealizationReportRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateGoodsRealizationReport(var_generate_goods_realization_report_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateGoodsRealizationReport(var_generate_goods_realization_report_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_goods_realization_report_request** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateGoodsTurnoverReport**
> GenerateReportResponse GenerateGoodsTurnoverReport(generate_goods_turnover_request, format = var.format)

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по оборачиваемости
#
# prepare function argument(s)
var_generate_goods_turnover_request <- GenerateGoodsTurnoverRequest$new(123, "date_example") # GenerateGoodsTurnoverRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateGoodsTurnoverReport(var_generate_goods_turnover_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateGoodsTurnoverReport(var_generate_goods_turnover_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_goods_turnover_request** | [**GenerateGoodsTurnoverRequest**](GenerateGoodsTurnoverRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateMassOrderLabelsReport**
> GenerateReportResponse GenerateMassOrderLabelsReport(generate_mass_order_labels_request, format = var.format)

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Готовые ярлыки‑наклейки на все коробки в нескольких заказах
#
# prepare function argument(s)
var_generate_mass_order_labels_request <- GenerateMassOrderLabelsRequest$new(123, c(123)) # GenerateMassOrderLabelsRequest | 
var_format <- PageFormatType$new() # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateMassOrderLabelsReport(var_generate_mass_order_labels_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateMassOrderLabelsReport(var_generate_mass_order_labels_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_mass_order_labels_request** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md)|  | 
 **format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус &#x60;RESOURCE_NOT_FOUND&#x60;.  |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GeneratePricesReport**
> GenerateReportResponse GeneratePricesReport(generate_prices_report_request, format = var.format)

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет «Цены на рынке»
#
# prepare function argument(s)
var_generate_prices_report_request <- GeneratePricesReportRequest$new(123, 123, c(123), "creationDateFrom_example", "creationDateTo_example") # GeneratePricesReportRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GeneratePricesReport(var_generate_prices_report_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GeneratePricesReport(var_generate_prices_report_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_prices_report_request** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateShelfsStatisticsReport**
> GenerateReportResponse GenerateShelfsStatisticsReport(generate_shelfs_statistics_request, format = var.format)

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по полкам
#
# prepare function argument(s)
var_generate_shelfs_statistics_request <- GenerateShelfsStatisticsRequest$new(123, "dateFrom_example", "dateTo_example", ShelfsStatisticsAttributionType$new()) # GenerateShelfsStatisticsRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateShelfsStatisticsReport(var_generate_shelfs_statistics_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateShelfsStatisticsReport(var_generate_shelfs_statistics_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_shelfs_statistics_request** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateShipmentListDocumentReport**
> GenerateReportResponse GenerateShipmentListDocumentReport(generate_shipment_list_document_report_request)

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Получение листа сборки
#
# prepare function argument(s)
var_generate_shipment_list_document_report_request <- GenerateShipmentListDocumentReportRequest$new(123, 123, c(123)) # GenerateShipmentListDocumentReportRequest | 

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateShipmentListDocumentReport(var_generate_shipment_list_document_report_requestdata_file = "result.txt")
result <- api_instance$GenerateShipmentListDocumentReport(var_generate_shipment_list_document_report_request)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_shipment_list_document_report_request** | [**GenerateShipmentListDocumentReportRequest**](GenerateShipmentListDocumentReportRequest.md)|  | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateShowsSalesReport**
> GenerateReportResponse GenerateShowsSalesReport(generate_shows_sales_report_request, format = var.format)

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет «Аналитика продаж»
#
# prepare function argument(s)
var_generate_shows_sales_report_request <- GenerateShowsSalesReportRequest$new("dateFrom_example", "dateTo_example", ShowsSalesGroupingType$new(), 123, 123) # GenerateShowsSalesReportRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateShowsSalesReport(var_generate_shows_sales_report_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateShowsSalesReport(var_generate_shows_sales_report_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_shows_sales_report_request** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateStocksOnWarehousesReport**
> GenerateReportResponse GenerateStocksOnWarehousesReport(generate_stocks_on_warehouses_report_request, format = var.format)

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по остаткам на складах
#
# prepare function argument(s)
var_generate_stocks_on_warehouses_report_request <- GenerateStocksOnWarehousesReportRequest$new(123, c(123), "reportDate_example", c(123), "hasStocks_example") # GenerateStocksOnWarehousesReportRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateStocksOnWarehousesReport(var_generate_stocks_on_warehouses_report_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateStocksOnWarehousesReport(var_generate_stocks_on_warehouses_report_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_stocks_on_warehouses_report_request** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateUnitedMarketplaceServicesReport**
> GenerateReportResponse GenerateUnitedMarketplaceServicesReport(generate_united_marketplace_services_report_request, format = var.format)

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по стоимости услуг
#
# prepare function argument(s)
var_generate_united_marketplace_services_report_request <- GenerateUnitedMarketplaceServicesReportRequest$new(123, "dateTimeFrom_example", "dateTimeTo_example", "dateFrom_example", "dateTo_example", 123, 123, 123, 123, c(PlacementType$new()), c("inns_example"), c(123)) # GenerateUnitedMarketplaceServicesReportRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateUnitedMarketplaceServicesReport(var_generate_united_marketplace_services_report_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateUnitedMarketplaceServicesReport(var_generate_united_marketplace_services_report_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_united_marketplace_services_report_request** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateUnitedNettingReport**
> GenerateReportResponse GenerateUnitedNettingReport(generate_united_netting_report_request, format = var.format)

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по платежам
#
# prepare function argument(s)
var_generate_united_netting_report_request <- GenerateUnitedNettingReportRequest$new(123, "dateTimeFrom_example", "dateTimeTo_example", "dateFrom_example", "dateTo_example", 123, "bankOrderDateTime_example", c(PlacementType$new()), c("inns_example"), c(123)) # GenerateUnitedNettingReportRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateUnitedNettingReport(var_generate_united_netting_report_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateUnitedNettingReport(var_generate_united_netting_report_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_united_netting_report_request** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GenerateUnitedOrdersReport**
> GenerateReportResponse GenerateUnitedOrdersReport(generate_united_orders_request, format = var.format)

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```R
library(ympa_r_client)

# Отчет по заказам
#
# prepare function argument(s)
var_generate_united_orders_request <- GenerateUnitedOrdersRequest$new(123, "dateFrom_example", "dateTo_example", c(123), "promoId_example") # GenerateUnitedOrdersRequest | 
var_format <- ReportFormatType$new() # ReportFormatType | Формат отчета. (Optional)

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GenerateUnitedOrdersReport(var_generate_united_orders_request, format = var_formatdata_file = "result.txt")
result <- api_instance$GenerateUnitedOrdersReport(var_generate_united_orders_request, format = var_format)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_united_orders_request** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md)|  | 
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

# **GetReportInfo**
> GetReportInfoResponse GetReportInfo(report_id)

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```R
library(ympa_r_client)

# Получение заданного отчета
#
# prepare function argument(s)
var_report_id <- "report_id_example" # character | Идентификатор отчета, который вы получили после запуска генерации. 

api_instance <- ReportsApi$new()
# Configure OAuth2 access token for authorization: OAuth
api_instance$api_client$access_token <- Sys.getenv("ACCESS_TOKEN")
# to save the result into a file, simply add the optional `data_file` parameter, e.g.
# result <- api_instance$GetReportInfo(var_report_iddata_file = "result.txt")
result <- api_instance$GetReportInfo(var_report_id)
dput(result)
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **character**| Идентификатор отчета, который вы получили после запуска генерации.  | 

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — &#x60;FAILED&#x60; или &#x60;NO_DATA&#x60;, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}     |  -  |
| **400** | Запрос содержит неправильные данные. |  -  |
| **401** | В запросе не указаны данные для авторизации. |  -  |
| **403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
| **404** | Запрашиваемый ресурс не найден. |  -  |
| **420** | Превышено ограничение на доступ к ресурсу. |  -  |
| **500** | Внутренняя ошибка сервера. |  -  |

