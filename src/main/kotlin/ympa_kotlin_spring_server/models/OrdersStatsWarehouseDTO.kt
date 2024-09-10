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
 * Информация о складе, на котором хранится товар.
 * @param id Идентификатор склада.
 * @param name Название склада.
 */
data class OrdersStatsWarehouseDTO(

    @Schema(example = "null", description = "Идентификатор склада.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Название склада.")
    @get:JsonProperty("name") val name: kotlin.String? = null
    ) {

}

