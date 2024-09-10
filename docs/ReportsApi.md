# ympa_python_client.ReportsApi

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
> GenerateReportResponse generate_boost_consolidated_report(generate_boost_consolidated_request, format=format)

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_boost_consolidated_request import GenerateBoostConsolidatedRequest
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_boost_consolidated_request = ympa_python_client.GenerateBoostConsolidatedRequest() # GenerateBoostConsolidatedRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет по бусту продаж
        api_response = api_instance.generate_boost_consolidated_report(generate_boost_consolidated_request, format=format)
        print("The response of ReportsApi->generate_boost_consolidated_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_boost_consolidated_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_competitors_position_report**
> GenerateReportResponse generate_competitors_position_report(generate_competitors_position_report_request, format=format)

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_competitors_position_report_request import GenerateCompetitorsPositionReportRequest
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_competitors_position_report_request = ympa_python_client.GenerateCompetitorsPositionReportRequest() # GenerateCompetitorsPositionReportRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет «Конкурентная позиция»
        api_response = api_instance.generate_competitors_position_report(generate_competitors_position_report_request, format=format)
        print("The response of ReportsApi->generate_competitors_position_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_competitors_position_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_feedback_report**
> GenerateReportResponse generate_goods_feedback_report(generate_goods_feedback_request, format=format)

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_goods_feedback_request import GenerateGoodsFeedbackRequest
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_goods_feedback_request = ympa_python_client.GenerateGoodsFeedbackRequest() # GenerateGoodsFeedbackRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет по отзывам о товарах
        api_response = api_instance.generate_goods_feedback_report(generate_goods_feedback_request, format=format)
        print("The response of ReportsApi->generate_goods_feedback_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_goods_feedback_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_movement_report**
> GenerateReportResponse generate_goods_movement_report(generate_goods_movement_report_request, format=format)

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_goods_movement_report_request import GenerateGoodsMovementReportRequest
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_goods_movement_report_request = ympa_python_client.GenerateGoodsMovementReportRequest() # GenerateGoodsMovementReportRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет по движению товаров
        api_response = api_instance.generate_goods_movement_report(generate_goods_movement_report_request, format=format)
        print("The response of ReportsApi->generate_goods_movement_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_goods_movement_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_realization_report**
> GenerateReportResponse generate_goods_realization_report(generate_goods_realization_report_request, format=format)

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_goods_realization_report_request import GenerateGoodsRealizationReportRequest
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_goods_realization_report_request = ympa_python_client.GenerateGoodsRealizationReportRequest() # GenerateGoodsRealizationReportRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет по реализации
        api_response = api_instance.generate_goods_realization_report(generate_goods_realization_report_request, format=format)
        print("The response of ReportsApi->generate_goods_realization_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_goods_realization_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_goods_turnover_report**
> GenerateReportResponse generate_goods_turnover_report(generate_goods_turnover_request, format=format)

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_goods_turnover_request import GenerateGoodsTurnoverRequest
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_goods_turnover_request = ympa_python_client.GenerateGoodsTurnoverRequest() # GenerateGoodsTurnoverRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет по оборачиваемости
        api_response = api_instance.generate_goods_turnover_report(generate_goods_turnover_request, format=format)
        print("The response of ReportsApi->generate_goods_turnover_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_goods_turnover_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_mass_order_labels_report**
> GenerateReportResponse generate_mass_order_labels_report(generate_mass_order_labels_request, format=format)

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_mass_order_labels_request import GenerateMassOrderLabelsRequest
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.page_format_type import PageFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_mass_order_labels_request = ympa_python_client.GenerateMassOrderLabelsRequest() # GenerateMassOrderLabelsRequest | 
    format = ympa_python_client.PageFormatType() # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. (optional)

    try:
        # Готовые ярлыки‑наклейки на все коробки в нескольких заказах
        api_response = api_instance.generate_mass_order_labels_report(generate_mass_order_labels_request, format=format)
        print("The response of ReportsApi->generate_mass_order_labels_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_mass_order_labels_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус &#x60;RESOURCE_NOT_FOUND&#x60;.  |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_prices_report**
> GenerateReportResponse generate_prices_report(generate_prices_report_request, format=format)

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_prices_report_request import GeneratePricesReportRequest
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_prices_report_request = ympa_python_client.GeneratePricesReportRequest() # GeneratePricesReportRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет «Цены на рынке»
        api_response = api_instance.generate_prices_report(generate_prices_report_request, format=format)
        print("The response of ReportsApi->generate_prices_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_prices_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_shelfs_statistics_report**
> GenerateReportResponse generate_shelfs_statistics_report(generate_shelfs_statistics_request, format=format)

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.generate_shelfs_statistics_request import GenerateShelfsStatisticsRequest
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_shelfs_statistics_request = ympa_python_client.GenerateShelfsStatisticsRequest() # GenerateShelfsStatisticsRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет по полкам
        api_response = api_instance.generate_shelfs_statistics_report(generate_shelfs_statistics_request, format=format)
        print("The response of ReportsApi->generate_shelfs_statistics_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_shelfs_statistics_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_shipment_list_document_report**
> GenerateReportResponse generate_shipment_list_document_report(generate_shipment_list_document_report_request)

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.generate_shipment_list_document_report_request import GenerateShipmentListDocumentReportRequest
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_shipment_list_document_report_request = ympa_python_client.GenerateShipmentListDocumentReportRequest() # GenerateShipmentListDocumentReportRequest | 

    try:
        # Получение листа сборки
        api_response = api_instance.generate_shipment_list_document_report(generate_shipment_list_document_report_request)
        print("The response of ReportsApi->generate_shipment_list_document_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_shipment_list_document_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_shows_sales_report**
> GenerateReportResponse generate_shows_sales_report(generate_shows_sales_report_request, format=format)

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.generate_shows_sales_report_request import GenerateShowsSalesReportRequest
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_shows_sales_report_request = ympa_python_client.GenerateShowsSalesReportRequest() # GenerateShowsSalesReportRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет «Аналитика продаж»
        api_response = api_instance.generate_shows_sales_report(generate_shows_sales_report_request, format=format)
        print("The response of ReportsApi->generate_shows_sales_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_shows_sales_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_stocks_on_warehouses_report**
> GenerateReportResponse generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request, format=format)

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.generate_stocks_on_warehouses_report_request import GenerateStocksOnWarehousesReportRequest
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_stocks_on_warehouses_report_request = ympa_python_client.GenerateStocksOnWarehousesReportRequest() # GenerateStocksOnWarehousesReportRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет по остаткам на складах
        api_response = api_instance.generate_stocks_on_warehouses_report(generate_stocks_on_warehouses_report_request, format=format)
        print("The response of ReportsApi->generate_stocks_on_warehouses_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_stocks_on_warehouses_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_united_marketplace_services_report**
> GenerateReportResponse generate_united_marketplace_services_report(generate_united_marketplace_services_report_request, format=format)

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.generate_united_marketplace_services_report_request import GenerateUnitedMarketplaceServicesReportRequest
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_united_marketplace_services_report_request = ympa_python_client.GenerateUnitedMarketplaceServicesReportRequest() # GenerateUnitedMarketplaceServicesReportRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет по стоимости услуг
        api_response = api_instance.generate_united_marketplace_services_report(generate_united_marketplace_services_report_request, format=format)
        print("The response of ReportsApi->generate_united_marketplace_services_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_united_marketplace_services_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_united_netting_report**
> GenerateReportResponse generate_united_netting_report(generate_united_netting_report_request, format=format)

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.generate_united_netting_report_request import GenerateUnitedNettingReportRequest
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_united_netting_report_request = ympa_python_client.GenerateUnitedNettingReportRequest() # GenerateUnitedNettingReportRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет по платежам
        api_response = api_instance.generate_united_netting_report(generate_united_netting_report_request, format=format)
        print("The response of ReportsApi->generate_united_netting_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_united_netting_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **generate_united_orders_report**
> GenerateReportResponse generate_united_orders_report(generate_united_orders_request, format=format)

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.generate_report_response import GenerateReportResponse
from ympa_python_client.models.generate_united_orders_request import GenerateUnitedOrdersRequest
from ympa_python_client.models.report_format_type import ReportFormatType
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    generate_united_orders_request = ympa_python_client.GenerateUnitedOrdersRequest() # GenerateUnitedOrdersRequest | 
    format = ympa_python_client.ReportFormatType() # ReportFormatType | Формат отчета. (optional)

    try:
        # Отчет по заказам
        api_response = api_instance.generate_united_orders_report(generate_united_orders_request, format=format)
        print("The response of ReportsApi->generate_united_orders_report:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->generate_united_orders_report: %s\n" % e)
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
**200** | В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет. |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

# **get_report_info**
> GetReportInfoResponse get_report_info(report_id)

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example

* OAuth Authentication (OAuth):

```python
import ympa_python_client
from ympa_python_client.models.get_report_info_response import GetReportInfoResponse
from ympa_python_client.rest import ApiException
from pprint import pprint

# Defining the host is optional and defaults to https://api.partner.market.yandex.ru
# See configuration.py for a list of all supported configuration parameters.
configuration = ympa_python_client.Configuration(
    host = "https://api.partner.market.yandex.ru"
)

# The client must configure the authentication and authorization parameters
# in accordance with the API server security policy.
# Examples for each auth method are provided below, use the example that
# satisfies your auth use case.

configuration.access_token = os.environ["ACCESS_TOKEN"]

# Enter a context with an instance of the API client
with ympa_python_client.ApiClient(configuration) as api_client:
    # Create an instance of the API class
    api_instance = ympa_python_client.ReportsApi(api_client)
    report_id = 'report_id_example' # str | Идентификатор отчета, который вы получили после запуска генерации. 

    try:
        # Получение заданного отчета
        api_response = api_instance.get_report_info(report_id)
        print("The response of ReportsApi->get_report_info:\n")
        pprint(api_response)
    except Exception as e:
        print("Exception when calling ReportsApi->get_report_info: %s\n" % e)
```



### Parameters


Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **report_id** | **str**| Идентификатор отчета, который вы получили после запуска генерации.  | 

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
**200** | Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — &#x60;FAILED&#x60; или &#x60;NO_DATA&#x60;, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}     |  -  |
**400** | Запрос содержит неправильные данные. |  -  |
**401** | В запросе не указаны данные для авторизации. |  -  |
**403** | Данные для авторизации неверны или доступ к ресурсу запрещен. |  -  |
**404** | Запрашиваемый ресурс не найден. |  -  |
**420** | Превышено ограничение на доступ к ресурсу. |  -  |
**500** | Внутренняя ошибка сервера. |  -  |

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

