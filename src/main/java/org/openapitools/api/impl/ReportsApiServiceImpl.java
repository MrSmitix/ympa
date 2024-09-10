package org.openapitools.api.impl;

import org.openapitools.api.*;
import org.openapitools.model.ApiClientDataErrorResponse;
import org.openapitools.model.ApiForbiddenErrorResponse;
import org.openapitools.model.ApiLimitErrorResponse;
import org.openapitools.model.ApiNotFoundErrorResponse;
import org.openapitools.model.ApiServerErrorResponse;
import org.openapitools.model.ApiUnauthorizedErrorResponse;
import org.openapitools.model.GenerateBoostConsolidatedRequest;
import org.openapitools.model.GenerateCompetitorsPositionReportRequest;
import org.openapitools.model.GenerateGoodsFeedbackRequest;
import org.openapitools.model.GenerateGoodsMovementReportRequest;
import org.openapitools.model.GenerateGoodsRealizationReportRequest;
import org.openapitools.model.GenerateGoodsTurnoverRequest;
import org.openapitools.model.GenerateMassOrderLabelsRequest;
import org.openapitools.model.GeneratePricesReportRequest;
import org.openapitools.model.GenerateReportResponse;
import org.openapitools.model.GenerateShelfsStatisticsRequest;
import org.openapitools.model.GenerateShipmentListDocumentReportRequest;
import org.openapitools.model.GenerateShowsSalesReportRequest;
import org.openapitools.model.GenerateStocksOnWarehousesReportRequest;
import org.openapitools.model.GenerateUnitedMarketplaceServicesReportRequest;
import org.openapitools.model.GenerateUnitedNettingReportRequest;
import org.openapitools.model.GenerateUnitedOrdersRequest;
import org.openapitools.model.GetReportInfoResponse;
import org.openapitools.model.PageFormatType;
import org.openapitools.model.ReportFormatType;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.model.wadl.Description;
import org.apache.cxf.jaxrs.model.wadl.DocTarget;

import org.apache.cxf.jaxrs.ext.multipart.*;

import io.swagger.annotations.Api;

/**
 * Партнерский API Маркета
 *
 * <p>API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 */
public class ReportsApiServiceImpl implements ReportsApi {
    /**
     * Отчет по бусту продаж
     *
     * Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateBoostConsolidatedReport(GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет «Конкурентная позиция»
     *
     * Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateCompetitorsPositionReport(GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет по отзывам о товарах
     *
     * Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateGoodsFeedbackReport(GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет по движению товаров
     *
     * Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateGoodsMovementReport(GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет по реализации
     *
     * Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateGoodsRealizationReport(GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет по оборачиваемости
     *
     * Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateGoodsTurnoverReport(GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Готовые ярлыки‑наклейки на все коробки в нескольких заказах
     *
     * Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateMassOrderLabelsReport(GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest, PageFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет «Цены на рынке»
     *
     * Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generatePricesReport(GeneratePricesReportRequest generatePricesReportRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет по полкам
     *
     * Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateShelfsStatisticsReport(GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Получение листа сборки
     *
     * Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateShipmentListDocumentReport(GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет «Аналитика продаж»
     *
     * Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateShowsSalesReport(GenerateShowsSalesReportRequest generateShowsSalesReportRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет по остаткам на складах
     *
     * Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateStocksOnWarehousesReport(GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет по стоимости услуг
     *
     * Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateUnitedMarketplaceServicesReport(GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет по платежам
     *
     * Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateUnitedNettingReport(GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Отчет по заказам
     *
     * Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     */
    @Override
    public GenerateReportResponse generateUnitedOrdersReport(GenerateUnitedOrdersRequest generateUnitedOrdersRequest, ReportFormatType format) {
        // TODO: Implement...
        return null;
    }

    /**
     * Получение заданного отчета
     *
     * Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     *
     */
    @Override
    public GetReportInfoResponse getReportInfo(String reportId) {
        // TODO: Implement...
        return null;
    }

}
