# reports_api

All URIs are relative to *https://api.partner.market.yandex.ru*

Method | HTTP request | Description
------------- | ------------- | -------------
[**GenerateBoostConsolidatedReport**](reports_api.md#GenerateBoostConsolidatedReport) | **POST** /reports/boost-consolidated/generate | Отчет по бусту продаж
[**GenerateCompetitorsPositionReport**](reports_api.md#GenerateCompetitorsPositionReport) | **POST** /reports/competitors-position/generate | Отчет «Конкурентная позиция»
[**GenerateGoodsFeedbackReport**](reports_api.md#GenerateGoodsFeedbackReport) | **POST** /reports/goods-feedback/generate | Отчет по отзывам о товарах
[**GenerateGoodsMovementReport**](reports_api.md#GenerateGoodsMovementReport) | **POST** /reports/goods-movement/generate | Отчет по движению товаров
[**GenerateGoodsRealizationReport**](reports_api.md#GenerateGoodsRealizationReport) | **POST** /reports/goods-realization/generate | Отчет по реализации
[**GenerateGoodsTurnoverReport**](reports_api.md#GenerateGoodsTurnoverReport) | **POST** /reports/goods-turnover/generate | Отчет по оборачиваемости
[**GenerateMassOrderLabelsReport**](reports_api.md#GenerateMassOrderLabelsReport) | **POST** /reports/documents/labels/generate | Готовые ярлыки‑наклейки на все коробки в нескольких заказах
[**GeneratePricesReport**](reports_api.md#GeneratePricesReport) | **POST** /reports/prices/generate | Отчет «Цены на рынке»
[**GenerateShelfsStatisticsReport**](reports_api.md#GenerateShelfsStatisticsReport) | **POST** /reports/shelf-statistics/generate | Отчет по полкам
[**GenerateShipmentListDocumentReport**](reports_api.md#GenerateShipmentListDocumentReport) | **POST** /reports/documents/shipment-list/generate | Получение листа сборки
[**GenerateShowsSalesReport**](reports_api.md#GenerateShowsSalesReport) | **POST** /reports/shows-sales/generate | Отчет «Аналитика продаж»
[**GenerateStocksOnWarehousesReport**](reports_api.md#GenerateStocksOnWarehousesReport) | **POST** /reports/stocks-on-warehouses/generate | Отчет по остаткам на складах
[**GenerateUnitedMarketplaceServicesReport**](reports_api.md#GenerateUnitedMarketplaceServicesReport) | **POST** /reports/united-marketplace-services/generate | Отчет по стоимости услуг
[**GenerateUnitedNettingReport**](reports_api.md#GenerateUnitedNettingReport) | **POST** /reports/united-netting/generate | Отчет по платежам
[**GenerateUnitedOrdersReport**](reports_api.md#GenerateUnitedOrdersReport) | **POST** /reports/united-orders/generate | Отчет по заказам
[**GetReportInfo**](reports_api.md#GetReportInfo) | **GET** /reports/info/{reportId} | Получение заданного отчета


<a name="GenerateBoostConsolidatedReport"></a>
# **GenerateBoostConsolidatedReport**
> GenerateReportResponse GenerateBoostConsolidatedReport(generateBoostConsolidatedRequest, format)

Отчет по бусту продаж

Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateCompetitorsPositionReport"></a>
# **GenerateCompetitorsPositionReport**
> GenerateReportResponse GenerateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format)

Отчет «Конкурентная позиция»

Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
<a name="GenerateGoodsFeedbackReport"></a>
# **GenerateGoodsFeedbackReport**
> GenerateReportResponse GenerateGoodsFeedbackReport(generateGoodsFeedbackRequest, format)

Отчет по отзывам о товарах

Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateGoodsMovementReport"></a>
# **GenerateGoodsMovementReport**
> GenerateReportResponse GenerateGoodsMovementReport(generateGoodsMovementReportRequest, format)

Отчет по движению товаров

Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateGoodsRealizationReport"></a>
# **GenerateGoodsRealizationReport**
> GenerateReportResponse GenerateGoodsRealizationReport(generateGoodsRealizationReportRequest, format)

Отчет по реализации

Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateGoodsTurnoverReport"></a>
# **GenerateGoodsTurnoverReport**
> GenerateReportResponse GenerateGoodsTurnoverReport(generateGoodsTurnoverRequest, format)

Отчет по оборачиваемости

Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateMassOrderLabelsReport"></a>
# **GenerateMassOrderLabelsReport**
> GenerateReportResponse GenerateMassOrderLabelsReport(generateMassOrderLabelsRequest, format)

Готовые ярлыки‑наклейки на все коробки в нескольких заказах

Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
<a name="GeneratePricesReport"></a>
# **GeneratePricesReport**
> GenerateReportResponse GeneratePricesReport(generatePricesReportRequest, format)

Отчет «Цены на рынке»

Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateShelfsStatisticsReport"></a>
# **GenerateShelfsStatisticsReport**
> GenerateReportResponse GenerateShelfsStatisticsReport(generateShelfsStatisticsRequest, format)

Отчет по полкам

Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateShipmentListDocumentReport"></a>
# **GenerateShipmentListDocumentReport**
> GenerateReportResponse GenerateShipmentListDocumentReport(generateShipmentListDocumentReportRequest)

Получение листа сборки

Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateShowsSalesReport"></a>
# **GenerateShowsSalesReport**
> GenerateReportResponse GenerateShowsSalesReport(generateShowsSalesReportRequest, format)

Отчет «Аналитика продаж»

Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
<a name="GenerateStocksOnWarehousesReport"></a>
# **GenerateStocksOnWarehousesReport**
> GenerateReportResponse GenerateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format)

Отчет по остаткам на складах

Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateUnitedMarketplaceServicesReport"></a>
# **GenerateUnitedMarketplaceServicesReport**
> GenerateReportResponse GenerateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format)

Отчет по стоимости услуг

Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateUnitedNettingReport"></a>
# **GenerateUnitedNettingReport**
> GenerateReportResponse GenerateUnitedNettingReport(generateUnitedNettingReportRequest, format)

Отчет по платежам

Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GenerateUnitedOrdersReport"></a>
# **GenerateUnitedOrdersReport**
> GenerateReportResponse GenerateUnitedOrdersReport(generateUnitedOrdersRequest, format)

Отчет по заказам

Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
<a name="GetReportInfo"></a>
# **GetReportInfo**
> GetReportInfoResponse GetReportInfo(reportId)

Получение заданного отчета

Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
