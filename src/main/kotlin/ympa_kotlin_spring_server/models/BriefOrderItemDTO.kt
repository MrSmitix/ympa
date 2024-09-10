package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderItemInstanceDTO
import ympa_kotlin_spring_server.models.OrderVatType
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
 * Информация о маркированном товаре.
 * @param id Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. 
 * @param vat 
 * @param count Количество единиц товара.
 * @param price Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. 
 * @param offerName Название товара.
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param instances Переданные вами коды маркировки.
 */
data class BriefOrderItemDTO(

    @Schema(example = "null", description = "Идентификатор товара в заказе.  Позволяет идентифицировать товар в рамках данного заказа. ")
    @get:JsonProperty("id") val id: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("vat") val vat: OrderVatType? = null,

    @Schema(example = "null", description = "Количество единиц товара.")
    @get:JsonProperty("count") val count: kotlin.Int? = null,

    @Schema(example = "null", description = "Цена на товар. Указана в той валюте, которая была задана в каталоге. Разделитель целой и дробной части — точка. ")
    @get:JsonProperty("price") val price: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Название товара.")
    @get:JsonProperty("offerName") val offerName: kotlin.String? = null,

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("offerId") val offerId: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Переданные вами коды маркировки.")
    @get:JsonProperty("instances") val instances: kotlin.collections.List<OrderItemInstanceDTO>? = null
    ) {

}

