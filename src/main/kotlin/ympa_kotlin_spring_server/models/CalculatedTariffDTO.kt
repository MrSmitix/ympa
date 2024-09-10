package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.CalculatedTariffType
import ympa_kotlin_spring_server.models.TariffParameterDTO
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
 * Информация об услугах Маркета.
 * @param type 
 * @param parameters Параметры расчета тарифа.
 * @param amount Стоимость услуги в рублях.
 */
data class CalculatedTariffDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: CalculatedTariffType,

    @field:Valid
    @Schema(example = "null", required = true, description = "Параметры расчета тарифа.")
    @get:JsonProperty("parameters", required = true) val parameters: kotlin.collections.List<TariffParameterDTO>,

    @Schema(example = "null", description = "Стоимость услуги в рублях.")
    @get:JsonProperty("amount") val amount: java.math.BigDecimal? = null
    ) {

}

