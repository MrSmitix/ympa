package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OfferCardStatusType
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
 * 
 * @param offerIds Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. 
 * @param cardStatuses Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) 
 * @param categoryIds Фильтр по категориям на Маркете.
 */
data class GetOfferCardsContentStatusRequest(

    @get:Size(max=200)
    @Schema(example = "null", description = "Идентификаторы товаров, информация о которых нужна. <br><br> ⚠️ Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым. ")
    @get:JsonProperty("offerIds") val offerIds: kotlin.collections.Set<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Фильтр по статусам карточек.  [Что такое карточка товара](https://yandex.ru/support/marketplace/assortment/content/index.html) ")
    @get:JsonProperty("cardStatuses") val cardStatuses: kotlin.collections.Set<OfferCardStatusType>? = null,

    @get:Size(max=200)
    @Schema(example = "null", description = "Фильтр по категориям на Маркете.")
    @get:JsonProperty("categoryIds") val categoryIds: kotlin.collections.Set<kotlin.Int>? = null
    ) {

}

