package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.GetRegionWithChildrenResponse
import ympa_kotlin_spring_server.models.GetRegionsResponse
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
class RegionsApiController() {

    @Operation(
        summary = "Информация о дочерних регионах",
        operationId = "searchRegionChildren",
        description = """Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Регионы, являющиеся дочерними к указанному в запросе.", content = [Content(schema = Schema(implementation = GetRegionWithChildrenResponse::class))]),
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
        value = ["/regions/{regionId}/children"],
        produces = ["application/json"]
    )
    fun searchRegionChildren(@Parameter(description = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true) @PathVariable("regionId") regionId: kotlin.Long, @Max(10000) @Parameter(description = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "page", required = false, defaultValue = "1") page: kotlin.Int,@Parameter(description = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ") @Valid @RequestParam(value = "pageSize", required = false) pageSize: kotlin.Int?): ResponseEntity<GetRegionWithChildrenResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о дочерних регионах",
        operationId = "searchRegionChildren",
        description = """Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Регионы, являющиеся дочерними к указанному в запросе.", content = [Content(schema = Schema(implementation = GetRegionWithChildrenResponse::class))]),
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
        value = ["/regions/{regionId}/children"],
        produces = ["application/json"]
    )
    fun searchRegionChildren(@Parameter(description = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true) @PathVariable("regionId") regionId: kotlin.Long, @Max(10000) @Parameter(description = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "page", required = false, defaultValue = "1") page: kotlin.Int,@Parameter(description = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ") @Valid @RequestParam(value = "pageSize", required = false) pageSize: kotlin.Int?): ResponseEntity<GetRegionWithChildrenResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о дочерних регионах",
        operationId = "searchRegionChildren",
        description = """Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Регионы, являющиеся дочерними к указанному в запросе.", content = [Content(schema = Schema(implementation = GetRegionWithChildrenResponse::class))]),
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
        value = ["/regions/{regionId}/children"],
        produces = ["application/json"]
    )
    fun searchRegionChildren(@Parameter(description = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true) @PathVariable("regionId") regionId: kotlin.Long, @Max(10000) @Parameter(description = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "page", required = false, defaultValue = "1") page: kotlin.Int,@Parameter(description = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ") @Valid @RequestParam(value = "pageSize", required = false) pageSize: kotlin.Int?): ResponseEntity<GetRegionWithChildrenResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о дочерних регионах",
        operationId = "searchRegionChildren",
        description = """Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Регионы, являющиеся дочерними к указанному в запросе.", content = [Content(schema = Schema(implementation = GetRegionWithChildrenResponse::class))]),
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
        value = ["/regions/{regionId}/children"],
        produces = ["application/json"]
    )
    fun searchRegionChildren(@Parameter(description = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true) @PathVariable("regionId") regionId: kotlin.Long, @Max(10000) @Parameter(description = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "page", required = false, defaultValue = "1") page: kotlin.Int,@Parameter(description = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ") @Valid @RequestParam(value = "pageSize", required = false) pageSize: kotlin.Int?): ResponseEntity<GetRegionWithChildrenResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о дочерних регионах",
        operationId = "searchRegionChildren",
        description = """Возвращает информацию о регионах, являющихся дочерними по отношению к региону, идентификатор которого указан в запросе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Регионы, являющиеся дочерними к указанному в запросе.", content = [Content(schema = Schema(implementation = GetRegionWithChildrenResponse::class))]),
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
        value = ["/regions/{regionId}/children"],
        produces = ["application/json"]
    )
    fun searchRegionChildren(@Parameter(description = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true) @PathVariable("regionId") regionId: kotlin.Long, @Max(10000) @Parameter(description = "Номер страницы результатов.  Значение по умолчанию: 1.  Используется вместе с параметром `page_size`.  `page_number` игнорируется, если задан `page_token`, `limit` или `offset`. ", schema = Schema(defaultValue = "1")) @Valid @RequestParam(value = "page", required = false, defaultValue = "1") page: kotlin.Int,@Parameter(description = "Размер страницы.  Используется вместе с параметром `page_number`.  `page_size` игнорируется, если задан `page_token`, `limit` или `offset`. ") @Valid @RequestParam(value = "pageSize", required = false) pageSize: kotlin.Int?): ResponseEntity<GetRegionWithChildrenResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о регионе",
        operationId = "searchRegionsById",
        description = """Возвращает информацию о регионе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Найденный регион.", content = [Content(schema = Schema(implementation = GetRegionsResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/regions/{regionId}"],
        produces = ["application/json"]
    )
    fun searchRegionsById(@Parameter(description = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true) @PathVariable("regionId") regionId: kotlin.Long): ResponseEntity<GetRegionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о регионе",
        operationId = "searchRegionsById",
        description = """Возвращает информацию о регионе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Найденный регион.", content = [Content(schema = Schema(implementation = GetRegionsResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/regions/{regionId}"],
        produces = ["application/json"]
    )
    fun searchRegionsById(@Parameter(description = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true) @PathVariable("regionId") regionId: kotlin.Long): ResponseEntity<GetRegionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о регионе",
        operationId = "searchRegionsById",
        description = """Возвращает информацию о регионе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Найденный регион.", content = [Content(schema = Schema(implementation = GetRegionsResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/regions/{regionId}"],
        produces = ["application/json"]
    )
    fun searchRegionsById(@Parameter(description = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true) @PathVariable("regionId") regionId: kotlin.Long): ResponseEntity<GetRegionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о регионе",
        operationId = "searchRegionsById",
        description = """Возвращает информацию о регионе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Найденный регион.", content = [Content(schema = Schema(implementation = GetRegionsResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/regions/{regionId}"],
        produces = ["application/json"]
    )
    fun searchRegionsById(@Parameter(description = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true) @PathVariable("regionId") regionId: kotlin.Long): ResponseEntity<GetRegionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о регионе",
        operationId = "searchRegionsById",
        description = """Возвращает информацию о регионе.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Найденный регион.", content = [Content(schema = Schema(implementation = GetRegionsResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/regions/{regionId}"],
        produces = ["application/json"]
    )
    fun searchRegionsById(@Parameter(description = "Идентификатор региона.  Идентификатор региона можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md). ", required = true) @PathVariable("regionId") regionId: kotlin.Long): ResponseEntity<GetRegionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Поиск регионов по их имени",
        operationId = "searchRegionsByName",
        description = """Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.

Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список найденных регионов.", content = [Content(schema = Schema(implementation = GetRegionsResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/regions"],
        produces = ["application/json"]
    )
    fun searchRegionsByName(@NotNull @Parameter(description = "Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. ", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetRegionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Поиск регионов по их имени",
        operationId = "searchRegionsByName",
        description = """Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.

Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список найденных регионов.", content = [Content(schema = Schema(implementation = GetRegionsResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/regions"],
        produces = ["application/json"]
    )
    fun searchRegionsByName(@NotNull @Parameter(description = "Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. ", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetRegionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Поиск регионов по их имени",
        operationId = "searchRegionsByName",
        description = """Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.

Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список найденных регионов.", content = [Content(schema = Schema(implementation = GetRegionsResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/regions"],
        produces = ["application/json"]
    )
    fun searchRegionsByName(@NotNull @Parameter(description = "Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. ", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetRegionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Поиск регионов по их имени",
        operationId = "searchRegionsByName",
        description = """Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.

Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список найденных регионов.", content = [Content(schema = Schema(implementation = GetRegionsResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/regions"],
        produces = ["application/json"]
    )
    fun searchRegionsByName(@NotNull @Parameter(description = "Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. ", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetRegionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Поиск регионов по их имени",
        operationId = "searchRegionsByName",
        description = """Возвращает информацию о регионе, удовлетворяющем заданным в запросе условиям поиска.

Если найдено несколько регионов, удовлетворяющих условиям поиска, возвращается информация по каждому найденному региону (но не более десяти регионов) для возможности определения нужного региона по родительским регионам.

Для методов `GET regions`, `GET regions/{regionId}` и `GET regions/{regionId}/children` действует групповое ресурсное ограничение. Ограничение вводится на суммарное количество регионов, информация о которых запрошена при помощи этих методов (не более 100 000 регионов).

Объем запросов к ресурсу, который возможно выполнить в течение суток, зависит от суммарного количества регионов.

|**⚙️ Лимит:** 50 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список найденных регионов.", content = [Content(schema = Schema(implementation = GetRegionsResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.GET],
        value = ["/regions"],
        produces = ["application/json"]
    )
    fun searchRegionsByName(@NotNull @Parameter(description = "Название региона.  Важно учитывать регистр: первая буква должна быть заглавной, остальные — строчными. Например, `Москва`. ", required = true) @Valid @RequestParam(value = "name", required = true) name: kotlin.String,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetRegionsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
