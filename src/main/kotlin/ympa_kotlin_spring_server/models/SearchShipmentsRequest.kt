package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ShipmentStatusType
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
 * Запрос информации об отгрузках.
 * @param dateFrom Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
 * @param dateTo Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. 
 * @param statuses Список статусов отгрузок.
 * @param orderIds Список идентификаторов заказов из отгрузок.
 * @param cancelledOrders Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. 
 */
data class SearchShipmentsRequest(

    @field:Valid
    @Schema(example = "null", required = true, description = "Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("dateFrom", required = true) val dateFrom: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("dateTo", required = true) val dateTo: java.time.LocalDate,

    @field:Valid
    @get:Size(min=1)
    @Schema(example = "null", description = "Список статусов отгрузок.")
    @get:JsonProperty("statuses") val statuses: kotlin.collections.Set<ShipmentStatusType>? = null,

    @get:Size(min=1)
    @Schema(example = "null", description = "Список идентификаторов заказов из отгрузок.")
    @get:JsonProperty("orderIds") val orderIds: kotlin.collections.Set<kotlin.Long>? = null,

    @Schema(example = "null", description = "Возвращать ли отмененные заказы.  Значение по умолчанию — `true`. Если возвращать отмененные заказы не нужно, передайте значение `false`. ")
    @get:JsonProperty("cancelledOrders") val cancelledOrders: kotlin.Boolean? = true
    ) {

}

