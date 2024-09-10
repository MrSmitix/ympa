package ympa_kotlin_spring_server.apis

import ympa_kotlin_spring_server.models.AddOffersToArchiveRequest
import ympa_kotlin_spring_server.models.AddOffersToArchiveResponse
import ympa_kotlin_spring_server.models.ApiClientDataErrorResponse
import ympa_kotlin_spring_server.models.ApiForbiddenErrorResponse
import ympa_kotlin_spring_server.models.ApiLimitErrorResponse
import ympa_kotlin_spring_server.models.ApiLockedErrorResponse
import ympa_kotlin_spring_server.models.ApiNotFoundErrorResponse
import ympa_kotlin_spring_server.models.ApiServerErrorResponse
import ympa_kotlin_spring_server.models.ApiUnauthorizedErrorResponse
import ympa_kotlin_spring_server.models.ConfirmPricesRequest
import ympa_kotlin_spring_server.models.CreateChatRequest
import ympa_kotlin_spring_server.models.CreateChatResponse
import ympa_kotlin_spring_server.models.DeleteGoodsFeedbackCommentRequest
import ympa_kotlin_spring_server.models.DeleteOffersFromArchiveRequest
import ympa_kotlin_spring_server.models.DeleteOffersFromArchiveResponse
import ympa_kotlin_spring_server.models.DeleteOffersRequest
import ympa_kotlin_spring_server.models.DeleteOffersResponse
import ympa_kotlin_spring_server.models.DeletePromoOffersRequest
import ympa_kotlin_spring_server.models.DeletePromoOffersResponse
import ympa_kotlin_spring_server.models.EmptyApiResponse
import ympa_kotlin_spring_server.models.GetBidsInfoRequest
import ympa_kotlin_spring_server.models.GetBidsInfoResponse
import ympa_kotlin_spring_server.models.GetBidsRecommendationsRequest
import ympa_kotlin_spring_server.models.GetBidsRecommendationsResponse
import ympa_kotlin_spring_server.models.GetBusinessSettingsResponse
import ympa_kotlin_spring_server.models.GetChatHistoryRequest
import ympa_kotlin_spring_server.models.GetChatHistoryResponse
import ympa_kotlin_spring_server.models.GetChatsRequest
import ympa_kotlin_spring_server.models.GetChatsResponse
import ympa_kotlin_spring_server.models.GetGoodsFeedbackCommentsRequest
import ympa_kotlin_spring_server.models.GetGoodsFeedbackCommentsResponse
import ympa_kotlin_spring_server.models.GetGoodsFeedbackRequest
import ympa_kotlin_spring_server.models.GetGoodsFeedbackResponse
import ympa_kotlin_spring_server.models.GetOfferCardsContentStatusRequest
import ympa_kotlin_spring_server.models.GetOfferCardsContentStatusResponse
import ympa_kotlin_spring_server.models.GetOfferMappingsRequest
import ympa_kotlin_spring_server.models.GetOfferMappingsResponse
import ympa_kotlin_spring_server.models.GetOfferRecommendationsRequest
import ympa_kotlin_spring_server.models.GetOfferRecommendationsResponse
import ympa_kotlin_spring_server.models.GetPromoOffersRequest
import ympa_kotlin_spring_server.models.GetPromoOffersResponse
import ympa_kotlin_spring_server.models.GetPromosRequest
import ympa_kotlin_spring_server.models.GetPromosResponse
import ympa_kotlin_spring_server.models.GetQualityRatingRequest
import ympa_kotlin_spring_server.models.GetQualityRatingResponse
import ympa_kotlin_spring_server.models.GetQuarantineOffersRequest
import ympa_kotlin_spring_server.models.GetQuarantineOffersResponse
import ympa_kotlin_spring_server.models.GetSuggestedOfferMappingsRequest
import ympa_kotlin_spring_server.models.GetSuggestedOfferMappingsResponse
import ympa_kotlin_spring_server.models.GetWarehousesResponse
import ympa_kotlin_spring_server.models.PutSkuBidsRequest
import ympa_kotlin_spring_server.models.SendMessageToChatRequest
import ympa_kotlin_spring_server.models.SkipGoodsFeedbackReactionRequest
import ympa_kotlin_spring_server.models.UpdateBusinessPricesRequest
import ympa_kotlin_spring_server.models.UpdateGoodsFeedbackCommentRequest
import ympa_kotlin_spring_server.models.UpdateGoodsFeedbackCommentResponse
import ympa_kotlin_spring_server.models.UpdateOfferContentRequest
import ympa_kotlin_spring_server.models.UpdateOfferContentResponse
import ympa_kotlin_spring_server.models.UpdateOfferMappingsRequest
import ympa_kotlin_spring_server.models.UpdateOfferMappingsResponse
import ympa_kotlin_spring_server.models.UpdatePromoOffersRequest
import ympa_kotlin_spring_server.models.UpdatePromoOffersResponse
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
class BusinessesApiController() {

    @Operation(
        summary = "Добавление товаров в архив",
        operationId = "addOffersToArchive",
        description = """Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.

{% note warning "В архив нельзя отправить товар, который хранится на складе Маркета" %}

Вначале такой товар нужно распродать или вывезти.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. ", content = [Content(schema = Schema(implementation = AddOffersToArchiveResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/archive"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun addOffersToArchive(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody addOffersToArchiveRequest: AddOffersToArchiveRequest): ResponseEntity<AddOffersToArchiveResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в архив",
        operationId = "addOffersToArchive",
        description = """Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.

{% note warning "В архив нельзя отправить товар, который хранится на складе Маркета" %}

Вначале такой товар нужно распродать или вывезти.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. ", content = [Content(schema = Schema(implementation = AddOffersToArchiveResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/archive"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun addOffersToArchive(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody addOffersToArchiveRequest: AddOffersToArchiveRequest): ResponseEntity<AddOffersToArchiveResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в архив",
        operationId = "addOffersToArchive",
        description = """Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.

{% note warning "В архив нельзя отправить товар, который хранится на складе Маркета" %}

Вначале такой товар нужно распродать или вывезти.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. ", content = [Content(schema = Schema(implementation = AddOffersToArchiveResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/archive"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun addOffersToArchive(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody addOffersToArchiveRequest: AddOffersToArchiveRequest): ResponseEntity<AddOffersToArchiveResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в архив",
        operationId = "addOffersToArchive",
        description = """Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.

{% note warning "В архив нельзя отправить товар, который хранится на складе Маркета" %}

Вначале такой товар нужно распродать или вывезти.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. ", content = [Content(schema = Schema(implementation = AddOffersToArchiveResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/archive"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun addOffersToArchive(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody addOffersToArchiveRequest: AddOffersToArchiveRequest): ResponseEntity<AddOffersToArchiveResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в архив",
        operationId = "addOffersToArchive",
        description = """Помещает товары в архив. Товары, помещенные в архив, скрыты с витрины во всех магазинах кабинета.

{% note warning "В архив нельзя отправить товар, который хранится на складе Маркета" %}

Вначале такой товар нужно распродать или вывезти.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если некоторые товары добавить в архив не удалось, в ответе 200 будет их список.  Список успешно добавленных товаров не возвращается. ", content = [Content(schema = Schema(implementation = AddOffersToArchiveResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/archive"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun addOffersToArchive(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody addOffersToArchiveRequest: AddOffersToArchiveRequest): ResponseEntity<AddOffersToArchiveResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товара из карантина по цене в кабинете",
        operationId = "confirmBusinessPrices",
        description = """Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.

Основная цена задается в каталоге и действует во всех магазинах кабинета.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Ответ 200 обозначает, что цены подтверждены.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/price-quarantine/confirm"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun confirmBusinessPrices(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody confirmPricesRequest: ConfirmPricesRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товара из карантина по цене в кабинете",
        operationId = "confirmBusinessPrices",
        description = """Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.

Основная цена задается в каталоге и действует во всех магазинах кабинета.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Ответ 200 обозначает, что цены подтверждены.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/price-quarantine/confirm"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun confirmBusinessPrices(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody confirmPricesRequest: ConfirmPricesRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товара из карантина по цене в кабинете",
        operationId = "confirmBusinessPrices",
        description = """Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.

Основная цена задается в каталоге и действует во всех магазинах кабинета.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Ответ 200 обозначает, что цены подтверждены.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/price-quarantine/confirm"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun confirmBusinessPrices(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody confirmPricesRequest: ConfirmPricesRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товара из карантина по цене в кабинете",
        operationId = "confirmBusinessPrices",
        description = """Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.

Основная цена задается в каталоге и действует во всех магазинах кабинета.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Ответ 200 обозначает, что цены подтверждены.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/price-quarantine/confirm"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun confirmBusinessPrices(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody confirmPricesRequest: ConfirmPricesRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товара из карантина по цене в кабинете",
        operationId = "confirmBusinessPrices",
        description = """Подтверждает основную цену на товары, которые попали в карантин, и удаляет их из карантина.

Основная цена задается в каталоге и действует во всех магазинах кабинета.

Товар попадает в карантин, если его цена меняется слишком резко. [Как настроить карантин](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

Чтобы увидеть список товаров, которые попали в карантин, используйте запрос [POST businesses/{businessId}/price-quarantine](getBusinessQuarantineOffers.md).

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Ответ 200 обозначает, что цены подтверждены.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/price-quarantine/confirm"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun confirmBusinessPrices(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody confirmPricesRequest: ConfirmPricesRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Создание нового чата с покупателем",
        operationId = "createChat",
        description = """Создает новый чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все получилось: чат создан. ", content = [Content(schema = Schema(implementation = CreateChatResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/new"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody createChatRequest: CreateChatRequest): ResponseEntity<CreateChatResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Создание нового чата с покупателем",
        operationId = "createChat",
        description = """Создает новый чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все получилось: чат создан. ", content = [Content(schema = Schema(implementation = CreateChatResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/new"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody createChatRequest: CreateChatRequest): ResponseEntity<CreateChatResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Создание нового чата с покупателем",
        operationId = "createChat",
        description = """Создает новый чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все получилось: чат создан. ", content = [Content(schema = Schema(implementation = CreateChatResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/new"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody createChatRequest: CreateChatRequest): ResponseEntity<CreateChatResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Создание нового чата с покупателем",
        operationId = "createChat",
        description = """Создает новый чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все получилось: чат создан. ", content = [Content(schema = Schema(implementation = CreateChatResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/new"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody createChatRequest: CreateChatRequest): ResponseEntity<CreateChatResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Создание нового чата с покупателем",
        operationId = "createChat",
        description = """Создает новый чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все получилось: чат создан. ", content = [Content(schema = Schema(implementation = CreateChatResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/new"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun createChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody createChatRequest: CreateChatRequest): ResponseEntity<CreateChatResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление комментария к отзыву",
        operationId = "deleteGoodsFeedbackComment",
        description = """Удаляет комментарий магазина.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteGoodsFeedbackComment(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление комментария к отзыву",
        operationId = "deleteGoodsFeedbackComment",
        description = """Удаляет комментарий магазина.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteGoodsFeedbackComment(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление комментария к отзыву",
        operationId = "deleteGoodsFeedbackComment",
        description = """Удаляет комментарий магазина.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteGoodsFeedbackComment(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление комментария к отзыву",
        operationId = "deleteGoodsFeedbackComment",
        description = """Удаляет комментарий магазина.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteGoodsFeedbackComment(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление комментария к отзыву",
        operationId = "deleteGoodsFeedbackComment",
        description = """Удаляет комментарий магазина.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteGoodsFeedbackComment(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteGoodsFeedbackCommentRequest: DeleteGoodsFeedbackCommentRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из каталога",
        operationId = "deleteOffers",
        description = """Удаляет товары из каталога.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.", content = [Content(schema = Schema(implementation = DeleteOffersResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteOffersRequest: DeleteOffersRequest): ResponseEntity<DeleteOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из каталога",
        operationId = "deleteOffers",
        description = """Удаляет товары из каталога.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.", content = [Content(schema = Schema(implementation = DeleteOffersResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteOffersRequest: DeleteOffersRequest): ResponseEntity<DeleteOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из каталога",
        operationId = "deleteOffers",
        description = """Удаляет товары из каталога.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.", content = [Content(schema = Schema(implementation = DeleteOffersResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteOffersRequest: DeleteOffersRequest): ResponseEntity<DeleteOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из каталога",
        operationId = "deleteOffers",
        description = """Удаляет товары из каталога.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.", content = [Content(schema = Schema(implementation = DeleteOffersResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteOffersRequest: DeleteOffersRequest): ResponseEntity<DeleteOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из каталога",
        operationId = "deleteOffers",
        description = """Удаляет товары из каталога.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если удалось удалить не все товары, с ответом 200 вернется список тех, что были в запросе, но остались в магазине.", content = [Content(schema = Schema(implementation = DeleteOffersResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteOffersRequest: DeleteOffersRequest): ResponseEntity<DeleteOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из архива",
        operationId = "deleteOffersFromArchive",
        description = """Восстанавливает товары из архива.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. ", content = [Content(schema = Schema(implementation = DeleteOffersFromArchiveResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/unarchive"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteOffersFromArchive(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): ResponseEntity<DeleteOffersFromArchiveResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из архива",
        operationId = "deleteOffersFromArchive",
        description = """Восстанавливает товары из архива.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. ", content = [Content(schema = Schema(implementation = DeleteOffersFromArchiveResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/unarchive"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteOffersFromArchive(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): ResponseEntity<DeleteOffersFromArchiveResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из архива",
        operationId = "deleteOffersFromArchive",
        description = """Восстанавливает товары из архива.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. ", content = [Content(schema = Schema(implementation = DeleteOffersFromArchiveResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/unarchive"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteOffersFromArchive(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): ResponseEntity<DeleteOffersFromArchiveResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из архива",
        operationId = "deleteOffersFromArchive",
        description = """Восстанавливает товары из архива.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. ", content = [Content(schema = Schema(implementation = DeleteOffersFromArchiveResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/unarchive"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteOffersFromArchive(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): ResponseEntity<DeleteOffersFromArchiveResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из архива",
        operationId = "deleteOffersFromArchive",
        description = """Восстанавливает товары из архива.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Если некоторые товары восстановить из архива не удалось, в ответе 200 будет их список.  Список успешно восстановленных товаров не возвращается. ", content = [Content(schema = Schema(implementation = DeleteOffersFromArchiveResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/unarchive"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deleteOffersFromArchive(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deleteOffersFromArchiveRequest: DeleteOffersFromArchiveRequest): ResponseEntity<DeleteOffersFromArchiveResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из акции",
        operationId = "deletePromoOffers",
        description = """Убирает товары из акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Результат удаления товаров из акции.", content = [Content(schema = Schema(implementation = DeletePromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deletePromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deletePromoOffersRequest: DeletePromoOffersRequest): ResponseEntity<DeletePromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из акции",
        operationId = "deletePromoOffers",
        description = """Убирает товары из акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Результат удаления товаров из акции.", content = [Content(schema = Schema(implementation = DeletePromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deletePromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deletePromoOffersRequest: DeletePromoOffersRequest): ResponseEntity<DeletePromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из акции",
        operationId = "deletePromoOffers",
        description = """Убирает товары из акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Результат удаления товаров из акции.", content = [Content(schema = Schema(implementation = DeletePromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deletePromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deletePromoOffersRequest: DeletePromoOffersRequest): ResponseEntity<DeletePromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из акции",
        operationId = "deletePromoOffers",
        description = """Убирает товары из акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Результат удаления товаров из акции.", content = [Content(schema = Schema(implementation = DeletePromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deletePromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deletePromoOffersRequest: DeletePromoOffersRequest): ResponseEntity<DeletePromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Удаление товаров из акции",
        operationId = "deletePromoOffers",
        description = """Убирает товары из акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Результат удаления товаров из акции.", content = [Content(schema = Schema(implementation = DeletePromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers/delete"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun deletePromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody deletePromoOffersRequest: DeletePromoOffersRequest): ResponseEntity<DeletePromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация об установленных ставках",
        operationId = "getBidsInfoForBusiness",
        description = """Возвращает значения ставок для заданных товаров.

{% note warning "" %}

В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.", content = [Content(schema = Schema(implementation = GetBidsInfoResponse::class))]),
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
        value = ["/businesses/{businessId}/bids/info"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBidsInfoForBusiness(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "description") @Valid @RequestBody(required = false) getBidsInfoRequest: GetBidsInfoRequest?): ResponseEntity<GetBidsInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация об установленных ставках",
        operationId = "getBidsInfoForBusiness",
        description = """Возвращает значения ставок для заданных товаров.

{% note warning "" %}

В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.", content = [Content(schema = Schema(implementation = GetBidsInfoResponse::class))]),
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
        value = ["/businesses/{businessId}/bids/info"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBidsInfoForBusiness(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "description") @Valid @RequestBody(required = false) getBidsInfoRequest: GetBidsInfoRequest?): ResponseEntity<GetBidsInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация об установленных ставках",
        operationId = "getBidsInfoForBusiness",
        description = """Возвращает значения ставок для заданных товаров.

{% note warning "" %}

В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.", content = [Content(schema = Schema(implementation = GetBidsInfoResponse::class))]),
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
        value = ["/businesses/{businessId}/bids/info"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBidsInfoForBusiness(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "description") @Valid @RequestBody(required = false) getBidsInfoRequest: GetBidsInfoRequest?): ResponseEntity<GetBidsInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация об установленных ставках",
        operationId = "getBidsInfoForBusiness",
        description = """Возвращает значения ставок для заданных товаров.

{% note warning "" %}

В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.", content = [Content(schema = Schema(implementation = GetBidsInfoResponse::class))]),
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
        value = ["/businesses/{businessId}/bids/info"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBidsInfoForBusiness(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "description") @Valid @RequestBody(required = false) getBidsInfoRequest: GetBidsInfoRequest?): ResponseEntity<GetBidsInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация об установленных ставках",
        operationId = "getBidsInfoForBusiness",
        description = """Возвращает значения ставок для заданных товаров.

{% note warning "" %}

В ответе возвращаются значения только тех ставок, которые вы установили через запрос [PUT businesses/{businessId}/bids](../../reference/bids/putBidsForBusiness.md). Получить информацию по кампаниям, созданным в кабинете, не получится.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Значения ставок для заданных товаров. В ответ попадают только товары, на которые установлены ставки.", content = [Content(schema = Schema(implementation = GetBidsInfoResponse::class))]),
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
        value = ["/businesses/{businessId}/bids/info"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBidsInfoForBusiness(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "description") @Valid @RequestBody(required = false) getBidsInfoRequest: GetBidsInfoRequest?): ResponseEntity<GetBidsInfoResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Рекомендованные ставки для заданных товаров",
        operationId = "getBidsRecommendations",
        description = """Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.

Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.

Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Рекомендованные ставки для заданных товаров.", content = [Content(schema = Schema(implementation = GetBidsRecommendationsResponse::class))]),
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
        value = ["/businesses/{businessId}/bids/recommendations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBidsRecommendations(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description.", required = true) @Valid @RequestBody getBidsRecommendationsRequest: GetBidsRecommendationsRequest): ResponseEntity<GetBidsRecommendationsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Рекомендованные ставки для заданных товаров",
        operationId = "getBidsRecommendations",
        description = """Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.

Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.

Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Рекомендованные ставки для заданных товаров.", content = [Content(schema = Schema(implementation = GetBidsRecommendationsResponse::class))]),
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
        value = ["/businesses/{businessId}/bids/recommendations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBidsRecommendations(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description.", required = true) @Valid @RequestBody getBidsRecommendationsRequest: GetBidsRecommendationsRequest): ResponseEntity<GetBidsRecommendationsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Рекомендованные ставки для заданных товаров",
        operationId = "getBidsRecommendations",
        description = """Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.

Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.

Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Рекомендованные ставки для заданных товаров.", content = [Content(schema = Schema(implementation = GetBidsRecommendationsResponse::class))]),
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
        value = ["/businesses/{businessId}/bids/recommendations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBidsRecommendations(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description.", required = true) @Valid @RequestBody getBidsRecommendationsRequest: GetBidsRecommendationsRequest): ResponseEntity<GetBidsRecommendationsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Рекомендованные ставки для заданных товаров",
        operationId = "getBidsRecommendations",
        description = """Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.

Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.

Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Рекомендованные ставки для заданных товаров.", content = [Content(schema = Schema(implementation = GetBidsRecommendationsResponse::class))]),
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
        value = ["/businesses/{businessId}/bids/recommendations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBidsRecommendations(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description.", required = true) @Valid @RequestBody getBidsRecommendationsRequest: GetBidsRecommendationsRequest): ResponseEntity<GetBidsRecommendationsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Рекомендованные ставки для заданных товаров",
        operationId = "getBidsRecommendations",
        description = """Возвращает рекомендованные ставки для заданных товаров — такие ставки обеспечивают вашим предложениям определенную долю показов, если цена не превышает рекомендованную.

Для одного товара может возвращаться одна рекомендованная ставка или несколько. Во втором случае разные ставки предназначены для достижения разной доли показов.

Если товар только добавлен в каталог, но пока не продается, рекомендованной ставки для него не будет.

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Рекомендованные ставки для заданных товаров.", content = [Content(schema = Schema(implementation = GetBidsRecommendationsResponse::class))]),
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
        value = ["/businesses/{businessId}/bids/recommendations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBidsRecommendations(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description.", required = true) @Valid @RequestBody getBidsRecommendationsRequest: GetBidsRecommendationsRequest): ResponseEntity<GetBidsRecommendationsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Список товаров, находящихся в карантине по цене в кабинете",
        operationId = "getBusinessQuarantineOffers",
        description = """Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% note info "𝓠 Что такое карантин?" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров в карантине.", content = [Content(schema = Schema(implementation = GetQuarantineOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/price-quarantine"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBusinessQuarantineOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getQuarantineOffersRequest: GetQuarantineOffersRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetQuarantineOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Список товаров, находящихся в карантине по цене в кабинете",
        operationId = "getBusinessQuarantineOffers",
        description = """Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% note info "𝓠 Что такое карантин?" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров в карантине.", content = [Content(schema = Schema(implementation = GetQuarantineOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/price-quarantine"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBusinessQuarantineOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getQuarantineOffersRequest: GetQuarantineOffersRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetQuarantineOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Список товаров, находящихся в карантине по цене в кабинете",
        operationId = "getBusinessQuarantineOffers",
        description = """Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% note info "𝓠 Что такое карантин?" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров в карантине.", content = [Content(schema = Schema(implementation = GetQuarantineOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/price-quarantine"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBusinessQuarantineOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getQuarantineOffersRequest: GetQuarantineOffersRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetQuarantineOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Список товаров, находящихся в карантине по цене в кабинете",
        operationId = "getBusinessQuarantineOffers",
        description = """Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% note info "𝓠 Что такое карантин?" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров в карантине.", content = [Content(schema = Schema(implementation = GetQuarantineOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/price-quarantine"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBusinessQuarantineOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getQuarantineOffersRequest: GetQuarantineOffersRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetQuarantineOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Список товаров, находящихся в карантине по цене в кабинете",
        operationId = "getBusinessQuarantineOffers",
        description = """Возвращает список товаров, которые находятся в карантине по **основной цене**. Основная цена задается в каталоге и действует во всех магазинах кабинета.

Проверьте цену каждого из товаров, который попал в карантин. Если ошибки нет и цена правильная, подтвердите ее с помощью запроса [POST businesses/{businessId}/price-quarantine/confirm](../../reference/business-assortment/confirmBusinessPrices.md). Если цена в самом деле ошибочная, установите верную с помощью запроса [POST businesses/{businessId}/offer-prices/updates](../../reference/business-assortment/updateBusinessPrices.md).

{% note info "𝓠 Что такое карантин?" %}

𝓐 Товар попадает в карантин, если его цена меняется слишком резко или слишком сильно отличается от рыночной. [Подробнее](https://yandex.ru/support/marketplace/assortment/operations/prices.html#quarantine)

{% endnote %}

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров в карантине.", content = [Content(schema = Schema(implementation = GetQuarantineOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/price-quarantine"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getBusinessQuarantineOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getQuarantineOffersRequest: GetQuarantineOffersRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetQuarantineOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Настройки кабинета",
        operationId = "getBusinessSettings",
        description = """Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Настройки кабинета.", content = [Content(schema = Schema(implementation = GetBusinessSettingsResponse::class))]),
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
        value = ["/businesses/{businessId}/settings"],
        produces = ["application/json"]
    )
    fun getBusinessSettings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long): ResponseEntity<GetBusinessSettingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Настройки кабинета",
        operationId = "getBusinessSettings",
        description = """Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Настройки кабинета.", content = [Content(schema = Schema(implementation = GetBusinessSettingsResponse::class))]),
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
        value = ["/businesses/{businessId}/settings"],
        produces = ["application/json"]
    )
    fun getBusinessSettings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long): ResponseEntity<GetBusinessSettingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Настройки кабинета",
        operationId = "getBusinessSettings",
        description = """Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Настройки кабинета.", content = [Content(schema = Schema(implementation = GetBusinessSettingsResponse::class))]),
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
        value = ["/businesses/{businessId}/settings"],
        produces = ["application/json"]
    )
    fun getBusinessSettings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long): ResponseEntity<GetBusinessSettingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Настройки кабинета",
        operationId = "getBusinessSettings",
        description = """Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Настройки кабинета.", content = [Content(schema = Schema(implementation = GetBusinessSettingsResponse::class))]),
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
        value = ["/businesses/{businessId}/settings"],
        produces = ["application/json"]
    )
    fun getBusinessSettings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long): ResponseEntity<GetBusinessSettingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Настройки кабинета",
        operationId = "getBusinessSettings",
        description = """Возвращает информацию о настройках кабинета, идентификатор которого указан в запросе.
|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Настройки кабинета.", content = [Content(schema = Schema(implementation = GetBusinessSettingsResponse::class))]),
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
        value = ["/businesses/{businessId}/settings"],
        produces = ["application/json"]
    )
    fun getBusinessSettings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long): ResponseEntity<GetBusinessSettingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение истории сообщений в чате",
        operationId = "getChatHistory",
        description = """Возвращает историю сообщений в чате с покупателем.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "История сообщений успешно получена. ", content = [Content(schema = Schema(implementation = GetChatHistoryResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/history"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getChatHistory(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody getChatHistoryRequest: GetChatHistoryRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetChatHistoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение истории сообщений в чате",
        operationId = "getChatHistory",
        description = """Возвращает историю сообщений в чате с покупателем.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "История сообщений успешно получена. ", content = [Content(schema = Schema(implementation = GetChatHistoryResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/history"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getChatHistory(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody getChatHistoryRequest: GetChatHistoryRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetChatHistoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение истории сообщений в чате",
        operationId = "getChatHistory",
        description = """Возвращает историю сообщений в чате с покупателем.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "История сообщений успешно получена. ", content = [Content(schema = Schema(implementation = GetChatHistoryResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/history"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getChatHistory(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody getChatHistoryRequest: GetChatHistoryRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetChatHistoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение истории сообщений в чате",
        operationId = "getChatHistory",
        description = """Возвращает историю сообщений в чате с покупателем.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "История сообщений успешно получена. ", content = [Content(schema = Schema(implementation = GetChatHistoryResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/history"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getChatHistory(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody getChatHistoryRequest: GetChatHistoryRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetChatHistoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение истории сообщений в чате",
        operationId = "getChatHistory",
        description = """Возвращает историю сообщений в чате с покупателем.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "История сообщений успешно получена. ", content = [Content(schema = Schema(implementation = GetChatHistoryResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/history"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getChatHistory(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody getChatHistoryRequest: GetChatHistoryRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetChatHistoryResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение доступных чатов",
        operationId = "getChats",
        description = """Возвращает ваши чаты с покупателями.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список чатов. ", content = [Content(schema = Schema(implementation = GetChatsResponse::class))]),
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
        value = ["/businesses/{businessId}/chats"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getChats(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody getChatsRequest: GetChatsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetChatsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение доступных чатов",
        operationId = "getChats",
        description = """Возвращает ваши чаты с покупателями.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список чатов. ", content = [Content(schema = Schema(implementation = GetChatsResponse::class))]),
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
        value = ["/businesses/{businessId}/chats"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getChats(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody getChatsRequest: GetChatsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetChatsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение доступных чатов",
        operationId = "getChats",
        description = """Возвращает ваши чаты с покупателями.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список чатов. ", content = [Content(schema = Schema(implementation = GetChatsResponse::class))]),
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
        value = ["/businesses/{businessId}/chats"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getChats(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody getChatsRequest: GetChatsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetChatsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение доступных чатов",
        operationId = "getChats",
        description = """Возвращает ваши чаты с покупателями.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список чатов. ", content = [Content(schema = Schema(implementation = GetChatsResponse::class))]),
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
        value = ["/businesses/{businessId}/chats"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getChats(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody getChatsRequest: GetChatsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetChatsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение доступных чатов",
        operationId = "getChats",
        description = """Возвращает ваши чаты с покупателями.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список чатов. ", content = [Content(schema = Schema(implementation = GetChatsResponse::class))]),
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
        value = ["/businesses/{businessId}/chats"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getChats(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody getChatsRequest: GetChatsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetChatsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение комментариев к отзыву",
        operationId = "getGoodsFeedbackComments",
        description = """Возвращает комментарии к отзыву.

Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.

Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Дерево комментариев к отзыву.", content = [Content(schema = Schema(implementation = GetGoodsFeedbackCommentsResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getGoodsFeedbackComments(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetGoodsFeedbackCommentsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение комментариев к отзыву",
        operationId = "getGoodsFeedbackComments",
        description = """Возвращает комментарии к отзыву.

Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.

Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Дерево комментариев к отзыву.", content = [Content(schema = Schema(implementation = GetGoodsFeedbackCommentsResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getGoodsFeedbackComments(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetGoodsFeedbackCommentsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение комментариев к отзыву",
        operationId = "getGoodsFeedbackComments",
        description = """Возвращает комментарии к отзыву.

Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.

Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Дерево комментариев к отзыву.", content = [Content(schema = Schema(implementation = GetGoodsFeedbackCommentsResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getGoodsFeedbackComments(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetGoodsFeedbackCommentsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение комментариев к отзыву",
        operationId = "getGoodsFeedbackComments",
        description = """Возвращает комментарии к отзыву.

Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.

Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Дерево комментариев к отзыву.", content = [Content(schema = Schema(implementation = GetGoodsFeedbackCommentsResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getGoodsFeedbackComments(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetGoodsFeedbackCommentsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение комментариев к отзыву",
        operationId = "getGoodsFeedbackComments",
        description = """Возвращает комментарии к отзыву.

Результаты возвращаются постранично, одна страница содержит не более 20 комментариев.

Комментарии расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Дерево комментариев к отзыву.", content = [Content(schema = Schema(implementation = GetGoodsFeedbackCommentsResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getGoodsFeedbackComments(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getGoodsFeedbackCommentsRequest: GetGoodsFeedbackCommentsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetGoodsFeedbackCommentsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение отзывов о товарах продавца",
        operationId = "getGoodsFeedbacks",
        description = """Возвращает все отзывы о товарах продавца по указанным фильтрам.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.

Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список отзывов.", content = [Content(schema = Schema(implementation = GetGoodsFeedbackResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getGoodsFeedbacks(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getGoodsFeedbackRequest: GetGoodsFeedbackRequest?): ResponseEntity<GetGoodsFeedbackResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение отзывов о товарах продавца",
        operationId = "getGoodsFeedbacks",
        description = """Возвращает все отзывы о товарах продавца по указанным фильтрам.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.

Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список отзывов.", content = [Content(schema = Schema(implementation = GetGoodsFeedbackResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getGoodsFeedbacks(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getGoodsFeedbackRequest: GetGoodsFeedbackRequest?): ResponseEntity<GetGoodsFeedbackResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение отзывов о товарах продавца",
        operationId = "getGoodsFeedbacks",
        description = """Возвращает все отзывы о товарах продавца по указанным фильтрам.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.

Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список отзывов.", content = [Content(schema = Schema(implementation = GetGoodsFeedbackResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getGoodsFeedbacks(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getGoodsFeedbackRequest: GetGoodsFeedbackRequest?): ResponseEntity<GetGoodsFeedbackResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение отзывов о товарах продавца",
        operationId = "getGoodsFeedbacks",
        description = """Возвращает все отзывы о товарах продавца по указанным фильтрам.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.

Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список отзывов.", content = [Content(schema = Schema(implementation = GetGoodsFeedbackResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getGoodsFeedbacks(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getGoodsFeedbackRequest: GetGoodsFeedbackRequest?): ResponseEntity<GetGoodsFeedbackResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение отзывов о товарах продавца",
        operationId = "getGoodsFeedbacks",
        description = """Возвращает все отзывы о товарах продавца по указанным фильтрам.

Результаты возвращаются постранично, одна страница содержит не более 20 отзывов.

Отзывы расположены в порядке публикации, поэтому вы можете передавать определенный идентификатор страницы в `page_token`, если вы получали его ранее.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список отзывов.", content = [Content(schema = Schema(implementation = GetGoodsFeedbackResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getGoodsFeedbacks(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getGoodsFeedbackRequest: GetGoodsFeedbackRequest?): ResponseEntity<GetGoodsFeedbackResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение информации о заполненности карточек магазина",
        operationId = "getOfferCardsContentStatus",
        description = """Возвращает сведения о состоянии контента для заданных товаров:

* создана ли карточка товара и в каком она статусе;
* заполненность карточки в процентах;
* переданные характеристики товаров;
* есть ли ошибки или предупреждения, связанные с контентом;
* рекомендации по заполнению карточки.

|**⚙️ Лимит:** 600 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о карточках указанных товаров.", content = [Content(schema = Schema(implementation = GetOfferCardsContentStatusResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-cards"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferCardsContentStatus(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest?): ResponseEntity<GetOfferCardsContentStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение информации о заполненности карточек магазина",
        operationId = "getOfferCardsContentStatus",
        description = """Возвращает сведения о состоянии контента для заданных товаров:

* создана ли карточка товара и в каком она статусе;
* заполненность карточки в процентах;
* переданные характеристики товаров;
* есть ли ошибки или предупреждения, связанные с контентом;
* рекомендации по заполнению карточки.

|**⚙️ Лимит:** 600 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о карточках указанных товаров.", content = [Content(schema = Schema(implementation = GetOfferCardsContentStatusResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-cards"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferCardsContentStatus(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest?): ResponseEntity<GetOfferCardsContentStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение информации о заполненности карточек магазина",
        operationId = "getOfferCardsContentStatus",
        description = """Возвращает сведения о состоянии контента для заданных товаров:

* создана ли карточка товара и в каком она статусе;
* заполненность карточки в процентах;
* переданные характеристики товаров;
* есть ли ошибки или предупреждения, связанные с контентом;
* рекомендации по заполнению карточки.

|**⚙️ Лимит:** 600 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о карточках указанных товаров.", content = [Content(schema = Schema(implementation = GetOfferCardsContentStatusResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-cards"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferCardsContentStatus(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest?): ResponseEntity<GetOfferCardsContentStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение информации о заполненности карточек магазина",
        operationId = "getOfferCardsContentStatus",
        description = """Возвращает сведения о состоянии контента для заданных товаров:

* создана ли карточка товара и в каком она статусе;
* заполненность карточки в процентах;
* переданные характеристики товаров;
* есть ли ошибки или предупреждения, связанные с контентом;
* рекомендации по заполнению карточки.

|**⚙️ Лимит:** 600 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о карточках указанных товаров.", content = [Content(schema = Schema(implementation = GetOfferCardsContentStatusResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-cards"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferCardsContentStatus(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest?): ResponseEntity<GetOfferCardsContentStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение информации о заполненности карточек магазина",
        operationId = "getOfferCardsContentStatus",
        description = """Возвращает сведения о состоянии контента для заданных товаров:

* создана ли карточка товара и в каком она статусе;
* заполненность карточки в процентах;
* переданные характеристики товаров;
* есть ли ошибки или предупреждения, связанные с контентом;
* рекомендации по заполнению карточки.

|**⚙️ Лимит:** 600 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о карточках указанных товаров.", content = [Content(schema = Schema(implementation = GetOfferCardsContentStatusResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-cards"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferCardsContentStatus(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getOfferCardsContentStatusRequest: GetOfferCardsContentStatusRequest?): ResponseEntity<GetOfferCardsContentStatusResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о товарах в каталоге",
        operationId = "getOfferMappings",
        description = """Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.

Можно использовать тремя способами:
* задать список интересующих SKU;
* задать фильтр — в этом случае результаты возвращаются постранично;
* не передавать тело запроса, чтобы получить список всех товаров в каталоге.

|**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о товарах в каталоге.", content = [Content(schema = Schema(implementation = GetOfferMappingsResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-mappings"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getOfferMappingsRequest: GetOfferMappingsRequest?): ResponseEntity<GetOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о товарах в каталоге",
        operationId = "getOfferMappings",
        description = """Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.

Можно использовать тремя способами:
* задать список интересующих SKU;
* задать фильтр — в этом случае результаты возвращаются постранично;
* не передавать тело запроса, чтобы получить список всех товаров в каталоге.

|**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о товарах в каталоге.", content = [Content(schema = Schema(implementation = GetOfferMappingsResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-mappings"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getOfferMappingsRequest: GetOfferMappingsRequest?): ResponseEntity<GetOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о товарах в каталоге",
        operationId = "getOfferMappings",
        description = """Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.

Можно использовать тремя способами:
* задать список интересующих SKU;
* задать фильтр — в этом случае результаты возвращаются постранично;
* не передавать тело запроса, чтобы получить список всех товаров в каталоге.

|**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о товарах в каталоге.", content = [Content(schema = Schema(implementation = GetOfferMappingsResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-mappings"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getOfferMappingsRequest: GetOfferMappingsRequest?): ResponseEntity<GetOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о товарах в каталоге",
        operationId = "getOfferMappings",
        description = """Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.

Можно использовать тремя способами:
* задать список интересующих SKU;
* задать фильтр — в этом случае результаты возвращаются постранично;
* не передавать тело запроса, чтобы получить список всех товаров в каталоге.

|**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о товарах в каталоге.", content = [Content(schema = Schema(implementation = GetOfferMappingsResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-mappings"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getOfferMappingsRequest: GetOfferMappingsRequest?): ResponseEntity<GetOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Информация о товарах в каталоге",
        operationId = "getOfferMappings",
        description = """Возвращает список товаров в каталоге, их категории на Маркете и характеристики каждого товара.

Можно использовать тремя способами:
* задать список интересующих SKU;
* задать фильтр — в этом случае результаты возвращаются постранично;
* не передавать тело запроса, чтобы получить список всех товаров в каталоге.

|**⚙️ Лимит:** 600 запросов в минуту, не более 200 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о товарах в каталоге.", content = [Content(schema = Schema(implementation = GetOfferMappingsResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-mappings"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?,@Parameter(description = "") @Valid @RequestBody(required = false) getOfferMappingsRequest: GetOfferMappingsRequest?): ResponseEntity<GetOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Рекомендации Маркета, касающиеся цен",
        operationId = "getOfferRecommendations",
        description = """Метод возвращает рекомендации нескольких типов.

**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**

Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)

**2. Оценка привлекательности цен на витрине.**

Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров с рекомендациями.", content = [Content(schema = Schema(implementation = GetOfferRecommendationsResponse::class))]),
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
        value = ["/businesses/{businessId}/offers/recommendations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferRecommendations(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getOfferRecommendationsRequest: GetOfferRecommendationsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetOfferRecommendationsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Рекомендации Маркета, касающиеся цен",
        operationId = "getOfferRecommendations",
        description = """Метод возвращает рекомендации нескольких типов.

**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**

Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)

**2. Оценка привлекательности цен на витрине.**

Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров с рекомендациями.", content = [Content(schema = Schema(implementation = GetOfferRecommendationsResponse::class))]),
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
        value = ["/businesses/{businessId}/offers/recommendations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferRecommendations(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getOfferRecommendationsRequest: GetOfferRecommendationsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetOfferRecommendationsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Рекомендации Маркета, касающиеся цен",
        operationId = "getOfferRecommendations",
        description = """Метод возвращает рекомендации нескольких типов.

**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**

Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)

**2. Оценка привлекательности цен на витрине.**

Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров с рекомендациями.", content = [Content(schema = Schema(implementation = GetOfferRecommendationsResponse::class))]),
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
        value = ["/businesses/{businessId}/offers/recommendations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferRecommendations(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getOfferRecommendationsRequest: GetOfferRecommendationsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetOfferRecommendationsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Рекомендации Маркета, касающиеся цен",
        operationId = "getOfferRecommendations",
        description = """Метод возвращает рекомендации нескольких типов.

**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**

Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)

**2. Оценка привлекательности цен на витрине.**

Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров с рекомендациями.", content = [Content(schema = Schema(implementation = GetOfferRecommendationsResponse::class))]),
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
        value = ["/businesses/{businessId}/offers/recommendations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferRecommendations(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getOfferRecommendationsRequest: GetOfferRecommendationsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetOfferRecommendationsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Рекомендации Маркета, касающиеся цен",
        operationId = "getOfferRecommendations",
        description = """Метод возвращает рекомендации нескольких типов.

**1. Порог для привлекательной цены. Он нужен для участия в софинансировании скидок.**

Показывает, какие **цены для участия** нужно установить, чтобы получить максимальные шансы на срабатывание скидок, софинансируемых Маркетом. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#sponsored-discounts)

**2. Оценка привлекательности цен на витрине.**

Привлекательность влияет на вероятность срабатывания скидок за счет Маркета. [Как это устроено](https://yandex.ru/support/marketplace/marketing/smart-pricing.html#validation)

В запросе можно использовать фильтры.

Результаты возвращаются постранично.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров с рекомендациями.", content = [Content(schema = Schema(implementation = GetOfferRecommendationsResponse::class))]),
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
        value = ["/businesses/{businessId}/offers/recommendations"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getOfferRecommendations(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getOfferRecommendationsRequest: GetOfferRecommendationsRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetOfferRecommendationsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение списка товаров, которые участвуют или могут участвовать в акции",
        operationId = "getPromoOffers",
        description = """Возвращает список товаров, которые участвуют или могут участвовать в акции.

{% note warning %}

В параметре `limit` не передавайте значение больше 500.

{% endnote %}

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров, которые участвуют или могут участвовать в акции.", content = [Content(schema = Schema(implementation = GetPromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getPromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getPromoOffersRequest: GetPromoOffersRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetPromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение списка товаров, которые участвуют или могут участвовать в акции",
        operationId = "getPromoOffers",
        description = """Возвращает список товаров, которые участвуют или могут участвовать в акции.

{% note warning %}

В параметре `limit` не передавайте значение больше 500.

{% endnote %}

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров, которые участвуют или могут участвовать в акции.", content = [Content(schema = Schema(implementation = GetPromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getPromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getPromoOffersRequest: GetPromoOffersRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetPromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение списка товаров, которые участвуют или могут участвовать в акции",
        operationId = "getPromoOffers",
        description = """Возвращает список товаров, которые участвуют или могут участвовать в акции.

{% note warning %}

В параметре `limit` не передавайте значение больше 500.

{% endnote %}

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров, которые участвуют или могут участвовать в акции.", content = [Content(schema = Schema(implementation = GetPromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getPromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getPromoOffersRequest: GetPromoOffersRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetPromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение списка товаров, которые участвуют или могут участвовать в акции",
        operationId = "getPromoOffers",
        description = """Возвращает список товаров, которые участвуют или могут участвовать в акции.

{% note warning %}

В параметре `limit` не передавайте значение больше 500.

{% endnote %}

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров, которые участвуют или могут участвовать в акции.", content = [Content(schema = Schema(implementation = GetPromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getPromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getPromoOffersRequest: GetPromoOffersRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetPromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение списка товаров, которые участвуют или могут участвовать в акции",
        operationId = "getPromoOffers",
        description = """Возвращает список товаров, которые участвуют или могут участвовать в акции.

{% note warning %}

В параметре `limit` не передавайте значение больше 500.

{% endnote %}

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список товаров, которые участвуют или могут участвовать в акции.", content = [Content(schema = Schema(implementation = GetPromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getPromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getPromoOffersRequest: GetPromoOffersRequest,@Parameter(description = "Идентификатор страницы c результатами.  Если параметр не указан, возвращается первая страница.  Рекомендуется передавать значение выходного параметра `nextPageToken`, полученное при последнем запросе.  Если задан `page_token` и в запросе есть параметры `offset`, `page_number` и `page_size`, они игнорируются. ") @Valid @RequestParam(value = "page_token", required = false) pageToken: kotlin.String?,@Parameter(description = "Количество значений на одной странице. ") @Valid @RequestParam(value = "limit", required = false) limit: kotlin.Int?): ResponseEntity<GetPromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение списка акций",
        operationId = "getPromos",
        description = """Возвращает информацию об акциях Маркета.

По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.

Чтобы получить текущие или завершенные акции, передайте параметр `participation`.

Типы акций, которые возвращаются в ответе:

* прямая скидка;
* флеш-акция;
* скидка по промокоду.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список акций Маркета.", content = [Content(schema = Schema(implementation = GetPromosResponse::class))]),
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
        value = ["/businesses/{businessId}/promos"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getPromos(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "") @Valid @RequestBody(required = false) getPromosRequest: GetPromosRequest?): ResponseEntity<GetPromosResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение списка акций",
        operationId = "getPromos",
        description = """Возвращает информацию об акциях Маркета.

По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.

Чтобы получить текущие или завершенные акции, передайте параметр `participation`.

Типы акций, которые возвращаются в ответе:

* прямая скидка;
* флеш-акция;
* скидка по промокоду.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список акций Маркета.", content = [Content(schema = Schema(implementation = GetPromosResponse::class))]),
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
        value = ["/businesses/{businessId}/promos"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getPromos(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "") @Valid @RequestBody(required = false) getPromosRequest: GetPromosRequest?): ResponseEntity<GetPromosResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение списка акций",
        operationId = "getPromos",
        description = """Возвращает информацию об акциях Маркета.

По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.

Чтобы получить текущие или завершенные акции, передайте параметр `participation`.

Типы акций, которые возвращаются в ответе:

* прямая скидка;
* флеш-акция;
* скидка по промокоду.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список акций Маркета.", content = [Content(schema = Schema(implementation = GetPromosResponse::class))]),
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
        value = ["/businesses/{businessId}/promos"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getPromos(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "") @Valid @RequestBody(required = false) getPromosRequest: GetPromosRequest?): ResponseEntity<GetPromosResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение списка акций",
        operationId = "getPromos",
        description = """Возвращает информацию об акциях Маркета.

По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.

Чтобы получить текущие или завершенные акции, передайте параметр `participation`.

Типы акций, которые возвращаются в ответе:

* прямая скидка;
* флеш-акция;
* скидка по промокоду.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список акций Маркета.", content = [Content(schema = Schema(implementation = GetPromosResponse::class))]),
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
        value = ["/businesses/{businessId}/promos"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getPromos(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "") @Valid @RequestBody(required = false) getPromosRequest: GetPromosRequest?): ResponseEntity<GetPromosResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Получение списка акций",
        operationId = "getPromos",
        description = """Возвращает информацию об акциях Маркета.

По умолчанию возвращаются акции, в которых продавец участвует или может принять участие.

Чтобы получить текущие или завершенные акции, передайте параметр `participation`.

Типы акций, которые возвращаются в ответе:

* прямая скидка;
* флеш-акция;
* скидка по промокоду.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список акций Маркета.", content = [Content(schema = Schema(implementation = GetPromosResponse::class))]),
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
        value = ["/businesses/{businessId}/promos"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getPromos(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "") @Valid @RequestBody(required = false) getPromosRequest: GetPromosRequest?): ResponseEntity<GetPromosResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Индекс качества магазинов",
        operationId = "getQualityRatings",
        description = """Возвращает значение индекса качества магазинов и его составляющие.

Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Значение индекса качества магазинов и его составляющие.", content = [Content(schema = Schema(implementation = GetQualityRatingResponse::class))]),
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
        value = ["/businesses/{businessId}/ratings/quality"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getQualityRatings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getQualityRatingRequest: GetQualityRatingRequest): ResponseEntity<GetQualityRatingResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Индекс качества магазинов",
        operationId = "getQualityRatings",
        description = """Возвращает значение индекса качества магазинов и его составляющие.

Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Значение индекса качества магазинов и его составляющие.", content = [Content(schema = Schema(implementation = GetQualityRatingResponse::class))]),
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
        value = ["/businesses/{businessId}/ratings/quality"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getQualityRatings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getQualityRatingRequest: GetQualityRatingRequest): ResponseEntity<GetQualityRatingResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Индекс качества магазинов",
        operationId = "getQualityRatings",
        description = """Возвращает значение индекса качества магазинов и его составляющие.

Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Значение индекса качества магазинов и его составляющие.", content = [Content(schema = Schema(implementation = GetQualityRatingResponse::class))]),
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
        value = ["/businesses/{businessId}/ratings/quality"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getQualityRatings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getQualityRatingRequest: GetQualityRatingRequest): ResponseEntity<GetQualityRatingResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Индекс качества магазинов",
        operationId = "getQualityRatings",
        description = """Возвращает значение индекса качества магазинов и его составляющие.

Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Значение индекса качества магазинов и его составляющие.", content = [Content(schema = Schema(implementation = GetQualityRatingResponse::class))]),
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
        value = ["/businesses/{businessId}/ratings/quality"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getQualityRatings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getQualityRatingRequest: GetQualityRatingRequest): ResponseEntity<GetQualityRatingResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Индекс качества магазинов",
        operationId = "getQualityRatings",
        description = """Возвращает значение индекса качества магазинов и его составляющие.

Подробнее об индексе качества читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/quality/score/).

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Значение индекса качества магазинов и его составляющие.", content = [Content(schema = Schema(implementation = GetQualityRatingResponse::class))]),
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
        value = ["/businesses/{businessId}/ratings/quality"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getQualityRatings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody getQualityRatingRequest: GetQualityRatingRequest): ResponseEntity<GetQualityRatingResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Просмотр карточек на Маркете, которые подходят вашим товарам",
        operationId = "getSuggestedOfferMappings",
        description = """Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.

Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.

**Как пользоваться запросом**

1. Передайте Маркету список товаров, которые нужно проверить.
2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией.
3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`.
4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.

{% note info "𝓠 Как определить `marketSku` товара, найденного на Маркете?" %}

𝓐 Он есть в адресе страницы товара — расположен после `sku=`.

Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. ", content = [Content(schema = Schema(implementation = GetSuggestedOfferMappingsResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-mappings/suggestions"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getSuggestedOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "") @Valid @RequestBody(required = false) getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest?): ResponseEntity<GetSuggestedOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Просмотр карточек на Маркете, которые подходят вашим товарам",
        operationId = "getSuggestedOfferMappings",
        description = """Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.

Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.

**Как пользоваться запросом**

1. Передайте Маркету список товаров, которые нужно проверить.
2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией.
3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`.
4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.

{% note info "𝓠 Как определить `marketSku` товара, найденного на Маркете?" %}

𝓐 Он есть в адресе страницы товара — расположен после `sku=`.

Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. ", content = [Content(schema = Schema(implementation = GetSuggestedOfferMappingsResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-mappings/suggestions"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getSuggestedOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "") @Valid @RequestBody(required = false) getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest?): ResponseEntity<GetSuggestedOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Просмотр карточек на Маркете, которые подходят вашим товарам",
        operationId = "getSuggestedOfferMappings",
        description = """Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.

Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.

**Как пользоваться запросом**

1. Передайте Маркету список товаров, которые нужно проверить.
2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией.
3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`.
4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.

{% note info "𝓠 Как определить `marketSku` товара, найденного на Маркете?" %}

𝓐 Он есть в адресе страницы товара — расположен после `sku=`.

Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. ", content = [Content(schema = Schema(implementation = GetSuggestedOfferMappingsResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-mappings/suggestions"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getSuggestedOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "") @Valid @RequestBody(required = false) getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest?): ResponseEntity<GetSuggestedOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Просмотр карточек на Маркете, которые подходят вашим товарам",
        operationId = "getSuggestedOfferMappings",
        description = """Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.

Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.

**Как пользоваться запросом**

1. Передайте Маркету список товаров, которые нужно проверить.
2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией.
3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`.
4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.

{% note info "𝓠 Как определить `marketSku` товара, найденного на Маркете?" %}

𝓐 Он есть в адресе страницы товара — расположен после `sku=`.

Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. ", content = [Content(schema = Schema(implementation = GetSuggestedOfferMappingsResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-mappings/suggestions"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getSuggestedOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "") @Valid @RequestBody(required = false) getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest?): ResponseEntity<GetSuggestedOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Просмотр карточек на Маркете, которые подходят вашим товарам",
        operationId = "getSuggestedOfferMappings",
        description = """Возвращает идентификаторы карточек на Маркете, которые соответствуют товарам с заданными параметрами.

Пользоваться этим запросом необязательно: он просто помогает заранее убедиться, что Маркет верно определяет карточки по предоставленным вами данным.

**Как пользоваться запросом**

1. Передайте Маркету список товаров, которые нужно проверить.
2. В ответ вы получите список SKU на Маркете с расшифровкой: названием, идентификатором модели, категорией.
3. Если расшифровки мало, вы можете открыть карточку. Для этого перейдите по ссылке вида `https://market.yandex.ru/product/<marketModelId>?sku=<marketSku>`.
4. Если карточка соответствует товару, значит его можно добавлять в каталог с теми данными, что вы указали. Если карточка определилась неправильно — проверьте данные о товаре. Возможно, их нужно уточнить или дополнить. Кроме того, на этапе добавления товара вы можете указать `marketSKU`, который ему подходит по вашему мнению.

{% note info "𝓠 Как определить `marketSku` товара, найденного на Маркете?" %}

𝓐 Он есть в адресе страницы товара — расположен после `sku=`.

Например, `https://market.yandex.ru/product--yandex-kniga/484830016?sku=484830016`

{% endnote %}

|**⚙️ Лимит:** 100 000 товаров в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Подобранные карточки на Маркете.  По результатам проверки товара полученная через этот запрос карточка может быть заменена на другую. ", content = [Content(schema = Schema(implementation = GetSuggestedOfferMappingsResponse::class))]),
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
        value = ["/businesses/{businessId}/offer-mappings/suggestions"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun getSuggestedOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "") @Valid @RequestBody(required = false) getSuggestedOfferMappingsRequest: GetSuggestedOfferMappingsRequest?): ResponseEntity<GetSuggestedOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Список складов и групп складов",
        operationId = "getWarehouses",
        description = """Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)

Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список складов и групп складов.", content = [Content(schema = Schema(implementation = GetWarehousesResponse::class))]),
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
        value = ["/businesses/{businessId}/warehouses"],
        produces = ["application/json"]
    )
    fun getWarehouses(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long): ResponseEntity<GetWarehousesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Список складов и групп складов",
        operationId = "getWarehouses",
        description = """Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)

Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список складов и групп складов.", content = [Content(schema = Schema(implementation = GetWarehousesResponse::class))]),
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
        value = ["/businesses/{businessId}/warehouses"],
        produces = ["application/json"]
    )
    fun getWarehouses(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long): ResponseEntity<GetWarehousesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Список складов и групп складов",
        operationId = "getWarehouses",
        description = """Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)

Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список складов и групп складов.", content = [Content(schema = Schema(implementation = GetWarehousesResponse::class))]),
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
        value = ["/businesses/{businessId}/warehouses"],
        produces = ["application/json"]
    )
    fun getWarehouses(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long): ResponseEntity<GetWarehousesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Список складов и групп складов",
        operationId = "getWarehouses",
        description = """Возвращает список складов и, если склады объединены, список групп складов. [Что такое группы складов и зачем они нужны](https://yandex.ru/support/marketplace/assortment/operations/stocks.html#unified-stocks)

Среди прочего запрос позволяет определить идентификатор, который нужно использовать при передаче остатков для группы складов.

|**⚙️ Лимит:** 100 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Список складов и групп складов.", content = [Content(schema = Schema(implementation = GetWarehousesResponse::class))]),
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
        value = ["/businesses/{businessId}/warehouses"],
        produces = ["application/json"]
    )
    fun getWarehouses(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long): ResponseEntity<GetWarehousesResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Включение буста продаж и установка ставок",
        operationId = "putBidsForBusiness",
        description = """Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

{% cut "Как в кабинете выглядит кампания, созданная через API" %}

![](../../_images/api-boost.png)

{% endcut %}

При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info "𝓠 Как посмотреть расходы на буст продаж?" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. ", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/businesses/{businessId}/bids"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun putBidsForBusiness(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody putSkuBidsRequest: PutSkuBidsRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Включение буста продаж и установка ставок",
        operationId = "putBidsForBusiness",
        description = """Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

{% cut "Как в кабинете выглядит кампания, созданная через API" %}

![](../../_images/api-boost.png)

{% endcut %}

При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info "𝓠 Как посмотреть расходы на буст продаж?" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. ", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/businesses/{businessId}/bids"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun putBidsForBusiness(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody putSkuBidsRequest: PutSkuBidsRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Включение буста продаж и установка ставок",
        operationId = "putBidsForBusiness",
        description = """Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

{% cut "Как в кабинете выглядит кампания, созданная через API" %}

![](../../_images/api-boost.png)

{% endcut %}

При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info "𝓠 Как посмотреть расходы на буст продаж?" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. ", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/businesses/{businessId}/bids"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun putBidsForBusiness(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody putSkuBidsRequest: PutSkuBidsRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Включение буста продаж и установка ставок",
        operationId = "putBidsForBusiness",
        description = """Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

{% cut "Как в кабинете выглядит кампания, созданная через API" %}

![](../../_images/api-boost.png)

{% endcut %}

При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info "𝓠 Как посмотреть расходы на буст продаж?" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. ", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/businesses/{businessId}/bids"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun putBidsForBusiness(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody putSkuBidsRequest: PutSkuBidsRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Включение буста продаж и установка ставок",
        operationId = "putBidsForBusiness",
        description = """Запускает буст продаж — создает и включает кампанию, добавляет в нее товары и назначает на них ставки.

{% cut "Как в кабинете выглядит кампания, созданная через API" %}

![](../../_images/api-boost.png)

{% endcut %}

При первом использовании запроса Маркет: создаст единую на все магазины бизнес-аккаунта кампанию, добавит в нее товары с указанными ставками, включит для них ценовую стратегию и запустит продвижение. Повторное использование запроса позволит обновить ставки на товары в этой кампании или добавить новые. Подробнее о ценовой стратегии читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html#price-strategy).

Если товара с указанным SKU нет, он будет проигнорирован. Если в будущем в каталоге появится товар с таким SKU, он автоматически будет добавлен в кампанию с указанной ставкой.

Запрос всегда работает с одной и той же созданной через API кампанией. Если в кабинете удалить ее, при следующем выполнении запроса Маркет создаст новую. Другими кампаниями управлять через API не получится. У созданной через API кампании всегда наибольший приоритет над остальными — изменить его нельзя.

Выполнение запроса включает кампанию и ценовую стратегию, если они были отключены.

Внести другие изменения в созданную через API кампанию можно в кабинете:

* выключить или включить кампанию;
* изменить ее название;
* выключить или включить ценовую стратегию.

Чтобы остановить продвижение отдельных товаров и удалить их из кампании, передайте для них нулевую ставку в параметре `bid`.

Подробнее о том, как работает буст продаж, читайте в [Справке Маркета для продавцов](https://yandex.ru/support/marketplace/marketing/campaigns.html).

{% note info "𝓠 Как посмотреть расходы на буст продаж?" %}

𝓐 Фактические расходы на буст указаны в отчете по заказам ([POST campaigns/{campaignId}/stats/orders](../../reference/stats/getOrdersStats.md)). Сумма содержится в поле `bidFee`.

{% endnote %}

В одном запросе может быть максимум 1500 товаров.

|**⚙️ Лимит:** 1000 запросов в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все получилось: ставки установлены или обновлены. Если нужно, добавлены новые товары и запущена кампания. ", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.PUT],
        value = ["/businesses/{businessId}/bids"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun putBidsForBusiness(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody putSkuBidsRequest: PutSkuBidsRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отправка файла в чат",
        operationId = "sendFileToChat",
        description = """Отправляет файл в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что файл отправлен.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/file/send"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun sendFileToChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "Содержимое файла. Максимальный размер файла — 5 Мбайт.") @Valid @RequestPart("file", required = true) file: org.springframework.core.io.Resource): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отправка файла в чат",
        operationId = "sendFileToChat",
        description = """Отправляет файл в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что файл отправлен.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/file/send"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun sendFileToChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "Содержимое файла. Максимальный размер файла — 5 Мбайт.") @Valid @RequestPart("file", required = true) file: org.springframework.core.io.Resource): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отправка файла в чат",
        operationId = "sendFileToChat",
        description = """Отправляет файл в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что файл отправлен.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/file/send"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun sendFileToChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "Содержимое файла. Максимальный размер файла — 5 Мбайт.") @Valid @RequestPart("file", required = true) file: org.springframework.core.io.Resource): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отправка файла в чат",
        operationId = "sendFileToChat",
        description = """Отправляет файл в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что файл отправлен.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/file/send"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun sendFileToChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "Содержимое файла. Максимальный размер файла — 5 Мбайт.") @Valid @RequestPart("file", required = true) file: org.springframework.core.io.Resource): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отправка файла в чат",
        operationId = "sendFileToChat",
        description = """Отправляет файл в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что файл отправлен.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/file/send"],
        produces = ["application/json"],
        consumes = ["multipart/form-data"]
    )
    fun sendFileToChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "Содержимое файла. Максимальный размер файла — 5 Мбайт.") @Valid @RequestPart("file", required = true) file: org.springframework.core.io.Resource): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отправка сообщения в чат",
        operationId = "sendMessageToChat",
        description = """Отправляет сообщение в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что сообщение отправлено.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/message"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun sendMessageToChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody sendMessageToChatRequest: SendMessageToChatRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отправка сообщения в чат",
        operationId = "sendMessageToChat",
        description = """Отправляет сообщение в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что сообщение отправлено.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/message"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun sendMessageToChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody sendMessageToChatRequest: SendMessageToChatRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отправка сообщения в чат",
        operationId = "sendMessageToChat",
        description = """Отправляет сообщение в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что сообщение отправлено.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/message"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun sendMessageToChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody sendMessageToChatRequest: SendMessageToChatRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отправка сообщения в чат",
        operationId = "sendMessageToChat",
        description = """Отправляет сообщение в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что сообщение отправлено.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/message"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun sendMessageToChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody sendMessageToChatRequest: SendMessageToChatRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отправка сообщения в чат",
        operationId = "sendMessageToChat",
        description = """Отправляет сообщение в чат с покупателем.

|**⚙️ Лимит:** 1000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ. Означает, что сообщение отправлено.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/chats/message"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun sendMessageToChat(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@NotNull @Parameter(description = "Идентификатор чата.", required = true) @Valid @RequestParam(value = "chatId", required = true) chatId: kotlin.Long,@Parameter(description = "description", required = true) @Valid @RequestBody sendMessageToChatRequest: SendMessageToChatRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отказ от ответа на отзывы",
        operationId = "skipGoodsFeedbacksReaction",
        description = """Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/skip-reaction"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun skipGoodsFeedbacksReaction(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отказ от ответа на отзывы",
        operationId = "skipGoodsFeedbacksReaction",
        description = """Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/skip-reaction"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun skipGoodsFeedbacksReaction(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отказ от ответа на отзывы",
        operationId = "skipGoodsFeedbacksReaction",
        description = """Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/skip-reaction"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun skipGoodsFeedbacksReaction(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отказ от ответа на отзывы",
        operationId = "skipGoodsFeedbacksReaction",
        description = """Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/skip-reaction"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun skipGoodsFeedbacksReaction(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Отказ от ответа на отзывы",
        operationId = "skipGoodsFeedbacksReaction",
        description = """Пропускает отзывы — они больше не будут возвращаться в методе получения всех отзывов [POST businesses/{businessId}/goods-feedback](../../reference/goods-feedback/getGoodsFeedbacks.md).

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Пустой ответ.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/skip-reaction"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun skipGoodsFeedbacksReaction(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody skipGoodsFeedbackReactionRequest: SkipGoodsFeedbackReactionRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Установка цен на товары во всех магазинах",
        operationId = "updateBusinessPrices",
        description = """Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Маркет принял информацию о новых ценах.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-prices/updates"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateBusinessPrices(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateBusinessPricesRequest: UpdateBusinessPricesRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Установка цен на товары во всех магазинах",
        operationId = "updateBusinessPrices",
        description = """Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Маркет принял информацию о новых ценах.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-prices/updates"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateBusinessPrices(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateBusinessPricesRequest: UpdateBusinessPricesRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Установка цен на товары во всех магазинах",
        operationId = "updateBusinessPrices",
        description = """Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Маркет принял информацию о новых ценах.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-prices/updates"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateBusinessPrices(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateBusinessPricesRequest: UpdateBusinessPricesRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Установка цен на товары во всех магазинах",
        operationId = "updateBusinessPrices",
        description = """Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Маркет принял информацию о новых ценах.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-prices/updates"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateBusinessPrices(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateBusinessPricesRequest: UpdateBusinessPricesRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Установка цен на товары во всех магазинах",
        operationId = "updateBusinessPrices",
        description = """Устанавливает [базовые цены](*default-price). Чтобы получить рекомендации Маркета, касающиеся цен, выполните запрос [POST businesses/{businessId}/offers/recommendations](../../reference/business-assortment/getOfferRecommendations.md).

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Маркет принял информацию о новых ценах.", content = [Content(schema = Schema(implementation = EmptyApiResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-prices/updates"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateBusinessPrices(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateBusinessPricesRequest: UpdateBusinessPricesRequest): ResponseEntity<EmptyApiResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление нового или изменение созданного комментария",
        operationId = "updateGoodsFeedbackComment",
        description = """Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.

Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.

Чтобы добавить комментарий к другому комментарию, передайте:

* `feedbackId` — идентификатор отзыва;
* `comment.parentId` — идентификатор родительского комментария.

Чтобы изменить комментарий, передайте:

* `feedbackId`— идентификатор отзыва;
* `comment.id` — идентификатор комментария, который нужно изменить.

Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о добавленном или измененном комментарии.", content = [Content(schema = Schema(implementation = UpdateGoodsFeedbackCommentResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateGoodsFeedbackComment(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): ResponseEntity<UpdateGoodsFeedbackCommentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление нового или изменение созданного комментария",
        operationId = "updateGoodsFeedbackComment",
        description = """Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.

Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.

Чтобы добавить комментарий к другому комментарию, передайте:

* `feedbackId` — идентификатор отзыва;
* `comment.parentId` — идентификатор родительского комментария.

Чтобы изменить комментарий, передайте:

* `feedbackId`— идентификатор отзыва;
* `comment.id` — идентификатор комментария, который нужно изменить.

Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о добавленном или измененном комментарии.", content = [Content(schema = Schema(implementation = UpdateGoodsFeedbackCommentResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateGoodsFeedbackComment(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): ResponseEntity<UpdateGoodsFeedbackCommentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление нового или изменение созданного комментария",
        operationId = "updateGoodsFeedbackComment",
        description = """Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.

Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.

Чтобы добавить комментарий к другому комментарию, передайте:

* `feedbackId` — идентификатор отзыва;
* `comment.parentId` — идентификатор родительского комментария.

Чтобы изменить комментарий, передайте:

* `feedbackId`— идентификатор отзыва;
* `comment.id` — идентификатор комментария, который нужно изменить.

Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о добавленном или измененном комментарии.", content = [Content(schema = Schema(implementation = UpdateGoodsFeedbackCommentResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateGoodsFeedbackComment(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): ResponseEntity<UpdateGoodsFeedbackCommentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление нового или изменение созданного комментария",
        operationId = "updateGoodsFeedbackComment",
        description = """Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.

Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.

Чтобы добавить комментарий к другому комментарию, передайте:

* `feedbackId` — идентификатор отзыва;
* `comment.parentId` — идентификатор родительского комментария.

Чтобы изменить комментарий, передайте:

* `feedbackId`— идентификатор отзыва;
* `comment.id` — идентификатор комментария, который нужно изменить.

Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о добавленном или измененном комментарии.", content = [Content(schema = Schema(implementation = UpdateGoodsFeedbackCommentResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateGoodsFeedbackComment(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): ResponseEntity<UpdateGoodsFeedbackCommentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление нового или изменение созданного комментария",
        operationId = "updateGoodsFeedbackComment",
        description = """Добавляет новый комментарий магазина или изменяет комментарий, который магазин оставлял ранее.

Для создания комментария к отзыву передайте только идентификатор отзыва `feedbackId`.

Чтобы добавить комментарий к другому комментарию, передайте:

* `feedbackId` — идентификатор отзыва;
* `comment.parentId` — идентификатор родительского комментария.

Чтобы изменить комментарий, передайте:

* `feedbackId`— идентификатор отзыва;
* `comment.id` — идентификатор комментария, который нужно изменить.

Если передать одновременно `comment.parentId` и `comment.id`, будет изменен существующий комментарий.

|**⚙️ Лимит:** 1 000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Информация о добавленном или измененном комментарии.", content = [Content(schema = Schema(implementation = UpdateGoodsFeedbackCommentResponse::class))]),
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
        value = ["/businesses/{businessId}/goods-feedback/comments/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateGoodsFeedbackComment(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateGoodsFeedbackCommentRequest: UpdateGoodsFeedbackCommentRequest): ResponseEntity<UpdateGoodsFeedbackCommentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Редактирование категорийных характеристик товара",
        operationId = "updateOfferContent",
        description = """Редактирует характеристики товара, которые специфичны для категории, к которой он относится.

{% note warning "Здесь только то, что относится к конкретной категории" %}

Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Запрос выполнен корректно, данные обработаны.  {% note warning \"Ответ 200 сам по себе не значит, что переданные значения корректны\" %}  Обязательно посмотрите детали ответа: `status` и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в `status` вернулось `ERROR`, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля `errors` и `warnings`. ", content = [Content(schema = Schema(implementation = UpdateOfferContentResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-cards/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOfferContent(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateOfferContentRequest: UpdateOfferContentRequest): ResponseEntity<UpdateOfferContentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Редактирование категорийных характеристик товара",
        operationId = "updateOfferContent",
        description = """Редактирует характеристики товара, которые специфичны для категории, к которой он относится.

{% note warning "Здесь только то, что относится к конкретной категории" %}

Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Запрос выполнен корректно, данные обработаны.  {% note warning \"Ответ 200 сам по себе не значит, что переданные значения корректны\" %}  Обязательно посмотрите детали ответа: `status` и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в `status` вернулось `ERROR`, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля `errors` и `warnings`. ", content = [Content(schema = Schema(implementation = UpdateOfferContentResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-cards/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOfferContent(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateOfferContentRequest: UpdateOfferContentRequest): ResponseEntity<UpdateOfferContentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Редактирование категорийных характеристик товара",
        operationId = "updateOfferContent",
        description = """Редактирует характеристики товара, которые специфичны для категории, к которой он относится.

{% note warning "Здесь только то, что относится к конкретной категории" %}

Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Запрос выполнен корректно, данные обработаны.  {% note warning \"Ответ 200 сам по себе не значит, что переданные значения корректны\" %}  Обязательно посмотрите детали ответа: `status` и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в `status` вернулось `ERROR`, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля `errors` и `warnings`. ", content = [Content(schema = Schema(implementation = UpdateOfferContentResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-cards/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOfferContent(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateOfferContentRequest: UpdateOfferContentRequest): ResponseEntity<UpdateOfferContentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Редактирование категорийных характеристик товара",
        operationId = "updateOfferContent",
        description = """Редактирует характеристики товара, которые специфичны для категории, к которой он относится.

{% note warning "Здесь только то, что относится к конкретной категории" %}

Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Запрос выполнен корректно, данные обработаны.  {% note warning \"Ответ 200 сам по себе не значит, что переданные значения корректны\" %}  Обязательно посмотрите детали ответа: `status` и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в `status` вернулось `ERROR`, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля `errors` и `warnings`. ", content = [Content(schema = Schema(implementation = UpdateOfferContentResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-cards/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOfferContent(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateOfferContentRequest: UpdateOfferContentRequest): ResponseEntity<UpdateOfferContentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Редактирование категорийных характеристик товара",
        operationId = "updateOfferContent",
        description = """Редактирует характеристики товара, которые специфичны для категории, к которой он относится.

{% note warning "Здесь только то, что относится к конкретной категории" %}

Если вам нужно изменить основные параметры товара (название, описание, изображения, видео, производитель, штрихкод), воспользуйтесь запросом [POST businesses/{businessId}/offer-mappings/update](../../reference/business-assortment/updateOfferMappings.md).

{% endnote %}

Чтобы удалить характеристики, которые заданы в параметрах с типом `string`, передайте пустое значение.

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Запрос выполнен корректно, данные обработаны.  {% note warning \"Ответ 200 сам по себе не значит, что переданные значения корректны\" %}  Обязательно посмотрите детали ответа: `status` и перечень ошибок, если он есть.  Даже если ошибка допущена в характеристиках всего одного товара, никакие изменения из запроса в каталог не попадут.  {% endnote %}  Если в `status` вернулось `ERROR`, убедитесь, что:  * все обязательные характеристики заполнены; * характеристики действительно существуют в указанных категориях; * значения соответствуют характеристикам; * ваши собственные значения имеют нужный тип данных.  Найти проблемы помогут поля `errors` и `warnings`. ", content = [Content(schema = Schema(implementation = UpdateOfferContentResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-cards/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOfferContent(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateOfferContentRequest: UpdateOfferContentRequest): ResponseEntity<UpdateOfferContentResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в каталог и изменение информации о них",
        operationId = "updateOfferMappings",
        description = """Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.

Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).

Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.

Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.

Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.

Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.

Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.

{% note warning "Правила использования SKU" %}

* У каждого товара SKU должен быть свой.

* SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.

* Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.

{% endnote %}

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. ", content = [Content(schema = Schema(implementation = UpdateOfferMappingsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateOfferMappingsRequest: UpdateOfferMappingsRequest): ResponseEntity<UpdateOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в каталог и изменение информации о них",
        operationId = "updateOfferMappings",
        description = """Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.

Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).

Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.

Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.

Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.

Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.

Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.

{% note warning "Правила использования SKU" %}

* У каждого товара SKU должен быть свой.

* SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.

* Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.

{% endnote %}

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. ", content = [Content(schema = Schema(implementation = UpdateOfferMappingsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateOfferMappingsRequest: UpdateOfferMappingsRequest): ResponseEntity<UpdateOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в каталог и изменение информации о них",
        operationId = "updateOfferMappings",
        description = """Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.

Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).

Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.

Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.

Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.

Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.

Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.

{% note warning "Правила использования SKU" %}

* У каждого товара SKU должен быть свой.

* SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.

* Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.

{% endnote %}

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. ", content = [Content(schema = Schema(implementation = UpdateOfferMappingsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateOfferMappingsRequest: UpdateOfferMappingsRequest): ResponseEntity<UpdateOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в каталог и изменение информации о них",
        operationId = "updateOfferMappings",
        description = """Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.

Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).

Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.

Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.

Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.

Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.

Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.

{% note warning "Правила использования SKU" %}

* У каждого товара SKU должен быть свой.

* SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.

* Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.

{% endnote %}

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. ", content = [Content(schema = Schema(implementation = UpdateOfferMappingsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateOfferMappingsRequest: UpdateOfferMappingsRequest): ResponseEntity<UpdateOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в каталог и изменение информации о них",
        operationId = "updateOfferMappings",
        description = """Добавляет товары в каталог, передает их категории на Маркете и характеристики, необходимые для этих категории. Также редактирует информацию об уже имеющихся товарах.

Список категорий Маркета можно получить с помощью запроса [POST categories/tree](../../reference/categories/getCategoriesTree.md), а характеристики товаров по категориям с помощью [POST category/{categoryId}/parameters](../../reference/content/getCategoryContentParameters.md).

Чтобы **добавить новый товар**, передайте его с новым идентификатором, который раньше никогда не использовался в каталоге. Старайтесь сразу передать как можно больше информации — она потребуется Маркету для подбора подходящей карточки или создания новой. Если известно, какой карточке на Маркете соответствует товар, можно сразу указать идентификатор этой карточки (**SKU на Маркете**) в поле `marketSKU`.

Для **новых товаров** обязательно укажите параметры: `offerId`, `name`, `marketCategoryId` или `category`, `pictures`, `vendor`, `description`.

Чтобы **отредактировать информацию о товаре**, передайте новые данные, указав в `offerId` соответствующий **ваш SKU**. Поля, в которых ничего не меняется, можно не передавать.

Чтобы **удалить характеристики**, которые заданы в параметрах с типом `string`, передайте пустое значение.

Параметр `offerId` должен быть **уникальным** для всех товаров, которые вы передаете.

{% note warning "Правила использования SKU" %}

* У каждого товара SKU должен быть свой.

* SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.

* Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.

{% endnote %}

{% note info "Данные в каталоге обновляются не мгновенно" %}

Это занимает до нескольких минут.

{% endnote %}

|**⚙️ Лимит:** 5000 товаров в минуту, не более 500 товаров в одном запросе|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Все обязательные поля товаров заполнены, поэтому новые товары и внесенные изменения сохранены в каталоге. ", content = [Content(schema = Schema(implementation = UpdateOfferMappingsResponse::class))]),
            ApiResponse(responseCode = "400", description = "Запрос содержит неправильные данные.", content = [Content(schema = Schema(implementation = ApiClientDataErrorResponse::class))]),
            ApiResponse(responseCode = "401", description = "В запросе не указаны данные для авторизации.", content = [Content(schema = Schema(implementation = ApiUnauthorizedErrorResponse::class))]),
            ApiResponse(responseCode = "403", description = "Данные для авторизации неверны или доступ к ресурсу запрещен.", content = [Content(schema = Schema(implementation = ApiForbiddenErrorResponse::class))]),
            ApiResponse(responseCode = "404", description = "Запрашиваемый ресурс не найден.", content = [Content(schema = Schema(implementation = ApiNotFoundErrorResponse::class))]),
            ApiResponse(responseCode = "420", description = "Превышено ограничение на доступ к ресурсу.", content = [Content(schema = Schema(implementation = ApiLimitErrorResponse::class))]),
            ApiResponse(responseCode = "423", description = "К ресурсу нельзя применить указанный метод.", content = [Content(schema = Schema(implementation = ApiLockedErrorResponse::class))]),
            ApiResponse(responseCode = "500", description = "Внутренняя ошибка сервера.", content = [Content(schema = Schema(implementation = ApiServerErrorResponse::class))]) ],
        security = [ SecurityRequirement(name = "OAuth", scopes = [ "market:partner-api" ]) ]
    )
    @RequestMapping(
        method = [RequestMethod.POST],
        value = ["/businesses/{businessId}/offer-mappings/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updateOfferMappings(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updateOfferMappingsRequest: UpdateOfferMappingsRequest): ResponseEntity<UpdateOfferMappingsResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в акцию или изменение их цен",
        operationId = "updatePromoOffers",
        description = """Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Результат добавления товаров в акцию или обновления их цен.", content = [Content(schema = Schema(implementation = UpdatePromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updatePromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updatePromoOffersRequest: UpdatePromoOffersRequest): ResponseEntity<UpdatePromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в акцию или изменение их цен",
        operationId = "updatePromoOffers",
        description = """Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Результат добавления товаров в акцию или обновления их цен.", content = [Content(schema = Schema(implementation = UpdatePromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updatePromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updatePromoOffersRequest: UpdatePromoOffersRequest): ResponseEntity<UpdatePromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в акцию или изменение их цен",
        operationId = "updatePromoOffers",
        description = """Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Результат добавления товаров в акцию или обновления их цен.", content = [Content(schema = Schema(implementation = UpdatePromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updatePromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updatePromoOffersRequest: UpdatePromoOffersRequest): ResponseEntity<UpdatePromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в акцию или изменение их цен",
        operationId = "updatePromoOffers",
        description = """Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Результат добавления товаров в акцию или обновления их цен.", content = [Content(schema = Schema(implementation = UpdatePromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updatePromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updatePromoOffersRequest: UpdatePromoOffersRequest): ResponseEntity<UpdatePromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }

    @Operation(
        summary = "Добавление товаров в акцию или изменение их цен",
        operationId = "updatePromoOffers",
        description = """Добавляет товары в акцию или изменяет цены на товары, которые участвуют в акции.

Изменения начинают действовать в течение 4–6 часов.

|**⚙️ Лимит:** 10000 запросов в час|
|-|
""",
        responses = [
            ApiResponse(responseCode = "200", description = "Результат добавления товаров в акцию или обновления их цен.", content = [Content(schema = Schema(implementation = UpdatePromoOffersResponse::class))]),
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
        value = ["/businesses/{businessId}/promos/offers/update"],
        produces = ["application/json"],
        consumes = ["application/json"]
    )
    fun updatePromoOffers(@Parameter(description = "Идентификатор кабинета. Чтобы узнать идентификатор, воспользуйтесь запросом [GET campaigns](../../reference/campaigns/getCampaigns.md#businessdto).  ℹ️ [Что такое кабинет и магазин на Маркете](https://yandex.ru/support/marketplace/account/introduction.html) ", required = true) @PathVariable("businessId") businessId: kotlin.Long,@Parameter(description = "", required = true) @Valid @RequestBody updatePromoOffersRequest: UpdatePromoOffersRequest): ResponseEntity<UpdatePromoOffersResponse> {
        return ResponseEntity(HttpStatus.NOT_IMPLEMENTED)
    }
}
