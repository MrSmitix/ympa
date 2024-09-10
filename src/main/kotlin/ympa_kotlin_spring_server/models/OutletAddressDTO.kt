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
 * Адрес точки продаж. 
 * @param regionId Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} 
 * @param street Улица.
 * @param number Номер дома.
 * @param building Номер строения.
 * @param estate Номер владения.
 * @param block Номер корпуса.
 * @param additional Дополнительная информация.
 * @param km Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.
 * @param city {% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} 
 */
data class OutletAddressDTO(

    @Schema(example = "null", required = true, description = "Идентификатор региона.  Идентификатор можно получить c помощью запроса [GET regions](../../reference/regions/searchRegionsByName.md).  {% note alert %}  При создании и редактировании точек продаж можно указывать только регионы типов `TOWN` (город), `CITY` (крупный город) и `REPUBLIC_AREA` (район субъекта федерации). Тип региона указан в выходных параметрах type запросов [GET regions](../../reference/regions/searchRegionsByName.md) и [GET regions/{regionId}](../../reference/regions/searchRegionsById.md).  {% endnote %} ")
    @get:JsonProperty("regionId", required = true) val regionId: kotlin.Long,

    @get:Size(max=512)
    @Schema(example = "null", description = "Улица.")
    @get:JsonProperty("street") val street: kotlin.String? = null,

    @get:Size(max=256)
    @Schema(example = "null", description = "Номер дома.")
    @get:JsonProperty("number") val number: kotlin.String? = null,

    @get:Size(max=16)
    @Schema(example = "null", description = "Номер строения.")
    @get:JsonProperty("building") val building: kotlin.String? = null,

    @get:Size(max=16)
    @Schema(example = "null", description = "Номер владения.")
    @get:JsonProperty("estate") val estate: kotlin.String? = null,

    @get:Size(max=16)
    @Schema(example = "null", description = "Номер корпуса.")
    @get:JsonProperty("block") val block: kotlin.String? = null,

    @Schema(example = "null", description = "Дополнительная информация.")
    @get:JsonProperty("additional") val additional: kotlin.String? = null,

    @Schema(example = "null", description = "Порядковый номер километра дороги, на котором располагается точка продаж, если отсутствует улица.")
    @get:JsonProperty("km") val km: kotlin.Int? = null,

    @get:Size(max=200)
    @Schema(example = "null", description = "{% note warning \"\" %}  Этот параметр устарел. Не используйте его. Город или населенный пункт возвращается в параметре `regionId`.  {% endnote %} ")
    @get:JsonProperty("city") val city: kotlin.String? = null
    ) {

}

