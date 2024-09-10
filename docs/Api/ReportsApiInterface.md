# OpenAPI\Server\Api\ReportsApiInterface

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**generateBoostConsolidatedReport**](ReportsApiInterface.md#generateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**generateCompetitorsPositionReport**](ReportsApiInterface.md#generateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**generateGoodsFeedbackReport**](ReportsApiInterface.md#generateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**generateGoodsMovementReport**](ReportsApiInterface.md#generateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
[**generateGoodsRealizationReport**](ReportsApiInterface.md#generateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**generateGoodsTurnoverReport**](ReportsApiInterface.md#generateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
[**generateMassOrderLabelsReport**](ReportsApiInterface.md#generateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**generatePricesReport**](ReportsApiInterface.md#generatePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**generateShelfsStatisticsReport**](ReportsApiInterface.md#generateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**generateShipmentListDocumentReport**](ReportsApiInterface.md#generateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
[**generateShowsSalesReport**](ReportsApiInterface.md#generateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**generateStocksOnWarehousesReport**](ReportsApiInterface.md#generateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**generateUnitedMarketplaceServicesReport**](ReportsApiInterface.md#generateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**generateUnitedNettingReport**](ReportsApiInterface.md#generateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
[**generateUnitedOrdersReport**](ReportsApiInterface.md#generateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
[**getReportInfo**](ReportsApiInterface.md#getReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета


## Service Declaration
```yaml
# config/services.yaml
services:
    # ...
    Acme\MyBundle\Api\ReportsApi:
        tags:
            - { name: "open_api_server.api", api: "reports" }
    # ...
```

## **generateBoostConsolidatedReport**
> OpenAPI\Server\Model\GenerateReportResponse generateBoostConsolidatedReport($generateBoostConsolidatedRequest, $format)

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateBoostConsolidatedReport
     */
    public function generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest $generateBoostConsolidatedRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateBoostConsolidatedRequest** | [**OpenAPI\Server\Model\GenerateBoostConsolidatedRequest**](../Model/GenerateBoostConsolidatedRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateCompetitorsPositionReport**
> OpenAPI\Server\Model\GenerateReportResponse generateCompetitorsPositionReport($generateCompetitorsPositionReportRequest, $format)

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateCompetitorsPositionReport
     */
    public function generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest $generateCompetitorsPositionReportRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateCompetitorsPositionReportRequest** | [**OpenAPI\Server\Model\GenerateCompetitorsPositionReportRequest**](../Model/GenerateCompetitorsPositionReportRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateGoodsFeedbackReport**
> OpenAPI\Server\Model\GenerateReportResponse generateGoodsFeedbackReport($generateGoodsFeedbackRequest, $format)

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateGoodsFeedbackReport
     */
    public function generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest $generateGoodsFeedbackRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsFeedbackRequest** | [**OpenAPI\Server\Model\GenerateGoodsFeedbackRequest**](../Model/GenerateGoodsFeedbackRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateGoodsMovementReport**
> OpenAPI\Server\Model\GenerateReportResponse generateGoodsMovementReport($generateGoodsMovementReportRequest, $format)

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateGoodsMovementReport
     */
    public function generateGoodsMovementReport(GenerateGoodsMovementReportRequest $generateGoodsMovementReportRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsMovementReportRequest** | [**OpenAPI\Server\Model\GenerateGoodsMovementReportRequest**](../Model/GenerateGoodsMovementReportRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateGoodsRealizationReport**
> OpenAPI\Server\Model\GenerateReportResponse generateGoodsRealizationReport($generateGoodsRealizationReportRequest, $format)

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateGoodsRealizationReport
     */
    public function generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest $generateGoodsRealizationReportRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsRealizationReportRequest** | [**OpenAPI\Server\Model\GenerateGoodsRealizationReportRequest**](../Model/GenerateGoodsRealizationReportRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateGoodsTurnoverReport**
> OpenAPI\Server\Model\GenerateReportResponse generateGoodsTurnoverReport($generateGoodsTurnoverRequest, $format)

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateGoodsTurnoverReport
     */
    public function generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest $generateGoodsTurnoverRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateGoodsTurnoverRequest** | [**OpenAPI\Server\Model\GenerateGoodsTurnoverRequest**](../Model/GenerateGoodsTurnoverRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateMassOrderLabelsReport**
> OpenAPI\Server\Model\GenerateReportResponse generateMassOrderLabelsReport($generateMassOrderLabelsRequest, $format)

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateMassOrderLabelsReport
     */
    public function generateMassOrderLabelsReport(GenerateMassOrderLabelsRequest $generateMassOrderLabelsRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateMassOrderLabelsRequest** | [**OpenAPI\Server\Model\GenerateMassOrderLabelsRequest**](../Model/GenerateMassOrderLabelsRequest.md)|  |
 **format** | [**PageFormatType**](../Model/.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generatePricesReport**
> OpenAPI\Server\Model\GenerateReportResponse generatePricesReport($generatePricesReportRequest, $format)

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generatePricesReport
     */
    public function generatePricesReport(GeneratePricesReportRequest $generatePricesReportRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generatePricesReportRequest** | [**OpenAPI\Server\Model\GeneratePricesReportRequest**](../Model/GeneratePricesReportRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateShelfsStatisticsReport**
> OpenAPI\Server\Model\GenerateReportResponse generateShelfsStatisticsReport($generateShelfsStatisticsRequest, $format)

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateShelfsStatisticsReport
     */
    public function generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest $generateShelfsStatisticsRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShelfsStatisticsRequest** | [**OpenAPI\Server\Model\GenerateShelfsStatisticsRequest**](../Model/GenerateShelfsStatisticsRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateShipmentListDocumentReport**
> OpenAPI\Server\Model\GenerateReportResponse generateShipmentListDocumentReport($generateShipmentListDocumentReportRequest)

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateShipmentListDocumentReport
     */
    public function generateShipmentListDocumentReport(GenerateShipmentListDocumentReportRequest $generateShipmentListDocumentReportRequest, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShipmentListDocumentReportRequest** | [**OpenAPI\Server\Model\GenerateShipmentListDocumentReportRequest**](../Model/GenerateShipmentListDocumentReportRequest.md)|  |

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateShowsSalesReport**
> OpenAPI\Server\Model\GenerateReportResponse generateShowsSalesReport($generateShowsSalesReportRequest, $format)

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateShowsSalesReport
     */
    public function generateShowsSalesReport(GenerateShowsSalesReportRequest $generateShowsSalesReportRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateShowsSalesReportRequest** | [**OpenAPI\Server\Model\GenerateShowsSalesReportRequest**](../Model/GenerateShowsSalesReportRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateStocksOnWarehousesReport**
> OpenAPI\Server\Model\GenerateReportResponse generateStocksOnWarehousesReport($generateStocksOnWarehousesReportRequest, $format)

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateStocksOnWarehousesReport
     */
    public function generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest $generateStocksOnWarehousesReportRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateStocksOnWarehousesReportRequest** | [**OpenAPI\Server\Model\GenerateStocksOnWarehousesReportRequest**](../Model/GenerateStocksOnWarehousesReportRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateUnitedMarketplaceServicesReport**
> OpenAPI\Server\Model\GenerateReportResponse generateUnitedMarketplaceServicesReport($generateUnitedMarketplaceServicesReportRequest, $format)

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateUnitedMarketplaceServicesReport
     */
    public function generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest $generateUnitedMarketplaceServicesReportRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedMarketplaceServicesReportRequest** | [**OpenAPI\Server\Model\GenerateUnitedMarketplaceServicesReportRequest**](../Model/GenerateUnitedMarketplaceServicesReportRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateUnitedNettingReport**
> OpenAPI\Server\Model\GenerateReportResponse generateUnitedNettingReport($generateUnitedNettingReportRequest, $format)

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateUnitedNettingReport
     */
    public function generateUnitedNettingReport(GenerateUnitedNettingReportRequest $generateUnitedNettingReportRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedNettingReportRequest** | [**OpenAPI\Server\Model\GenerateUnitedNettingReportRequest**](../Model/GenerateUnitedNettingReportRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **generateUnitedOrdersReport**
> OpenAPI\Server\Model\GenerateReportResponse generateUnitedOrdersReport($generateUnitedOrdersRequest, $format)

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#generateUnitedOrdersReport
     */
    public function generateUnitedOrdersReport(GenerateUnitedOrdersRequest $generateUnitedOrdersRequest, ?$format, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **generateUnitedOrdersRequest** | [**OpenAPI\Server\Model\GenerateUnitedOrdersRequest**](../Model/GenerateUnitedOrdersRequest.md)|  |
 **format** | [**ReportFormatType**](../Model/.md)| Формат отчета. | [optional]

### Return type

[**OpenAPI\Server\Model\GenerateReportResponse**](../Model/GenerateReportResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

## **getReportInfo**
> OpenAPI\Server\Model\GetReportInfoResponse getReportInfo($reportId)

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-|

### Example Implementation
```php
<?php
// src/Acme/MyBundle/Api/ReportsApiInterface.php

namespace Acme\MyBundle\Api;

use OpenAPI\Server\Api\ReportsApiInterface;

class ReportsApi implements ReportsApiInterface
{

    /**
     * Configure OAuth2 access token for authorization: OAuth
     */
    public function setOAuth($oauthToken)
    {
        // Retrieve logged in user from $oauthToken ...
    }

    // ...

    /**
     * Implementation of ReportsApiInterface#getReportInfo
     */
    public function getReportInfo(string $reportId, int &$responseCode, array &$responseHeaders): array|object|null
    {
        // Implement the operation ...
    }

    // ...
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportId** | **string**| Идентификатор отчета, который вы получили после запуска генерации. |

### Return type

[**OpenAPI\Server\Model\GetReportInfoResponse**](../Model/GetReportInfoResponse.md)

### Authorization

[OAuth](../../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../../README.md#documentation-for-api-endpoints) [[Back to Model list]](../../README.md#documentation-for-models) [[Back to README]](../../README.md)

