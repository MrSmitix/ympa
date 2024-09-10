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
* Услуга:  * `FEE` — размещение товара на Маркете. * `FULFILLMENT` — складская обработка. Не возвращается с 1 января 2024 года. * `LOYALTY_PARTICIPATION_FEE` — участие в программе лояльности и отзывы за баллы. * `AUCTION_PROMOTION` — буст продаж с оплатой за продажи. * `INSTALLMENT` — рассрочка. Не возвращается с 24 февраля 2022 года. * `DELIVERY_TO_CUSTOMER` — доставка покупателю (FBY, FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `EXPRESS_DELIVERY_TO_CUSTOMER` — экспресс-доставка покупателю (Экспресс). * `AGENCY` — прием платежа покупателя. * `PAYMENT_TRANSFER` — перевод платежа покупателя. * `RETURNED_ORDERS_STORAGE` — хранение невыкупов и возвратов (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `SORTING` — обработка заказа (FBS). * `INTAKE_SORTING` — организация забора заказов со склада продавца (FBS). * `RETURN_PROCESSING` — обработка заказов на складе (FBS). Для DBS и Экспресс — если заказ возвращается через логистику Маркета. * `ILLIQUID_GOODS_SALE` — вознаграждение за продажу невывезенных товаров. 
* Values: FEE,FULFILLMENT,LOYALTY_PARTICIPATION_FEE,AUCTION_PROMOTION,INSTALLMENT,DELIVERY_TO_CUSTOMER,EXPRESS_DELIVERY_TO_CUSTOMER,AGENCY,PAYMENT_TRANSFER,RETURNED_ORDERS_STORAGE,SORTING,INTAKE_SORTING,RETURN_PROCESSING,ILLIQUID_GOODS_SALE
*/
enum class OrdersStatsCommissionType(@get:JsonValue val value: kotlin.String) {

    FEE("FEE"),
    FULFILLMENT("FULFILLMENT"),
    LOYALTY_PARTICIPATION_FEE("LOYALTY_PARTICIPATION_FEE"),
    AUCTION_PROMOTION("AUCTION_PROMOTION"),
    INSTALLMENT("INSTALLMENT"),
    DELIVERY_TO_CUSTOMER("DELIVERY_TO_CUSTOMER"),
    EXPRESS_DELIVERY_TO_CUSTOMER("EXPRESS_DELIVERY_TO_CUSTOMER"),
    AGENCY("AGENCY"),
    PAYMENT_TRANSFER("PAYMENT_TRANSFER"),
    RETURNED_ORDERS_STORAGE("RETURNED_ORDERS_STORAGE"),
    SORTING("SORTING"),
    INTAKE_SORTING("INTAKE_SORTING"),
    RETURN_PROCESSING("RETURN_PROCESSING"),
    ILLIQUID_GOODS_SALE("ILLIQUID_GOODS_SALE");

    companion object {
        @JvmStatic
        @JsonCreator
        fun forValue(value: kotlin.String): OrdersStatsCommissionType {
                return values().first{it -> it.value == value}
        }
    }
}

