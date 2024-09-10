# REPORTS_API

All URIs are relative to *https://api.partner.market.yandex.ru*

Feature | HTTP request | Description
------------- | ------------- | -------------
[**generate_boost_consolidated_report**](REPORTS_API.md#generate_boost_consolidated_report) | **Post** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**generate_competitors_position_report**](REPORTS_API.md#generate_competitors_position_report) | **Post** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**generate_goods_feedback_report**](REPORTS_API.md#generate_goods_feedback_report) | **Post** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**generate_goods_movement_report**](REPORTS_API.md#generate_goods_movement_report) | **Post** /reports/goods-movement/generate | Отчет по движению товаров
[**generate_goods_realization_report**](REPORTS_API.md#generate_goods_realization_report) | **Post** /reports/goods-realization/generate | Отчет по реализации
[**generate_goods_turnover_report**](REPORTS_API.md#generate_goods_turnover_report) | **Post** /reports/goods-turnover/generate | Отчет по оборачиваемости
[**generate_mass_order_labels_report**](REPORTS_API.md#generate_mass_order_labels_report) | **Post** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**generate_prices_report**](REPORTS_API.md#generate_prices_report) | **Post** /reports/prices/generate | Отчет «Цены на рынке»
[**generate_shelfs_statistics_report**](REPORTS_API.md#generate_shelfs_statistics_report) | **Post** /reports/shelf-statistics/generate | Отчет по полкам
[**generate_shipment_list_document_report**](REPORTS_API.md#generate_shipment_list_document_report) | **Post** /reports/documents/shipment-list/generate | Получение листа сборки
[**generate_shows_sales_report**](REPORTS_API.md#generate_shows_sales_report) | **Post** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**generate_stocks_on_warehouses_report**](REPORTS_API.md#generate_stocks_on_warehouses_report) | **Post** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**generate_united_marketplace_services_report**](REPORTS_API.md#generate_united_marketplace_services_report) | **Post** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**generate_united_netting_report**](REPORTS_API.md#generate_united_netting_report) | **Post** /reports/united-netting/generate | Отчет по платежам
[**generate_united_orders_report**](REPORTS_API.md#generate_united_orders_report) | **Post** /reports/united-orders/generate | Отчет по заказам
[**report_info**](REPORTS_API.md#report_info) | **Get** /reports/info/{reportId} | Получение заданного отчета


# **generate_boost_consolidated_report**
> generate_boost_consolidated_report (generate_boost_consolidated_request: GENERATE_BOOST_CONSOLIDATED_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_boost_consolidated_request** | [**GENERATE_BOOST_CONSOLIDATED_REQUEST**](GENERATE_BOOST_CONSOLIDATED_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_competitors_position_report**
> generate_competitors_position_report (generate_competitors_position_report_request: GENERATE_COMPETITORS_POSITION_REPORT_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_competitors_position_report_request** | [**GENERATE_COMPETITORS_POSITION_REPORT_REQUEST**](GENERATE_COMPETITORS_POSITION_REPORT_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_feedback_report**
> generate_goods_feedback_report (generate_goods_feedback_request: GENERATE_GOODS_FEEDBACK_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_goods_feedback_request** | [**GENERATE_GOODS_FEEDBACK_REQUEST**](GENERATE_GOODS_FEEDBACK_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_movement_report**
> generate_goods_movement_report (generate_goods_movement_report_request: GENERATE_GOODS_MOVEMENT_REPORT_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_goods_movement_report_request** | [**GENERATE_GOODS_MOVEMENT_REPORT_REQUEST**](GENERATE_GOODS_MOVEMENT_REPORT_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_realization_report**
> generate_goods_realization_report (generate_goods_realization_report_request: GENERATE_GOODS_REALIZATION_REPORT_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_goods_realization_report_request** | [**GENERATE_GOODS_REALIZATION_REPORT_REQUEST**](GENERATE_GOODS_REALIZATION_REPORT_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_turnover_report**
> generate_goods_turnover_report (generate_goods_turnover_request: GENERATE_GOODS_TURNOVER_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_goods_turnover_request** | [**GENERATE_GOODS_TURNOVER_REQUEST**](GENERATE_GOODS_TURNOVER_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_mass_order_labels_report**
> generate_mass_order_labels_report (generate_mass_order_labels_request: GENERATE_MASS_ORDER_LABELS_REQUEST ; format:  detachable PAGE_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_mass_order_labels_request** | [**GENERATE_MASS_ORDER_LABELS_REQUEST**](GENERATE_MASS_ORDER_LABELS_REQUEST.md)|  | 
 **format** | [**PAGE_FORMAT_TYPE**](.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_prices_report**
> generate_prices_report (generate_prices_report_request: GENERATE_PRICES_REPORT_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_prices_report_request** | [**GENERATE_PRICES_REPORT_REQUEST**](GENERATE_PRICES_REPORT_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_shelfs_statistics_report**
> generate_shelfs_statistics_report (generate_shelfs_statistics_request: GENERATE_SHELFS_STATISTICS_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_shelfs_statistics_request** | [**GENERATE_SHELFS_STATISTICS_REQUEST**](GENERATE_SHELFS_STATISTICS_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_shipment_list_document_report**
> generate_shipment_list_document_report (generate_shipment_list_document_report_request: GENERATE_SHIPMENT_LIST_DOCUMENT_REPORT_REQUEST ): detachable GENERATE_REPORT_RESPONSE


Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_shipment_list_document_report_request** | [**GENERATE_SHIPMENT_LIST_DOCUMENT_REPORT_REQUEST**](GENERATE_SHIPMENT_LIST_DOCUMENT_REPORT_REQUEST.md)|  | 

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_shows_sales_report**
> generate_shows_sales_report (generate_shows_sales_report_request: GENERATE_SHOWS_SALES_REPORT_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_shows_sales_report_request** | [**GENERATE_SHOWS_SALES_REPORT_REQUEST**](GENERATE_SHOWS_SALES_REPORT_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_stocks_on_warehouses_report**
> generate_stocks_on_warehouses_report (generate_stocks_on_warehouses_report_request: GENERATE_STOCKS_ON_WAREHOUSES_REPORT_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_stocks_on_warehouses_report_request** | [**GENERATE_STOCKS_ON_WAREHOUSES_REPORT_REQUEST**](GENERATE_STOCKS_ON_WAREHOUSES_REPORT_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_united_marketplace_services_report**
> generate_united_marketplace_services_report (generate_united_marketplace_services_report_request: GENERATE_UNITED_MARKETPLACE_SERVICES_REPORT_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_united_marketplace_services_report_request** | [**GENERATE_UNITED_MARKETPLACE_SERVICES_REPORT_REQUEST**](GENERATE_UNITED_MARKETPLACE_SERVICES_REPORT_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_united_netting_report**
> generate_united_netting_report (generate_united_netting_report_request: GENERATE_UNITED_NETTING_REPORT_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_united_netting_report_request** | [**GENERATE_UNITED_NETTING_REPORT_REQUEST**](GENERATE_UNITED_NETTING_REPORT_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_united_orders_report**
> generate_united_orders_report (generate_united_orders_request: GENERATE_UNITED_ORDERS_REQUEST ; format:  detachable REPORT_FORMAT_TYPE ): detachable GENERATE_REPORT_RESPONSE


Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generate_united_orders_request** | [**GENERATE_UNITED_ORDERS_REQUEST**](GENERATE_UNITED_ORDERS_REQUEST.md)|  | 
 **format** | [**REPORT_FORMAT_TYPE**](.md)| Формат отчета. | [optional] [default to null]

### Return type

[**GENERATE_REPORT_RESPONSE**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **report_info**
> report_info (report_id: STRING_32 ): detachable GET_REPORT_INFO_RESPONSE


Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 


### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **STRING_32**| Идентификатор отчета, который вы получили после запуска генерации.  | [default to null]

### Return type

[**GET_REPORT_INFO_RESPONSE**](GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

