/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.prokarma.pkmst.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.prokarma.pkmst.model.ApiClientDataErrorResponse;
import com.prokarma.pkmst.model.ApiForbiddenErrorResponse;
import com.prokarma.pkmst.model.ApiLimitErrorResponse;
import com.prokarma.pkmst.model.ApiNotFoundErrorResponse;
import com.prokarma.pkmst.model.ApiServerErrorResponse;
import com.prokarma.pkmst.model.ApiUnauthorizedErrorResponse;
import com.prokarma.pkmst.model.GenerateBoostConsolidatedRequest;
import com.prokarma.pkmst.model.GenerateCompetitorsPositionReportRequest;
import com.prokarma.pkmst.model.GenerateGoodsFeedbackRequest;
import com.prokarma.pkmst.model.GenerateGoodsMovementReportRequest;
import com.prokarma.pkmst.model.GenerateGoodsRealizationReportRequest;
import com.prokarma.pkmst.model.GenerateGoodsTurnoverRequest;
import com.prokarma.pkmst.model.GenerateMassOrderLabelsRequest;
import com.prokarma.pkmst.model.GeneratePricesReportRequest;
import com.prokarma.pkmst.model.GenerateReportResponse;
import com.prokarma.pkmst.model.GenerateShelfsStatisticsRequest;
import com.prokarma.pkmst.model.GenerateShipmentListDocumentReportRequest;
import com.prokarma.pkmst.model.GenerateShowsSalesReportRequest;
import com.prokarma.pkmst.model.GenerateStocksOnWarehousesReportRequest;
import com.prokarma.pkmst.model.GenerateUnitedMarketplaceServicesReportRequest;
import com.prokarma.pkmst.model.GenerateUnitedNettingReportRequest;
import com.prokarma.pkmst.model.GenerateUnitedOrdersRequest;
import com.prokarma.pkmst.model.GetReportInfoResponse;
import com.prokarma.pkmst.model.PageFormatType;
import com.prokarma.pkmst.model.ReportFormatType;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

/**
 * API tests for ReportsApi
 */
@Ignore
public class ReportsApiTest {

    private final ObjectMapper objectMapper = new ObjectMapper();

    private final ReportsApi api = new ReportsApiController(objectMapper);

    private final String accept = "application/json";

    
    /**
     * Отчет по бусту продаж
     *
     * Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateBoostConsolidatedReportTest() throws Exception {
        GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет «Конкурентная позиция»
     *
     * Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateCompetitorsPositionReportTest() throws Exception {
        GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет по отзывам о товарах
     *
     * Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateGoodsFeedbackReportTest() throws Exception {
        GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет по движению товаров
     *
     * Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateGoodsMovementReportTest() throws Exception {
        GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateGoodsMovementReport(generateGoodsMovementReportRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет по реализации
     *
     * Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateGoodsRealizationReportTest() throws Exception {
        GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет по оборачиваемости
     *
     * Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateGoodsTurnoverReportTest() throws Exception {
        GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Готовые ярлыки‑наклейки на все коробки в нескольких заказах
     *
     * Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateMassOrderLabelsReportTest() throws Exception {
        GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest = null;
        PageFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateMassOrderLabelsReport(generateMassOrderLabelsRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет «Цены на рынке»
     *
     * Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generatePricesReportTest() throws Exception {
        GeneratePricesReportRequest generatePricesReportRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generatePricesReport(generatePricesReportRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет по полкам
     *
     * Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateShelfsStatisticsReportTest() throws Exception {
        GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Получение листа сборки
     *
     * Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateShipmentListDocumentReportTest() throws Exception {
        GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest = null;
    ResponseEntity<GenerateReportResponse> response = api.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет «Аналитика продаж»
     *
     * Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateShowsSalesReportTest() throws Exception {
        GenerateShowsSalesReportRequest generateShowsSalesReportRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateShowsSalesReport(generateShowsSalesReportRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет по остаткам на складах
     *
     * Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateStocksOnWarehousesReportTest() throws Exception {
        GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет по стоимости услуг
     *
     * Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateUnitedMarketplaceServicesReportTest() throws Exception {
        GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет по платежам
     *
     * Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateUnitedNettingReportTest() throws Exception {
        GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateUnitedNettingReport(generateUnitedNettingReportRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Отчет по заказам
     *
     * Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void generateUnitedOrdersReportTest() throws Exception {
        GenerateUnitedOrdersRequest generateUnitedOrdersRequest = null;
        ReportFormatType format = null;
    ResponseEntity<GenerateReportResponse> response = api.generateUnitedOrdersReport(generateUnitedOrdersRequest, format , accept);

        // TODO: test validations
    }
    
    /**
     * Получение заданного отчета
     *
     * Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void getReportInfoTest() throws Exception {
        String reportId = null;
    ResponseEntity<GetReportInfoResponse> response = api.getReportInfo(reportId , accept);

        // TODO: test validations
    }
    
}
