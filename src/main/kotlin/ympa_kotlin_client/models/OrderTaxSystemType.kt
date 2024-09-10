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
 * Система налогообложения (СНО) магазина на момент оформления заказа:  * `ECHN` — единый сельскохозяйственный налог (ЕСХН).  * `ENVD` — единый налог на вмененный доход (ЕНВД).  * `OSN` — общая система налогообложения (ОСН).  * `PSN` — патентная система налогообложения (ПСН).  * `USN` — упрощенная система налогообложения (УСН).  * `USN_MINUS_COST` — упрощенная система налогообложения, доходы, уменьшенные на величину расходов (УСН «Доходы минус расходы»).  * `NPD` — налог на профессиональный доход (НПД).  * `UNKNOWN_VALUE` — неизвестное значение. Используется только совместно с параметром `payment-method=YANDEX`. 
 *
 * Values: OSN,USN,USN_MINUS_COST,ENVD,ECHN,PSN,NPD,UNKNOWN_VALUE
 */

@JsonClass(generateAdapter = false)
enum class OrderTaxSystemType(val value: kotlin.String) {

    @Json(name = "OSN")
    OSN("OSN"),

    @Json(name = "USN")
    USN("USN"),

    @Json(name = "USN_MINUS_COST")
    USN_MINUS_COST("USN_MINUS_COST"),

    @Json(name = "ENVD")
    ENVD("ENVD"),

    @Json(name = "ECHN")
    ECHN("ECHN"),

    @Json(name = "PSN")
    PSN("PSN"),

    @Json(name = "NPD")
    NPD("NPD"),

    @Json(name = "UNKNOWN_VALUE")
    UNKNOWN_VALUE("UNKNOWN_VALUE");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OrderTaxSystemType) "$data" else null

        /**
         * Returns a valid [OrderTaxSystemType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OrderTaxSystemType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

