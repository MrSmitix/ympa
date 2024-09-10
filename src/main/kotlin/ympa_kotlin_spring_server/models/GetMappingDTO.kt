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
 * Информация о товарах в каталоге. 
 * @param marketSku SKU на Маркете.
 * @param marketSkuName Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
 * @param marketModelId Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
 * @param marketModelName Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. 
 * @param marketCategoryId Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
 * @param marketCategoryName Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. 
 */
data class GetMappingDTO(

    @Schema(example = "null", description = "SKU на Маркете.")
    @get:JsonProperty("marketSku") val marketSku: kotlin.Long? = null,

    @Schema(example = "null", description = "Название карточки товара.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
    @get:JsonProperty("marketSkuName") val marketSkuName: kotlin.String? = null,

    @Schema(example = "null", description = "Идентификатор модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
    @get:JsonProperty("marketModelId") val marketModelId: kotlin.Long? = null,

    @Schema(example = "null", description = "Название модели на Маркете.  Может отсутствовать в ответе, если товар еще не привязан к карточке. ")
    @get:JsonProperty("marketModelName") val marketModelName: kotlin.String? = null,

    @Schema(example = "null", description = "Идентификатор категории на Маркете, в которую попал товар.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ")
    @get:JsonProperty("marketCategoryId") val marketCategoryId: kotlin.Long? = null,

    @Schema(example = "null", description = "Название категории карточки на Маркете.  Может отсутствовать в ответе, если Маркет еще не определил категорию товара. ")
    @get:JsonProperty("marketCategoryName") val marketCategoryName: kotlin.String? = null
    ) {

}

