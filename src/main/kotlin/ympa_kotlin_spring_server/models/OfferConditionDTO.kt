package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OfferConditionQualityType
import ympa_kotlin_spring_server.models.OfferConditionType
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
 * Состояние уцененного товара. 
 * @param type 
 * @param quality 
 * @param reason Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
 */
data class OfferConditionDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: OfferConditionType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("quality") val quality: OfferConditionQualityType? = null,

    @Schema(example = "null", description = "Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. ")
    @get:JsonProperty("reason") val reason: kotlin.String? = null
    ) {

}

