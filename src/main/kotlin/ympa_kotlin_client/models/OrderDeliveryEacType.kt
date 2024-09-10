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
 * Тип кода подтверждения ЭАПП:  * `MERCHANT_TO_COURIER` — продавец передает код курьеру.  * `COURIER_TO_MERCHANT` — курьер передает код продавцу.  * `CHECKING_BY_MERCHANT` — продавец проверяет код на своей стороне. 
 *
 * Values: MERCHANT_TO_COURIER,COURIER_TO_MERCHANT,CHECKING_BY_MERCHANT
 */

@JsonClass(generateAdapter = false)
enum class OrderDeliveryEacType(val value: kotlin.String) {

    @Json(name = "MERCHANT_TO_COURIER")
    MERCHANT_TO_COURIER("MERCHANT_TO_COURIER"),

    @Json(name = "COURIER_TO_MERCHANT")
    COURIER_TO_MERCHANT("COURIER_TO_MERCHANT"),

    @Json(name = "CHECKING_BY_MERCHANT")
    CHECKING_BY_MERCHANT("CHECKING_BY_MERCHANT");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OrderDeliveryEacType) "$data" else null

        /**
         * Returns a valid [OrderDeliveryEacType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OrderDeliveryEacType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

