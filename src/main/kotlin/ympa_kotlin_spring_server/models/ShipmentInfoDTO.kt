package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.DeliveryServiceDTO
import ympa_kotlin_spring_server.models.PalletsCountDTO
import ympa_kotlin_spring_server.models.PartnerShipmentWarehouseDTO
import ympa_kotlin_spring_server.models.ShipmentStatusType
import ympa_kotlin_spring_server.models.ShipmentType
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
 * Список с информацией об отгрузках.
 * @param orderIds Идентификаторы заказов в отгрузке.
 * @param id Идентификатор отгрузки.
 * @param planIntervalFrom Начало планового интервала отгрузки.
 * @param planIntervalTo Конец планового интервала отгрузки.
 * @param shipmentType 
 * @param warehouse 
 * @param warehouseTo 
 * @param externalId Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.
 * @param deliveryService 
 * @param palletsCount 
 * @param draftCount Количество заказов, которое Маркет запланировал к отгрузке.
 * @param plannedCount Количество заказов, которое Маркет подтвердил к отгрузке.
 * @param factCount Количество заказов, принятых в сортировочном центре или пункте приема.
 * @param status 
 * @param statusDescription Описание статуса отгрузки.
 * @param statusUpdateTime Время последнего изменения статуса отгрузки.
 */
data class ShipmentInfoDTO(

    @Schema(example = "null", required = true, description = "Идентификаторы заказов в отгрузке.")
    @get:JsonProperty("orderIds", required = true) val orderIds: kotlin.collections.Set<kotlin.Long>,

    @Schema(example = "null", description = "Идентификатор отгрузки.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Начало планового интервала отгрузки.")
    @get:JsonProperty("planIntervalFrom") val planIntervalFrom: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Конец планового интервала отгрузки.")
    @get:JsonProperty("planIntervalTo") val planIntervalTo: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("shipmentType") val shipmentType: ShipmentType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("warehouse") val warehouse: PartnerShipmentWarehouseDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("warehouseTo") val warehouseTo: PartnerShipmentWarehouseDTO? = null,

    @Schema(example = "null", description = "Идентификатор отгрузки в вашей системе. Если вы еще не передавали идентификатор, вернется идентификатор из параметра `id`.")
    @get:JsonProperty("externalId") val externalId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("deliveryService") val deliveryService: DeliveryServiceDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("palletsCount") val palletsCount: PalletsCountDTO? = null,

    @Schema(example = "null", description = "Количество заказов, которое Маркет запланировал к отгрузке.")
    @get:JsonProperty("draftCount") val draftCount: kotlin.Int? = null,

    @Schema(example = "null", description = "Количество заказов, которое Маркет подтвердил к отгрузке.")
    @get:JsonProperty("plannedCount") val plannedCount: kotlin.Int? = null,

    @Schema(example = "null", description = "Количество заказов, принятых в сортировочном центре или пункте приема.")
    @get:JsonProperty("factCount") val factCount: kotlin.Int? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: ShipmentStatusType? = null,

    @Schema(example = "null", description = "Описание статуса отгрузки.")
    @get:JsonProperty("statusDescription") val statusDescription: kotlin.String? = null,

    @Schema(example = "null", description = "Время последнего изменения статуса отгрузки.")
    @get:JsonProperty("statusUpdateTime") val statusUpdateTime: java.time.OffsetDateTime? = null
    ) {

}

