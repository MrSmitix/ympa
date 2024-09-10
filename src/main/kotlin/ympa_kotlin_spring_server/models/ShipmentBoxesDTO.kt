package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ParcelBoxDTO
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
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 * @param boxes Список грузовых мест. Маркет определил количество мест по длине этого списка. 
 */
data class ShipmentBoxesDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список грузовых мест. Маркет определил количество мест по длине этого списка. ")
    @get:JsonProperty("boxes", required = true) val boxes: kotlin.collections.List<ParcelBoxDTO>
    ) {

}

