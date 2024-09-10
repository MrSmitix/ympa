package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.OfferCampaignStatusType
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
 * Фильтрации товаров  В запросе можно указать либо фильтр offerIds, либо любые другие фильтры товаров. Совместное использование фильтра offerIds с другими фильтрациями приведет к ошибке. 
 * @param offerIds Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    
 * @param statuses Фильтр по статусам товаров. 
 * @param categoryIds Фильтр по категориям на Маркете.
 * @param vendorNames Фильтр по брендам.
 * @param tags Фильтр по тегам.
 */
data class GetCampaignOffersRequest(

    @get:Size(max=200)
    @Schema(example = "null", description = "Идентификаторы товаров, информация о которых нужна.  {% note warning \"Такой список возвращается только целиком\" %}  Не используйте это поле одновременно с фильтрами по статусам карточек, категориям, брендам или тегам. Если вы хотите воспользоваться фильтрами, оставьте поле пустым.  Если вы запрашиваете информацию по конкретным SKU, не заполняйте:  * `page_token` * `limit`  {% endnote %}    ")
    @get:JsonProperty("offerIds") val offerIds: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "Фильтр по статусам товаров. ")
    @get:JsonProperty("statuses") val statuses: kotlin.collections.List<OfferCampaignStatusType>? = null,

    @Schema(example = "null", description = "Фильтр по категориям на Маркете.")
    @get:JsonProperty("categoryIds") val categoryIds: kotlin.collections.List<kotlin.Int>? = null,

    @Schema(example = "null", description = "Фильтр по брендам.")
    @get:JsonProperty("vendorNames") val vendorNames: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "null", description = "Фильтр по тегам.")
    @get:JsonProperty("tags") val tags: kotlin.collections.List<kotlin.String>? = null
    ) {

}

