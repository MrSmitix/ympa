package ympa_kotlin_spring_server.models

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
* Услуга Маркета или дополнительный тариф к услуге размещения:  * `AGENCY_COMMISSION` — прием платежа покупателя.  * `PAYMENT_TRANSFER` — перевод платежа покупателя.  * `STORAGE` — хранение товара на складе Маркета в течение суток.  * `SURPLUS` — хранение излишков на складе Маркета.  * `WITHDRAW` — вывоз товара со склада Маркета.  * `FEE` — размещение товара на Маркете.  * `DELIVERY_TO_CUSTOMER` — доставка покупателю.  * `CROSSREGIONAL_DELIVERY` — доставка в федеральный округ, город или населенный пункт.  * `CROSSREGIONAL_DELIVERY_RETURN` — доставка невыкупов и возвратов.  * `DISPOSAL` — утилизация.  * `SORTING_CENTER_STORAGE` — хранение невыкупов и возвратов.  * `EXPRESS_DELIVERY` — экспресс-доставка покупателю.  * `FF_XDOC_SUPPLY_BOX` — поставка товара через транзитный склад (за короб).  * `FF_XDOC_SUPPLY_PALLET` — поставка товара через транзитный склад (за палету).  * `SORTING` — обработка заказа.  * `MIDDLE_MILE` — средняя миля.  * `RETURN_PROCESSING` — обработка невыкупов и возвратов.  * `EXPRESS_CANCELLED_BY_PARTNER` — отмена заказа с экспресс-доставкой.  * `DELIVERY_TO_CUSTOMER_RETURN` — возврат доставляемого товара на склад.  * `CROSSBORDER_DELIVERY` — доставка из-за рубежа.  * `INTAKE_SORTING_BULKY_CARGO` — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_SMALL_GOODS` — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * `INTAKE_SORTING_DAILY` — организация забора заказов со склада продавца.  * `FF_STORAGE_BILLING` — хранения товаров на складе.  * `CANCELLED_ORDER_FEE_QI` — отмена заказа по вине продавца.  * `LATE_ORDER_EXECUTION_FEE_QI` — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
* Values: AGENCY_COMMISSION,PAYMENT_TRANSFER,STORAGE,WITHDRAW,SURPLUS,FEE,DELIVERY_TO_CUSTOMER,CROSSREGIONAL_DELIVERY,CROSSREGIONAL_DELIVERY_RETURN,DISPOSAL,SORTING_CENTER_STORAGE,EXPRESS_DELIVERY,FF_XDOC_SUPPLY_BOX,FF_XDOC_SUPPLY_PALLET,SORTING,MIDDLE_MILE,RETURN_PROCESSING,EXPRESS_CANCELLED_BY_PARTNER,DELIVERY_TO_CUSTOMER_RETURN,CROSSBORDER_DELIVERY,INTAKE_SORTING_BULKY_CARGO,INTAKE_SORTING_SMALL_GOODS,INTAKE_SORTING_DAILY,FF_STORAGE_BILLING,CANCELLED_ORDER_FEE_QI,LATE_ORDER_EXECUTION_FEE_QI
*/
enum class TariffType(@get:JsonValue val value: kotlin.String) {

    AGENCY_COMMISSION("AGENCY_COMMISSION"),
    PAYMENT_TRANSFER("PAYMENT_TRANSFER"),
    STORAGE("STORAGE"),
    WITHDRAW("WITHDRAW"),
    SURPLUS("SURPLUS"),
    FEE("FEE"),
    DELIVERY_TO_CUSTOMER("DELIVERY_TO_CUSTOMER"),
    CROSSREGIONAL_DELIVERY("CROSSREGIONAL_DELIVERY"),
    CROSSREGIONAL_DELIVERY_RETURN("CROSSREGIONAL_DELIVERY_RETURN"),
    DISPOSAL("DISPOSAL"),
    SORTING_CENTER_STORAGE("SORTING_CENTER_STORAGE"),
    EXPRESS_DELIVERY("EXPRESS_DELIVERY"),
    FF_XDOC_SUPPLY_BOX("FF_XDOC_SUPPLY_BOX"),
    FF_XDOC_SUPPLY_PALLET("FF_XDOC_SUPPLY_PALLET"),
    SORTING("SORTING"),
    MIDDLE_MILE("MIDDLE_MILE"),
    RETURN_PROCESSING("RETURN_PROCESSING"),
    EXPRESS_CANCELLED_BY_PARTNER("EXPRESS_CANCELLED_BY_PARTNER"),
    DELIVERY_TO_CUSTOMER_RETURN("DELIVERY_TO_CUSTOMER_RETURN"),
    CROSSBORDER_DELIVERY("CROSSBORDER_DELIVERY"),
    INTAKE_SORTING_BULKY_CARGO("INTAKE_SORTING_BULKY_CARGO"),
    INTAKE_SORTING_SMALL_GOODS("INTAKE_SORTING_SMALL_GOODS"),
    INTAKE_SORTING_DAILY("INTAKE_SORTING_DAILY"),
    FF_STORAGE_BILLING("FF_STORAGE_BILLING"),
    CANCELLED_ORDER_FEE_QI("CANCELLED_ORDER_FEE_QI"),
    LATE_ORDER_EXECUTION_FEE_QI("LATE_ORDER_EXECUTION_FEE_QI");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): TariffType {
                return values().first{it -> it.value == value}
        }
    }
}
