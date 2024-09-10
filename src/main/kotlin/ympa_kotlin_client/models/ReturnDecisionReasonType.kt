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
 * Причины возврата:  * `BAD_QUALITY` — бракованный товар (есть недостатки).  * `DO_NOT_FIT` — товар не подошел.  * `WRONG_ITEM` — привезли не тот товар.  * `DAMAGE_DELIVERY` — товар поврежден при доставке.  * `LOYALTY_FAIL` — невозможно установить виновного в браке/пересорте.  * `CONTENT_FAIL` — ошибочное описание товара по вине Маркета.  * `UNKNOWN` — причина не известна. 
 *
 * Values: BAD_QUALITY,DOES_NOT_FIT,WRONG_ITEM,DAMAGE_DELIVERY,LOYALTY_FAIL,CONTENT_FAIL,UNKNOWN
 */

@JsonClass(generateAdapter = false)
enum class ReturnDecisionReasonType(val value: kotlin.String) {

    @Json(name = "BAD_QUALITY")
    BAD_QUALITY("BAD_QUALITY"),

    @Json(name = "DOES_NOT_FIT")
    DOES_NOT_FIT("DOES_NOT_FIT"),

    @Json(name = "WRONG_ITEM")
    WRONG_ITEM("WRONG_ITEM"),

    @Json(name = "DAMAGE_DELIVERY")
    DAMAGE_DELIVERY("DAMAGE_DELIVERY"),

    @Json(name = "LOYALTY_FAIL")
    LOYALTY_FAIL("LOYALTY_FAIL"),

    @Json(name = "CONTENT_FAIL")
    CONTENT_FAIL("CONTENT_FAIL"),

    @Json(name = "UNKNOWN")
    UNKNOWN("UNKNOWN");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is ReturnDecisionReasonType) "$data" else null

        /**
         * Returns a valid [ReturnDecisionReasonType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): ReturnDecisionReasonType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

