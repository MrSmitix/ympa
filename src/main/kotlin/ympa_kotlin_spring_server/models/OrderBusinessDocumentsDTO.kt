package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.DocumentDTO
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
 * Информация о документах. 
 * @param upd 
 * @param ukd 
 * @param torgTwelve 
 * @param sf 
 * @param ksf 
 */
data class OrderBusinessDocumentsDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("upd") val upd: DocumentDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ukd") val ukd: DocumentDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("torgTwelve") val torgTwelve: DocumentDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("sf") val sf: DocumentDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("ksf") val ksf: DocumentDTO? = null
    ) {

}

