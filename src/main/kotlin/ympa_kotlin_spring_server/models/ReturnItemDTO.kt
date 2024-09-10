package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.ReturnDecisionDTO
import ympa_kotlin_spring_server.models.ReturnInstanceDTO
import ympa_kotlin_spring_server.models.TrackDTO
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
 * Список товаров в возврате.
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param count Количество единиц товара.
 * @param marketSku SKU на Маркете.
 * @param decisions Список решений по возврату.
 * @param instances Список логистических позиций возврата.
 * @param tracks Список трек-кодов для почтовых отправлений.
 */
data class ReturnItemDTO(

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", required = true, description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("shopSku", required = true) val shopSku: kotlin.String,

    @Schema(example = "null", required = true, description = "Количество единиц товара.")
    @get:JsonProperty("count", required = true) val count: kotlin.Long,

    @Schema(example = "null", description = "SKU на Маркете.")
    @get:JsonProperty("marketSku") val marketSku: kotlin.Long? = null,

    @field:Valid
    @Schema(example = "null", description = "Список решений по возврату.")
    @get:JsonProperty("decisions") val decisions: kotlin.collections.List<ReturnDecisionDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Список логистических позиций возврата.")
    @get:JsonProperty("instances") val instances: kotlin.collections.List<ReturnInstanceDTO>? = null,

    @field:Valid
    @Schema(example = "null", description = "Список трек-кодов для почтовых отправлений.")
    @get:JsonProperty("tracks") val tracks: kotlin.collections.List<TrackDTO>? = null
    ) {

}

