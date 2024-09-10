package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.GpsDTO
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
 * Адрес доставки.  Указывается, если `type=DELIVERY`, `type=POST` или `type=PICKUP` (адрес пункта выдачи). 
 * @param country Страна.  Обязательный параметр. 
 * @param postcode Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). 
 * @param city Город или населенный пункт.  Обязательный параметр. 
 * @param district Район.
 * @param subway Станция метро.
 * @param street Улица.  Обязательный параметр. 
 * @param house Дом или владение.  Обязательный параметр. 
 * @param block Корпус или строение.
 * @param entrance Подъезд.
 * @param entryphone Код домофона.
 * @param floor Этаж.
 * @param apartment Квартира или офис.
 * @param phone Телефон получателя заказа.  Обязательный параметр. 
 * @param recipient Фамилия, имя и отчество получателя заказа.  Обязательный параметр. 
 * @param gps 
 */
data class OrderDeliveryAddressDTO(

    @Schema(example = "null", description = "Страна.  Обязательный параметр. ")
    @get:JsonProperty("country") val country: kotlin.String? = null,

    @Schema(example = "null", description = "Почтовый индекс.  Указывается, если выбрана доставка почтой (`delivery type=POST`). ")
    @get:JsonProperty("postcode") val postcode: kotlin.String? = null,

    @Schema(example = "null", description = "Город или населенный пункт.  Обязательный параметр. ")
    @get:JsonProperty("city") val city: kotlin.String? = null,

    @Schema(example = "null", description = "Район.")
    @get:JsonProperty("district") val district: kotlin.String? = null,

    @Schema(example = "null", description = "Станция метро.")
    @get:JsonProperty("subway") val subway: kotlin.String? = null,

    @Schema(example = "null", description = "Улица.  Обязательный параметр. ")
    @get:JsonProperty("street") val street: kotlin.String? = null,

    @Schema(example = "null", description = "Дом или владение.  Обязательный параметр. ")
    @get:JsonProperty("house") val house: kotlin.String? = null,

    @Schema(example = "null", description = "Корпус или строение.")
    @get:JsonProperty("block") val block: kotlin.String? = null,

    @Schema(example = "null", description = "Подъезд.")
    @get:JsonProperty("entrance") val entrance: kotlin.String? = null,

    @Schema(example = "null", description = "Код домофона.")
    @get:JsonProperty("entryphone") val entryphone: kotlin.String? = null,

    @Schema(example = "null", description = "Этаж.")
    @get:JsonProperty("floor") val floor: kotlin.String? = null,

    @Schema(example = "null", description = "Квартира или офис.")
    @get:JsonProperty("apartment") val apartment: kotlin.String? = null,

    @Schema(example = "null", description = "Телефон получателя заказа.  Обязательный параметр. ")
    @get:JsonProperty("phone") val phone: kotlin.String? = null,

    @Schema(example = "null", description = "Фамилия, имя и отчество получателя заказа.  Обязательный параметр. ")
    @get:JsonProperty("recipient") val recipient: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("gps") val gps: GpsDTO? = null
    ) {

}

