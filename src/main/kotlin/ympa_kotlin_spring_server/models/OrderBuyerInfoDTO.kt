package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import ympa_kotlin_spring_server.models.OrderBuyerType
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
 * Информация о покупателе и его номере телефона.
 * @param id Идентификатор покупателя.
 * @param lastName Фамилия покупателя.
 * @param firstName Имя покупателя.
 * @param middleName Отчество покупателя.
 * @param type 
 * @param phone Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. 
 */
data class OrderBuyerInfoDTO(

    @Schema(example = "null", description = "Идентификатор покупателя.")
    @get:JsonProperty("id") val id: kotlin.String? = null,

    @Schema(example = "null", description = "Фамилия покупателя.")
    @get:JsonProperty("lastName") val lastName: kotlin.String? = null,

    @Schema(example = "null", description = "Имя покупателя.")
    @get:JsonProperty("firstName") val firstName: kotlin.String? = null,

    @Schema(example = "null", description = "Отчество покупателя.")
    @get:JsonProperty("middleName") val middleName: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("type") val type: OrderBuyerType? = null,

    @Schema(example = "null", description = "Подменный номер телефона покупателя. Подробнее о таких номерах читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/orders/dbs/call#fake-number).  Формат номера: `+<код_страны><код_региона><номер_телефона>`. ")
    @get:JsonProperty("phone") val phone: kotlin.String? = null
    ) {

}

