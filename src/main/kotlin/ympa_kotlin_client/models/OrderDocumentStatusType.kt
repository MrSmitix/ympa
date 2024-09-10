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
 * Статус документа:  * `READY` — готов. * `NOT_READY` — не готов. 
 *
 * Values: READY,NOT_READY
 */

@JsonClass(generateAdapter = false)
enum class OrderDocumentStatusType(val value: kotlin.String) {

    @Json(name = "READY")
    READY("READY"),

    @Json(name = "NOT_READY")
    NOT_READY("NOT_READY");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OrderDocumentStatusType) "$data" else null

        /**
         * Returns a valid [OrderDocumentStatusType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OrderDocumentStatusType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

