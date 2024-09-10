note
    description: "API tests for REPORTS_API"
    date: "$Date$"
    revision: "$Revision$"


class REPORTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_generate_boost_consolidated_report
            -- Отчет по бусту продаж
            --
            -- Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_boost_consolidated_request: GENERATE_BOOST_CONSOLIDATED_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_boost_consolidated_request

            -- l_response := api.generate_boost_consolidated_report(l_generate_boost_consolidated_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_competitors_position_report
            -- Отчет «Конкурентная позиция»
            --
            -- Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_competitors_position_report_request: GENERATE_COMPETITORS_POSITION_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_competitors_position_report_request

            -- l_response := api.generate_competitors_position_report(l_generate_competitors_position_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_goods_feedback_report
            -- Отчет по отзывам о товарах
            --
            -- Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_goods_feedback_request: GENERATE_GOODS_FEEDBACK_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_goods_feedback_request

            -- l_response := api.generate_goods_feedback_report(l_generate_goods_feedback_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_goods_movement_report
            -- Отчет по движению товаров
            --
            -- Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_goods_movement_report_request: GENERATE_GOODS_MOVEMENT_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_goods_movement_report_request

            -- l_response := api.generate_goods_movement_report(l_generate_goods_movement_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_goods_realization_report
            -- Отчет по реализации
            --
            -- Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_goods_realization_report_request: GENERATE_GOODS_REALIZATION_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_goods_realization_report_request

            -- l_response := api.generate_goods_realization_report(l_generate_goods_realization_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_goods_turnover_report
            -- Отчет по оборачиваемости
            --
            -- Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_goods_turnover_request: GENERATE_GOODS_TURNOVER_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_goods_turnover_request

            -- l_response := api.generate_goods_turnover_report(l_generate_goods_turnover_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_mass_order_labels_report
            -- Готовые ярлыки‑наклейки на все коробки в нескольких заказах
            --
            -- Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_mass_order_labels_request: GENERATE_MASS_ORDER_LABELS_REQUEST
            l_format: PAGE_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_mass_order_labels_request

            -- l_response := api.generate_mass_order_labels_report(l_generate_mass_order_labels_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_prices_report
            -- Отчет «Цены на рынке»
            --
            -- Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_prices_report_request: GENERATE_PRICES_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_prices_report_request

            -- l_response := api.generate_prices_report(l_generate_prices_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_shelfs_statistics_report
            -- Отчет по полкам
            --
            -- Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_shelfs_statistics_request: GENERATE_SHELFS_STATISTICS_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_shelfs_statistics_request

            -- l_response := api.generate_shelfs_statistics_report(l_generate_shelfs_statistics_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_shipment_list_document_report
            -- Получение листа сборки
            --
            -- Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_shipment_list_document_report_request: GENERATE_SHIPMENT_LIST_DOCUMENT_REPORT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_generate_shipment_list_document_report_request

            -- l_response := api.generate_shipment_list_document_report(l_generate_shipment_list_document_report_request)
            assert ("not_implemented", False)
        end

    test_generate_shows_sales_report
            -- Отчет «Аналитика продаж»
            --
            -- Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_shows_sales_report_request: GENERATE_SHOWS_SALES_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_shows_sales_report_request

            -- l_response := api.generate_shows_sales_report(l_generate_shows_sales_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_stocks_on_warehouses_report
            -- Отчет по остаткам на складах
            --
            -- Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_stocks_on_warehouses_report_request: GENERATE_STOCKS_ON_WAREHOUSES_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_stocks_on_warehouses_report_request

            -- l_response := api.generate_stocks_on_warehouses_report(l_generate_stocks_on_warehouses_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_united_marketplace_services_report
            -- Отчет по стоимости услуг
            --
            -- Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_united_marketplace_services_report_request: GENERATE_UNITED_MARKETPLACE_SERVICES_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_united_marketplace_services_report_request

            -- l_response := api.generate_united_marketplace_services_report(l_generate_united_marketplace_services_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_united_netting_report
            -- Отчет по платежам
            --
            -- Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_united_netting_report_request: GENERATE_UNITED_NETTING_REPORT_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_united_netting_report_request

            -- l_response := api.generate_united_netting_report(l_generate_united_netting_report_request, l_format)
            assert ("not_implemented", False)
        end

    test_generate_united_orders_report
            -- Отчет по заказам
            --
            -- Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
        local
            l_response: GENERATE_REPORT_RESPONSE
            l_generate_united_orders_request: GENERATE_UNITED_ORDERS_REQUEST
            l_format: REPORT_FORMAT_TYPE
        do
            -- TODO: Initialize required params.
            -- l_generate_united_orders_request

            -- l_response := api.generate_united_orders_report(l_generate_united_orders_request, l_format)
            assert ("not_implemented", False)
        end

    test_report_info
            -- Получение заданного отчета
            --
            -- Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
        local
            l_response: GET_REPORT_INFO_RESPONSE
            l_report_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_report_id

            -- l_response := api.report_info(l_report_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: REPORTS_API
            -- Create an object instance of `REPORTS_API'.
        once
            create { REPORTS_API } Result
        end

end
