package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OrderParcelBoxDTO
import ympa_kotlin_spring_server.models.OrderTrackDTO
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
 * Список посылок.  В параметре может указываться несколько посылок. 
 * @param id Идентификатор посылки, присвоенный Маркетом.
 * @param shipmentDate Формат даты: `ДД-ММ-ГГГГ`. 
 * @param shipmentTime **Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. 
 * @param tracks **Только для модели DBS**  Информация для отслеживания перемещений посылки. 
 * @param boxes Список грузовых мест.
 */
data class OrderShipmentDTO(

    @Schema(example = "null", description = "Идентификатор посылки, присвоенный Маркетом.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "23-09-2022", description = "Формат даты: `ДД-ММ-ГГГГ`. ")
    @get:JsonProperty("shipmentDate") val shipmentDate: kotlin.String? = null,

    @Schema(example = "null", description = "**Только для модели Экспресс**  Время, к которому магазин должен упаковать заказ и перевести его в статус `READY_TO_SHIP`. После смены статуса за заказом приедет курьер.  Поле может появиться не сразу. Запрашивайте информацию о заказе в течении 5–10 минут, пока оно не вернется.  Формат времени: 24-часовой, `ЧЧ:ММ`.  Если заказ сделан организацией, параметр не возвращается до согласования даты доставки. ")
    @get:JsonProperty("shipmentTime") val shipmentTime: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "**Только для модели DBS**  Информация для отслеживания перемещений посылки. ")
    @get:JsonProperty("tracks") val tracks: kotlin.collections.List<OrderTrackDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Список грузовых мест.")
    @get:JsonProperty("boxes") val boxes: kotlin.collections.List<OrderParcelBoxDTO>? = null
    ) {

}

