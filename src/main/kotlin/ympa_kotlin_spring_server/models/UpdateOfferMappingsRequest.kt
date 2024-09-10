package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.UpdateOfferMappingDTO
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
 * 
 * @param offerMappings Перечень товаров, которые нужно добавить или обновить.
 * @param onlyPartnerMediaContent Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. 
 */
data class UpdateOfferMappingsRequest(

    @field:Valid
    @get:Size(min=1,max=500) 
    @Schema(example = "null", required = true, description = "Перечень товаров, которые нужно добавить или обновить.")
    @get:JsonProperty("offerMappings", required = true) val offerMappings: kotlin.collections.List<UpdateOfferMappingDTO>,

    @Schema(example = "null", description = "Будут использоваться только переданные вами изображения товаров.  Значение по умолчанию — `false`. Если вы хотите заменить изображения, которые добавил Маркет, передайте значение `true`. ")
    @get:JsonProperty("onlyPartnerMediaContent") val onlyPartnerMediaContent: kotlin.Boolean? = null
    ) {

}

