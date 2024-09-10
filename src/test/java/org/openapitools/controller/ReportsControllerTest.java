package org.openapitools.controller;

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
import io.micronaut.http.client.HttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.server.EmbeddedServer;
import io.micronaut.http.HttpStatus;
import io.micronaut.http.MutableHttpRequest;
import io.micronaut.http.HttpRequest;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.uri.UriTemplate;
import io.micronaut.http.cookie.Cookie;
import io.micronaut.http.client.multipart.MultipartBody;
import io.micronaut.core.type.Argument;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Assertions;
import jakarta.inject.Inject;
import reactor.core.publisher.Mono;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.HashSet;


/**
 * API tests for ReportsController
 */
@MicronautTest
public class ReportsControllerTest {

    @Inject
    EmbeddedServer server;

    @Inject
    @Client
    HttpClient client;

    @Inject
    ReportsController controller;

    /**
     * This test is used to validate the implementation of generateBoostConsolidatedReport() method
     *
     * The method should: Отчет по бусту продаж
     *
     * Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateBoostConsolidatedReportMethodTest() {
        // given
        GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest = new GenerateBoostConsolidatedRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateBoostConsolidatedReport(generateBoostConsolidatedRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/boost-consolidated/generate' to the features of generateBoostConsolidatedReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateBoostConsolidatedReportClientApiTest() throws IOException {
        // given
        GenerateBoostConsolidatedRequest body = new GenerateBoostConsolidatedRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        String uri = UriTemplate.of("/reports/boost-consolidated/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@7ef5a01b");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateCompetitorsPositionReport() method
     *
     * The method should: Отчет «Конкурентная позиция»
     *
     * Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \&quot;Значение -1 в отчете\&quot; %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateCompetitorsPositionReportMethodTest() {
        // given
        GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest = new GenerateCompetitorsPositionReportRequest(56L, 56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/competitors-position/generate' to the features of generateCompetitorsPositionReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateCompetitorsPositionReportClientApiTest() throws IOException {
        // given
        GenerateCompetitorsPositionReportRequest body = new GenerateCompetitorsPositionReportRequest(56L, 56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        String uri = UriTemplate.of("/reports/competitors-position/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@7a3a8ee0");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateGoodsFeedbackReport() method
     *
     * The method should: Отчет по отзывам о товарах
     *
     * Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateGoodsFeedbackReportMethodTest() {
        // given
        GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest = new GenerateGoodsFeedbackRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateGoodsFeedbackReport(generateGoodsFeedbackRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/goods-feedback/generate' to the features of generateGoodsFeedbackReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateGoodsFeedbackReportClientApiTest() throws IOException {
        // given
        GenerateGoodsFeedbackRequest body = new GenerateGoodsFeedbackRequest(56L);
        String uri = UriTemplate.of("/reports/goods-feedback/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@86e170e");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateGoodsMovementReport() method
     *
     * The method should: Отчет по движению товаров
     *
     * Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateGoodsMovementReportMethodTest() {
        // given
        GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest = new GenerateGoodsMovementReportRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateGoodsMovementReport(generateGoodsMovementReportRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/goods-movement/generate' to the features of generateGoodsMovementReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateGoodsMovementReportClientApiTest() throws IOException {
        // given
        GenerateGoodsMovementReportRequest body = new GenerateGoodsMovementReportRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        String uri = UriTemplate.of("/reports/goods-movement/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@4c9e86a4");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateGoodsRealizationReport() method
     *
     * The method should: Отчет по реализации
     *
     * Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateGoodsRealizationReportMethodTest() {
        // given
        GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest = new GenerateGoodsRealizationReportRequest(56L, 56, 56);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateGoodsRealizationReport(generateGoodsRealizationReportRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/goods-realization/generate' to the features of generateGoodsRealizationReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateGoodsRealizationReportClientApiTest() throws IOException {
        // given
        GenerateGoodsRealizationReportRequest body = new GenerateGoodsRealizationReportRequest(56L, 56, 56);
        String uri = UriTemplate.of("/reports/goods-realization/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@1fb81254");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateGoodsTurnoverReport() method
     *
     * The method should: Отчет по оборачиваемости
     *
     * Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateGoodsTurnoverReportMethodTest() {
        // given
        GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest = new GenerateGoodsTurnoverRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateGoodsTurnoverReport(generateGoodsTurnoverRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/goods-turnover/generate' to the features of generateGoodsTurnoverReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateGoodsTurnoverReportClientApiTest() throws IOException {
        // given
        GenerateGoodsTurnoverRequest body = new GenerateGoodsTurnoverRequest(56L);
        String uri = UriTemplate.of("/reports/goods-turnover/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@315bd2cd");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateMassOrderLabelsReport() method
     *
     * The method should: Готовые ярлыки‑наклейки на все коробки в нескольких заказах
     *
     * Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateMassOrderLabelsReportMethodTest() {
        // given
        GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest = new GenerateMassOrderLabelsRequest(56L, new HashSet<>());
        PageFormatType _format = PageFormatType.fromValue("A7");

        // when
        GenerateReportResponse result = controller.generateMassOrderLabelsReport(generateMassOrderLabelsRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/documents/labels/generate' to the features of generateMassOrderLabelsReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateMassOrderLabelsReportClientApiTest() throws IOException {
        // given
        GenerateMassOrderLabelsRequest body = new GenerateMassOrderLabelsRequest(56L, new HashSet<>());
        String uri = UriTemplate.of("/reports/documents/labels/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@49f5758f");
        request.getParameters()
            .add("format", String.valueOf(PageFormatType.fromValue("A7"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generatePricesReport() method
     *
     * The method should: Отчет «Цены на рынке»
     *
     * Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generatePricesReportMethodTest() {
        // given
        GeneratePricesReportRequest generatePricesReportRequest = new GeneratePricesReportRequest();
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generatePricesReport(generatePricesReportRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/prices/generate' to the features of generatePricesReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generatePricesReportClientApiTest() throws IOException {
        // given
        GeneratePricesReportRequest body = new GeneratePricesReportRequest();
        String uri = UriTemplate.of("/reports/prices/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@716661b3");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateShelfsStatisticsReport() method
     *
     * The method should: Отчет по полкам
     *
     * Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateShelfsStatisticsReportMethodTest() {
        // given
        GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest = new GenerateShelfsStatisticsRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3), org.openapitools.model.ShelfsStatisticsAttributionType.fromValue("CLICKS"));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateShelfsStatisticsReport(generateShelfsStatisticsRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/shelf-statistics/generate' to the features of generateShelfsStatisticsReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateShelfsStatisticsReportClientApiTest() throws IOException {
        // given
        GenerateShelfsStatisticsRequest body = new GenerateShelfsStatisticsRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3), org.openapitools.model.ShelfsStatisticsAttributionType.fromValue("CLICKS"));
        String uri = UriTemplate.of("/reports/shelf-statistics/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@2e93e779");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateShipmentListDocumentReport() method
     *
     * The method should: Получение листа сборки
     *
     * Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateShipmentListDocumentReportMethodTest() {
        // given
        GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest = new GenerateShipmentListDocumentReportRequest(56L);

        // when
        GenerateReportResponse result = controller.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/documents/shipment-list/generate' to the features of generateShipmentListDocumentReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateShipmentListDocumentReportClientApiTest() throws IOException {
        // given
        GenerateShipmentListDocumentReportRequest body = new GenerateShipmentListDocumentReportRequest(56L);
        String uri = UriTemplate.of("/reports/documents/shipment-list/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@230ac978");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateShowsSalesReport() method
     *
     * The method should: Отчет «Аналитика продаж»
     *
     * Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateShowsSalesReportMethodTest() {
        // given
        GenerateShowsSalesReportRequest generateShowsSalesReportRequest = new GenerateShowsSalesReportRequest(LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3), org.openapitools.model.ShowsSalesGroupingType.fromValue("CATEGORIES"));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateShowsSalesReport(generateShowsSalesReportRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/shows-sales/generate' to the features of generateShowsSalesReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateShowsSalesReportClientApiTest() throws IOException {
        // given
        GenerateShowsSalesReportRequest body = new GenerateShowsSalesReportRequest(LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3), org.openapitools.model.ShowsSalesGroupingType.fromValue("CATEGORIES"));
        String uri = UriTemplate.of("/reports/shows-sales/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@61a35f53");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateStocksOnWarehousesReport() method
     *
     * The method should: Отчет по остаткам на складах
     *
     * Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateStocksOnWarehousesReportMethodTest() {
        // given
        GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest = new GenerateStocksOnWarehousesReportRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/stocks-on-warehouses/generate' to the features of generateStocksOnWarehousesReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateStocksOnWarehousesReportClientApiTest() throws IOException {
        // given
        GenerateStocksOnWarehousesReportRequest body = new GenerateStocksOnWarehousesReportRequest(56L);
        String uri = UriTemplate.of("/reports/stocks-on-warehouses/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@50bac431");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateUnitedMarketplaceServicesReport() method
     *
     * The method should: Отчет по стоимости услуг
     *
     * Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;            | |По дате формирования акта    |&#x60;year&#x60; и &#x60;month&#x60;                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateUnitedMarketplaceServicesReportMethodTest() {
        // given
        GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest = new GenerateUnitedMarketplaceServicesReportRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/united-marketplace-services/generate' to the features of generateUnitedMarketplaceServicesReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateUnitedMarketplaceServicesReportClientApiTest() throws IOException {
        // given
        GenerateUnitedMarketplaceServicesReportRequest body = new GenerateUnitedMarketplaceServicesReportRequest(56L);
        String uri = UriTemplate.of("/reports/united-marketplace-services/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@1de8248f");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateUnitedNettingReport() method
     *
     * The method should: Отчет по платежам
     *
     * Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |&#x60;dateFrom&#x60; и &#x60;dateTo&#x60;                  | |О платежном поручении    |&#x60;bankOrderId&#x60; и &#x60;bankOrderDateTime&#x60;    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateUnitedNettingReportMethodTest() {
        // given
        GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest = new GenerateUnitedNettingReportRequest(56L);
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateUnitedNettingReport(generateUnitedNettingReportRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/united-netting/generate' to the features of generateUnitedNettingReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateUnitedNettingReportClientApiTest() throws IOException {
        // given
        GenerateUnitedNettingReportRequest body = new GenerateUnitedNettingReportRequest(56L);
        String uri = UriTemplate.of("/reports/united-netting/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@68dc7f43");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of generateUnitedOrdersReport() method
     *
     * The method should: Отчет по заказам
     *
     * Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \&quot;\&quot; %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void generateUnitedOrdersReportMethodTest() {
        // given
        GenerateUnitedOrdersRequest generateUnitedOrdersRequest = new GenerateUnitedOrdersRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        ReportFormatType _format = ReportFormatType.fromValue("FILE");

        // when
        GenerateReportResponse result = controller.generateUnitedOrdersReport(generateUnitedOrdersRequest, _format).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/united-orders/generate' to the features of generateUnitedOrdersReport() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void generateUnitedOrdersReportClientApiTest() throws IOException {
        // given
        GenerateUnitedOrdersRequest body = new GenerateUnitedOrdersRequest(56L, LocalDate.of(2001, 2, 3), LocalDate.of(2001, 2, 3));
        String uri = UriTemplate.of("/reports/united-orders/generate").expand(new HashMap<>());
        MutableHttpRequest<?> request = HttpRequest.POST(uri, body)
            .accept("[Ljava.lang.String;@137efccc");
        request.getParameters()
            .add("format", String.valueOf(ReportFormatType.fromValue("FILE"))); // The query parameter format should be 

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GenerateReportResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

    /**
     * This test is used to validate the implementation of getReportInfo() method
     *
     * The method should: Получение заданного отчета
     *
     * Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| 
     *
     * TODO fill in the parameters and test return value.
     */
    @Test
    @Disabled("Not Implemented")
    void getReportInfoMethodTest() {
        // given
        String reportId = "example";

        // when
        GetReportInfoResponse result = controller.getReportInfo(reportId).block();

        // then
        Assertions.assertTrue(true);
    }

    /**
     * This test is used to check that the api available to client through
     * '/reports/info/{reportId}' to the features of getReportInfo() works as desired.
     *
     * TODO fill in the request parameters and test response.
     */
    @Test
    @Disabled("Not Implemented")
    void getReportInfoClientApiTest() throws IOException {
        // given
        String uri = UriTemplate.of("/reports/info/{reportId}").expand(new HashMap<String, Object>(){{
            // Fill in the path variables
            put("reportId", "example");
        }});
        MutableHttpRequest<?> request = HttpRequest.GET(uri)
            .accept("[Ljava.lang.String;@156329de");

        // when
        HttpResponse<?> response = client.toBlocking().exchange(request, GetReportInfoResponse.class);

        // then
        Assertions.assertEquals(HttpStatus.OK, response.status());
    }

}
