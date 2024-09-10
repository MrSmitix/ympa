# ReportsAPI

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ReportsAPI_generateBoostConsolidatedReport**](ReportsAPI.md#ReportsAPI_generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**ReportsAPI_generateCompetitorsPositionReport**](ReportsAPI.md#ReportsAPI_generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**ReportsAPI_generateGoodsFeedbackReport**](ReportsAPI.md#ReportsAPI_generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**ReportsAPI_generateGoodsMovementReport**](ReportsAPI.md#ReportsAPI_generateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
[**ReportsAPI_generateGoodsRealizationReport**](ReportsAPI.md#ReportsAPI_generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**ReportsAPI_generateGoodsTurnoverReport**](ReportsAPI.md#ReportsAPI_generateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
[**ReportsAPI_generateMassOrderLabelsReport**](ReportsAPI.md#ReportsAPI_generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**ReportsAPI_generatePricesReport**](ReportsAPI.md#ReportsAPI_generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**ReportsAPI_generateShelfsStatisticsReport**](ReportsAPI.md#ReportsAPI_generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**ReportsAPI_generateShipmentListDocumentReport**](ReportsAPI.md#ReportsAPI_generateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
[**ReportsAPI_generateShowsSalesReport**](ReportsAPI.md#ReportsAPI_generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**ReportsAPI_generateStocksOnWarehousesReport**](ReportsAPI.md#ReportsAPI_generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**ReportsAPI_generateUnitedMarketplaceServicesReport**](ReportsAPI.md#ReportsAPI_generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**ReportsAPI_generateUnitedNettingReport**](ReportsAPI.md#ReportsAPI_generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
[**ReportsAPI_generateUnitedOrdersReport**](ReportsAPI.md#ReportsAPI_generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
[**ReportsAPI_getReportInfo**](ReportsAPI.md#ReportsAPI_getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета


# **ReportsAPI_generateBoostConsolidatedReport**
```c
// Отчет по бусту продаж
//
// Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateBoostConsolidatedReport(apiClient_t *apiClient, generate_boost_consolidated_request_t *generate_boost_consolidated_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_boost_consolidated_request** | **[generate_boost_consolidated_request_t](generate_boost_consolidated_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateCompetitorsPositionReport**
```c
// Отчет «Конкурентная позиция»
//
// Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateCompetitorsPositionReport(apiClient_t *apiClient, generate_competitors_position_report_request_t *generate_competitors_position_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_competitors_position_report_request** | **[generate_competitors_position_report_request_t](generate_competitors_position_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateGoodsFeedbackReport**
```c
// Отчет по отзывам о товарах
//
// Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateGoodsFeedbackReport(apiClient_t *apiClient, generate_goods_feedback_request_t *generate_goods_feedback_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_goods_feedback_request** | **[generate_goods_feedback_request_t](generate_goods_feedback_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateGoodsMovementReport**
```c
// Отчет по движению товаров
//
// Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateGoodsMovementReport(apiClient_t *apiClient, generate_goods_movement_report_request_t *generate_goods_movement_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_goods_movement_report_request** | **[generate_goods_movement_report_request_t](generate_goods_movement_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateGoodsRealizationReport**
```c
// Отчет по реализации
//
// Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateGoodsRealizationReport(apiClient_t *apiClient, generate_goods_realization_report_request_t *generate_goods_realization_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_goods_realization_report_request** | **[generate_goods_realization_report_request_t](generate_goods_realization_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateGoodsTurnoverReport**
```c
// Отчет по оборачиваемости
//
// Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateGoodsTurnoverReport(apiClient_t *apiClient, generate_goods_turnover_request_t *generate_goods_turnover_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_goods_turnover_request** | **[generate_goods_turnover_request_t](generate_goods_turnover_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateMassOrderLabelsReport**
```c
// Готовые ярлыки‑наклейки на все коробки в нескольких заказах
//
// Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateMassOrderLabelsReport(apiClient_t *apiClient, generate_mass_order_labels_request_t *generate_mass_order_labels_request, page_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_mass_order_labels_request** | **[generate_mass_order_labels_request_t](generate_mass_order_labels_request.md) \*** |  | 
**format** | **page_format_type_e** | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generatePricesReport**
```c
// Отчет «Цены на рынке»
//
// Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generatePricesReport(apiClient_t *apiClient, generate_prices_report_request_t *generate_prices_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_prices_report_request** | **[generate_prices_report_request_t](generate_prices_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateShelfsStatisticsReport**
```c
// Отчет по полкам
//
// Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateShelfsStatisticsReport(apiClient_t *apiClient, generate_shelfs_statistics_request_t *generate_shelfs_statistics_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_shelfs_statistics_request** | **[generate_shelfs_statistics_request_t](generate_shelfs_statistics_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateShipmentListDocumentReport**
```c
// Получение листа сборки
//
// Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateShipmentListDocumentReport(apiClient_t *apiClient, generate_shipment_list_document_report_request_t *generate_shipment_list_document_report_request);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_shipment_list_document_report_request** | **[generate_shipment_list_document_report_request_t](generate_shipment_list_document_report_request.md) \*** |  | 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateShowsSalesReport**
```c
// Отчет «Аналитика продаж»
//
// Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateShowsSalesReport(apiClient_t *apiClient, generate_shows_sales_report_request_t *generate_shows_sales_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_shows_sales_report_request** | **[generate_shows_sales_report_request_t](generate_shows_sales_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateStocksOnWarehousesReport**
```c
// Отчет по остаткам на складах
//
// Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateStocksOnWarehousesReport(apiClient_t *apiClient, generate_stocks_on_warehouses_report_request_t *generate_stocks_on_warehouses_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_stocks_on_warehouses_report_request** | **[generate_stocks_on_warehouses_report_request_t](generate_stocks_on_warehouses_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateUnitedMarketplaceServicesReport**
```c
// Отчет по стоимости услуг
//
// Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateUnitedMarketplaceServicesReport(apiClient_t *apiClient, generate_united_marketplace_services_report_request_t *generate_united_marketplace_services_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_united_marketplace_services_report_request** | **[generate_united_marketplace_services_report_request_t](generate_united_marketplace_services_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateUnitedNettingReport**
```c
// Отчет по платежам
//
// Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateUnitedNettingReport(apiClient_t *apiClient, generate_united_netting_report_request_t *generate_united_netting_report_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_united_netting_report_request** | **[generate_united_netting_report_request_t](generate_united_netting_report_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_generateUnitedOrdersReport**
```c
// Отчет по заказам
//
// Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
//
generate_report_response_t* ReportsAPI_generateUnitedOrdersReport(apiClient_t *apiClient, generate_united_orders_request_t *generate_united_orders_request, report_format_type_e format);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**generate_united_orders_request** | **[generate_united_orders_request_t](generate_united_orders_request.md) \*** |  | 
**format** | **report_format_type_e** | Формат отчета. | [optional] 

### Return type

[generate_report_response_t](generate_report_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **ReportsAPI_getReportInfo**
```c
// Получение заданного отчета
//
// Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
//
get_report_info_response_t* ReportsAPI_getReportInfo(apiClient_t *apiClient, char *reportId);
```

### Parameters
Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
**apiClient** | **apiClient_t \*** | context containing the client configuration |
**reportId** | **char \*** | Идентификатор отчета, который вы получили после запуска генерации.  | 

### Return type

[get_report_info_response_t](get_report_info_response.md) *


### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

