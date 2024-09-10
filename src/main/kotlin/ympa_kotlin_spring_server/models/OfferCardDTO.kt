package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.GetMappingDTO
import ympa_kotlin_spring_server.models.OfferCardRecommendationDTO
import ympa_kotlin_spring_server.models.OfferCardStatusType
import ympa_kotlin_spring_server.models.OfferErrorDTO
import ympa_kotlin_spring_server.models.ParameterValueDTO
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
 * Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param mapping 
 * @param parameterValues Список характеристик с их значениями. 
 * @param cardStatus 
 * @param contentRating Процент заполненности карточки.
 * @param recommendations Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
 * @param errors Ошибки в контенте, препятствующие размещению товара на витрине.
 * @param warnings Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
 */
data class OfferCardDTO(

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", required = true, description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("offerId", required = true) val offerId: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("mapping") val mapping: GetMappingDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "Список характеристик с их значениями. ")
    @get:JsonProperty("parameterValues") val parameterValues: kotlin.collections.List<ParameterValueDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("cardStatus") val cardStatus: OfferCardStatusType? = null,

    @Schema(example = "null", description = "Процент заполненности карточки.")
    @get:JsonProperty("contentRating") val contentRating: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. ")
    @get:JsonProperty("recommendations") val recommendations: kotlin.collections.List<OfferCardRecommendationDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Ошибки в контенте, препятствующие размещению товара на витрине.")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<OfferErrorDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.")
    @get:JsonProperty("warnings") val warnings: kotlin.collections.List<OfferErrorDTO>? = null
    ) {

}

