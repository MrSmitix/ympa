package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OutletLicenseDTO
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
 * Запрос на создание или изменение лицензий для точек продаж.
 * @param licenses Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. 
 */
data class UpdateOutletLicenseRequest(

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", required = true, description = "Список лицензий. Обязательный параметр, должен содержать информацию хотя бы об одной лицензии. ")
    @get:JsonProperty("licenses", required = true) val licenses: kotlin.collections.List<OutletLicenseDTO>
    ) {

}

