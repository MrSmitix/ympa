package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import ympa_kotlin_spring_server.models.CampaignSettingsLocalRegionDTO
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
 * Настройки магазина.
 * @param countryRegion Идентификатор региона, в котором находится магазин.
 * @param shopName Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. 
 * @param showInContext Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. 
 * @param showInPremium Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. 
 * @param useOpenStat Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. 
 * @param localRegion 
 */
data class CampaignSettingsDTO(

    @Schema(example = "null", description = "Идентификатор региона, в котором находится магазин.")
    @get:JsonProperty("countryRegion") val countryRegion: kotlin.Long? = null,

    @Schema(example = "null", description = "Наименование магазина на Яндекс Маркете. Если наименование отсутствует, значение параметра выводится — `null`. ")
    @get:JsonProperty("shopName") val shopName: kotlin.String? = null,

    @Schema(example = "null", description = "Признак размещения магазина на сайтах партнеров Яндекс Дистрибуции. Возможные значения: * `false` — магазин не размещен на сайтах партнеров Яндекс Дистрибуции. * `true` — магазин размещен на сайтах партнеров Яндекс Дистрибуции. ")
    @get:JsonProperty("showInContext") val showInContext: kotlin.Boolean? = null,

    @Schema(example = "null", description = "Признак показа предложений магазина в рекламном блоке над результатами поиска (cпецразмещение). Возможные значения: * `false` — предложения не показываются в блоке cпецразмещения. * `true` — предложения показываются в блоке cпецразмещения. ")
    @get:JsonProperty("showInPremium") val showInPremium: kotlin.Boolean? = null,

    @Schema(example = "null", description = "Признак использования внешней интернет-статистики. Возможные значения: * `false` — внешняя интернет-статистика не используется. * `true` — внешняя интернет-статистика используется. ")
    @get:JsonProperty("useOpenStat") val useOpenStat: kotlin.Boolean? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("localRegion") val localRegion: CampaignSettingsLocalRegionDTO? = null
    ) {

}

