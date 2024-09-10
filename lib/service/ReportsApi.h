#ifndef TINY_CPP_CLIENT_ReportsApi_H_
#define TINY_CPP_CLIENT_ReportsApi_H_


#include "Response.h"
#include "Arduino.h"
#include "Service.h"
#include "Helpers.h"
#include <list>

#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "GenerateBoostConsolidatedRequest.h"
#include "GenerateCompetitorsPositionReportRequest.h"
#include "GenerateGoodsFeedbackRequest.h"
#include "GenerateGoodsMovementReportRequest.h"
#include "GenerateGoodsRealizationReportRequest.h"
#include "GenerateGoodsTurnoverRequest.h"
#include "GenerateMassOrderLabelsRequest.h"
#include "GeneratePricesReportRequest.h"
#include "GenerateReportResponse.h"
#include "GenerateShelfsStatisticsRequest.h"
#include "GenerateShipmentListDocumentReportRequest.h"
#include "GenerateShowsSalesReportRequest.h"
#include "GenerateStocksOnWarehousesReportRequest.h"
#include "GenerateUnitedMarketplaceServicesReportRequest.h"
#include "GenerateUnitedNettingReportRequest.h"
#include "GenerateUnitedOrdersRequest.h"
#include "GetReportInfoResponse.h"
#include "PageFormatType.h"
#include "ReportFormatType.h"

namespace Tiny {

/**
 *  Class 
 * Generated with openapi::tiny-cpp-client
 */

class ReportsApi : public Service {
public:
    ReportsApi() = default;

    virtual ~ReportsApi() = default;

    /**
    * Отчет по бусту продаж.
    *
    * Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateBoostConsolidatedRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateBoostConsolidatedReport(
            
            GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Отчет «Конкурентная позиция».
    *
    * Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
    * \param generateCompetitorsPositionReportRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateCompetitorsPositionReport(
            
            GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Отчет по отзывам о товарах.
    *
    * Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateGoodsFeedbackRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateGoodsFeedbackReport(
            
            GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Отчет по движению товаров.
    *
    * Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateGoodsMovementReportRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateGoodsMovementReport(
            
            GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Отчет по реализации.
    *
    * Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateGoodsRealizationReportRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateGoodsRealizationReport(
            
            GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Отчет по оборачиваемости.
    *
    * Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateGoodsTurnoverRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateGoodsTurnoverReport(
            
            GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Готовые ярлыки‑наклейки на все коробки в нескольких заказах.
    *
    * Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
    * \param generateMassOrderLabelsRequest  *Required*
    * \param format Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.
    */
    Response<
                GenerateReportResponse
        >
    generateMassOrderLabelsReport(
            
            GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest
            , 
            
            PageFormatType format
            
    );
    /**
    * Отчет «Цены на рынке».
    *
    * Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generatePricesReportRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generatePricesReport(
            
            GeneratePricesReportRequest generatePricesReportRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Отчет по полкам.
    *
    * Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateShelfsStatisticsRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateShelfsStatisticsReport(
            
            GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Получение листа сборки.
    *
    * Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateShipmentListDocumentReportRequest  *Required*
    */
    Response<
                GenerateReportResponse
        >
    generateShipmentListDocumentReport(
            
            GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest
            
    );
    /**
    * Отчет «Аналитика продаж».
    *
    * Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
    * \param generateShowsSalesReportRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateShowsSalesReport(
            
            GenerateShowsSalesReportRequest generateShowsSalesReportRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Отчет по остаткам на складах.
    *
    * Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateStocksOnWarehousesReportRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateStocksOnWarehousesReport(
            
            GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Отчет по стоимости услуг.
    *
    * Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateUnitedMarketplaceServicesReportRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateUnitedMarketplaceServicesReport(
            
            GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Отчет по платежам.
    *
    * Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateUnitedNettingReportRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateUnitedNettingReport(
            
            GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Отчет по заказам.
    *
    * Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
    * \param generateUnitedOrdersRequest  *Required*
    * \param format Формат отчета.
    */
    Response<
                GenerateReportResponse
        >
    generateUnitedOrdersReport(
            
            GenerateUnitedOrdersRequest generateUnitedOrdersRequest
            , 
            
            ReportFormatType format
            
    );
    /**
    * Получение заданного отчета.
    *
    * Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
    * \param reportId Идентификатор отчета, который вы получили после запуска генерации.  *Required*
    */
    Response<
                GetReportInfoResponse
        >
    getReportInfo(
            
            std::string reportId
            
    );
}; 

} 

#endif /* TINY_CPP_CLIENT_ReportsApi_H_ */