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

import ympa_kotlin_client.models.GetPriceWithDiscountDTO
import ympa_kotlin_client.models.GetPriceWithVatDTO
import ympa_kotlin_client.models.OfferCampaignStatusType
import ympa_kotlin_client.models.OfferErrorDTO
import ympa_kotlin_client.models.QuantumDTO

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Параметры размещения товара в магазине.
 *
 * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
 * @param quantum 
 * @param available Есть ли товар в продаже. 
 * @param basicPrice 
 * @param campaignPrice 
 * @param status 
 * @param errors Ошибки, препятствующие размещению товара на витрине. 
 * @param warnings Предупреждения, не препятствующие размещению товара на витрине. 
 */


data class GetCampaignOfferDTO (

    /* Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields)  */
    @Json(name = "offerId")
    val offerId: kotlin.String,

    @Json(name = "quantum")
    val quantum: QuantumDTO? = null,

    /* Есть ли товар в продаже.  */
    @Json(name = "available")
    val available: kotlin.Boolean? = null,

    @Json(name = "basicPrice")
    val basicPrice: GetPriceWithDiscountDTO? = null,

    @Json(name = "campaignPrice")
    val campaignPrice: GetPriceWithVatDTO? = null,

    @Json(name = "status")
    val status: OfferCampaignStatusType? = null,

    /* Ошибки, препятствующие размещению товара на витрине.  */
    @Json(name = "errors")
    val errors: kotlin.collections.List<OfferErrorDTO>? = null,

    /* Предупреждения, не препятствующие размещению товара на витрине.  */
    @Json(name = "warnings")
    val warnings: kotlin.collections.List<OfferErrorDTO>? = null

) {


}

