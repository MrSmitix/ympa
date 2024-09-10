package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.RegionType
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
 * Регион доставки.
 * @param name Название региона.
 * @param type 
 * @param id Идентификатор региона.
 * @param parent 
 * @param children Дочерние регионы.
 */
data class RegionDTO(

    @Schema(example = "null", required = true, description = "Название региона.")
    @get:JsonProperty("name", required = true) val name: kotlin.String,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: RegionType,

    @Schema(example = "null", description = "Идентификатор региона.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("parent") val parent: RegionDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "Дочерние регионы.")
    @get:JsonProperty("children") val children: kotlin.collections.List<RegionDTO>? = null
    ) {

}

