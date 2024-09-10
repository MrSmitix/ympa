# ympa_powershell_client.ympa_powershell_client\Api.ReportsApi

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**New-BoostConsolidatedReport**](ReportsApi.md#New-BoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**New-CompetitorsPositionReport**](ReportsApi.md#New-CompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**New-GoodsFeedbackReport**](ReportsApi.md#New-GoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**New-GoodsMovementReport**](ReportsApi.md#New-GoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
[**New-GoodsRealizationReport**](ReportsApi.md#New-GoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**New-GoodsTurnoverReport**](ReportsApi.md#New-GoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
[**New-MassOrderLabelsReport**](ReportsApi.md#New-MassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**New-PricesReport**](ReportsApi.md#New-PricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**New-ShelfsStatisticsReport**](ReportsApi.md#New-ShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**New-ShipmentListDocumentReport**](ReportsApi.md#New-ShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
[**New-ShowsSalesReport**](ReportsApi.md#New-ShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**New-StocksOnWarehousesReport**](ReportsApi.md#New-StocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**New-UnitedMarketplaceServicesReport**](ReportsApi.md#New-UnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**New-UnitedNettingReport**](ReportsApi.md#New-UnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
[**New-UnitedOrdersReport**](ReportsApi.md#New-UnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
[**Get-ReportInfo**](ReportsApi.md#Get-ReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета


<a id="New-BoostConsolidatedReport"></a>
# **New-BoostConsolidatedReport**
> GenerateReportResponse New-BoostConsolidatedReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateBoostConsolidatedRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateBoostConsolidatedRequest = Initialize-GenerateBoostConsolidatedRequest -BusinessId 0 -DateFrom (Get-Date) -DateTo (Get-Date) # GenerateBoostConsolidatedRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет по бусту продаж
try {
    $Result = New-BoostConsolidatedReport -GenerateBoostConsolidatedRequest $GenerateBoostConsolidatedRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-BoostConsolidatedReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateBoostConsolidatedRequest** | [**GenerateBoostConsolidatedRequest**](GenerateBoostConsolidatedRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-CompetitorsPositionReport"></a>
# **New-CompetitorsPositionReport**
> GenerateReportResponse New-CompetitorsPositionReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateCompetitorsPositionReportRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info ""Значение -1 в отчете"" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateCompetitorsPositionReportRequest = Initialize-GenerateCompetitorsPositionReportRequest -BusinessId 0 -CategoryId 0 -DateFrom (Get-Date) -DateTo (Get-Date) # GenerateCompetitorsPositionReportRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет «Конкурентная позиция»
try {
    $Result = New-CompetitorsPositionReport -GenerateCompetitorsPositionReportRequest $GenerateCompetitorsPositionReportRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-CompetitorsPositionReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateCompetitorsPositionReportRequest** | [**GenerateCompetitorsPositionReportRequest**](GenerateCompetitorsPositionReportRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-GoodsFeedbackReport"></a>
# **New-GoodsFeedbackReport**
> GenerateReportResponse New-GoodsFeedbackReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateGoodsFeedbackRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateGoodsFeedbackRequest = Initialize-GenerateGoodsFeedbackRequest -BusinessId 0 # GenerateGoodsFeedbackRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет по отзывам о товарах
try {
    $Result = New-GoodsFeedbackReport -GenerateGoodsFeedbackRequest $GenerateGoodsFeedbackRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-GoodsFeedbackReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateGoodsFeedbackRequest** | [**GenerateGoodsFeedbackRequest**](GenerateGoodsFeedbackRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-GoodsMovementReport"></a>
# **New-GoodsMovementReport**
> GenerateReportResponse New-GoodsMovementReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateGoodsMovementReportRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateGoodsMovementReportRequest = Initialize-GenerateGoodsMovementReportRequest -CampaignId 0 -DateFrom (Get-Date) -DateTo (Get-Date) -ShopSku "MyShopSku" # GenerateGoodsMovementReportRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет по движению товаров
try {
    $Result = New-GoodsMovementReport -GenerateGoodsMovementReportRequest $GenerateGoodsMovementReportRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-GoodsMovementReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateGoodsMovementReportRequest** | [**GenerateGoodsMovementReportRequest**](GenerateGoodsMovementReportRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-GoodsRealizationReport"></a>
# **New-GoodsRealizationReport**
> GenerateReportResponse New-GoodsRealizationReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateGoodsRealizationReportRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateGoodsRealizationReportRequest = Initialize-GenerateGoodsRealizationReportRequest -CampaignId 0 -Year 0 -Month 0 # GenerateGoodsRealizationReportRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет по реализации
try {
    $Result = New-GoodsRealizationReport -GenerateGoodsRealizationReportRequest $GenerateGoodsRealizationReportRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-GoodsRealizationReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateGoodsRealizationReportRequest** | [**GenerateGoodsRealizationReportRequest**](GenerateGoodsRealizationReportRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-GoodsTurnoverReport"></a>
# **New-GoodsTurnoverReport**
> GenerateReportResponse New-GoodsTurnoverReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateGoodsTurnoverRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateGoodsTurnoverRequest = Initialize-GenerateGoodsTurnoverRequest -CampaignId 0 -Date (Get-Date) # GenerateGoodsTurnoverRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет по оборачиваемости
try {
    $Result = New-GoodsTurnoverReport -GenerateGoodsTurnoverRequest $GenerateGoodsTurnoverRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-GoodsTurnoverReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateGoodsTurnoverRequest** | [**GenerateGoodsTurnoverRequest**](GenerateGoodsTurnoverRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-MassOrderLabelsReport"></a>
# **New-MassOrderLabelsReport**
> GenerateReportResponse New-MassOrderLabelsReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateMassOrderLabelsRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateMassOrderLabelsRequest = Initialize-GenerateMassOrderLabelsRequest -BusinessId 0 -OrderIds 0 # GenerateMassOrderLabelsRequest | 
$Format = "A7" # PageFormatType | Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. (optional)

# Готовые ярлыки‑наклейки на все коробки в нескольких заказах
try {
    $Result = New-MassOrderLabelsReport -GenerateMassOrderLabelsRequest $GenerateMassOrderLabelsRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-MassOrderLabelsReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateMassOrderLabelsRequest** | [**GenerateMassOrderLabelsRequest**](GenerateMassOrderLabelsRequest.md)|  | 
 **Format** | [**PageFormatType**](PageFormatType.md)| Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-PricesReport"></a>
# **New-PricesReport**
> GenerateReportResponse New-PricesReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GeneratePricesReportRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GeneratePricesReportRequest = Initialize-GeneratePricesReportRequest -BusinessId 0 -CampaignId 0 -CategoryIds 0 -CreationDateFrom (Get-Date) -CreationDateTo (Get-Date) # GeneratePricesReportRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет «Цены на рынке»
try {
    $Result = New-PricesReport -GeneratePricesReportRequest $GeneratePricesReportRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-PricesReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GeneratePricesReportRequest** | [**GeneratePricesReportRequest**](GeneratePricesReportRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ShelfsStatisticsReport"></a>
# **New-ShelfsStatisticsReport**
> GenerateReportResponse New-ShelfsStatisticsReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateShelfsStatisticsRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateShelfsStatisticsRequest = Initialize-GenerateShelfsStatisticsRequest -BusinessId 0 -DateFrom (Get-Date) -DateTo (Get-Date) -AttributionType "CLICKS" # GenerateShelfsStatisticsRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет по полкам
try {
    $Result = New-ShelfsStatisticsReport -GenerateShelfsStatisticsRequest $GenerateShelfsStatisticsRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-ShelfsStatisticsReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateShelfsStatisticsRequest** | [**GenerateShelfsStatisticsRequest**](GenerateShelfsStatisticsRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ShipmentListDocumentReport"></a>
# **New-ShipmentListDocumentReport**
> GenerateReportResponse New-ShipmentListDocumentReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateShipmentListDocumentReportRequest] <PSCustomObject><br>

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateShipmentListDocumentReportRequest = Initialize-GenerateShipmentListDocumentReportRequest -CampaignId 0 -ShipmentId 0 -OrderIds 0 # GenerateShipmentListDocumentReportRequest | 

# Получение листа сборки
try {
    $Result = New-ShipmentListDocumentReport -GenerateShipmentListDocumentReportRequest $GenerateShipmentListDocumentReportRequest
} catch {
    Write-Host ("Exception occurred when calling New-ShipmentListDocumentReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateShipmentListDocumentReportRequest** | [**GenerateShipmentListDocumentReportRequest**](GenerateShipmentListDocumentReportRequest.md)|  | 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-ShowsSalesReport"></a>
# **New-ShowsSalesReport**
> GenerateReportResponse New-ShowsSalesReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateShowsSalesReportRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateShowsSalesReportRequest = Initialize-GenerateShowsSalesReportRequest -BusinessId 0 -CampaignId 0 -DateFrom (Get-Date) -DateTo (Get-Date) -Grouping "CATEGORIES" # GenerateShowsSalesReportRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет «Аналитика продаж»
try {
    $Result = New-ShowsSalesReport -GenerateShowsSalesReportRequest $GenerateShowsSalesReportRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-ShowsSalesReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateShowsSalesReportRequest** | [**GenerateShowsSalesReportRequest**](GenerateShowsSalesReportRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-StocksOnWarehousesReport"></a>
# **New-StocksOnWarehousesReport**
> GenerateReportResponse New-StocksOnWarehousesReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateStocksOnWarehousesReportRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateStocksOnWarehousesReportRequest = Initialize-GenerateStocksOnWarehousesReportRequest -CampaignId 0 -WarehouseIds 0 -ReportDate (Get-Date) -CategoryIds 0 -HasStocks $false # GenerateStocksOnWarehousesReportRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет по остаткам на складах
try {
    $Result = New-StocksOnWarehousesReport -GenerateStocksOnWarehousesReportRequest $GenerateStocksOnWarehousesReportRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-StocksOnWarehousesReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateStocksOnWarehousesReportRequest** | [**GenerateStocksOnWarehousesReportRequest**](GenerateStocksOnWarehousesReportRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-UnitedMarketplaceServicesReport"></a>
# **New-UnitedMarketplaceServicesReport**
> GenerateReportResponse New-UnitedMarketplaceServicesReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateUnitedMarketplaceServicesReportRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateUnitedMarketplaceServicesReportRequest = Initialize-GenerateUnitedMarketplaceServicesReportRequest -BusinessId 0 -DateTimeFrom (Get-Date) -DateTimeTo (Get-Date) -DateFrom (Get-Date) -DateTo (Get-Date) -YearFrom 0 -MonthFrom 0 -YearTo 0 -MonthTo 0 -PlacementPrograms "FBS" -Inns "MyInns" -CampaignIds 0 # GenerateUnitedMarketplaceServicesReportRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет по стоимости услуг
try {
    $Result = New-UnitedMarketplaceServicesReport -GenerateUnitedMarketplaceServicesReportRequest $GenerateUnitedMarketplaceServicesReportRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-UnitedMarketplaceServicesReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateUnitedMarketplaceServicesReportRequest** | [**GenerateUnitedMarketplaceServicesReportRequest**](GenerateUnitedMarketplaceServicesReportRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-UnitedNettingReport"></a>
# **New-UnitedNettingReport**
> GenerateReportResponse New-UnitedNettingReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateUnitedNettingReportRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateUnitedNettingReportRequest = Initialize-GenerateUnitedNettingReportRequest -BusinessId 0 -DateTimeFrom (Get-Date) -DateTimeTo (Get-Date) -DateFrom (Get-Date) -DateTo (Get-Date) -BankOrderId 0 -BankOrderDateTime (Get-Date) -PlacementPrograms "FBS" -Inns "MyInns" -CampaignIds 0 # GenerateUnitedNettingReportRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет по платежам
try {
    $Result = New-UnitedNettingReport -GenerateUnitedNettingReportRequest $GenerateUnitedNettingReportRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-UnitedNettingReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateUnitedNettingReportRequest** | [**GenerateUnitedNettingReportRequest**](GenerateUnitedNettingReportRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="New-UnitedOrdersReport"></a>
# **New-UnitedOrdersReport**
> GenerateReportResponse New-UnitedOrdersReport<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-GenerateUnitedOrdersRequest] <PSCustomObject><br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-Format] <PSCustomObject><br>

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info """" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$GenerateUnitedOrdersRequest = Initialize-GenerateUnitedOrdersRequest -BusinessId 0 -DateFrom (Get-Date) -DateTo (Get-Date) -CampaignIds 0 -PromoId "MyPromoId" # GenerateUnitedOrdersRequest | 
$Format = "FILE" # ReportFormatType | Формат отчета. (optional)

# Отчет по заказам
try {
    $Result = New-UnitedOrdersReport -GenerateUnitedOrdersRequest $GenerateUnitedOrdersRequest -Format $Format
} catch {
    Write-Host ("Exception occurred when calling New-UnitedOrdersReport: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **GenerateUnitedOrdersRequest** | [**GenerateUnitedOrdersRequest**](GenerateUnitedOrdersRequest.md)|  | 
 **Format** | [**ReportFormatType**](ReportFormatType.md)| Формат отчета. | [optional] 

### Return type

[**GenerateReportResponse**](GenerateReportResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

<a id="Get-ReportInfo"></a>
# **Get-ReportInfo**
> GetReportInfoResponse Get-ReportInfo<br>
> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;[-ReportId] <String><br>

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 

### Example
```powershell
# general setting of the PowerShell module, e.g. base URL, authentication, etc
$Configuration = Get-Configuration
# Configure OAuth2 access token for authorization: OAuth
$Configuration.AccessToken = "YOUR_ACCESS_TOKEN"

$ReportId = "MyReportId" # String | Идентификатор отчета, который вы получили после запуска генерации. 

# Получение заданного отчета
try {
    $Result = Get-ReportInfo -ReportId $ReportId
} catch {
    Write-Host ("Exception occurred when calling Get-ReportInfo: {0}" -f ($_.ErrorDetails | ConvertFrom-Json))
    Write-Host ("Response headers: {0}" -f ($_.Exception.Response.Headers | ConvertTo-Json))
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **ReportId** | **String**| Идентификатор отчета, который вы получили после запуска генерации.  | 

### Return type

[**GetReportInfoResponse**](GetReportInfoResponse.md) (PSCustomObject)

### Authorization

[OAuth](../README.md#OAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

[[Back to top]](#) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to Model list]](../README.md#documentation-for-models) [[Back to README]](../README.md)

