package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.LogisticPickupPointDTO
import ympa_kotlin_spring_server.models.RecipientType
import ympa_kotlin_spring_server.models.RefundStatusType
import ympa_kotlin_spring_server.models.ReturnItemDTO
import ympa_kotlin_spring_server.models.ReturnShipmentStatusType
import ympa_kotlin_spring_server.models.ReturnType
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
 * Возврат заказа.
 * @param items Список товаров в возврате.
 * @param id Идентификатор возврата.
 * @param orderId Номер заказа.
 * @param creationDate Дата создания возврата клиентом.
 * @param updateDate Дата обновления возврата.
 * @param refundStatus 
 * @param logisticPickupPoint 
 * @param shipmentRecipientType 
 * @param shipmentStatus 
 * @param refundAmount Сумма возврата.
 * @param returnType 
 * @param fastReturn Используется ли опция **Быстрый возврат денег за дешевый брак**. 
 */
data class ReturnDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "Список товаров в возврате.")
    @get:JsonProperty("items", required = true) val items: kotlin.collections.List<ReturnItemDTO>,

    @Schema(example = "null", description = "Идентификатор возврата.")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @Schema(example = "null", description = "Номер заказа.")
    @get:JsonProperty("orderId") val orderId: kotlin.Long? = null,

    @Schema(example = "null", description = "Дата создания возврата клиентом.")
    @get:JsonProperty("creationDate") val creationDate: java.time.OffsetDateTime? = null,

    @Schema(example = "null", description = "Дата обновления возврата.")
    @get:JsonProperty("updateDate") val updateDate: java.time.OffsetDateTime? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("refundStatus") val refundStatus: RefundStatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("logisticPickupPoint") val logisticPickupPoint: LogisticPickupPointDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("shipmentRecipientType") val shipmentRecipientType: RecipientType? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("shipmentStatus") val shipmentStatus: ReturnShipmentStatusType? = null,

    @Schema(example = "null", description = "Сумма возврата.")
    @get:JsonProperty("refundAmount") val refundAmount: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("returnType") val returnType: ReturnType? = null,

    @Schema(example = "null", description = "Используется ли опция **Быстрый возврат денег за дешевый брак**. ")
    @get:JsonProperty("fastReturn") val fastReturn: kotlin.Boolean? = null
    ) {

}

