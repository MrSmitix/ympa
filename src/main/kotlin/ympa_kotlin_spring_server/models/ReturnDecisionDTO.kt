package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.ReturnDecisionReasonType
import ympa_kotlin_spring_server.models.ReturnDecisionSubreasonType
import ympa_kotlin_spring_server.models.ReturnDecisionType
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
 * Решения по возвратам.
 * @param returnItemId Идентификатор товара в возврате.
 * @param count Количество единиц товара.
 * @param comment Комментарий.
 * @param reasonType 
 * @param subreasonType 
 * @param decisionType 
 * @param refundAmount Сумма возврата.
 * @param partnerCompensation Компенсация за обратную доставку.
 * @param images Список хеш-кодов фотографий товара от покупателя.
 */
data class ReturnDecisionDTO(

    @Schema(example = "null", description = "Идентификатор товара в возврате.")
    @get:JsonProperty("returnItemId") val returnItemId: kotlin.Long? = null,

    @Schema(example = "null", description = "Количество единиц товара.")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @Schema(example = "null", description = "Комментарий.")
    @get:JsonProperty("comment") val comment: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("reasonType") val reasonType: ReturnDecisionReasonType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("subreasonType") val subreasonType: ReturnDecisionSubreasonType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("decisionType") val decisionType: ReturnDecisionType? = null,

    @Schema(example = "null", description = "Сумма возврата.")
    @get:JsonProperty("refundAmount") val refundAmount: kotlin.Long? = null,

    @Schema(example = "null", description = "Компенсация за обратную доставку.")
    @get:JsonProperty("partnerCompensation") val partnerCompensation: kotlin.Long? = null,

    @Schema(example = "null", description = "Список хеш-кодов фотографий товара от покупателя.")
    @get:JsonProperty("images") val images: kotlin.collections.List<kotlin.String>? = null
    ) {

}

