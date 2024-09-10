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

import ympa_kotlin_client.models.ReturnDecisionReasonType
import ympa_kotlin_client.models.ReturnDecisionSubreasonType
import ympa_kotlin_client.models.ReturnDecisionType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Решения по возвратам.
 *
 * @param returnItemId Идентификатор товара в возврате.
 * @param count Количество единиц товара.
 * @param comment Комментарий.
 * @param reasonType 
 * @param subreasonType 
 * @param decisionType 
 * @param refundAmount Сумма возврата.
 * @param partnerCompensation Компенсация за обратную доставку.
 * @param images Список хеш-кодов фотографий товара от покупателя.
 */


data class ReturnDecisionDTO (

    /* Идентификатор товара в возврате. */
    @Json(name = "returnItemId")
    val returnItemId: kotlin.Long? = null,

    /* Количество единиц товара. */
    @Json(name = "count")
    val count: kotlin.Int? = null,

    /* Комментарий. */
    @Json(name = "comment")
    val comment: kotlin.String? = null,

    @Json(name = "reasonType")
    val reasonType: ReturnDecisionReasonType? = null,

    @Json(name = "subreasonType")
    val subreasonType: ReturnDecisionSubreasonType? = null,

    @Json(name = "decisionType")
    val decisionType: ReturnDecisionType? = null,

    /* Сумма возврата. */
    @Json(name = "refundAmount")
    val refundAmount: kotlin.Long? = null,

    /* Компенсация за обратную доставку. */
    @Json(name = "partnerCompensation")
    val partnerCompensation: kotlin.Long? = null,

    /* Список хеш-кодов фотографий товара от покупателя. */
    @Json(name = "images")
    val images: kotlin.collections.List<kotlin.String>? = null

) {


}

