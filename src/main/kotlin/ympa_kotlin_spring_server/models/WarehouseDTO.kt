package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.WarehouseAddressDTO
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
 * Информация о складе.
 * @param id Идентификатор склада.
 * @param name Название склада.
 * @param campaignId Идентификатор кампании в API и идентификатор магазина.
 * @param express Возможна ли доставка по модели Экспресс.
 * @param address 
 */
data class WarehouseDTO(

    @Schema(example = "null", required = true, description = "Идентификатор склада.")
    @get:JsonProperty("id", required = true) val id: kotlin.Long,

    @Schema(example = "null", required = true, description = "Название склада.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @Schema(example = "null", required = true, description = "Идентификатор кампании в API и идентификатор магазина.")
    @get:JsonProperty("campaignId", required = true) val campaignId: kotlin.Long,

    @Schema(example = "null", required = true, description = "Возможна ли доставка по модели Экспресс.")
    @get:JsonProperty("express", required = true) val express: kotlin.Boolean,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("address") val address: WarehouseAddressDTO? = null
    ) {

}

