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
 * Услуга Маркета или дополнительный тариф к услуге размещения:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `STORAGE` — хранение товара на складе Маркета в течение суток.  * `SURPLUS` — хранение излишков на складе Маркета.  * `WITHDRAW` — вывоз товара со склада Маркета.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `CROSSREGIONAL_DELIVERY_RETURN` — доставка невыкупов и возвратов.  * `DISPOSAL` — утилизация.  * `SORTING_CENTER_STORAGE` — хранение невыкупов и возвратов.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `FF_XDOC_SUPPLY_BOX` — поставка товара через транзитный склад (за короб).  * `FF_XDOC_SUPPLY_PALLET` — поставка товара через транзитный склад (за палету).  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  * `RETURN_PROCESSING` — обработка невыкупов и возвратов.  * `EXPRESS_CANCELLED_BY_PARTNER` — отмена заказа с экспресс-доставкой.  * `DELIVERY_TO_CUSTOMER_RETURN` — возврат доставляемого товара на склад.  * `CROSSBORDER_DELIVERY` — доставка из-за рубежа.  * `INTAKE_SORTING_BULKY_CARGO` — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_SMALL_GOODS` — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_DAILY` — организация забора заказов со склада продавца.  * `FF_STORAGE_BILLING` — хранения товаров на складе.  * `CANCELLED_ORDER_FEE_QI` — отмена заказа по вине продавца.  * `LATE_ORDER_EXECUTION_FEE_QI` — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 *
 * Values: AGENCY_COMMISSION,PAYMENT_TRANSFER,STORAGE,WITHDRAW,SURPLUS,FEE,DELIVERY_TO_CUSTOMER,CROSSREGIONAL_DELIVERY,CROSSREGIONAL_DELIVERY_RETURN,DISPOSAL,SORTING_CENTER_STORAGE,EXPRESS_DELIVERY,FF_XDOC_SUPPLY_BOX,FF_XDOC_SUPPLY_PALLET,SORTING,MIDDLE_MILE,RETURN_PROCESSING,EXPRESS_CANCELLED_BY_PARTNER,DELIVERY_TO_CUSTOMER_RETURN,CROSSBORDER_DELIVERY,INTAKE_SORTING_BULKY_CARGO,INTAKE_SORTING_SMALL_GOODS,INTAKE_SORTING_DAILY,FF_STORAGE_BILLING,CANCELLED_ORDER_FEE_QI,LATE_ORDER_EXECUTION_FEE_QI
 */

@JsonClass(generateAdapter = false)
enum class TariffType(val value: kotlin.String) {

    @Json(name = "AGENCY_COMMISSION")
    AGENCY_COMMISSION("AGENCY_COMMISSION"),

    @Json(name = "PAYMENT_TRANSFER")
    PAYMENT_TRANSFER("PAYMENT_TRANSFER"),

    @Json(name = "STORAGE")
    STORAGE("STORAGE"),

    @Json(name = "WITHDRAW")
    WITHDRAW("WITHDRAW"),

    @Json(name = "SURPLUS")
    SURPLUS("SURPLUS"),

    @Json(name = "FEE")
    FEE("FEE"),

    @Json(name = "DELIVERY_TO_CUSTOMER")
    DELIVERY_TO_CUSTOMER("DELIVERY_TO_CUSTOMER"),

    @Json(name = "CROSSREGIONAL_DELIVERY")
    CROSSREGIONAL_DELIVERY("CROSSREGIONAL_DELIVERY"),

    @Json(name = "CROSSREGIONAL_DELIVERY_RETURN")
    CROSSREGIONAL_DELIVERY_RETURN("CROSSREGIONAL_DELIVERY_RETURN"),

    @Json(name = "DISPOSAL")
    DISPOSAL("DISPOSAL"),

    @Json(name = "SORTING_CENTER_STORAGE")
    SORTING_CENTER_STORAGE("SORTING_CENTER_STORAGE"),

    @Json(name = "EXPRESS_DELIVERY")
    EXPRESS_DELIVERY("EXPRESS_DELIVERY"),

    @Json(name = "FF_XDOC_SUPPLY_BOX")
    FF_XDOC_SUPPLY_BOX("FF_XDOC_SUPPLY_BOX"),

    @Json(name = "FF_XDOC_SUPPLY_PALLET")
    FF_XDOC_SUPPLY_PALLET("FF_XDOC_SUPPLY_PALLET"),

    @Json(name = "SORTING")
    SORTING("SORTING"),

    @Json(name = "MIDDLE_MILE")
    MIDDLE_MILE("MIDDLE_MILE"),

    @Json(name = "RETURN_PROCESSING")
    RETURN_PROCESSING("RETURN_PROCESSING"),

    @Json(name = "EXPRESS_CANCELLED_BY_PARTNER")
    EXPRESS_CANCELLED_BY_PARTNER("EXPRESS_CANCELLED_BY_PARTNER"),

    @Json(name = "DELIVERY_TO_CUSTOMER_RETURN")
    DELIVERY_TO_CUSTOMER_RETURN("DELIVERY_TO_CUSTOMER_RETURN"),

    @Json(name = "CROSSBORDER_DELIVERY")
    CROSSBORDER_DELIVERY("CROSSBORDER_DELIVERY"),

    @Json(name = "INTAKE_SORTING_BULKY_CARGO")
    INTAKE_SORTING_BULKY_CARGO("INTAKE_SORTING_BULKY_CARGO"),

    @Json(name = "INTAKE_SORTING_SMALL_GOODS")
    INTAKE_SORTING_SMALL_GOODS("INTAKE_SORTING_SMALL_GOODS"),

    @Json(name = "INTAKE_SORTING_DAILY")
    INTAKE_SORTING_DAILY("INTAKE_SORTING_DAILY"),

    @Json(name = "FF_STORAGE_BILLING")
    FF_STORAGE_BILLING("FF_STORAGE_BILLING"),

    @Json(name = "CANCELLED_ORDER_FEE_QI")
    CANCELLED_ORDER_FEE_QI("CANCELLED_ORDER_FEE_QI"),

    @Json(name = "LATE_ORDER_EXECUTION_FEE_QI")
    LATE_ORDER_EXECUTION_FEE_QI("LATE_ORDER_EXECUTION_FEE_QI");

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
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is TariffType) "$data" else null

        /**
         * Returns a valid [TariffType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): TariffType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

