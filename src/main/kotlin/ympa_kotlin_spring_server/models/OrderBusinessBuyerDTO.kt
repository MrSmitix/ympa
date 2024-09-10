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
 * Информация о покупателе. 
 * @param inn ИНН.
 * @param kpp КПП.
 * @param organizationName Наименование юридического лица.
 * @param organizationJurAddress Юридический адрес.
 */
data class OrderBusinessBuyerDTO(

    @Schema(example = "null", description = "ИНН.")
    @get:JsonProperty("inn") val inn: kotlin.String? = null,

    @Schema(example = "null", description = "КПП.")
    @get:JsonProperty("kpp") val kpp: kotlin.String? = null,

    @Schema(example = "null", description = "Наименование юридического лица.")
    @get:JsonProperty("organizationName") val organizationName: kotlin.String? = null,

    @Schema(example = "null", description = "Юридический адрес.")
    @get:JsonProperty("organizationJurAddress") val organizationJurAddress: kotlin.String? = null
    ) {

}

