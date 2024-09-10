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
 * Удаление товаров из акции.  Чтобы убрать:  * все товары из акции и больше не участвовать в ней, передайте значение `true` в параметре `deleteAllOffers`;  * часть товаров, передайте их идентификаторы в параметре `offersIds`. 
 * @param promoId Идентификатор акции.
 * @param deleteAllOffers Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.
 * @param offerIds Товары, которые нужно убрать из акции.
 */
data class DeletePromoOffersRequest(

    @Schema(example = "null", required = true, description = "Идентификатор акции.")
    @get:JsonProperty("promoId", required = true) val promoId: kotlin.String,

    @Schema(example = "null", description = "Чтобы убрать все товары из акции и больше не участвовать в ней, передайте значение `true` и не передавайте параметр `offerIds`.")
    @get:JsonProperty("deleteAllOffers") val deleteAllOffers: kotlin.Boolean? = null,

    @get:Size(min=1,max=500) 
    @Schema(example = "null", description = "Товары, которые нужно убрать из акции.")
    @get:JsonProperty("offerIds") val offerIds: kotlin.collections.List<kotlin.String>? = null
    ) {

}

