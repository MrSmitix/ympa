/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.8.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.prokarma.pkmst.controller;

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

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.IOException;

import java.util.List;
/**
 * Provides the info about api methods
 * @author pkmst
 *
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Api(value = "Reports", description = "the Reports API")
public interface ReportsApi {

    @ApiOperation(value = "Отчет по бусту продаж", notes = "Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","fbs","dbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/boost-consolidated/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateBoostConsolidatedReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет «Конкурентная позиция»", notes = "Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","dbs","fbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/competitors-position/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateCompetitorsPositionReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет по отзывам о товарах", notes = "Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","fbs","dbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/goods-feedback/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateGoodsFeedbackReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет по движению товаров", notes = "Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/goods-movement/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateGoodsMovementReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет по реализации", notes = "Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","fbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/goods-realization/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateGoodsRealizationReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет по оборачиваемости", notes = "Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/goods-turnover/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateGoodsTurnoverReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Готовые ярлыки‑наклейки на все коробки в нескольких заказах", notes = "Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fbs","dbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус `RESOURCE_NOT_FOUND`. ", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/documents/labels/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateMassOrderLabelsReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest,@ApiParam(value = "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.", allowableValues = "A7, A4")  @RequestParam(value = "format", required = false) PageFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет «Цены на рынке»", notes = "Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","fbs","dbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/prices/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generatePricesReport(@ApiParam(value = "" ,required=true )   @RequestBody GeneratePricesReportRequest generatePricesReportRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет по полкам", notes = "Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","fbs","dbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/shelf-statistics/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateShelfsStatisticsReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Получение листа сборки", notes = "Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fbs", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/documents/shipment-list/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateShipmentListDocumentReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет «Аналитика продаж»", notes = "Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","dbs","fbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/shows-sales/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateShowsSalesReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateShowsSalesReportRequest generateShowsSalesReportRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет по остаткам на складах", notes = "Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","fbs","dbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/stocks-on-warehouses/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateStocksOnWarehousesReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет по стоимости услуг", notes = "Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","dbs","fbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/united-marketplace-services/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateUnitedMarketplaceServicesReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет по платежам", notes = "Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","dbs","fbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/united-netting/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateUnitedNettingReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Отчет по заказам", notes = "Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","fbs","dbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/reports/united-orders/generate",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<GenerateReportResponse> generateUnitedOrdersReport(@ApiParam(value = "" ,required=true )   @RequestBody GenerateUnitedOrdersRequest generateUnitedOrdersRequest,@ApiParam(value = "Формат отчета.", allowableValues = "FILE, CSV")  @RequestParam(value = "format", required = false) ReportFormatType format, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "Получение заданного отчета", notes = "Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| ", response = GetReportInfoResponse.class, authorizations = {
        @Authorization(value = "OAuth", scopes = {
            @AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров") })
         }, tags={ "reports","fby","dbs","fbs","express", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — `FAILED` или `NO_DATA`, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    ", response = GetReportInfoResponse.class),
        @ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        @ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        @ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        @ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        @ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        @ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/reports/info/{reportId}",
        produces = { "application/json" }
    )
    ResponseEntity<GetReportInfoResponse> getReportInfo(@ApiParam(value = "Идентификатор отчета, который вы получили после запуска генерации. ",required=true ) @PathVariable("reportId") String reportId, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}