package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.PromoOfferUpdateWarningCodeType
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
 * Предупреждение, которое появилось при добавлении товара в акцию или изменении его цен.
 * @param code 
 * @param campaignIds Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. 
 */
data class PromoOfferUpdateWarningDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("code", required = true) val code: PromoOfferUpdateWarningCodeType,

    @Schema(example = "null", description = "Идентификаторы магазинов в кабинете, для которых получены предупреждения.  Не возвращается, если предупреждения действуют для всех магазинов в кабинете. ")
    @get:JsonProperty("campaignIds") val campaignIds: kotlin.collections.List<kotlin.Long>? = null
    ) {

}

