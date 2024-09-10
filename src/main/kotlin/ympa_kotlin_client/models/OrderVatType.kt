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
 * Ставка налога на добавленную стоимость (НДС) на товар:  * `NO_VAT` — НДС не облагается, используется только для отдельных видов услуг.  * `VAT_0` — НДС 0%. Например, используется при продаже товаров, вывезенных в таможенной процедуре экспорта, или при оказании услуг по международной перевозке товаров.  * `VAT_10` — НДС 10%. Например, используется при реализации отдельных продовольственных и медицинских товаров.  * `VAT_10_110` — НДС 10/110. Расчетная ставка НДС 10%, применяется только при предоплате.  * `VAT_20` — НДС 20%. Основная ставка с 2019 года.  * `VAT_20_120` — НДС 20/120. Расчетная ставка НДС 20%, применяется только при предоплате.  * `VAT_18` — НДС 18%. Основная ставка до 2019 года.  * `VAT_18_118` — НДС 18/118. Ставка использовалась до 1 января 2019 года при предоплате.  * `UNKNOWN_VALUE` — неизвестный тип.  Используется только совместно с параметром `payment-method=YANDEX`. 
 *
 * Values: NO_VAT,VAT_0,VAT_10,VAT_10_110,VAT_20,VAT_20_120,VAT_18,VAT_18_118,UNKNOWN_VALUE
 */

@JsonClass(generateAdapter = false)
enum class OrderVatType(val value: kotlin.String) {

    @Json(name = "NO_VAT")
    NO_VAT("NO_VAT"),

    @Json(name = "VAT_0")
    VAT_0("VAT_0"),

    @Json(name = "VAT_10")
    VAT_10("VAT_10"),

    @Json(name = "VAT_10_110")
    VAT_10_110("VAT_10_110"),

    @Json(name = "VAT_20")
    VAT_20("VAT_20"),

    @Json(name = "VAT_20_120")
    VAT_20_120("VAT_20_120"),

    @Json(name = "VAT_18")
    VAT_18("VAT_18"),

    @Json(name = "VAT_18_118")
    VAT_18_118("VAT_18_118"),

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is OrderVatType) "$data" else null

        /**
         * Returns a valid [OrderVatType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): OrderVatType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

