package org.openapitools.api;

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
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import jakarta.inject.Inject;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;

/**
 * API tests for ReportsApi
 */
@MicronautTest
public class ReportsApiTest {

    @Inject
    ReportsApi api;

    
    /**
     * Отчет по бусту продаж
     *
     * Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateBoostConsolidatedReportTest() {
        // given
        GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = new GenerateBoostConsolidatedRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, _format).block();

        // then
        // TODO implement the generateBoostConsolidatedReportTest()
    }

    
    /**
     * Отчет «Конкурентная позиция»
     *
     * Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateCompetitorsPositionReportTest() {
        // given
        GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = new GenerateCompetitorsPositionReportRequest(56L, 56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, _format).block();

        // then
        // TODO implement the generateCompetitorsPositionReportTest()
    }

    
    /**
     * Отчет по отзывам о товарах
     *
     * Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateGoodsFeedbackReportTest() {
        // given
        GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = new GenerateGoodsFeedbackRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, _format).block();

        // then
        // TODO implement the generateGoodsFeedbackReportTest()
    }

    
    /**
     * Отчет по движению товаров
     *
     * Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateGoodsMovementReportTest() {
        // given
        GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = new GenerateGoodsMovementReportRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateGoodsMovementReport(generateGoodsMovementReportRequest, _format).block();

        // then
        // TODO implement the generateGoodsMovementReportTest()
    }

    
    /**
     * Отчет по реализации
     *
     * Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateGoodsRealizationReportTest() {
        // given
        GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = new GenerateGoodsRealizationReportRequest(56L, 56, 56);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, _format).block();

        // then
        // TODO implement the generateGoodsRealizationReportTest()
    }

    
    /**
     * Отчет по оборачиваемости
     *
     * Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateGoodsTurnoverReportTest() {
        // given
        GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = new GenerateGoodsTurnoverRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, _format).block();

        // then
        // TODO implement the generateGoodsTurnoverReportTest()
    }

    
    /**
     * Готовые ярлыки‑наклейки на все коробки в нескольких заказах
     *
     * Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateMassOrderLabelsReportTest() {
        // given
        GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest = new GenerateMassOrderLabelsRequest(56L, new HashSet<>());
        PageFormatType _format = PageFormatType.fromValue("A7");

        // when
        GenerateReportResponse body = api.generateMassOrderLabelsReport(generateMassOrderLabelsRequest, _format).block();

        // then
        // TODO implement the generateMassOrderLabelsReportTest()
    }

    
    /**
     * Отчет «Цены на рынке»
     *
     * Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generatePricesReportTest() {
        // given
        GeneratePricesReportRequest generatePricesReportRequest = new GeneratePricesReportRequest();
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generatePricesReport(generatePricesReportRequest, _format).block();

        // then
        // TODO implement the generatePricesReportTest()
    }

    
    /**
     * Отчет по полкам
     *
     * Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateShelfsStatisticsReportTest() {
        // given
        GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = new GenerateShelfsStatisticsRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3), org.openapitools.model.ShelfsStatisticsAttributionType.fromValue("CLICKS"));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, _format).block();

        // then
        // TODO implement the generateShelfsStatisticsReportTest()
    }

    
    /**
     * Получение листа сборки
     *
     * Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateShipmentListDocumentReportTest() {
        // given
        GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest = new GenerateShipmentListDocumentReportRequest(56L);

        // when
        GenerateReportResponse body = api.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest).block();

        // then
        // TODO implement the generateShipmentListDocumentReportTest()
    }

    
    /**
     * Отчет «Аналитика продаж»
     *
     * Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateShowsSalesReportTest() {
        // given
        GenerateShowsSalesReportRequest generateShowsSalesReportRequest = new GenerateShowsSalesReportRequest(LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3), org.openapitools.model.ShowsSalesGroupingType.fromValue("CATEGORIES"));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateShowsSalesReport(generateShowsSalesReportRequest, _format).block();

        // then
        // TODO implement the generateShowsSalesReportTest()
    }

    
    /**
     * Отчет по остаткам на складах
     *
     * Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateStocksOnWarehousesReportTest() {
        // given
        GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = new GenerateStocksOnWarehousesReportRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, _format).block();

        // then
        // TODO implement the generateStocksOnWarehousesReportTest()
    }

    
    /**
     * Отчет по стоимости услуг
     *
     * Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateUnitedMarketplaceServicesReportTest() {
        // given
        GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = new GenerateUnitedMarketplaceServicesReportRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, _format).block();

        // then
        // TODO implement the generateUnitedMarketplaceServicesReportTest()
    }

    
    /**
     * Отчет по платежам
     *
     * Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateUnitedNettingReportTest() {
        // given
        GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = new GenerateUnitedNettingReportRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateUnitedNettingReport(generateUnitedNettingReportRequest, _format).block();

        // then
        // TODO implement the generateUnitedNettingReportTest()
    }

    
    /**
     * Отчет по заказам
     *
     * Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void generateUnitedOrdersReportTest() {
        // given
        GenerateUnitedOrdersRequest generateUnitedOrdersRequest = new GenerateUnitedOrdersRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse body = api.generateUnitedOrdersReport(generateUnitedOrdersRequest, _format).block();

        // then
        // TODO implement the generateUnitedOrdersReportTest()
    }

    
    /**
     * Получение заданного отчета
     *
     * Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     */
    @Test
    @Disabled("Not Implemented")
    public void getReportInfoTest() {
        // given
        String reportId = "example";

        // when
        GetReportInfoResponse body = api.getReportInfo(reportId).block();

        // then
        // TODO implement the getReportInfoTest()
    }

    
}
