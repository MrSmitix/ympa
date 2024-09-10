package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrdersStatsItemStatusType
import ympa_kotlin_spring_server.models.OrdersStatsStockType
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
 * Информация об удалении товара из заказа.
 * @param itemStatus 
 * @param itemCount Количество товара со статусом, указанном в параметре `itemStatus`.
 * @param updateDate Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @param stockType 
 */
data class OrdersStatsDetailsDTO(

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("itemStatus") val itemStatus: OrdersStatsItemStatusType? = null,

    @Schema(example = "null", description = "Количество товара со статусом, указанном в параметре `itemStatus`.")
    @get:JsonProperty("itemCount") val itemCount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "Дата, когда товар получил статус, указанный в параметре `itemStatus`.  Формат даты: `ГГГГ-ММ-ДД`. ")
    @get:JsonProperty("updateDate") val updateDate: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("stockType") val stockType: OrdersStatsStockType? = null
    ) {

}

