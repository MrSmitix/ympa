{-
   Партнерский API Маркета
   API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

   The version of the OpenAPI document: LATEST

   NOTE: This file is auto generated by the openapi-generator.
   https://github.com/openapitools/openapi-generator.git

   DO NOT EDIT THIS FILE MANUALLY.

   For more info on generating Elm code, see https://eriktim.github.io/openapi-elm/
-}


module Api.Request.Reports exposing
    ( generateBoostConsolidatedReport
    , generateCompetitorsPositionReport
    , generateGoodsFeedbackReport
    , generateGoodsMovementReport
    , generateGoodsRealizationReport
    , generateGoodsTurnoverReport
    , generateMassOrderLabelsReport
    , generatePricesReport
    , generateShelfsStatisticsReport
    , generateShipmentListDocumentReport
    , generateShowsSalesReport
    , generateStocksOnWarehousesReport
    , generateUnitedMarketplaceServicesReport
    , generateUnitedNettingReport
    , generateUnitedOrdersReport
    , getReportInfo
    )

import Api
import Api.Data exposing (..)
import Dict
import Http
import Json.Decode
import Json.Encode

{-| Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateBoostConsolidatedReport : Maybe ReportFormatType -> Api.Data.GenerateBoostConsolidatedRequest -> Api.Request Api.Data.GenerateReportResponse
generateBoostConsolidatedReport format_query generateBoostConsolidatedRequest_body =
    Api.request
        "POST"
        "/reports/boost-consolidated/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateBoostConsolidatedRequest generateBoostConsolidatedRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
-}
generateCompetitorsPositionReport : Maybe ReportFormatType -> Api.Data.GenerateCompetitorsPositionReportRequest -> Api.Request Api.Data.GenerateReportResponse
generateCompetitorsPositionReport format_query generateCompetitorsPositionReportRequest_body =
    Api.request
        "POST"
        "/reports/competitors-position/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateGoodsFeedbackReport : Maybe ReportFormatType -> Api.Data.GenerateGoodsFeedbackRequest -> Api.Request Api.Data.GenerateReportResponse
generateGoodsFeedbackReport format_query generateGoodsFeedbackRequest_body =
    Api.request
        "POST"
        "/reports/goods-feedback/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateGoodsFeedbackRequest generateGoodsFeedbackRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateGoodsMovementReport : Maybe ReportFormatType -> Api.Data.GenerateGoodsMovementReportRequest -> Api.Request Api.Data.GenerateReportResponse
generateGoodsMovementReport format_query generateGoodsMovementReportRequest_body =
    Api.request
        "POST"
        "/reports/goods-movement/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateGoodsMovementReportRequest generateGoodsMovementReportRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateGoodsRealizationReport : Maybe ReportFormatType -> Api.Data.GenerateGoodsRealizationReportRequest -> Api.Request Api.Data.GenerateReportResponse
generateGoodsRealizationReport format_query generateGoodsRealizationReportRequest_body =
    Api.request
        "POST"
        "/reports/goods-realization/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateGoodsTurnoverReport : Maybe ReportFormatType -> Api.Data.GenerateGoodsTurnoverRequest -> Api.Request Api.Data.GenerateReportResponse
generateGoodsTurnoverReport format_query generateGoodsTurnoverRequest_body =
    Api.request
        "POST"
        "/reports/goods-turnover/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateGoodsTurnoverRequest generateGoodsTurnoverRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
-}
generateMassOrderLabelsReport : Maybe PageFormatType -> Api.Data.GenerateMassOrderLabelsRequest -> Api.Request Api.Data.GenerateReportResponse
generateMassOrderLabelsReport format_query generateMassOrderLabelsRequest_body =
    Api.request
        "POST"
        "/reports/documents/labels/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromPageFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateMassOrderLabelsRequest generateMassOrderLabelsRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generatePricesReport : Maybe ReportFormatType -> Api.Data.GeneratePricesReportRequest -> Api.Request Api.Data.GenerateReportResponse
generatePricesReport format_query generatePricesReportRequest_body =
    Api.request
        "POST"
        "/reports/prices/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGeneratePricesReportRequest generatePricesReportRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateShelfsStatisticsReport : Maybe ReportFormatType -> Api.Data.GenerateShelfsStatisticsRequest -> Api.Request Api.Data.GenerateReportResponse
generateShelfsStatisticsReport format_query generateShelfsStatisticsRequest_body =
    Api.request
        "POST"
        "/reports/shelf-statistics/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateShelfsStatisticsRequest generateShelfsStatisticsRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateShipmentListDocumentReport : Api.Data.GenerateShipmentListDocumentReportRequest -> Api.Request Api.Data.GenerateReportResponse
generateShipmentListDocumentReport generateShipmentListDocumentReportRequest_body =
    Api.request
        "POST"
        "/reports/documents/shipment-list/generate"
        []
        []
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
-}
generateShowsSalesReport : Maybe ReportFormatType -> Api.Data.GenerateShowsSalesReportRequest -> Api.Request Api.Data.GenerateReportResponse
generateShowsSalesReport format_query generateShowsSalesReportRequest_body =
    Api.request
        "POST"
        "/reports/shows-sales/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateShowsSalesReportRequest generateShowsSalesReportRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateStocksOnWarehousesReport : Maybe ReportFormatType -> Api.Data.GenerateStocksOnWarehousesReportRequest -> Api.Request Api.Data.GenerateReportResponse
generateStocksOnWarehousesReport format_query generateStocksOnWarehousesReportRequest_body =
    Api.request
        "POST"
        "/reports/stocks-on-warehouses/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateUnitedMarketplaceServicesReport : Maybe ReportFormatType -> Api.Data.GenerateUnitedMarketplaceServicesReportRequest -> Api.Request Api.Data.GenerateReportResponse
generateUnitedMarketplaceServicesReport format_query generateUnitedMarketplaceServicesReportRequest_body =
    Api.request
        "POST"
        "/reports/united-marketplace-services/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateUnitedNettingReport : Maybe ReportFormatType -> Api.Data.GenerateUnitedNettingReportRequest -> Api.Request Api.Data.GenerateReportResponse
generateUnitedNettingReport format_query generateUnitedNettingReportRequest_body =
    Api.request
        "POST"
        "/reports/united-netting/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateUnitedNettingReportRequest generateUnitedNettingReportRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
-}
generateUnitedOrdersReport : Maybe ReportFormatType -> Api.Data.GenerateUnitedOrdersRequest -> Api.Request Api.Data.GenerateReportResponse
generateUnitedOrdersReport format_query generateUnitedOrdersRequest_body =
    Api.request
        "POST"
        "/reports/united-orders/generate"
        []
        [ ( "format", Maybe.map Api.Data.stringFromReportFormatType format_query ) ]
        []
        (Maybe.map Http.jsonBody (Just (Api.Data.encodeGenerateUnitedOrdersRequest generateUnitedOrdersRequest_body)))
        Api.Data.generateReportResponseDecoder


{-| Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
-}
getReportInfo : String -> Api.Request Api.Data.GetReportInfoResponse
getReportInfo reportId_path =
    Api.request
        "GET"
        "/reports/info/{reportId}"
        [ ( "reportId", identity reportId_path ) ]
        []
        []
        Nothing
        Api.Data.getReportInfoResponseDecoder

