package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.ReturnRequestDecisionType
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
 * Решения по позиции в возврате.
 * @param returnItemId Идентификатор товара в возврате.
 * @param decisionType 
 * @param comment Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. 
 */
data class SetReturnDecisionRequest(

    @Schema(example = "null", required = true, description = "Идентификатор товара в возврате.")
    @get:JsonProperty("returnItemId", required = true) val returnItemId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("decisionType", required = true) val decisionType: ReturnRequestDecisionType,

    @Schema(example = "null", description = "Комментарий к решению. Укажите:  * для `REFUND_MONEY_INCLUDING_SHIPMENT`— стоимость обратной пересылки;  * для `REPAIR` — когда вы устраните недостатки товара;  * для `DECLINE_REFUND` — причину отказа;  * для `OTHER_DECISION` — какое решение вы предлагаете. ")
    @get:JsonProperty("comment") val comment: kotlin.String? = null
    ) {

}

