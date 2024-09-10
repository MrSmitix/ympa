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
 * Составляющие индекса качества.  **Для модели DBS:** * `DBS_CANCELLATION_RATE` — доля отмененных товаров. * `DBS_LATE_DELIVERY_RATE` — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * `FBS_CANCELLATION_RATE` — доля отмененных товаров. * `FBS_LATE_SHIP_RATE` — доля не вовремя отгруженных заказов.  **Для модели FBY:** * `FBY_LATE_DELIVERY_RATE` — доля товаров, которые приехали на склад с опозданием. * `FBY_CANCELLATION_RATE` — доля отмененных или недоставленных товаров. * `FBY_DELIVERY_DIFF_RATE` — доля товаров, которые не прибыли вместе с поставкой или которые не приняли. * `FBY_LATE_EDITING_RATE` — доля товаров, которые поздно убрали из заявки. 
 *
 * Values: DBS_CANCELLATION_RATE,DBS_LATE_DELIVERY_RATE,FBS_CANCELLATION_RATE,FBS_LATE_SHIP_RATE,FBY_LATE_DELIVERY_RATE,FBY_CANCELLATION_RATE,FBY_DELIVERY_DIFF_RATE,FBY_LATE_EDITING_RATE
 */

@JsonClass(generateAdapter = false)
enum class QualityRatingComponentType(val value: kotlin.String) {

    @Json(name = "DBS_CANCELLATION_RATE")
    DBS_CANCELLATION_RATE("DBS_CANCELLATION_RATE"),

    @Json(name = "DBS_LATE_DELIVERY_RATE")
    DBS_LATE_DELIVERY_RATE("DBS_LATE_DELIVERY_RATE"),

    @Json(name = "FBS_CANCELLATION_RATE")
    FBS_CANCELLATION_RATE("FBS_CANCELLATION_RATE"),

    @Json(name = "FBS_LATE_SHIP_RATE")
    FBS_LATE_SHIP_RATE("FBS_LATE_SHIP_RATE"),

    @Json(name = "FBY_LATE_DELIVERY_RATE")
    FBY_LATE_DELIVERY_RATE("FBY_LATE_DELIVERY_RATE"),

    @Json(name = "FBY_CANCELLATION_RATE")
    FBY_CANCELLATION_RATE("FBY_CANCELLATION_RATE"),

    @Json(name = "FBY_DELIVERY_DIFF_RATE")
    FBY_DELIVERY_DIFF_RATE("FBY_DELIVERY_DIFF_RATE"),

    @Json(name = "FBY_LATE_EDITING_RATE")
    FBY_LATE_EDITING_RATE("FBY_LATE_EDITING_RATE");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is QualityRatingComponentType) "$data" else null

        /**
         * Returns a valid [QualityRatingComponentType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): QualityRatingComponentType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

