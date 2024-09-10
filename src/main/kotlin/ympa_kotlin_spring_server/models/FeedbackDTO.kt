package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.FeedbackAuthorDTO
import ympa_kotlin_spring_server.models.FeedbackCommentDTO
import ympa_kotlin_spring_server.models.FeedbackGradesDTO
import ympa_kotlin_spring_server.models.FeedbackOrderDTO
import ympa_kotlin_spring_server.models.FeedbackShopDTO
import ympa_kotlin_spring_server.models.FeedbackStateType
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
 * Отзыв пользователя Яндекс Маркета об указанном магазине.
 * @param comments Переписка автора отзыва с магазином.
 * @param id Идентификатор отзыва.
 * @param createdAt Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. 
 * @param text Комментарий автора отзыва.
 * @param state 
 * @param author 
 * @param pro Достоинства магазина, описанные в отзыве.
 * @param contra Недостатки магазина, описанные в отзыве.
 * @param shop 
 * @param resolved Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. 
 * @param verified {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. 
 * @param recommend Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. 
 * @param grades 
 * @param order 
 */
data class FeedbackDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Переписка автора отзыва с магазином.")
    @get:JsonProperty("comments", required = true) val comments: kotlin.collections.List<FeedbackCommentDTO>,

    @Schema(example = "null", description = "Идентификатор отзыва.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Дата и время создания отзыва.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:00:00+03:00`. ")
    @get:JsonProperty("createdAt") val createdAt: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Комментарий автора отзыва.")
    @get:JsonProperty("text") val text: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("state") val state: FeedbackStateType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("author") val author: FeedbackAuthorDTO? = null,

    @Schema(example = "null", description = "Достоинства магазина, описанные в отзыве.")
    @get:JsonProperty("pro") val pro: kotlin.String? = null,

    @Schema(example = "null", description = "Недостатки магазина, описанные в отзыве.")
    @get:JsonProperty("contra") val contra: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("shop") val shop: FeedbackShopDTO? = null,

    @Schema(example = "null", description = "Решена ли проблема автора отзыва:  * `true` — да. * `false` — нет.  Если проблема решена, около отзыва на странице магазина появляется соответствующая надпись. ")
    @get:JsonProperty("resolved") val resolved: kotlin.Boolean? = null,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Является ли отзыв рекомендованным:  * `true` — да. * `false` — нет. ")
    @get:JsonProperty("verified") val verified: kotlin.Boolean? = null,

    @Schema(example = "null", description = "Купил бы автор отзыва в магазине снова:  * `true` — да. * `false` — нет. ")
    @get:JsonProperty("recommend") val recommend: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("grades") val grades: FeedbackGradesDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("order") val order: FeedbackOrderDTO? = null
    ) {

}

