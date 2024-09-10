# WWW::OpenAPIClient::ReportsApi

## Load the API package
```perl
use WWW::OpenAPIClient::Object::ReportsApi;
```

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
> GenerateReportResponse generate_boost_consolidated_report(generate_boost_consolidated_request => $generate_boost_consolidated_request, format => $format)

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_boost_consolidated_request = WWW::OpenAPIClient::Object::GenerateBoostConsolidatedRequest->new(); # GenerateBoostConsolidatedRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_boost_consolidated_report(generate_boost_consolidated_request => $generate_boost_consolidated_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_boost_consolidated_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_competitors_position_report**
> GenerateReportResponse generate_competitors_position_report(generate_competitors_position_report_request => $generate_competitors_position_report_request, format => $format)

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_competitors_position_report_request = WWW::OpenAPIClient::Object::GenerateCompetitorsPositionReportRequest->new(); # GenerateCompetitorsPositionReportRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_competitors_position_report(generate_competitors_position_report_request => $generate_competitors_position_report_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_competitors_position_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_feedback_report**
> GenerateReportResponse generate_goods_feedback_report(generate_goods_feedback_request => $generate_goods_feedback_request, format => $format)

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_goods_feedback_request = WWW::OpenAPIClient::Object::GenerateGoodsFeedbackRequest->new(); # GenerateGoodsFeedbackRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_goods_feedback_report(generate_goods_feedback_request => $generate_goods_feedback_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_goods_feedback_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_movement_report**
> GenerateReportResponse generate_goods_movement_report(generate_goods_movement_report_request => $generate_goods_movement_report_request, format => $format)

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_goods_movement_report_request = WWW::OpenAPIClient::Object::GenerateGoodsMovementReportRequest->new(); # GenerateGoodsMovementReportRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_goods_movement_report(generate_goods_movement_report_request => $generate_goods_movement_report_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_goods_movement_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_realization_report**
> GenerateReportResponse generate_goods_realization_report(generate_goods_realization_report_request => $generate_goods_realization_report_request, format => $format)

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_goods_realization_report_request = WWW::OpenAPIClient::Object::GenerateGoodsRealizationReportRequest->new(); # GenerateGoodsRealizationReportRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_goods_realization_report(generate_goods_realization_report_request => $generate_goods_realization_report_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_goods_realization_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_turnover_report**
> GenerateReportResponse generate_goods_turnover_report(generate_goods_turnover_request => $generate_goods_turnover_request, format => $format)

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_goods_turnover_request = WWW::OpenAPIClient::Object::GenerateGoodsTurnoverRequest->new(); # GenerateGoodsTurnoverRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_goods_turnover_report(generate_goods_turnover_request => $generate_goods_turnover_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_goods_turnover_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_mass_order_labels_report**
> GenerateReportResponse generate_mass_order_labels_report(generate_mass_order_labels_request => $generate_mass_order_labels_request, format => $format)

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_mass_order_labels_request = WWW::OpenAPIClient::Object::GenerateMassOrderLabelsRequest->new(); # GenerateMassOrderLabelsRequest | 
my $format = new WWW::OpenAPIClient.PageFormatType(); # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.

eval {
    my $result = $api_instance->generate_mass_order_labels_report(generate_mass_order_labels_request => $generate_mass_order_labels_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_mass_order_labels_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_prices_report**
> GenerateReportResponse generate_prices_report(generate_prices_report_request => $generate_prices_report_request, format => $format)

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_prices_report_request = WWW::OpenAPIClient::Object::GeneratePricesReportRequest->new(); # GeneratePricesReportRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_prices_report(generate_prices_report_request => $generate_prices_report_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_prices_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_shelfs_statistics_report**
> GenerateReportResponse generate_shelfs_statistics_report(generate_shelfs_statistics_request => $generate_shelfs_statistics_request, format => $format)

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_shelfs_statistics_request = WWW::OpenAPIClient::Object::GenerateShelfsStatisticsRequest->new(); # GenerateShelfsStatisticsRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_shelfs_statistics_report(generate_shelfs_statistics_request => $generate_shelfs_statistics_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_shelfs_statistics_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_shipment_list_document_report**
> GenerateReportResponse generate_shipment_list_document_report(generate_shipment_list_document_report_request => $generate_shipment_list_document_report_request)

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_shipment_list_document_report_request = WWW::OpenAPIClient::Object::GenerateShipmentListDocumentReportRequest->new(); # GenerateShipmentListDocumentReportRequest | 

eval {
    my $result = $api_instance->generate_shipment_list_document_report(generate_shipment_list_document_report_request => $generate_shipment_list_document_report_request);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_shipment_list_document_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_shows_sales_report**
> GenerateReportResponse generate_shows_sales_report(generate_shows_sales_report_request => $generate_shows_sales_report_request, format => $format)

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_shows_sales_report_request = WWW::OpenAPIClient::Object::GenerateShowsSalesReportRequest->new(); # GenerateShowsSalesReportRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_shows_sales_report(generate_shows_sales_report_request => $generate_shows_sales_report_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_shows_sales_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_stocks_on_warehouses_report**
> GenerateReportResponse generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request => $generate_stocks_on_warehouses_report_request, format => $format)

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_stocks_on_warehouses_report_request = WWW::OpenAPIClient::Object::GenerateStocksOnWarehousesReportRequest->new(); # GenerateStocksOnWarehousesReportRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request => $generate_stocks_on_warehouses_report_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_stocks_on_warehouses_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_united_marketplace_services_report**
> GenerateReportResponse generate_united_marketplace_services_report(generate_united_marketplace_services_report_request => $generate_united_marketplace_services_report_request, format => $format)

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_united_marketplace_services_report_request = WWW::OpenAPIClient::Object::GenerateUnitedMarketplaceServicesReportRequest->new(); # GenerateUnitedMarketplaceServicesReportRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_united_marketplace_services_report(generate_united_marketplace_services_report_request => $generate_united_marketplace_services_report_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_united_marketplace_services_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_united_netting_report**
> GenerateReportResponse generate_united_netting_report(generate_united_netting_report_request => $generate_united_netting_report_request, format => $format)

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_united_netting_report_request = WWW::OpenAPIClient::Object::GenerateUnitedNettingReportRequest->new(); # GenerateUnitedNettingReportRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_united_netting_report(generate_united_netting_report_request => $generate_united_netting_report_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_united_netting_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_united_orders_report**
> GenerateReportResponse generate_united_orders_report(generate_united_orders_request => $generate_united_orders_request, format => $format)

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $generate_united_orders_request = WWW::OpenAPIClient::Object::GenerateUnitedOrdersRequest->new(); # GenerateUnitedOrdersRequest | 
my $format = new WWW::OpenAPIClient.ReportFormatType(); # ReportFormatType | Формат отчета.

eval {
    my $result = $api_instance->generate_united_orders_report(generate_united_orders_request => $generate_united_orders_request, format => $format);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->generate_united_orders_report: $@\n";
}
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

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_report_info**
> GetReportInfoResponse get_report_info(report_id => $report_id)

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```perl
use Data::Dumper;
use WWW::OpenAPIClient::ReportsApi;
my $api_instance = WWW::OpenAPIClient::ReportsApi->new(

    # Configure OAuth2 access token for authorization: OAuth
    access_token => 'YOUR_ACCESS_TOKEN',
);

my $report_id = "report_id_example"; # string | Идентификатор отчета, который вы получили после запуска генерации. 

eval {
    my $result = $api_instance->get_report_info(report_id => $report_id);
    print Dumper($result);
};
if ($@) {
    warn "Exception when calling ReportsApi->get_report_info: $@\n";
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **string**| Идентификатор отчета, который вы получили после запуска генерации.  | 

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

