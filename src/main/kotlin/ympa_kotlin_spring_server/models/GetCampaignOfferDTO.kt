package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.GetPriceWithDiscountDTO
import ympa_kotlin_spring_server.models.GetPriceWithVatDTO
import ympa_kotlin_spring_server.models.OfferCampaignStatusType
import ympa_kotlin_spring_server.models.OfferErrorDTO
import ympa_kotlin_spring_server.models.QuantumDTO
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
 * Параметры размещения товара в магазине.
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param quantum 
 * @param available Есть ли товар в продаже. 
 * @param basicPrice 
 * @param campaignPrice 
 * @param status 
 * @param errors Ошибки, препятствующие размещению товара на витрине. 
 * @param warnings Предупреждения, не препятствующие размещению товара на витрине. 
 */
data class GetCampaignOfferDTO(

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", required = true, description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("offerId", required = true) val offerId: kotlin.String,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("quantum") val quantum: QuantumDTO? = null,

    @Schema(example = "null", description = "Есть ли товар в продаже. ")
    @get:JsonProperty("available") val available: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("basicPrice") val basicPrice: GetPriceWithDiscountDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("campaignPrice") val campaignPrice: GetPriceWithVatDTO? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("status") val status: OfferCampaignStatusType? = null,

    @field:Valid
    @Schema(example = "null", description = "Ошибки, препятствующие размещению товара на витрине. ")
    @get:JsonProperty("errors") val errors: kotlin.collections.List<OfferErrorDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Предупреждения, не препятствующие размещению товара на витрине. ")
    @get:JsonProperty("warnings") val warnings: kotlin.collections.List<OfferErrorDTO>? = null
    ) {

}

