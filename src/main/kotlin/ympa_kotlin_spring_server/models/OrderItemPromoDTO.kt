package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderPromoType
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
 * Информация о вознаграждениях партнеру за скидки на товар по промокодам, купонам и акциям.
 * @param type 
 * @param discount Размер пользовательской скидки в валюте покупателя. 
 * @param subsidy Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. 
 * @param shopPromoId Идентификатор акции поставщика. 
 * @param marketPromoId Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. 
 */
data class OrderItemPromoDTO(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("type", required = true) val type: OrderPromoType,

    @Schema(example = "null", description = "Размер пользовательской скидки в валюте покупателя. ")
    @get:JsonProperty("discount") val discount: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Вознаграждение партнеру от Маркета за товар, проданный в рамках акции.  Передается в валюте заказа. ")
    @get:JsonProperty("subsidy") val subsidy: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Идентификатор акции поставщика. ")
    @get:JsonProperty("shopPromoId") val shopPromoId: kotlin.String? = null,

    @Schema(example = "null", description = "Идентификатор акции в рамках соглашения на оказание услуг по продвижению сервиса между Маркетом и партнером.  Параметр передается, только если параметр `type=MARKET_DEAL`. ")
    @get:JsonProperty("marketPromoId") val marketPromoId: kotlin.String? = null
    ) {

}

