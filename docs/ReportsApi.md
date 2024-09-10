# OpenapiClient::ReportsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

| Method | HTTP request | Description |
| ------ | ------------ | ----------- |
| [**generate_boost_consolidated_report**](ReportsApi.md#generate_boost_consolidated_report) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж |
| [**generate_competitors_position_report**](ReportsApi.md#generate_competitors_position_report) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция» |
| [**generate_goods_feedback_report**](ReportsApi.md#generate_goods_feedback_report) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах |
| [**generate_goods_movement_report**](ReportsApi.md#generate_goods_movement_report) | **POST** /reports/goods-movement/generate | Отчет по движению товаров |
| [**generate_goods_realization_report**](ReportsApi.md#generate_goods_realization_report) | **POST** /reports/goods-realization/generate | Отчет по реализации |
| [**generate_goods_turnover_report**](ReportsApi.md#generate_goods_turnover_report) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости |
| [**generate_mass_order_labels_report**](ReportsApi.md#generate_mass_order_labels_report) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах |
| [**generate_prices_report**](ReportsApi.md#generate_prices_report) | **POST** /reports/prices/generate | Отчет «Цены на рынке» |
| [**generate_shelfs_statistics_report**](ReportsApi.md#generate_shelfs_statistics_report) | **POST** /reports/shelf-statistics/generate | Отчет по полкам |
| [**generate_shipment_list_document_report**](ReportsApi.md#generate_shipment_list_document_report) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки |
| [**generate_shows_sales_report**](ReportsApi.md#generate_shows_sales_report) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж» |
| [**generate_stocks_on_warehouses_report**](ReportsApi.md#generate_stocks_on_warehouses_report) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах |
| [**generate_united_marketplace_services_report**](ReportsApi.md#generate_united_marketplace_services_report) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг |
| [**generate_united_netting_report**](ReportsApi.md#generate_united_netting_report) | **POST** /reports/united-netting/generate | Отчет по платежам |
| [**generate_united_orders_report**](ReportsApi.md#generate_united_orders_report) | **POST** /reports/united-orders/generate | Отчет по заказам |
| [**get_report_info**](ReportsApi.md#get_report_info) | **GET** /reports/info/{reportId} | Получение заданного отчета |


## generate_boost_consolidated_report

> <GenerateReportResponse> generate_boost_consolidated_report(generate_boost_consolidated_request, opts)

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_boost_consolidated_request = OpenapiClient::GenerateBoostConsolidatedRequest.new({business_id: 3.56, date_from: Date.today, date_to: Date.today}) # GenerateBoostConsolidatedRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по бусту продаж
  result = api_instance.generate_boost_consolidated_report(generate_boost_consolidated_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_boost_consolidated_report: #{e}"
end
```

#### Using the generate_boost_consolidated_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_boost_consolidated_report_with_http_info(generate_boost_consolidated_request, opts)

```ruby
begin
  # Отчет по бусту продаж
  data, status_code, headers = api_instance.generate_boost_consolidated_report_with_http_info(generate_boost_consolidated_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_boost_consolidated_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_boost_consolidated_request** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_competitors_position_report

> <GenerateReportResponse> generate_competitors_position_report(generate_competitors_position_report_request, opts)

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_competitors_position_report_request = OpenapiClient::GenerateCompetitorsPositionReportRequest.new({business_id: 3.56, category_id: 3.56, date_from: Date.today, date_to: Date.today}) # GenerateCompetitorsPositionReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет «Конкурентная позиция»
  result = api_instance.generate_competitors_position_report(generate_competitors_position_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_competitors_position_report: #{e}"
end
```

#### Using the generate_competitors_position_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_competitors_position_report_with_http_info(generate_competitors_position_report_request, opts)

```ruby
begin
  # Отчет «Конкурентная позиция»
  data, status_code, headers = api_instance.generate_competitors_position_report_with_http_info(generate_competitors_position_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_competitors_position_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_competitors_position_report_request** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_goods_feedback_report

> <GenerateReportResponse> generate_goods_feedback_report(generate_goods_feedback_request, opts)

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_goods_feedback_request = OpenapiClient::GenerateGoodsFeedbackRequest.new({business_id: 3.56}) # GenerateGoodsFeedbackRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по отзывам о товарах
  result = api_instance.generate_goods_feedback_report(generate_goods_feedback_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_goods_feedback_report: #{e}"
end
```

#### Using the generate_goods_feedback_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_goods_feedback_report_with_http_info(generate_goods_feedback_request, opts)

```ruby
begin
  # Отчет по отзывам о товарах
  data, status_code, headers = api_instance.generate_goods_feedback_report_with_http_info(generate_goods_feedback_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_goods_feedback_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_goods_feedback_request** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_goods_movement_report

> <GenerateReportResponse> generate_goods_movement_report(generate_goods_movement_report_request, opts)

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_goods_movement_report_request = OpenapiClient::GenerateGoodsMovementReportRequest.new({campaign_id: 3.56, date_from: Date.today, date_to: Date.today}) # GenerateGoodsMovementReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по движению товаров
  result = api_instance.generate_goods_movement_report(generate_goods_movement_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_goods_movement_report: #{e}"
end
```

#### Using the generate_goods_movement_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_goods_movement_report_with_http_info(generate_goods_movement_report_request, opts)

```ruby
begin
  # Отчет по движению товаров
  data, status_code, headers = api_instance.generate_goods_movement_report_with_http_info(generate_goods_movement_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_goods_movement_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_goods_movement_report_request** | [**GenerateGoodsMovementReportRequest**](GenerateGoodsMovementReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_goods_realization_report

> <GenerateReportResponse> generate_goods_realization_report(generate_goods_realization_report_request, opts)

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_goods_realization_report_request = OpenapiClient::GenerateGoodsRealizationReportRequest.new({campaign_id: 3.56, year: 37, month: 37}) # GenerateGoodsRealizationReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по реализации
  result = api_instance.generate_goods_realization_report(generate_goods_realization_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_goods_realization_report: #{e}"
end
```

#### Using the generate_goods_realization_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_goods_realization_report_with_http_info(generate_goods_realization_report_request, opts)

```ruby
begin
  # Отчет по реализации
  data, status_code, headers = api_instance.generate_goods_realization_report_with_http_info(generate_goods_realization_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_goods_realization_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_goods_realization_report_request** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_goods_turnover_report

> <GenerateReportResponse> generate_goods_turnover_report(generate_goods_turnover_request, opts)

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_goods_turnover_request = OpenapiClient::GenerateGoodsTurnoverRequest.new({campaign_id: 3.56}) # GenerateGoodsTurnoverRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по оборачиваемости
  result = api_instance.generate_goods_turnover_report(generate_goods_turnover_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_goods_turnover_report: #{e}"
end
```

#### Using the generate_goods_turnover_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_goods_turnover_report_with_http_info(generate_goods_turnover_request, opts)

```ruby
begin
  # Отчет по оборачиваемости
  data, status_code, headers = api_instance.generate_goods_turnover_report_with_http_info(generate_goods_turnover_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_goods_turnover_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_goods_turnover_request** | [**GenerateGoodsTurnoverRequest**](GenerateGoodsTurnoverRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_mass_order_labels_report

> <GenerateReportResponse> generate_mass_order_labels_report(generate_mass_order_labels_request, opts)

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_mass_order_labels_request = OpenapiClient::GenerateMassOrderLabelsRequest.new({business_id: 3.56, order_ids: [3.56]}) # GenerateMassOrderLabelsRequest | 
opts = {
  format: OpenapiClient::PageFormatType::A7 # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
}

begin
  # Готовые ярлыки‑наклейки на все коробки в нескольких заказах
  result = api_instance.generate_mass_order_labels_report(generate_mass_order_labels_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_mass_order_labels_report: #{e}"
end
```

#### Using the generate_mass_order_labels_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_mass_order_labels_report_with_http_info(generate_mass_order_labels_request, opts)

```ruby
begin
  # Готовые ярлыки‑наклейки на все коробки в нескольких заказах
  data, status_code, headers = api_instance.generate_mass_order_labels_report_with_http_info(generate_mass_order_labels_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_mass_order_labels_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_mass_order_labels_request** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md) |  |  |
| **format** | [**PageFormatType**](.md) | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_prices_report

> <GenerateReportResponse> generate_prices_report(generate_prices_report_request, opts)

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_prices_report_request = OpenapiClient::GeneratePricesReportRequest.new # GeneratePricesReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет «Цены на рынке»
  result = api_instance.generate_prices_report(generate_prices_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_prices_report: #{e}"
end
```

#### Using the generate_prices_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_prices_report_with_http_info(generate_prices_report_request, opts)

```ruby
begin
  # Отчет «Цены на рынке»
  data, status_code, headers = api_instance.generate_prices_report_with_http_info(generate_prices_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_prices_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_prices_report_request** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_shelfs_statistics_report

> <GenerateReportResponse> generate_shelfs_statistics_report(generate_shelfs_statistics_request, opts)

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_shelfs_statistics_request = OpenapiClient::GenerateShelfsStatisticsRequest.new({business_id: 3.56, date_from: Date.today, date_to: Date.today, attribution_type: OpenapiClient::ShelfsStatisticsAttributionType::CLICKS}) # GenerateShelfsStatisticsRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по полкам
  result = api_instance.generate_shelfs_statistics_report(generate_shelfs_statistics_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_shelfs_statistics_report: #{e}"
end
```

#### Using the generate_shelfs_statistics_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_shelfs_statistics_report_with_http_info(generate_shelfs_statistics_request, opts)

```ruby
begin
  # Отчет по полкам
  data, status_code, headers = api_instance.generate_shelfs_statistics_report_with_http_info(generate_shelfs_statistics_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_shelfs_statistics_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_shelfs_statistics_request** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_shipment_list_document_report

> <GenerateReportResponse> generate_shipment_list_document_report(generate_shipment_list_document_report_request)

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_shipment_list_document_report_request = OpenapiClient::GenerateShipmentListDocumentReportRequest.new({campaign_id: 3.56}) # GenerateShipmentListDocumentReportRequest | 

begin
  # Получение листа сборки
  result = api_instance.generate_shipment_list_document_report(generate_shipment_list_document_report_request)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_shipment_list_document_report: #{e}"
end
```

#### Using the generate_shipment_list_document_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_shipment_list_document_report_with_http_info(generate_shipment_list_document_report_request)

```ruby
begin
  # Получение листа сборки
  data, status_code, headers = api_instance.generate_shipment_list_document_report_with_http_info(generate_shipment_list_document_report_request)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_shipment_list_document_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_shipment_list_document_report_request** | [**GenerateShipmentListDocumentReportRequest**](GenerateShipmentListDocumentReportRequest.md) |  |  |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_shows_sales_report

> <GenerateReportResponse> generate_shows_sales_report(generate_shows_sales_report_request, opts)

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_shows_sales_report_request = OpenapiClient::GenerateShowsSalesReportRequest.new({date_from: Date.today, date_to: Date.today, grouping: OpenapiClient::ShowsSalesGroupingType::CATEGORIES}) # GenerateShowsSalesReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет «Аналитика продаж»
  result = api_instance.generate_shows_sales_report(generate_shows_sales_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_shows_sales_report: #{e}"
end
```

#### Using the generate_shows_sales_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_shows_sales_report_with_http_info(generate_shows_sales_report_request, opts)

```ruby
begin
  # Отчет «Аналитика продаж»
  data, status_code, headers = api_instance.generate_shows_sales_report_with_http_info(generate_shows_sales_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_shows_sales_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_shows_sales_report_request** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_stocks_on_warehouses_report

> <GenerateReportResponse> generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request, opts)

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_stocks_on_warehouses_report_request = OpenapiClient::GenerateStocksOnWarehousesReportRequest.new({campaign_id: 3.56}) # GenerateStocksOnWarehousesReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по остаткам на складах
  result = api_instance.generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_stocks_on_warehouses_report: #{e}"
end
```

#### Using the generate_stocks_on_warehouses_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_stocks_on_warehouses_report_with_http_info(generate_stocks_on_warehouses_report_request, opts)

```ruby
begin
  # Отчет по остаткам на складах
  data, status_code, headers = api_instance.generate_stocks_on_warehouses_report_with_http_info(generate_stocks_on_warehouses_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_stocks_on_warehouses_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_stocks_on_warehouses_report_request** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_united_marketplace_services_report

> <GenerateReportResponse> generate_united_marketplace_services_report(generate_united_marketplace_services_report_request, opts)

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_united_marketplace_services_report_request = OpenapiClient::GenerateUnitedMarketplaceServicesReportRequest.new({business_id: 3.56}) # GenerateUnitedMarketplaceServicesReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по стоимости услуг
  result = api_instance.generate_united_marketplace_services_report(generate_united_marketplace_services_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_united_marketplace_services_report: #{e}"
end
```

#### Using the generate_united_marketplace_services_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_united_marketplace_services_report_with_http_info(generate_united_marketplace_services_report_request, opts)

```ruby
begin
  # Отчет по стоимости услуг
  data, status_code, headers = api_instance.generate_united_marketplace_services_report_with_http_info(generate_united_marketplace_services_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_united_marketplace_services_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_united_marketplace_services_report_request** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_united_netting_report

> <GenerateReportResponse> generate_united_netting_report(generate_united_netting_report_request, opts)

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_united_netting_report_request = OpenapiClient::GenerateUnitedNettingReportRequest.new({business_id: 3.56}) # GenerateUnitedNettingReportRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по платежам
  result = api_instance.generate_united_netting_report(generate_united_netting_report_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_united_netting_report: #{e}"
end
```

#### Using the generate_united_netting_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_united_netting_report_with_http_info(generate_united_netting_report_request, opts)

```ruby
begin
  # Отчет по платежам
  data, status_code, headers = api_instance.generate_united_netting_report_with_http_info(generate_united_netting_report_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_united_netting_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_united_netting_report_request** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## generate_united_orders_report

> <GenerateReportResponse> generate_united_orders_report(generate_united_orders_request, opts)

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
generate_united_orders_request = OpenapiClient::GenerateUnitedOrdersRequest.new({business_id: 3.56, date_from: Date.today, date_to: Date.today}) # GenerateUnitedOrdersRequest | 
opts = {
  format: OpenapiClient::ReportFormatType::FILE # ReportFormatType | Формат отчета.
}

begin
  # Отчет по заказам
  result = api_instance.generate_united_orders_report(generate_united_orders_request, opts)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_united_orders_report: #{e}"
end
```

#### Using the generate_united_orders_report_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GenerateReportResponse>, Integer, Hash)> generate_united_orders_report_with_http_info(generate_united_orders_request, opts)

```ruby
begin
  # Отчет по заказам
  data, status_code, headers = api_instance.generate_united_orders_report_with_http_info(generate_united_orders_request, opts)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GenerateReportResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->generate_united_orders_report_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **generate_united_orders_request** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md) |  |  |
| **format** | [**ReportFormatType**](.md) | Формат отчета. | [optional] |

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


## get_report_info

> <GetReportInfoResponse> get_report_info(report_id)

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Examples

```ruby
require 'time'
require 'openapi_client'
# setup authorization
OpenapiClient.configure do |config|
  # Configure OAuth2 access token for authorization: OAuth
  config.access_token = 'YOUR ACCESS TOKEN'
end

api_instance = OpenapiClient::ReportsApi.new
report_id = 'report_id_example' # String | Идентификатор отчета, который вы получили после запуска генерации. 

begin
  # Получение заданного отчета
  result = api_instance.get_report_info(report_id)
  p result
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->get_report_info: #{e}"
end
```

#### Using the get_report_info_with_http_info variant

This returns an Array which contains the response data, status code and headers.

> <Array(<GetReportInfoResponse>, Integer, Hash)> get_report_info_with_http_info(report_id)

```ruby
begin
  # Получение заданного отчета
  data, status_code, headers = api_instance.get_report_info_with_http_info(report_id)
  p status_code # => 2xx
  p headers # => { ... }
  p data # => <GetReportInfoResponse>
rescue OpenapiClient::ApiError => e
  puts "Error when calling ReportsApi->get_report_info_with_http_info: #{e}"
end
```

### Parameters

| Name | Type | Description | Notes |
| ---- | ---- | ----------- | ----- |
| **report_id** | **String** | Идентификатор отчета, который вы получили после запуска генерации.  |  |

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

