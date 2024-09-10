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
 * Статус публикации товара:  * `READY` — товар прошел модерацию. Чтобы разместить его на Маркете, установите для него цену. * `IN_WORK` — товар проходит модерацию. Это занимает несколько дней. * `NEED_CONTENT` — для товара без SKU на Маркете `marketSku` нужно найти карточку самостоятельно (через API или кабинет продавца на Маркете) или создать ее, если товар еще не продается на Маркете. * `NEED_INFO` — товар не прошел модерацию из-за ошибок или недостающих сведений в описании товара. Информация о причинах отклонения возвращается в параметре `notes`. * `REJECTED` — товар не прошел модерацию, так как Маркет не планирует размещать подобные товары. * `SUSPENDED` — товар не прошел модерацию, так как Маркет пока не размещает подобные товары. 
 *
 * Values: UNKNOWN,READY,IN_WORK,NEED_INFO,NEED_MAPPING,NEED_CONTENT,CONTENT_PROCESSING,SUSPENDED,REJECTED,REVIEW,CREATE_ERROR,UPDATE_ERROR
 */

@JsonClass(generateAdapter = false)
enum class OfferProcessingStatusType(val value: kotlin.String) {

    @Json(name = "UNKNOWN")
    UNKNOWN("UNKNOWN"),

    @Json(name = "READY")
    READY("READY"),

    @Json(name = "IN_WORK")
    IN_WORK("IN_WORK"),

    @Json(name = "NEED_INFO")
    NEED_INFO("NEED_INFO"),

    @Json(name = "NEED_MAPPING")
    NEED_MAPPING("NEED_MAPPING"),

    @Json(name = "NEED_CONTENT")
    NEED_CONTENT("NEED_CONTENT"),

    @Json(name = "CONTENT_PROCESSING")
    CONTENT_PROCESSING("CONTENT_PROCESSING"),

    @Json(name = "SUSPENDED")
    SUSPENDED("SUSPENDED"),

    @Json(name = "REJECTED")
    REJECTED("REJECTED"),

    @Json(name = "REVIEW")
    REVIEW("REVIEW"),

    @Json(name = "CREATE_ERROR")
    CREATE_ERROR("CREATE_ERROR"),

    @Json(name = "UPDATE_ERROR")
    UPDATE_ERROR("UPDATE_ERROR");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OfferProcessingStatusType) "$data" else null

        /**
         * Returns a valid [OfferProcessingStatusType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OfferProcessingStatusType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

