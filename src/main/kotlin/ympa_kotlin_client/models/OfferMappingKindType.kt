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
 * Вид маппинга.
 *
 * Values: ACTIVE,ALL
 */

@JsonClass(generateAdapter = false)
enum class OfferMappingKindType(val value: kotlin.String) {

    @Json(name = "ACTIVE")
    ACTIVE("ACTIVE"),

    @Json(name = "ALL")
    ALL("ALL");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OfferMappingKindType) "$data" else null

        /**
         * Returns a valid [OfferMappingKindType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OfferMappingKindType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

