package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.FeedbackFactorDTO
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
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 * @param factors Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 * @param average Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).
 * @param agreeCount Количество пользователей, считающих отзыв полезным.
 * @param rejectCount Количество пользователей, считающих отзыв бесполезным.
 */
data class FeedbackGradesDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. ")
    @get:JsonProperty("factors", required = true) val factors: kotlin.collections.List<FeedbackFactorDTO>,

    @Schema(example = "null", description = "Общая оценка, указанная в отзыве: от `1` («Ужасный магазин») до `5` («Отличный магазин»).")
    @get:JsonProperty("average") val average: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Количество пользователей, считающих отзыв полезным.")
    @get:JsonProperty("agreeCount") val agreeCount: kotlin.Long? = null,

    @Schema(example = "null", description = "Количество пользователей, считающих отзыв бесполезным.")
    @get:JsonProperty("rejectCount") val rejectCount: kotlin.Long? = null
    ) {

}

