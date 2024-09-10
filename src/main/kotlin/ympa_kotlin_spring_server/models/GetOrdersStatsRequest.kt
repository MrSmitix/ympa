package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OrderStatsStatusType
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
 * Запрос информации по заказам.
 * @param dateFrom Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
 * @param dateTo Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. 
 * @param updateFrom Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
 * @param updateTo Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. 
 * @param orders Список идентификаторов заказов.
 * @param statuses Список статусов заказов.
 * @param hasCis Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
 */
data class GetOrdersStatsRequest(

    @field:Valid
    @Schema(example = "null", description = "Начальная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
    @get:JsonProperty("dateFrom") val dateFrom: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "Конечная дата, когда заказ был сформирован.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `updateFrom` и `updateTo`. ")
    @get:JsonProperty("dateTo") val dateTo: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "Начальная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
    @get:JsonProperty("updateFrom") val updateFrom: java.time.LocalDate? = null,

    @field:Valid
    @Schema(example = "null", description = "Конечная дата периода, за который были изменения статуса заказа.  Формат даты: `ГГГГ‑ММ‑ДД`.  Нельзя использовать вместе с параметрами `dateFrom` и `dateTo`. ")
    @get:JsonProperty("updateTo") val updateTo: java.time.LocalDate? = null,

    @Schema(example = "null", description = "Список идентификаторов заказов.")
    @get:JsonProperty("orders") val orders: kotlin.collections.List<kotlin.Long>? = null,

    @field:Valid
    @Schema(example = "null", description = "Список статусов заказов.")
    @get:JsonProperty("statuses") val statuses: kotlin.collections.List<OrderStatsStatusType>? = null,

    @Schema(example = "null", description = "Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * `true` — да. * `false` — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. ")
    @get:JsonProperty("hasCis") val hasCis: kotlin.Boolean? = null
    ) {

}

