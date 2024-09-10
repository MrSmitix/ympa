package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.GenerateBoostConsolidatedRequest
import ympa_kotlin_spring_server.models.GenerateCompetitorsPositionReportRequest
import ympa_kotlin_spring_server.models.GenerateGoodsFeedbackRequest
import ympa_kotlin_spring_server.models.GenerateGoodsMovementReportRequest
import ympa_kotlin_spring_server.models.GenerateGoodsRealizationReportRequest
import ympa_kotlin_spring_server.models.GenerateGoodsTurnoverRequest
import ympa_kotlin_spring_server.models.GenerateMassOrderLabelsRequest
import ympa_kotlin_spring_server.models.GeneratePricesReportRequest
import ympa_kotlin_spring_server.models.GenerateReportResponse
import ympa_kotlin_spring_server.models.GenerateShelfsStatisticsRequest
import ympa_kotlin_spring_server.models.GenerateShipmentListDocumentReportRequest
import ympa_kotlin_spring_server.models.GenerateShowsSalesReportRequest
import ympa_kotlin_spring_server.models.GenerateStocksOnWarehousesReportRequest
import ympa_kotlin_spring_server.models.GenerateUnitedMarketplaceServicesReportRequest
import ympa_kotlin_spring_server.models.GenerateUnitedNettingReportRequest
import ympa_kotlin_spring_server.models.GenerateUnitedOrdersRequest
import ympa_kotlin_spring_server.models.GetReportInfoResponse
import ympa_kotlin_spring_server.models.PageFormatType
import ympa_kotlin_spring_server.models.ReportFormatType
import io.swagger.v3.oas.annotations.*
import io.swagger.v3.oas.annotations.enums.*
import io.swagger.v3.oas.annotations.media.*
import io.swagger.v3.oas.annotations.responses.*
import io.swagger.v3.oas.annotations.security.*
import org.springframework.http.HttpStatus
import org.springframework.http.MediaType
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.validation.annotation.Validated
import org.springframework.web.context.request.NativeWebRequest
import org.springframework.beans.factory.annotation.Autowired

import javax.validation.Valid
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

import kotlin.collections.List
import kotlin.collections.Map

@RestController
@Validated
@RequestMapping("\${api.base-path:}")
class ReportsApiController() {

    @Operation(
        summary = "Отчет по бусту продаж",
        operationId = "generateBoostConsolidatedReport",
        description = """Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/boost-consolidated/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateBoostConsolidatedReport(@Parameter(description = "", required = true) @Valid @RequestBody generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по бусту продаж",
        operationId = "generateBoostConsolidatedReport",
        description = """Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/boost-consolidated/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateBoostConsolidatedReport(@Parameter(description = "", required = true) @Valid @RequestBody generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по бусту продаж",
        operationId = "generateBoostConsolidatedReport",
        description = """Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/boost-consolidated/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateBoostConsolidatedReport(@Parameter(description = "", required = true) @Valid @RequestBody generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по бусту продаж",
        operationId = "generateBoostConsolidatedReport",
        description = """Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/boost-consolidated/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateBoostConsolidatedReport(@Parameter(description = "", required = true) @Valid @RequestBody generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по бусту продаж",
        operationId = "generateBoostConsolidatedReport",
        description = """Запускает генерацию **сводного отчета по бусту продаж** за заданный период. Отчет содержит информацию по всем кампаниям, созданным и через API, и в кабинете.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/boost-consolidated/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateBoostConsolidatedReport(@Parameter(description = "", required = true) @Valid @RequestBody generateBoostConsolidatedRequest: GenerateBoostConsolidatedRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Конкурентная позиция»",
        operationId = "generateCompetitorsPositionReport",
        description = """Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

{% note info "Значение -1 в отчете" %}

Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.

{% endnote %}

|**⚙️ Лимит:** 10 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/competitors-position/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateCompetitorsPositionReport(@Parameter(description = "", required = true) @Valid @RequestBody generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Конкурентная позиция»",
        operationId = "generateCompetitorsPositionReport",
        description = """Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

{% note info "Значение -1 в отчете" %}

Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.

{% endnote %}

|**⚙️ Лимит:** 10 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/competitors-position/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateCompetitorsPositionReport(@Parameter(description = "", required = true) @Valid @RequestBody generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Конкурентная позиция»",
        operationId = "generateCompetitorsPositionReport",
        description = """Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

{% note info "Значение -1 в отчете" %}

Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.

{% endnote %}

|**⚙️ Лимит:** 10 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/competitors-position/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateCompetitorsPositionReport(@Parameter(description = "", required = true) @Valid @RequestBody generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Конкурентная позиция»",
        operationId = "generateCompetitorsPositionReport",
        description = """Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

{% note info "Значение -1 в отчете" %}

Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.

{% endnote %}

|**⚙️ Лимит:** 10 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/competitors-position/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateCompetitorsPositionReport(@Parameter(description = "", required = true) @Valid @RequestBody generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Конкурентная позиция»",
        operationId = "generateCompetitorsPositionReport",
        description = """Запускает генерацию **отчета «Конкурентная позиция»** за заданный период. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/analytics/competitors.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

{% note info "Значение -1 в отчете" %}

Если в CSV-файле в столбце **POSITION** стоит -1, в этот день не было заказов с товарами в указанной категории.

{% endnote %}

|**⚙️ Лимит:** 10 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/competitors-position/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateCompetitorsPositionReport(@Parameter(description = "", required = true) @Valid @RequestBody generateCompetitorsPositionReportRequest: GenerateCompetitorsPositionReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по отзывам о товарах",
        operationId = "generateGoodsFeedbackReport",
        description = """Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-feedback/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsFeedbackReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по отзывам о товарах",
        operationId = "generateGoodsFeedbackReport",
        description = """Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-feedback/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsFeedbackReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по отзывам о товарах",
        operationId = "generateGoodsFeedbackReport",
        description = """Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-feedback/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsFeedbackReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по отзывам о товарах",
        operationId = "generateGoodsFeedbackReport",
        description = """Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-feedback/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsFeedbackReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по отзывам о товарах",
        operationId = "generateGoodsFeedbackReport",
        description = """Запускает генерацию **отчета по отзывам о товарах**. [Что это за отчет](https://yandex.ru/support2/marketplace/ru/marketing/plus-reviews#stat)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-feedback/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsFeedbackReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsFeedbackRequest: GenerateGoodsFeedbackRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по движению товаров",
        operationId = "generateGoodsMovementReport",
        description = """Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-movement/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsMovementReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsMovementReportRequest: GenerateGoodsMovementReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по движению товаров",
        operationId = "generateGoodsMovementReport",
        description = """Запускает генерацию **отчета по движению товаров**. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#flow)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-movement/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsMovementReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsMovementReportRequest: GenerateGoodsMovementReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по реализации",
        operationId = "generateGoodsRealizationReport",
        description = """Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-realization/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsRealizationReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по реализации",
        operationId = "generateGoodsRealizationReport",
        description = """Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-realization/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsRealizationReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по реализации",
        operationId = "generateGoodsRealizationReport",
        description = """Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-realization/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsRealizationReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по реализации",
        operationId = "generateGoodsRealizationReport",
        description = """Запускает генерацию **отчета по реализации** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports-fby-fbs.html#sales-report)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-realization/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsRealizationReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsRealizationReportRequest: GenerateGoodsRealizationReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по оборачиваемости",
        operationId = "generateGoodsTurnoverReport",
        description = """Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-turnover/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsTurnoverReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsTurnoverRequest: GenerateGoodsTurnoverRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по оборачиваемости",
        operationId = "generateGoodsTurnoverReport",
        description = """Запускает генерацию **отчета по оборачиваемости** за заданную дату.  [Что это за отчет](https://yandex.ru/support/marketplace/analytics/turnover.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/goods-turnover/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateGoodsTurnoverReport(@Parameter(description = "", required = true) @Valid @RequestBody generateGoodsTurnoverRequest: GenerateGoodsTurnoverRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Готовые ярлыки‑наклейки на все коробки в нескольких заказах",
        operationId = "generateMassOrderLabelsReport",
        description = """Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус `RESOURCE_NOT_FOUND`. ", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/documents/labels/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateMassOrderLabelsReport(@Parameter(description = "", required = true) @Valid @RequestBody generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest,@Parameter(description = "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.", schema = Schema(allowableValues = ["A7", "A4"])) @Valid @RequestParam(value = "format", required = false) format: PageFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Готовые ярлыки‑наклейки на все коробки в нескольких заказах",
        operationId = "generateMassOrderLabelsReport",
        description = """Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус `RESOURCE_NOT_FOUND`. ", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/documents/labels/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateMassOrderLabelsReport(@Parameter(description = "", required = true) @Valid @RequestBody generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest,@Parameter(description = "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.", schema = Schema(allowableValues = ["A7", "A4"])) @Valid @RequestParam(value = "format", required = false) format: PageFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Готовые ярлыки‑наклейки на все коробки в нескольких заказах",
        operationId = "generateMassOrderLabelsReport",
        description = """Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус `RESOURCE_NOT_FOUND`. ", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/documents/labels/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateMassOrderLabelsReport(@Parameter(description = "", required = true) @Valid @RequestBody generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest,@Parameter(description = "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.", schema = Schema(allowableValues = ["A7", "A4"])) @Valid @RequestParam(value = "format", required = false) format: PageFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Готовые ярлыки‑наклейки на все коробки в нескольких заказах",
        operationId = "generateMassOrderLabelsReport",
        description = """Запускает генерацию PDF-файла с ярлыками для переданных заказов. Подробно о том, зачем они нужны и как выглядят, рассказано [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/orders/fbs/packaging/marking.html).

Узнать статус генерации и получить ссылку на готовый файл можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый файл.  Если при генерации не удалось найти часть заказов, в ответе на запрос получения готового файла вернется подстатус `RESOURCE_NOT_FOUND`. ", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/documents/labels/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateMassOrderLabelsReport(@Parameter(description = "", required = true) @Valid @RequestBody generateMassOrderLabelsRequest: GenerateMassOrderLabelsRequest,@Parameter(description = "Настройка размещения ярлыков на странице. Если параметра нет, возвращается PDF с ярлыками формата A7.", schema = Schema(allowableValues = ["A7", "A4"])) @Valid @RequestParam(value = "format", required = false) format: PageFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Цены на рынке»",
        operationId = "generatePricesReport",
        description = """Запускает генерацию **отчета «Цены на рынке»**.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/prices/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generatePricesReport(@Parameter(description = "", required = true) @Valid @RequestBody generatePricesReportRequest: GeneratePricesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Цены на рынке»",
        operationId = "generatePricesReport",
        description = """Запускает генерацию **отчета «Цены на рынке»**.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/prices/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generatePricesReport(@Parameter(description = "", required = true) @Valid @RequestBody generatePricesReportRequest: GeneratePricesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Цены на рынке»",
        operationId = "generatePricesReport",
        description = """Запускает генерацию **отчета «Цены на рынке»**.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/prices/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generatePricesReport(@Parameter(description = "", required = true) @Valid @RequestBody generatePricesReportRequest: GeneratePricesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Цены на рынке»",
        operationId = "generatePricesReport",
        description = """Запускает генерацию **отчета «Цены на рынке»**.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/prices/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generatePricesReport(@Parameter(description = "", required = true) @Valid @RequestBody generatePricesReportRequest: GeneratePricesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Цены на рынке»",
        operationId = "generatePricesReport",
        description = """Запускает генерацию **отчета «Цены на рынке»**.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/prices/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generatePricesReport(@Parameter(description = "", required = true) @Valid @RequestBody generatePricesReportRequest: GeneratePricesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по полкам",
        operationId = "generateShelfsStatisticsReport",
        description = """Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/shelf-statistics/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShelfsStatisticsReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по полкам",
        operationId = "generateShelfsStatisticsReport",
        description = """Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/shelf-statistics/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShelfsStatisticsReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по полкам",
        operationId = "generateShelfsStatisticsReport",
        description = """Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/shelf-statistics/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShelfsStatisticsReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по полкам",
        operationId = "generateShelfsStatisticsReport",
        description = """Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/shelf-statistics/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShelfsStatisticsReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по полкам",
        operationId = "generateShelfsStatisticsReport",
        description = """Запускает генерацию **сводного отчета по полкам** — рекламным блокам с баннером или видео и набором товаров. Подробнее о них читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/marketing/shelf).

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/shelf-statistics/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShelfsStatisticsReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShelfsStatisticsRequest: GenerateShelfsStatisticsRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение листа сборки",
        operationId = "generateShipmentListDocumentReport",
        description = """Запускает генерацию **листа сборки** для отгрузки.

Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/documents/shipment-list/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShipmentListDocumentReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShipmentListDocumentReportRequest: GenerateShipmentListDocumentReportRequest): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение листа сборки",
        operationId = "generateShipmentListDocumentReport",
        description = """Запускает генерацию **листа сборки** для отгрузки.

Узнать статус генерации и получить ссылку на готовый документ можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый документ.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/documents/shipment-list/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShipmentListDocumentReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShipmentListDocumentReportRequest: GenerateShipmentListDocumentReportRequest): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Аналитика продаж»",
        operationId = "generateShowsSalesReport",
        description = """Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 10 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/shows-sales/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShowsSalesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShowsSalesReportRequest: GenerateShowsSalesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Аналитика продаж»",
        operationId = "generateShowsSalesReport",
        description = """Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 10 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/shows-sales/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShowsSalesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShowsSalesReportRequest: GenerateShowsSalesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Аналитика продаж»",
        operationId = "generateShowsSalesReport",
        description = """Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 10 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/shows-sales/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShowsSalesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShowsSalesReportRequest: GenerateShowsSalesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Аналитика продаж»",
        operationId = "generateShowsSalesReport",
        description = """Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 10 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/shows-sales/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShowsSalesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShowsSalesReportRequest: GenerateShowsSalesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет «Аналитика продаж»",
        operationId = "generateShowsSalesReport",
        description = """Запускает генерацию **отчета «Аналитика продаж»** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/shows-sales.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 10 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/shows-sales/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateShowsSalesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateShowsSalesReportRequest: GenerateShowsSalesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по остаткам на складах",
        operationId = "generateStocksOnWarehousesReport",
        description = """Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:

* Для модели FBY — об остатках на складах Маркета.
* Для остальных моделей — об остатках на соответствующем складе магазина.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/stocks-on-warehouses/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateStocksOnWarehousesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по остаткам на складах",
        operationId = "generateStocksOnWarehousesReport",
        description = """Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:

* Для модели FBY — об остатках на складах Маркета.
* Для остальных моделей — об остатках на соответствующем складе магазина.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/stocks-on-warehouses/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateStocksOnWarehousesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по остаткам на складах",
        operationId = "generateStocksOnWarehousesReport",
        description = """Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:

* Для модели FBY — об остатках на складах Маркета.
* Для остальных моделей — об остатках на соответствующем складе магазина.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/stocks-on-warehouses/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateStocksOnWarehousesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по остаткам на складах",
        operationId = "generateStocksOnWarehousesReport",
        description = """Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:

* Для модели FBY — об остатках на складах Маркета.
* Для остальных моделей — об остатках на соответствующем складе магазина.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/stocks-on-warehouses/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateStocksOnWarehousesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по остаткам на складах",
        operationId = "generateStocksOnWarehousesReport",
        description = """Запускает генерацию **отчета по остаткам на складах**. Отчет содержит данные:

* Для модели FBY — об остатках на складах Маркета.
* Для остальных моделей — об остатках на соответствующем складе магазина.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/stocks-on-warehouses/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateStocksOnWarehousesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateStocksOnWarehousesReportRequest: GenerateStocksOnWarehousesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по стоимости услуг",
        operationId = "generateUnitedMarketplaceServicesReport",
        description = """Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**               |**Какие поля нужны**             |
|-----------------------------|---------------------------------|
|По дате начисления услуги    |`dateFrom` и `dateTo`            |
|По дате формирования акта    |`year` и `month`                 |

Заказать отчеты обоих типов одним запросом нельзя.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-marketplace-services/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedMarketplaceServicesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по стоимости услуг",
        operationId = "generateUnitedMarketplaceServicesReport",
        description = """Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**               |**Какие поля нужны**             |
|-----------------------------|---------------------------------|
|По дате начисления услуги    |`dateFrom` и `dateTo`            |
|По дате формирования акта    |`year` и `month`                 |

Заказать отчеты обоих типов одним запросом нельзя.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-marketplace-services/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedMarketplaceServicesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по стоимости услуг",
        operationId = "generateUnitedMarketplaceServicesReport",
        description = """Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**               |**Какие поля нужны**             |
|-----------------------------|---------------------------------|
|По дате начисления услуги    |`dateFrom` и `dateTo`            |
|По дате формирования акта    |`year` и `month`                 |

Заказать отчеты обоих типов одним запросом нельзя.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-marketplace-services/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedMarketplaceServicesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по стоимости услуг",
        operationId = "generateUnitedMarketplaceServicesReport",
        description = """Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**               |**Какие поля нужны**             |
|-----------------------------|---------------------------------|
|По дате начисления услуги    |`dateFrom` и `dateTo`            |
|По дате формирования акта    |`year` и `month`                 |

Заказать отчеты обоих типов одним запросом нельзя.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-marketplace-services/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedMarketplaceServicesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по стоимости услуг",
        operationId = "generateUnitedMarketplaceServicesReport",
        description = """Запускает генерацию **отчета по стоимости услуг** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/reports.html)

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**               |**Какие поля нужны**             |
|-----------------------------|---------------------------------|
|По дате начисления услуги    |`dateFrom` и `dateTo`            |
|По дате формирования акта    |`year` и `month`                 |

Заказать отчеты обоих типов одним запросом нельзя.

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-marketplace-services/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedMarketplaceServicesReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedMarketplaceServicesReportRequest: GenerateUnitedMarketplaceServicesReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по платежам",
        operationId = "generateUnitedNettingReport",
        description = """Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**           |**Какие поля нужны**                   |
|-------------------------|---------------------------------------|
|О платежах за период     |`dateFrom` и `dateTo`                  |
|О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |

Заказать отчеты обоих типов одним запросом нельзя.

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-netting/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedNettingReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по платежам",
        operationId = "generateUnitedNettingReport",
        description = """Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**           |**Какие поля нужны**                   |
|-------------------------|---------------------------------------|
|О платежах за период     |`dateFrom` и `dateTo`                  |
|О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |

Заказать отчеты обоих типов одним запросом нельзя.

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-netting/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedNettingReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по платежам",
        operationId = "generateUnitedNettingReport",
        description = """Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**           |**Какие поля нужны**                   |
|-------------------------|---------------------------------------|
|О платежах за период     |`dateFrom` и `dateTo`                  |
|О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |

Заказать отчеты обоих типов одним запросом нельзя.

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-netting/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedNettingReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по платежам",
        operationId = "generateUnitedNettingReport",
        description = """Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**           |**Какие поля нужны**                   |
|-------------------------|---------------------------------------|
|О платежах за период     |`dateFrom` и `dateTo`                  |
|О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |

Заказать отчеты обоих типов одним запросом нельзя.

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-netting/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedNettingReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по платежам",
        operationId = "generateUnitedNettingReport",
        description = """Запускает генерацию **отчета по платежам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/transactions.html)

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

Тип отчета зависит от того, какие поля заполнены в запросе:

|**Тип отчета**           |**Какие поля нужны**                   |
|-------------------------|---------------------------------------|
|О платежах за период     |`dateFrom` и `dateTo`                  |
|О платежном поручении    |`bankOrderId` и `bankOrderDateTime`    |

Заказать отчеты обоих типов одним запросом нельзя.

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-netting/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedNettingReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedNettingReportRequest: GenerateUnitedNettingReportRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по заказам",
        operationId = "generateUnitedOrdersReport",
        description = """Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)

{% note info "" %}

Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)

{% endnote %}

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-orders/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedOrdersReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedOrdersRequest: GenerateUnitedOrdersRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по заказам",
        operationId = "generateUnitedOrdersReport",
        description = """Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)

{% note info "" %}

Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)

{% endnote %}

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-orders/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedOrdersReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedOrdersRequest: GenerateUnitedOrdersRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по заказам",
        operationId = "generateUnitedOrdersReport",
        description = """Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)

{% note info "" %}

Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)

{% endnote %}

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-orders/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedOrdersReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedOrdersRequest: GenerateUnitedOrdersRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по заказам",
        operationId = "generateUnitedOrdersReport",
        description = """Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)

{% note info "" %}

Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)

{% endnote %}

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-orders/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedOrdersReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedOrdersRequest: GenerateUnitedOrdersRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отчет по заказам",
        operationId = "generateUnitedOrdersReport",
        description = """Запускает генерацию **отчета по заказам** за заданный период. [Что это за отчет](https://yandex.ru/support/marketplace/analytics/orders.html)

{% note info "" %}

Это новый отчет. Раньше мы так называли генерацию детальной информации по заказам. [Как получить детальную информацию по заказам](../../reference/stats/getOrdersStats.md)

{% endnote %}

Узнать статус генерации и получить ссылку на готовый отчет можно с помощью запроса [GET reports/info/{reportId}](../../reference/reports/getReportInfo.md).

|**⚙️ Лимит:** 100 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "В ответ приходит идентификатор, который позволяет узнавать статус генерации и скачать готовый отчет.", content = [Content(schema = Schema(implementation = GenerateReportResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/reports/united-orders/generate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun generateUnitedOrdersReport(@Parameter(description = "", required = true) @Valid @RequestBody generateUnitedOrdersRequest: GenerateUnitedOrdersRequest,@Parameter(description = "Формат отчета.", schema = Schema(allowableValues = ["FILE", "CSV"])) @Valid @RequestParam(value = "format", required = false) format: ReportFormatType?): ResponseEntity<GenerateReportResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение заданного отчета",
        operationId = "getReportInfo",
        description = """Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.

Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — `FAILED` или `NO_DATA`, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    ", content = [Content(schema = Schema(implementation = GetReportInfoResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/reports/info/{reportId}"],
        produces = ["application/json"]
    )
    fun getReportInfo(@Parameter(description = "Идентификатор отчета, который вы получили после запуска генерации. ", required = true) @PathVariable("reportId") reportId: kotlin.String): ResponseEntity<GetReportInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение заданного отчета",
        operationId = "getReportInfo",
        description = """Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.

Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — `FAILED` или `NO_DATA`, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    ", content = [Content(schema = Schema(implementation = GetReportInfoResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/reports/info/{reportId}"],
        produces = ["application/json"]
    )
    fun getReportInfo(@Parameter(description = "Идентификатор отчета, который вы получили после запуска генерации. ", required = true) @PathVariable("reportId") reportId: kotlin.String): ResponseEntity<GetReportInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение заданного отчета",
        operationId = "getReportInfo",
        description = """Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.

Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — `FAILED` или `NO_DATA`, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    ", content = [Content(schema = Schema(implementation = GetReportInfoResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/reports/info/{reportId}"],
        produces = ["application/json"]
    )
    fun getReportInfo(@Parameter(description = "Идентификатор отчета, который вы получили после запуска генерации. ", required = true) @PathVariable("reportId") reportId: kotlin.String): ResponseEntity<GetReportInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение заданного отчета",
        operationId = "getReportInfo",
        description = """Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.

Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — `FAILED` или `NO_DATA`, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    ", content = [Content(schema = Schema(implementation = GetReportInfoResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/reports/info/{reportId}"],
        produces = ["application/json"]
    )
    fun getReportInfo(@Parameter(description = "Идентификатор отчета, который вы получили после запуска генерации. ", required = true) @PathVariable("reportId") reportId: kotlin.String): ResponseEntity<GetReportInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение заданного отчета",
        operationId = "getReportInfo",
        description = """Возвращает статус генерации заданного отчета и, если отчет готов, ссылку для скачивания.

Чтобы воспользоваться этим запросом, вначале нужно запустить генерацию отчета. [Инструкция](../../step-by-step/reports.md)

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Статус генерации отчета и ссылка, если она уже есть.  {% note tip %}  Если статус генерации отчета — `FAILED` или `NO_DATA`, проверьте корректность запроса на генерацию. Например, верно ли указан идентификатор магазина, период или номер платежного поручения.  {% endnote %}    ", content = [Content(schema = Schema(implementation = GetReportInfoResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/reports/info/{reportId}"],
        produces = ["application/json"]
    )
    fun getReportInfo(@Parameter(description = "Идентификатор отчета, который вы получили после запуска генерации. ", required = true) @PathVariable("reportId") reportId: kotlin.String): ResponseEntity<GetReportInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
