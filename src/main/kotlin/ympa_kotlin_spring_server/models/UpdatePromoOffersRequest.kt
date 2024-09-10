package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.UpdatePromoOfferDTO
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
 * Добавление товаров в акцию или обновление их параметров.  Чтобы добавить товары в акцию или обновить параметры каких-то товаров, передайте их в параметре `offers`. 
 * @param promoId Идентификатор акции.
 * @param offers Товары, которые необходимо добавить в акцию или цены которых нужно изменить.
 */
data class UpdatePromoOffersRequest(

    @Schema(example = "null", required = true, description = "Идентификатор акции.")
    @get:JsonProperty("promoId", required = true) val promoId: kotlin.String,

    @field:Valid
    @get:Size(min=1,max=500) 
    @Schema(example = "null", required = true, description = "Товары, которые необходимо добавить в акцию или цены которых нужно изменить.")
    @get:JsonProperty("offers", required = true) val offers: kotlin.collections.List<UpdatePromoOfferDTO>
    ) {

}

