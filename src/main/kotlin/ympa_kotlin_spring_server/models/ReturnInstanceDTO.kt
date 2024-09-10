package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.ReturnInstanceStatusType
import ympa_kotlin_spring_server.models.ReturnInstanceStockType
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
 * Логистическая информация по возврату.
 * @param stockType 
 * @param status 
 * @param cis Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).
 * @param imei Международный идентификатор мобильного оборудования.
 */
data class ReturnInstanceDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("stockType") val stockType: ReturnInstanceStockType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: ReturnInstanceStatusType? = null,

    @Schema(example = "null", description = "Код идентификации единицы товара [в системе «Честный ЗНАК»](https://честныйзнак.рф/).")
    @get:JsonProperty("cis") val cis: kotlin.String? = null,

    @Schema(example = "null", description = "Международный идентификатор мобильного оборудования.")
    @get:JsonProperty("imei") val imei: kotlin.String? = null
    ) {

}

