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
 * Адрес доставки.
 * @param country Страна.
 * @param city Город.
 * @param street Улица.
 * @param house Номер дома.
 * @param postcode Почтовый индекс.
 */
data class PickupAddressDTO(

    @Schema(example = "Россия", description = "Страна.")
    @get:JsonProperty("country") val country: kotlin.String? = null,

    @Schema(example = "Москва", description = "Город.")
    @get:JsonProperty("city") val city: kotlin.String? = null,

    @Schema(example = "Стрелецкая улица", description = "Улица.")
    @get:JsonProperty("street") val street: kotlin.String? = null,

    @Schema(example = "9к2", description = "Номер дома.")
    @get:JsonProperty("house") val house: kotlin.String? = null,

    @Schema(example = "123518", description = "Почтовый индекс.")
    @get:JsonProperty("postcode") val postcode: kotlin.String? = null
    ) {

}

