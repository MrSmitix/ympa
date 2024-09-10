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
 * Данные, необходимые для генерации отчета.
 * @param campaignId Идентификатор кампании.
 * @param dateFrom Начало периода, включительно.
 * @param dateTo Конец периода, включительно.
 * @param shopSku Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 */
data class GenerateGoodsMovementReportRequest(

    @Schema(example = "null", required = true, description = "Идентификатор кампании.")
    @get:JsonProperty("campaignId", required = true) val campaignId: kotlin.Long,

    @field:Valid
    @Schema(example = "null", required = true, description = "Начало периода, включительно.")
    @get:JsonProperty("dateFrom", required = true) val dateFrom: java.time.LocalDate,

    @field:Valid
    @Schema(example = "null", required = true, description = "Конец периода, включительно.")
    @get:JsonProperty("dateTo", required = true) val dateTo: java.time.LocalDate,

    @get:Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @get:Size(min=1,max=255)
    @Schema(example = "null", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
    @get:JsonProperty("shopSku") val shopSku: kotlin.String? = null
    ) {

}

