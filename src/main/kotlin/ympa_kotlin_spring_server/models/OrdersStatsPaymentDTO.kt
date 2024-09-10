package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrdersStatsPaymentOrderDTO
import ympa_kotlin_spring_server.models.OrdersStatsPaymentSourceType
import ympa_kotlin_spring_server.models.OrdersStatsPaymentType
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
 * Информация о денежных переводах по заказу.
 * @param id Идентификатор денежного перевода.
 * @param date Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. 
 * @param type 
 * @param source 
 * @param total Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
 * @param paymentOrder 
 */
data class OrdersStatsPaymentDTO(

    @Schema(example = "null", description = "Идентификатор денежного перевода.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Дата денежного перевода.  Формат даты: `ГГГГ-ММ-ДД`. ")
    @get:JsonProperty("date") val date: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: OrdersStatsPaymentType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("source") val source: OrdersStatsPaymentSourceType? = null,

    @Schema(example = "null", description = "Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. ")
    @get:JsonProperty("total") val total: java.math.BigDecimal? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("paymentOrder") val paymentOrder: OrdersStatsPaymentOrderDTO? = null
    ) {

}

