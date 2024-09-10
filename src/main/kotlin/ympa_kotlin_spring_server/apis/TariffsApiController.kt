package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.CalculateTariffsRequest
import ympa_kotlin_spring_server.models.CalculateTariffsResponse
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
class TariffsApiController() {

    @Operation(
        summary = "Калькулятор стоимости услуг",
        operationId = "calculateTariffs",
        description = """Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,
для какого товара рассчитана стоимость услуги.

Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.

В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Стоимость услуг.", content = [Content(schema = Schema(implementation = CalculateTariffsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/tariffs/calculate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun calculateTariffs(@Parameter(description = "", required = true) @Valid @RequestBody calculateTariffsRequest: CalculateTariffsRequest): ResponseEntity<CalculateTariffsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Калькулятор стоимости услуг",
        operationId = "calculateTariffs",
        description = """Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,
для какого товара рассчитана стоимость услуги.

Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.

В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Стоимость услуг.", content = [Content(schema = Schema(implementation = CalculateTariffsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/tariffs/calculate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun calculateTariffs(@Parameter(description = "", required = true) @Valid @RequestBody calculateTariffsRequest: CalculateTariffsRequest): ResponseEntity<CalculateTariffsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Калькулятор стоимости услуг",
        operationId = "calculateTariffs",
        description = """Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,
для какого товара рассчитана стоимость услуги.

Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.

В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Стоимость услуг.", content = [Content(schema = Schema(implementation = CalculateTariffsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/tariffs/calculate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun calculateTariffs(@Parameter(description = "", required = true) @Valid @RequestBody calculateTariffsRequest: CalculateTariffsRequest): ResponseEntity<CalculateTariffsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Калькулятор стоимости услуг",
        operationId = "calculateTariffs",
        description = """Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,
для какого товара рассчитана стоимость услуги.

Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.

В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Стоимость услуг.", content = [Content(schema = Schema(implementation = CalculateTariffsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/tariffs/calculate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun calculateTariffs(@Parameter(description = "", required = true) @Valid @RequestBody calculateTariffsRequest: CalculateTariffsRequest): ResponseEntity<CalculateTariffsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Калькулятор стоимости услуг",
        operationId = "calculateTariffs",
        description = """Рассчитывает стоимость услуг Маркета для товаров с заданными параметрами. Порядок товаров в запросе и ответе сохраняется, чтобы определить,
для какого товара рассчитана стоимость услуги.

Обратите внимание: калькулятор осуществляет примерные расчеты. Финальная стоимость для каждого заказа зависит от предоставленных услуг.

В запросе можно указать либо параметр `campaignId`, либо `sellingProgram`. Совместное использование параметров приведет к ошибке.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Стоимость услуг.", content = [Content(schema = Schema(implementation = CalculateTariffsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/tariffs/calculate"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun calculateTariffs(@Parameter(description = "", required = true) @Valid @RequestBody calculateTariffsRequest: CalculateTariffsRequest): ResponseEntity<CalculateTariffsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
