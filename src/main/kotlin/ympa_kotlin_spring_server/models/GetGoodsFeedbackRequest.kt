package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.FeedbackReactionStatusType
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Фильтр запроса отзывов в кабинете. 
 * @param dateTimeFrom Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. 
 * @param dateTimeTo Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. 
 * @param reactionStatus 
 * @param ratingValues Оценка товара.
 * @param modelIds Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). 
 * @param paid Фильтр отзывов за баллы Плюса.
 */
data class GetGoodsFeedbackRequest(

    @Schema(example = "null", description = "Начало периода. Не включительно.  Если параметр не указан, возвращается информация за 6 месяцев до указанной в `dateTimeTo` даты. ")
    @get:JsonProperty("dateTimeFrom") val dateTimeFrom: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Конец периода. Не включительно.  Если параметр не указан, используется текущая дата. ")
    @get:JsonProperty("dateTimeTo") val dateTimeTo: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("reactionStatus") val reactionStatus: FeedbackReactionStatusType? = null,

    @get:Size(max=5)
    @Schema(example = "null", description = "Оценка товара.")
    @get:JsonProperty("ratingValues") val ratingValues: kotlin.collections.Set<kotlin.Int>? = null,

    @get:Size(max=20)
    @Schema(example = "null", description = "Фильтр по идентификатору модели товара.  Получить идентификатор модели можно с помощью одного из запросов:  * [POST businesses/{businessId}/offer-mappings](../../reference/business-assortment/getOfferMappings.md);  * [POST businesses/{businessId}/offer-cards](../../reference/content/getOfferCardsContentStatus.md);  * [POST models](../../reference/models/getModels.md). ")
    @get:JsonProperty("modelIds") val modelIds: kotlin.collections.Set<kotlin.Long>? = null,

    @Schema(example = "null", description = "Фильтр отзывов за баллы Плюса.")
    @get:JsonProperty("paid") val paid: kotlin.Boolean? = null
    ) {

}

