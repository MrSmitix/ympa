package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.TariffParameterDTO
import ympa_kotlin_spring_server.models.TariffType
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
 * Информация о тарифах, по которым нужно заплатить за услуги Маркета.
 * @param type 
 * @param amount Значение тарифа в рублях.
 * @param parameters Параметры расчета тарифа.
 * @param percent {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. 
 */
data class TariffDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: TariffType,

    @Schema(example = "null", required = true, description = "Значение тарифа в рублях.")
    @get:JsonProperty("amount", required = true) val amount: java.math.BigDecimal,

    @field:Valid
    @Schema(example = "null", required = true, description = "Параметры расчета тарифа.")
    @get:JsonProperty("parameters", required = true) val parameters: kotlin.collections.List<TariffParameterDTO>,

    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %}  Значение тарифа в процентах. ")
    @Deprecated(message = "")
    @get:JsonProperty("percent") val percent: java.math.BigDecimal? = null
    ) {

}

