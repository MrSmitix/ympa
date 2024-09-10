/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package ympa_kotlin_client.models

import ympa_kotlin_client.models.QualityRatingComponentDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация об индексе качества.
 *
 * @param rating Значение индекса качества.
 * @param calculationDate Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`. 
 * @param components Составляющие индекса качества.
 */


data class QualityRatingDTO (

    /* Значение индекса качества. */
    @Json(name = "rating")
    val rating: kotlin.Long,

    /* Дата вычисления.  Формат даты: `ГГГГ‑ММ‑ДД`.  */
    @Json(name = "calculationDate")
    val calculationDate: java.time.LocalDate,

    /* Составляющие индекса качества. */
    @Json(name = "components")
    val components: kotlin.collections.List<QualityRatingComponentDTO>

) {


}

