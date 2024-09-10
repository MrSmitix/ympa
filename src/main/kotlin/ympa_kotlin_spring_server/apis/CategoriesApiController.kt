package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.GetCategoriesMaxSaleQuantumRequest
import ympa_kotlin_spring_server.models.GetCategoriesMaxSaleQuantumResponse
import ympa_kotlin_spring_server.models.GetCategoriesRequest
import ympa_kotlin_spring_server.models.GetCategoriesResponse
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
class CategoriesApiController() {

    @Operation(
        summary = "Лимит на установку кванта продажи и минимального количества товаров в заказе",
        operationId = "getCategoriesMaxSaleQuantum",
        description = """Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.

Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.

Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Лимит на установку кванта и минимального количества товаров.", content = [Content(schema = Schema(implementation = GetCategoriesMaxSaleQuantumResponse::class))]),
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
        value = ["/categories/max-sale-quantum"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCategoriesMaxSaleQuantum(@Parameter(description = "", required = true) @Valid @RequestBody getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): ResponseEntity<GetCategoriesMaxSaleQuantumResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Лимит на установку кванта продажи и минимального количества товаров в заказе",
        operationId = "getCategoriesMaxSaleQuantum",
        description = """Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.

Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.

Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Лимит на установку кванта и минимального количества товаров.", content = [Content(schema = Schema(implementation = GetCategoriesMaxSaleQuantumResponse::class))]),
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
        value = ["/categories/max-sale-quantum"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCategoriesMaxSaleQuantum(@Parameter(description = "", required = true) @Valid @RequestBody getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): ResponseEntity<GetCategoriesMaxSaleQuantumResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Лимит на установку кванта продажи и минимального количества товаров в заказе",
        operationId = "getCategoriesMaxSaleQuantum",
        description = """Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.

Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.

Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Лимит на установку кванта и минимального количества товаров.", content = [Content(schema = Schema(implementation = GetCategoriesMaxSaleQuantumResponse::class))]),
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
        value = ["/categories/max-sale-quantum"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCategoriesMaxSaleQuantum(@Parameter(description = "", required = true) @Valid @RequestBody getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): ResponseEntity<GetCategoriesMaxSaleQuantumResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Лимит на установку кванта продажи и минимального количества товаров в заказе",
        operationId = "getCategoriesMaxSaleQuantum",
        description = """Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.

Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.

Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Лимит на установку кванта и минимального количества товаров.", content = [Content(schema = Schema(implementation = GetCategoriesMaxSaleQuantumResponse::class))]),
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
        value = ["/categories/max-sale-quantum"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCategoriesMaxSaleQuantum(@Parameter(description = "", required = true) @Valid @RequestBody getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): ResponseEntity<GetCategoriesMaxSaleQuantumResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Лимит на установку кванта продажи и минимального количества товаров в заказе",
        operationId = "getCategoriesMaxSaleQuantum",
        description = """Возвращает лимит на установку [кванта](*quantum) и минимального количества товаров в заказе, которые вы можете задать для товаров указанных категорий.

Если вы передадите значение кванта или минимального количества товаров выше установленного Маркетом ограничения, товар будет скрыт с витрины.

Подробнее о том, как продавать товары по несколько штук, читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/assortment/fields/quantum).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Лимит на установку кванта и минимального количества товаров.", content = [Content(schema = Schema(implementation = GetCategoriesMaxSaleQuantumResponse::class))]),
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
        value = ["/categories/max-sale-quantum"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCategoriesMaxSaleQuantum(@Parameter(description = "", required = true) @Valid @RequestBody getCategoriesMaxSaleQuantumRequest: GetCategoriesMaxSaleQuantumRequest): ResponseEntity<GetCategoriesMaxSaleQuantumResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Дерево категорий",
        operationId = "getCategoriesTree",
        description = """Возвращает дерево категорий Маркета.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Категории Маркета.", content = [Content(schema = Schema(implementation = GetCategoriesResponse::class))]),
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
        value = ["/categories/tree"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCategoriesTree(@Parameter(description = "") @Valid @RequestBody(required = false) getCategoriesRequest: GetCategoriesRequest?): ResponseEntity<GetCategoriesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Дерево категорий",
        operationId = "getCategoriesTree",
        description = """Возвращает дерево категорий Маркета.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Категории Маркета.", content = [Content(schema = Schema(implementation = GetCategoriesResponse::class))]),
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
        value = ["/categories/tree"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCategoriesTree(@Parameter(description = "") @Valid @RequestBody(required = false) getCategoriesRequest: GetCategoriesRequest?): ResponseEntity<GetCategoriesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Дерево категорий",
        operationId = "getCategoriesTree",
        description = """Возвращает дерево категорий Маркета.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Категории Маркета.", content = [Content(schema = Schema(implementation = GetCategoriesResponse::class))]),
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
        value = ["/categories/tree"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCategoriesTree(@Parameter(description = "") @Valid @RequestBody(required = false) getCategoriesRequest: GetCategoriesRequest?): ResponseEntity<GetCategoriesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Дерево категорий",
        operationId = "getCategoriesTree",
        description = """Возвращает дерево категорий Маркета.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Категории Маркета.", content = [Content(schema = Schema(implementation = GetCategoriesResponse::class))]),
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
        value = ["/categories/tree"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCategoriesTree(@Parameter(description = "") @Valid @RequestBody(required = false) getCategoriesRequest: GetCategoriesRequest?): ResponseEntity<GetCategoriesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Дерево категорий",
        operationId = "getCategoriesTree",
        description = """Возвращает дерево категорий Маркета.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Категории Маркета.", content = [Content(schema = Schema(implementation = GetCategoriesResponse::class))]),
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
        value = ["/categories/tree"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getCategoriesTree(@Parameter(description = "") @Valid @RequestBody(required = false) getCategoriesRequest: GetCategoriesRequest?): ResponseEntity<GetCategoriesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
