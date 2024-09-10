package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.LogisticPointType
import ympa_kotlin_spring_server.models.PickupAddressDTO
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
 * Описание пункта вывоза для возврата.
 * @param id Идентификатор пункта вывоза.
 * @param name Название пункта вывоза.
 * @param address 
 * @param instruction Дополнительные инструкции к вывозу.
 * @param type 
 * @param logisticPartnerId Идентификатор логистического партнера, к которому относится логистическая точка.
 */
data class LogisticPickupPointDTO(

    @Schema(example = "null", description = "Идентификатор пункта вывоза.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Название пункта вывоза.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("address") val address: PickupAddressDTO? = null,

    @Schema(example = "null", description = "Дополнительные инструкции к вывозу.")
    @get:JsonProperty("instruction") val instruction: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: LogisticPointType? = null,

    @Schema(example = "null", description = "Идентификатор логистического партнера, к которому относится логистическая точка.")
    @get:JsonProperty("logisticPartnerId") val logisticPartnerId: kotlin.Long? = null
    ) {

}

