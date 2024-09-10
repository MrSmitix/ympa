# ReportsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generate_boost_consolidated_report**](ReportsApi.md#generate_boost_consolidated_report) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**generate_competitors_position_report**](ReportsApi.md#generate_competitors_position_report) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**generate_goods_feedback_report**](ReportsApi.md#generate_goods_feedback_report) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**generate_goods_movement_report**](ReportsApi.md#generate_goods_movement_report) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
[**generate_goods_realization_report**](ReportsApi.md#generate_goods_realization_report) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**generate_goods_turnover_report**](ReportsApi.md#generate_goods_turnover_report) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
[**generate_mass_order_labels_report**](ReportsApi.md#generate_mass_order_labels_report) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**generate_prices_report**](ReportsApi.md#generate_prices_report) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**generate_shelfs_statistics_report**](ReportsApi.md#generate_shelfs_statistics_report) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**generate_shipment_list_document_report**](ReportsApi.md#generate_shipment_list_document_report) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
[**generate_shows_sales_report**](ReportsApi.md#generate_shows_sales_report) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**generate_stocks_on_warehouses_report**](ReportsApi.md#generate_stocks_on_warehouses_report) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**generate_united_marketplace_services_report**](ReportsApi.md#generate_united_marketplace_services_report) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**generate_united_netting_report**](ReportsApi.md#generate_united_netting_report) | **POST** /reports/united-netting/generate | Отчет по платежам
[**generate_united_orders_report**](ReportsApi.md#generate_united_orders_report) | **POST** /reports/united-orders/generate | Отчет по заказам
[**get_report_info**](ReportsApi.md#get_report_info) | **GET** /reports/info/{reportId} | Получение заданного отчета


# **generate_boost_consolidated_report**
> generate_boost_consolidated_report(_api::ReportsApi, generate_boost_consolidated_request::GenerateBoostConsolidatedRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_boost_consolidated_report(_api::ReportsApi, response_stream::Channel, generate_boost_consolidated_request::GenerateBoostConsolidatedRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_boost_consolidated_request** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_competitors_position_report**
> generate_competitors_position_report(_api::ReportsApi, generate_competitors_position_report_request::GenerateCompetitorsPositionReportRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_competitors_position_report(_api::ReportsApi, response_stream::Channel, generate_competitors_position_report_request::GenerateCompetitorsPositionReportRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_competitors_position_report_request** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_goods_feedback_report**
> generate_goods_feedback_report(_api::ReportsApi, generate_goods_feedback_request::GenerateGoodsFeedbackRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_goods_feedback_report(_api::ReportsApi, response_stream::Channel, generate_goods_feedback_request::GenerateGoodsFeedbackRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_goods_feedback_request** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_goods_movement_report**
> generate_goods_movement_report(_api::ReportsApi, generate_goods_movement_report_request::GenerateGoodsMovementReportRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_goods_movement_report(_api::ReportsApi, response_stream::Channel, generate_goods_movement_report_request::GenerateGoodsMovementReportRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_goods_movement_report_request** | [**GenerateGoodsMovementReportRequest**](GenerateGoodsMovementReportRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_goods_realization_report**
> generate_goods_realization_report(_api::ReportsApi, generate_goods_realization_report_request::GenerateGoodsRealizationReportRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_goods_realization_report(_api::ReportsApi, response_stream::Channel, generate_goods_realization_report_request::GenerateGoodsRealizationReportRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_goods_realization_report_request** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_goods_turnover_report**
> generate_goods_turnover_report(_api::ReportsApi, generate_goods_turnover_request::GenerateGoodsTurnoverRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_goods_turnover_report(_api::ReportsApi, response_stream::Channel, generate_goods_turnover_request::GenerateGoodsTurnoverRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_goods_turnover_request** | [**GenerateGoodsTurnoverRequest**](GenerateGoodsTurnoverRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_mass_order_labels_report**
> generate_mass_order_labels_report(_api::ReportsApi, generate_mass_order_labels_request::GenerateMassOrderLabelsRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_mass_order_labels_report(_api::ReportsApi, response_stream::Channel, generate_mass_order_labels_request::GenerateMassOrderLabelsRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_mass_order_labels_request** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**PageFormatType**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_prices_report**
> generate_prices_report(_api::ReportsApi, generate_prices_report_request::GeneratePricesReportRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_prices_report(_api::ReportsApi, response_stream::Channel, generate_prices_report_request::GeneratePricesReportRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_prices_report_request** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_shelfs_statistics_report**
> generate_shelfs_statistics_report(_api::ReportsApi, generate_shelfs_statistics_request::GenerateShelfsStatisticsRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_shelfs_statistics_report(_api::ReportsApi, response_stream::Channel, generate_shelfs_statistics_request::GenerateShelfsStatisticsRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_shelfs_statistics_request** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_shipment_list_document_report**
> generate_shipment_list_document_report(_api::ReportsApi, generate_shipment_list_document_report_request::GenerateShipmentListDocumentReportRequest; _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_shipment_list_document_report(_api::ReportsApi, response_stream::Channel, generate_shipment_list_document_report_request::GenerateShipmentListDocumentReportRequest; _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_shipment_list_document_report_request** | [**GenerateShipmentListDocumentReportRequest**](GenerateShipmentListDocumentReportRequest.md)|  | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_shows_sales_report**
> generate_shows_sales_report(_api::ReportsApi, generate_shows_sales_report_request::GenerateShowsSalesReportRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_shows_sales_report(_api::ReportsApi, response_stream::Channel, generate_shows_sales_report_request::GenerateShowsSalesReportRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_shows_sales_report_request** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_stocks_on_warehouses_report**
> generate_stocks_on_warehouses_report(_api::ReportsApi, generate_stocks_on_warehouses_report_request::GenerateStocksOnWarehousesReportRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_stocks_on_warehouses_report(_api::ReportsApi, response_stream::Channel, generate_stocks_on_warehouses_report_request::GenerateStocksOnWarehousesReportRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_stocks_on_warehouses_report_request** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_united_marketplace_services_report**
> generate_united_marketplace_services_report(_api::ReportsApi, generate_united_marketplace_services_report_request::GenerateUnitedMarketplaceServicesReportRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_united_marketplace_services_report(_api::ReportsApi, response_stream::Channel, generate_united_marketplace_services_report_request::GenerateUnitedMarketplaceServicesReportRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_united_marketplace_services_report_request** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_united_netting_report**
> generate_united_netting_report(_api::ReportsApi, generate_united_netting_report_request::GenerateUnitedNettingReportRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_united_netting_report(_api::ReportsApi, response_stream::Channel, generate_united_netting_report_request::GenerateUnitedNettingReportRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_united_netting_report_request** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **generate_united_orders_report**
> generate_united_orders_report(_api::ReportsApi, generate_united_orders_request::GenerateUnitedOrdersRequest; format=nothing, _mediaType=nothing) -> GenerateReportResponse, OpenAPI.Clients.ApiResponse <br/>
> generate_united_orders_report(_api::ReportsApi, response_stream::Channel, generate_united_orders_request::GenerateUnitedOrdersRequest; format=nothing, _mediaType=nothing) -> Channel{ GenerateReportResponse }, OpenAPI.Clients.ApiResponse

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**generate_united_orders_request** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md)|  | 

### Optional Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **format** | [**ReportFormatType**](.md)| Формат отчета. | [default to nothing]

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

# **get_report_info**
> get_report_info(_api::ReportsApi, report_id::String; _mediaType=nothing) -> GetReportInfoResponse, OpenAPI.Clients.ApiResponse <br/>
> get_report_info(_api::ReportsApi, response_stream::Channel, report_id::String; _mediaType=nothing) -> Channel{ GetReportInfoResponse }, OpenAPI.Clients.ApiResponse

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Required Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **_api** | **ReportsApi** | API context | 
**report_id** | **String**| Идентификатор отчета, который вы получили после запуска генерации.  | [default to nothing]

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#api-endpoints) [[Back to Model list]](../README.md#models) [[Back to README]](../README.md)

