package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 * @param id Идентификатор параметра.
 * @param title Название параметра. Например, `Скорость обработки заказа`.
 * @param description Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
 * @param &#x60;value&#x60; Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
 */
data class FeedbackFactorDTO(

    @Schema(example = "null", description = "Идентификатор параметра.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Название параметра. Например, `Скорость обработки заказа`.")
    @get:JsonProperty("title") val title: kotlin.String? = null,

    @Schema(example = "null", description = "Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). ")
    @get:JsonProperty("value") val `value`: kotlin.Int? = null
    ) {

}

