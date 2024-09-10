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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Информация об оценках по параметрам, указанных в отзыве.  При создании отзыва автору предлагается поставить оценки магазину по нескольким параметрам: например, за скорость обработки заказа или удобство самовывоза. Набор параметров зависит от того, какой способ покупки (параметр `delivery`) указал автор. 
 *
 * @param id Идентификатор параметра.
 * @param title Название параметра. Например, `Скорость обработки заказа`.
 * @param description Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`.
 * @param `value` Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка). 
 */


data class FeedbackFactorDTO (

    /* Идентификатор параметра. */
    @Json(name = "id")
    val id: kotlin.Long? = null,

    /* Название параметра. Например, `Скорость обработки заказа`. */
    @Json(name = "title")
    val title: kotlin.String? = null,

    /* Описание параметра. Например, `Как быстро с вами связались для подтверждения заказа?`. */
    @Json(name = "description")
    val description: kotlin.String? = null,

    /* Оценка по параметру, указанная в отзыве: от `1` (низшая оценка) до `5` (высшая оценка).  */
    @Json(name = "value")
    val `value`: kotlin.Int? = null

) {


}

