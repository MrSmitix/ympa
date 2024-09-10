require 'json'


MyApp.add_route('POST', '/reports/boost-consolidated/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет по бусту продаж",
  "nickname" => "generate_boost_consolidated_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/boost-consolidated/generate",
  "notes" => "Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateBoostConsolidatedRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/competitors-position/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет «Конкурентная позиция»",
  "nickname" => "generate_competitors_position_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/competitors-position/generate",
  "notes" => "Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateCompetitorsPositionReportRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/goods-feedback/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет по отзывам о товарах",
  "nickname" => "generate_goods_feedback_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/goods-feedback/generate",
  "notes" => "Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateGoodsFeedbackRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/goods-movement/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет по движению товаров",
  "nickname" => "generate_goods_movement_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/goods-movement/generate",
  "notes" => "Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateGoodsMovementReportRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/goods-realization/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет по реализации",
  "nickname" => "generate_goods_realization_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/goods-realization/generate",
  "notes" => "Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateGoodsRealizationReportRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/goods-turnover/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет по оборачиваемости",
  "nickname" => "generate_goods_turnover_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/goods-turnover/generate",
  "notes" => "Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateGoodsTurnoverRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/documents/labels/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Готовые ярлыки‑наклейки на все коробки в нескольких заказах",
  "nickname" => "generate_mass_order_labels_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/documents/labels/generate",
  "notes" => "Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.",
      "dataType" => "PageFormatType",
      "allowableValues" => "[A7, A4]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateMassOrderLabelsRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/prices/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет «Цены на рынке»",
  "nickname" => "generate_prices_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/prices/generate",
  "notes" => "Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GeneratePricesReportRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/shelf-statistics/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет по полкам",
  "nickname" => "generate_shelfs_statistics_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/shelf-statistics/generate",
  "notes" => "Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateShelfsStatisticsRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/documents/shipment-list/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Получение листа сборки",
  "nickname" => "generate_shipment_list_document_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/documents/shipment-list/generate",
  "notes" => "Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateShipmentListDocumentReportRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/shows-sales/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет «Аналитика продаж»",
  "nickname" => "generate_shows_sales_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/shows-sales/generate",
  "notes" => "Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateShowsSalesReportRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/stocks-on-warehouses/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет по остаткам на складах",
  "nickname" => "generate_stocks_on_warehouses_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/stocks-on-warehouses/generate",
  "notes" => "Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateStocksOnWarehousesReportRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/united-marketplace-services/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет по стоимости услуг",
  "nickname" => "generate_united_marketplace_services_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/united-marketplace-services/generate",
  "notes" => "Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateUnitedMarketplaceServicesReportRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/united-netting/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет по платежам",
  "nickname" => "generate_united_netting_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/united-netting/generate",
  "notes" => "Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateUnitedNettingReportRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/reports/united-orders/generate', {
  "resourcePath" => "/Reports",
  "summary" => "Отчет по заказам",
  "nickname" => "generate_united_orders_report",
  "responseClass" => "GenerateReportResponse",
  "endpoint" => "/reports/united-orders/generate",
  "notes" => "Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ",
  "parameters" => [
    {
      "name" => "format",
      "description" => "Формат отчета.",
      "dataType" => "ReportFormatType",
      "allowableValues" => "[FILE, CSV]",
      "paramType" => "query",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "GenerateUnitedOrdersRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/reports/info/{reportId}', {
  "resourcePath" => "/Reports",
  "summary" => "Получение заданного отчета",
  "nickname" => "get_report_info",
  "responseClass" => "GetReportInfoResponse",
  "endpoint" => "/reports/info/{reportId}",
  "notes" => "Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| ",
  "parameters" => [
    {
      "name" => "report_id",
      "description" => "Идентификатор отчета, который вы получили после запуска генерации. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

