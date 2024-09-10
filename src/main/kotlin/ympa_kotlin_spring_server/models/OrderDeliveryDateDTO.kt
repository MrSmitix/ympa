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
 * Информация о новой дате доставки заказа.
 * @param toDate Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
 */
data class OrderDeliveryDateDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. ")
    @get:JsonProperty("toDate", required = true) val toDate: java.time.LocalDate
    ) {

}

