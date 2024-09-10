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
 * Статус товара:  * `PUBLISHED` — Готов к продаже. * `CHECKING` — На проверке. * `DISABLED_BY_PARTNER` — Скрыт вами. * `REJECTED_BY_MARKET` — Отклонен. * `DISABLED_AUTOMATICALLY` — Исправьте ошибки. * `CREATING_CARD` — Создается карточка. * `NO_CARD` — Нужна карточка. * `NO_STOCKS` — Нет на складе. * `ARCHIVED` — В архиве.  [Что обозначает каждый из статусов](https://yandex.ru/support/marketplace/assortment/add/statuses.html) 
 *
 * Values: PUBLISHED,CHECKING,DISABLED_BY_PARTNER,DISABLED_AUTOMATICALLY,REJECTED_BY_MARKET,CREATING_CARD,NO_CARD,NO_STOCKS,ARCHIVED
 */

@JsonClass(generateAdapter = false)
enum class OfferCampaignStatusType(val value: kotlin.String) {

    @Json(name = "PUBLISHED")
    PUBLISHED("PUBLISHED"),

    @Json(name = "CHECKING")
    CHECKING("CHECKING"),

    @Json(name = "DISABLED_BY_PARTNER")
    DISABLED_BY_PARTNER("DISABLED_BY_PARTNER"),

    @Json(name = "DISABLED_AUTOMATICALLY")
    DISABLED_AUTOMATICALLY("DISABLED_AUTOMATICALLY"),

    @Json(name = "REJECTED_BY_MARKET")
    REJECTED_BY_MARKET("REJECTED_BY_MARKET"),

    @Json(name = "CREATING_CARD")
    CREATING_CARD("CREATING_CARD"),

    @Json(name = "NO_CARD")
    NO_CARD("NO_CARD"),

    @Json(name = "NO_STOCKS")
    NO_STOCKS("NO_STOCKS"),

    @Json(name = "ARCHIVED")
    ARCHIVED("ARCHIVED");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OfferCampaignStatusType) "$data" else null

        /**
         * Returns a valid [OfferCampaignStatusType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OfferCampaignStatusType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

