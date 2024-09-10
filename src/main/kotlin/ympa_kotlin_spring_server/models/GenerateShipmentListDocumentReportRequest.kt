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
 * Данные, необходимые для генерации документа. 
 * @param campaignId Идентификатор кампании.
 * @param shipmentId Идентификатор отгрузки.
 * @param orderIds Фильтр по идентификаторам заказа в отгрузке.
 */
data class GenerateShipmentListDocumentReportRequest(

    @Schema(example = "null", required = true, description = "Идентификатор кампании.")
    @get:JsonProperty("campaignId", required = true) val campaignId: kotlin.Long,

    @Schema(example = "null", description = "Идентификатор отгрузки.")
    @get:JsonProperty("shipmentId") val shipmentId: kotlin.Long? = null,

    @Schema(example = "null", description = "Фильтр по идентификаторам заказа в отгрузке.")
    @get:JsonProperty("orderIds") val orderIds: kotlin.collections.List<kotlin.Long>? = null
    ) {

}

