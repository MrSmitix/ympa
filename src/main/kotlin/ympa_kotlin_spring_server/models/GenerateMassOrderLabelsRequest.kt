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
 * Данные, необходимые для генерации файла. 
 * @param businessId Идентификатор кабинета.
 * @param orderIds Список идентификаторов заказов.
 */
data class GenerateMassOrderLabelsRequest(

    @Schema(example = "null", required = true, description = "Идентификатор кабинета.")
    @get:JsonProperty("businessId", required = true) val businessId: kotlin.Long,

    @get:Size(min=1,max=1000) 
    @Schema(example = "null", required = true, description = "Список идентификаторов заказов.")
    @get:JsonProperty("orderIds", required = true) val orderIds: kotlin.collections.Set<kotlin.Long>
    ) {

}

