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

import ympa_kotlin_client.models.CurrencyType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Цена с указанием скидки, валюты и времени последнего обновления.
 *
 * @param `value` Цена на товар.
 * @param discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
 * @param currencyId 
 * @param vat Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
 */


data class PriceDTO (

    /* Цена на товар. */
    @Json(name = "value")
    val `value`: java.math.BigDecimal? = null,

    /* Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар.  */
    @Json(name = "discountBase")
    val discountBase: java.math.BigDecimal? = null,

    @Json(name = "currencyId")
    val currencyId: CurrencyType? = null,

    /* Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете.  */
    @Json(name = "vat")
    val vat: kotlin.Int? = null

) {


}

