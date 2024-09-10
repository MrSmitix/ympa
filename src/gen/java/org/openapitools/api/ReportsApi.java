package org.openapitools.api;

import org.openapitools.model.*;
import org.openapitools.api.ReportsApiService;

import io.swagger.annotations.ApiParam;
import io.swagger.jaxrs.*;

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

import java.util.Map;
import java.util.List;
import org.openapitools.api.NotFoundException;

import java.io.InputStream;

import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.inject.Inject;

import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/reports")


@io.swagger.annotations.Api(description = "the reports API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ReportsApi  {

    @Inject ReportsApiService service;

    @POST
    @Path("/boost-consolidated/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет по бусту продаж", notes = "Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateBoostConsolidatedReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateBoostConsolidatedRequest generateBoostConsolidatedRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateBoostConsolidatedReport(generateBoostConsolidatedRequest,format,securityContext);
    }
    @POST
    @Path("/competitors-position/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет «Конкурентная позиция»", notes = "Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  {% note info \"Значение -1 в отчете\" %}  Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.  {% endnote %}  |**⚙️ Лимит:** 10 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","dbs","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateCompetitorsPositionReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateCompetitorsPositionReportRequest generateCompetitorsPositionReportRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateCompetitorsPositionReport(generateCompetitorsPositionReportRequest,format,securityContext);
    }
    @POST
    @Path("/goods-feedback/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет по отзывам о товарах", notes = "Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateGoodsFeedbackReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateGoodsFeedbackRequest generateGoodsFeedbackRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateGoodsFeedbackReport(generateGoodsFeedbackRequest,format,securityContext);
    }
    @POST
    @Path("/goods-movement/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет по движению товаров", notes = "Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateGoodsMovementReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateGoodsMovementReportRequest generateGoodsMovementReportRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateGoodsMovementReport(generateGoodsMovementReportRequest,format,securityContext);
    }
    @POST
    @Path("/goods-realization/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет по реализации", notes = "Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateGoodsRealizationReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateGoodsRealizationReportRequest generateGoodsRealizationReportRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateGoodsRealizationReport(generateGoodsRealizationReportRequest,format,securityContext);
    }
    @POST
    @Path("/goods-turnover/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет по оборачиваемости", notes = "Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateGoodsTurnoverReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateGoodsTurnoverRequest generateGoodsTurnoverRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateGoodsTurnoverReport(generateGoodsTurnoverRequest,format,securityContext);
    }
    @POST
    @Path("/documents/labels/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Готовые ярлыки‑наклейки на все коробки в нескольких заказах", notes = "Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).  Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 1000 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус `RESOURCE_NOT_FOUND`. ", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateMassOrderLabelsReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest,, allowableValues="A7, A4" @QueryParam("format") PageFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateMassOrderLabelsReport(generateMassOrderLabelsRequest,format,securityContext);
    }
    @POST
    @Path("/prices/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет «Цены на рынке»", notes = "Запускает генерацию **отчета «Цены на рынке»**.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generatePricesReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GeneratePricesReportRequest generatePricesReportRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generatePricesReport(generatePricesReportRequest,format,securityContext);
    }
    @POST
    @Path("/shelf-statistics/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет по полкам", notes = "Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateShelfsStatisticsReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateShelfsStatisticsRequest generateShelfsStatisticsRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateShelfsStatisticsReport(generateShelfsStatisticsRequest,format,securityContext);
    }
    @POST
    @Path("/documents/shipment-list/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Получение листа сборки", notes = "Запускает генерацию **листа сборки** для отгрузки.  Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fbs", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateShipmentListDocumentReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateShipmentListDocumentReportRequest generateShipmentListDocumentReportRequest,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateShipmentListDocumentReport(generateShipmentListDocumentReportRequest,securityContext);
    }
    @POST
    @Path("/shows-sales/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет «Аналитика продаж»", notes = "Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 10 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","dbs","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateShowsSalesReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateShowsSalesReportRequest generateShowsSalesReportRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateShowsSalesReport(generateShowsSalesReportRequest,format,securityContext);
    }
    @POST
    @Path("/stocks-on-warehouses/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет по остаткам на складах", notes = "Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:  * Для модели FBY — об остатках на складах Маркета. * Для остальных моделей — об остатках на соответствующем складе магазина.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateStocksOnWarehousesReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateStocksOnWarehousesReportRequest generateStocksOnWarehousesReportRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateStocksOnWarehousesReport(generateStocksOnWarehousesReportRequest,format,securityContext);
    }
    @POST
    @Path("/united-marketplace-services/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет по стоимости услуг", notes = "Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**               |**Какие поля нужны**             | |-----------------------------|---------------------------------| |По дате начисления услуги    |`dateFrom` и `dateTo`            | |По дате формирования акта    |`year` и `month`                 |  Заказать отчеты обоих типов одним запросом нельзя.  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","dbs","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateUnitedMarketplaceServicesReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateUnitedMarketplaceServicesReportRequest generateUnitedMarketplaceServicesReportRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateUnitedMarketplaceServicesReport(generateUnitedMarketplaceServicesReportRequest,format,securityContext);
    }
    @POST
    @Path("/united-netting/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет по платежам", notes = "Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  Тип отчета зависит от того, какие поля заполнены в запросе:  |**Тип отчета**           |**Какие поля нужны**                   | |-------------------------|---------------------------------------| |О платежах за период     |`dateFrom` и `dateTo`                  | |О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |  Заказать отчеты обоих типов одним запросом нельзя.  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","dbs","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateUnitedNettingReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateUnitedNettingReportRequest generateUnitedNettingReportRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateUnitedNettingReport(generateUnitedNettingReportRequest,format,securityContext);
    }
    @POST
    @Path("/united-orders/generate")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Отчет по заказам", notes = "Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)  {% note info \"\" %}  Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)  {% endnote %}  Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).  |**⚙️ Лимит:** 100 запросов в час| |-| ", response = GenerateReportResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","fbs","dbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", response = GenerateReportResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response generateUnitedOrdersReport(@ApiParam(value = "" ,required=true) @NotNull @Valid GenerateUnitedOrdersRequest generateUnitedOrdersRequest,, allowableValues="FILE, CSV" @QueryParam("format") ReportFormatType format,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.generateUnitedOrdersReport(generateUnitedOrdersRequest,format,securityContext);
    }
    @GET
    @Path("/info/{reportId}")
    
    @Produces({ "application/json" })
    @io.swagger.annotations.ApiOperation(value = "Получение заданного отчета", notes = "Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.  Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)  |**⚙️ Лимит:** 100 запросов в минуту| |-| ", response = GetReportInfoResponse.class, authorizations = {
        @io.swagger.annotations.Authorization(value = "OAuth", scopes = {
            @io.swagger.annotations.AuthorizationScope(scope = "market:partner-api", description = "API Яндекс.Маркета / Поиска по товарам для партнеров")
        })
    }, tags={ "reports","fby","dbs","fbs","express", })
    @io.swagger.annotations.ApiResponses(value = { 
        @io.swagger.annotations.ApiResponse(code = 200, message = "Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — `FAILED` или `NO_DATA`, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    ", response = GetReportInfoResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 400, message = "Запрос содержит неправильные данные.", response = ApiClientDataErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 401, message = "В запросе не указаны данные для авторизации.", response = ApiUnauthorizedErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 403, message = "Данные для авторизации неверны или доступ к ресурсу запрещен.", response = ApiForbiddenErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 404, message = "Запрашиваемый ресурс не найден.", response = ApiNotFoundErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 420, message = "Превышено ограничение на доступ к ресурсу.", response = ApiLimitErrorResponse.class),
        
        @io.swagger.annotations.ApiResponse(code = 500, message = "Внутренняя ошибка сервера.", response = ApiServerErrorResponse.class) })
    public Response getReportInfo( @PathParam("reportId") String reportId,@Context SecurityContext securityContext)
    throws NotFoundException {
        return service.getReportInfo(reportId,securityContext);
    }
}
